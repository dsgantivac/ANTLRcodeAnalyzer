package classes;

/**
 *
 * @author Gantiva
 */
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import classes.GrammarParser.*;
import java.util.LinkedList;
import java.util.TreeSet;

class Code_segments {

    public String code;
    public int fila;
    public int columna;

    public Code_segments(String code, int fila, int columna) {
        super();
        this.code = code;
        this.fila = fila;
        this.columna = columna;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
}

public class MyVisitor<T> extends GrammarBaseVisitor<T> {

    public static final int Method_limit = 10;
    public static final int Parameter_limit = 5;
    public static final int minName = 3;
    public static final int maxName = 10;
    public static final int Class_limit = 10;
    public static final int if_limit = 5;

    public int fila;
    public int columna;
    public ArrayList<Code_segments> arr = new ArrayList<Code_segments>();
    public ArrayList<Code_segments> Data_clumps = new ArrayList<Code_segments>();
    public ArrayList<Advertencia> adv = new ArrayList<Advertencia>();
    public HashMap<String, Integer> VARIABLES = new HashMap<String, Integer>();
    public HashMap<String, Integer> FUNCIONES = new HashMap<String, Integer>();
    public Set criticos = new TreeSet();
    public Set dupAux = new TreeSet();
    public LinkedList<String> dup = new LinkedList();

    //226   
    public T visitCompilationUnit(CompilationUnitContext ctx) {
        if (ctx.typeDeclaration().isEmpty() == false) {
            for (int i = 0; i < ctx.typeDeclaration().size(); i++) {
                visitTypeDeclaration(ctx.typeDeclaration(i));
            }

        }
        String key;
        int value;
        Set<String> keys = VARIABLES.keySet();

        //impresion de variables
        for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();) {
            key = iterator.next();
            value = VARIABLES.get(key);
            System.out.printf("#%s se repite %d veces en el codigo\n", key, value);
            //adv.add(new Advertencia("#%s se repite %d veces en el codigo\n", key, value, 3));

        }
        keys = FUNCIONES.keySet();

        //impresion de variables
        for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();) {
            key = iterator.next();
            value = FUNCIONES.get(key);
            System.out.printf("#%s se repite %d veces en el codigo\n", key, value);
           // adv.add(new Advertencia("#%s se repite %d veces en el codigo\n", key, value, 3));

        }

        return null;
    }

    public T visitTypeDeclaration(TypeDeclarationContext ctx) {

        if (ctx.classDeclaration() != null) {
            visitClassDeclaration(ctx.classDeclaration());
        }

        return null;
    }

    public T visitClassDeclaration(ClassDeclarationContext ctx) {
        if (ctx.normalClassDeclaration() != null) {
            visitNormalClassDeclaration(ctx.normalClassDeclaration());
        }
        return null;
    }

    //276
    public T visitNormalClassDeclaration(NormalClassDeclarationContext ctx) {

        fila = ctx.getStart().getLine();
        columna = ctx.getStart().getCharPositionInLine();

        if (ctx.Identifier().getText().length() < minName) {
            System.out.printf("nombre de la clase es demasiado corta en fila %d columna %d\n", fila, columna);
            adv.add(new Advertencia("nombre de la clase es demasiado corta en fila %d columna %d\n", fila, columna, 1));
            criticos.add(fila);
        }

        if (ctx.Identifier().getText().length() > maxName) {
            System.out.printf("nombre de la clase es demasiado largo en fila %d columna %d\n", fila, columna);
            adv.add(new Advertencia("nombre de la clase es demasiado largo en fila %d columna %d\n", fila, columna, 1));
            criticos.add(fila);
        }

        if (ctx.classBody() != null) {
            visitClassBody(ctx.classBody());
        }
        return null;
    }

    //311
    public T visitClassBody(ClassBodyContext ctx) {

        int tmp = 0;

        if (ctx.classBodyDeclaration() != null) {
            for (int i = 0; i < ctx.classBodyDeclaration().size(); i++) {
                if (ctx.classBodyDeclaration(i).classMemberDeclaration() != null) {
                    tmp++;
                }
            }
            if (tmp > Class_limit) {
                System.out.printf("la clase es demasiado grande y se encarga de demasiadas funciones en la fila %d y la columna %d\n", fila, columna);
                adv.add(new Advertencia("la clase es demasiado grande y se encarga de demasiadas funciones en la fila %d y la columna %d\n", fila, columna, 1));
                criticos.add(fila);
            }
            for (int i = 0; i < ctx.classBodyDeclaration().size(); i++) {
                visitClassBodyDeclaration(ctx.classBodyDeclaration(i));
            }

        }

        return null;
    }

    //315
    public T visitClassBodyDeclaration(ClassBodyDeclarationContext ctx) {

        if (ctx.classMemberDeclaration() != null) {
            visitClassMemberDeclaration(ctx.classMemberDeclaration());
        }
        if (ctx.instanceInitializer() != null) {
            visitBlock(ctx.instanceInitializer().block());
        }
        if (ctx.staticInitializer() != null) {
            visitBlock(ctx.staticInitializer().block());
        }

        return null;
    }

    //322
    public T visitClassMemberDeclaration(ClassMemberDeclarationContext ctx) {

        if (ctx.methodDeclaration() != null) {
            visitMethodDeclaration(ctx.methodDeclaration());
        }
        if (ctx.fieldDeclaration() != null) {
            visitFieldDeclaration(ctx.fieldDeclaration());

        }

        return null;
    }

    //330
    public T visitFieldDeclaration(FieldDeclarationContext ctx) {
        if (ctx.variableDeclaratorList() != null) {
            visitVariableDeclaratorList(ctx.variableDeclaratorList());
        }
        return null;
    }

    //422
    public T visitMethodDeclaration(MethodDeclarationContext ctx) {

        //ubicacion del metodo
        fila = ctx.getStart().getLine();
        columna = ctx.getStart().getCharPositionInLine();
        if (ctx.methodHeader() != null) {
            visitMethodHeader(ctx.methodHeader());
        }

        if (ctx.methodBody() != null) {
            visitMethodBody(ctx.methodBody());
        }
        return null;
    }

    //parametros del metodo
    //439
    public T visitMethodHeader(MethodHeaderContext ctx) {
        if (ctx.methodDeclarator() != null) {
            visitMethodDeclarator(ctx.methodDeclarator());
        }
        return null;
    }

    //449
    public T visitMethodDeclarator(MethodDeclaratorContext ctx) {

        if (ctx.Identifier() != null) {
            String Key = ctx.Identifier().getText();
            System.out.println("METHOD INVOCATION " + ctx.Identifier().getText());
            //System.out.printf("#%s\n",Key);
            if (!FUNCIONES.containsKey(Key)) {
                FUNCIONES.put(Key, 0);
            }
            if (ctx.Identifier().getText().length() < minName) {
                System.out.printf("el nombre del metodo en la fila %d, columna %d es demasiado corto\n", fila, columna);
                adv.add(new Advertencia("el nombre del metodo en la fila %d, columna %d es demasiado corto\n", fila, columna, 1));
                criticos.add(fila);
            }
            if (ctx.Identifier().getText().length() > maxName) {
                System.out.printf("el nombre del metodo en la fila %d, columna %d es demasiado grande\n", fila, columna);
                adv.add(new Advertencia("el nombre del metodo en la fila %d, columna %d es demasiado grande\n", fila, columna, 1));
                criticos.add(fila);
            }
        }
        if (ctx.formalParameterList() != null) {
            visitFormalParameterList(ctx.formalParameterList());
        }
        return null;
    }

    @Override
    public T visitMethodInvocation(MethodInvocationContext ctx) {
        //System.out.println("METHOD INVOCATION "+ctx.Identifier().getText());
        //System.out.println("nombre metodo "+ctx.methodName().Identifier().toString());
        if (ctx.Identifier() != null) {
            String Key = ctx.Identifier().getText();
            //System.out.println("METHOD INVOCATION "+ctx.Identifier().getText());
            //System.out.printf("#%s\n",Key);
            if (FUNCIONES.containsKey(Key)) {
                int value = FUNCIONES.get(Key) + 1;
                FUNCIONES.put(Key, value);
            } else {
                FUNCIONES.put(Key, 1);
            }
        } else if (ctx.methodName() != null) {
            String Key = ctx.methodName().getText();
            //System.out.printf("#%s\n",Key);
            if (FUNCIONES.containsKey(Key)) {
                int value = FUNCIONES.get(Key) + 1;
                FUNCIONES.put(Key, value);
            } else {
                FUNCIONES.put(Key, 1);
            }
        } else {
            //System.out.println("METHOD INVOCATION" + ctx.methodName().getText());
        }
        return super.visitMethodInvocation(ctx);
    }

    //453
    public T visitFormalParameterList(FormalParameterListContext ctx) {

        if (ctx.formalParameters() != null) {
            visitFormalParameters(ctx.formalParameters());
        }

        return null;
    }

    //459
    public T visitFormalParameters(FormalParametersContext ctx) {

        //demaisado parametros en los metodos y funciones
        if (ctx.formalParameter().size() > Parameter_limit - 1) {
            System.out.printf("la funcion pide demasiados argumentos en fila %d y columna %d\n", fila, columna);
            adv.add(new Advertencia("la funcion pide demasiados argumentos en fila %d y columna %d\n", fila, columna, 1));
            criticos.add(fila);
        }
        return null;
    }

    public T visitMethodBody(MethodBodyContext ctx) {

        if (ctx.block() != null) {
            visitBlock(ctx.block());
        }
        return null;
    }

    public T visitBlock(BlockContext ctx) {
        if (ctx.blockStatements() != null) {
            visitBlockStatements(ctx.blockStatements());
        }
        return null;
    }
    //715
    //cantidad de llineas en un metodo

    public T visitBlockStatements(BlockStatementsContext ctx) {
        int if_anidados = 0;

        if (ctx.blockStatement() != null) {
            String code = "";
            int if_fila = -1;
            int if_col = -1;
            //codigo duplicado en metodos
            for (int i = 0; i < ctx.blockStatement().size(); i++) {
                code += ctx.blockStatement(i).getText();
                visitBlockStatement(ctx.blockStatement(i));

                //if anidados
                if (ctx.blockStatement(i).statement() != null) {
                    if (ctx.blockStatement(i).statement().ifThenStatement() != null || ctx.blockStatement(i).statement().ifThenElseStatement() != null) {
                        if (if_fila == -1) {
                            if_fila = ctx.blockStatement(i).getStart().getLine();
                            if_col = ctx.blockStatement(i).getStart().getCharPositionInLine();
                        }
                        if_anidados++;
                    }
                }

            }

            if (if_anidados > if_limit) {
                System.out.printf("demasiados if anidados en %d, columna %d\n", if_fila, if_col);
                adv.add(new Advertencia("demasiados if anidados en %d, columna %d\n", if_fila, if_col, 1));
                criticos.add(fila);
            }

            Code_segments tmp = new Code_segments(code, fila, columna);

            if (arr.isEmpty()) {
                arr.add(tmp);
            } else {
                for (int i = 0; i < arr.size(); i++) {

                    String stmp = arr.get(i).code;

                    if (stmp.equals(code)) {
                        stmp = stmp.replace(";", ";\n");
                        if (!dupAux.contains(stmp)) {
                            dup.add(stmp);
                            dupAux.add(stmp);
                        }
                        System.out.printf("codigo igual en la fila %d con columna %d y en la fila %d con columna %d\n",
                                arr.get(i).fila, arr.get(i).columna, fila, columna);
                        adv.add(new Advertencia("codigo igual en la fila %d con columna %d y en la fila %d con columna %d\n", arr.get(i).fila, arr.get(i).columna, fila, columna, 2));
                        criticos.add(fila);
                        criticos.add(arr.get(i).fila);

                    }
                }
                arr.add(tmp);
            }

            //final codigo duplicado
            if (ctx.blockStatement().size() >= Method_limit) {
                System.out.printf("metodo muy largo en fila %d, columna %d\n", fila, columna);
                adv.add(new Advertencia("metodo muy largo en fila %d, columna %d\n", fila, columna, 1));
                criticos.add(fila);
            }
        }
        return null;
    }

    //719
    public T visitBlockStatement(BlockStatementContext ctx) {
        if (ctx.localVariableDeclarationStatement() != null) {
            visitLocalVariableDeclarationStatement(ctx.localVariableDeclarationStatement());
        }
        if (ctx.statement() != null) {
            visitStatement(ctx.statement());
        }
        return null;
    }

    @Override
    public T visitExpressionName(ExpressionNameContext ctx) {
        String Key = ctx.Identifier().getText();
        if (VARIABLES.containsKey(Key)) {
            int value = VARIABLES.get(Key) + 1;
            VARIABLES.put(Key, value);
        } else {
            VARIABLES.put(Key, 0);
        }
        return super.visitExpressionName(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    //725
    public T visitLocalVariableDeclarationStatement(LocalVariableDeclarationStatementContext ctx) {

        if (ctx.localVariableDeclaration() != null) {
            visitVariableDeclaratorList(ctx.localVariableDeclaration().variableDeclaratorList());
        }
        return null;
    }

    //725
    public T visitVariableDeclaratorList(VariableDeclaratorListContext ctx) {
        String variables = "";
        if (ctx.variableDeclarator() != null) {
            for (int i = 0; i < ctx.variableDeclarator().size(); i++) {
                variables += ctx.variableDeclarator(i).variableDeclaratorId().Identifier().getText();
                visitVariableDeclarator(ctx.variableDeclarator(i));
            }
        }

        Code_segments tmp = new Code_segments(variables, fila, columna);
        if (Data_clumps.isEmpty()) {
            Data_clumps.add(tmp);
        } else {
            for (int i = 0; i < Data_clumps.size(); i++) {

                String stmp = Data_clumps.get(i).code;
                if (stmp.equals(variables)) {
                    System.out.printf("el mismo patron de variables desde la fila %d con columna %d y en la fila %d con columna %d\n",
                            Data_clumps.get(i).fila, Data_clumps.get(i).columna, fila, columna);
                    adv.add(new Advertencia("el mismo patron de variables desde la fila %d con columna %d y en la fila %d con columna %d\n", Data_clumps.get(i).fila, Data_clumps.get(i).columna, fila, columna, 2));
                    criticos.add(fila);
                }
            }
            Data_clumps.add(tmp);
        }

        return null;
    }

    //349
    public T visitVariableDeclarator(VariableDeclaratorContext ctx) {

        //System.out.printf("#%s\n",ctx.variableDeclaratorId().Identifier().getText());
        String Key = ctx.variableDeclaratorId().Identifier().getText();

        //System.out.printf("#%s\n",Key);
        if (!VARIABLES.containsKey(Key)) {
            VARIABLES.put(Key, 0);
        } else {

        }

        if (ctx.variableDeclaratorId() != null) {
            if (ctx.variableDeclaratorId().Identifier().getText().length() < minName) {
                System.out.printf("el nombre de la variable %s es demasiado corto\n", ctx.variableDeclaratorId().Identifier().getText());
                adv.add(new Advertencia("el nombre de la variable %s es demasiado corto\n", fila, columna, 1));
                criticos.add(fila);
            }
            if (ctx.variableDeclaratorId().Identifier().getText().length() > maxName) {
                System.out.printf("el nombre de la variable %s es demasiado largo\n", ctx.variableDeclaratorId().Identifier().getText());
                adv.add(new Advertencia("el nombre de la variable %s es demasiado largo\n", fila, columna, 1));
                criticos.add(fila);
            }
        }
        return null;
    }

}
