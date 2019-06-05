package classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import classes.GrammarLexer;
import classes.GrammarParser;



 
public class Analizador {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*System.setIn(new FileInputStream(new File("input.txt")));
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		GrammarLexer lexer = new GrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GrammarParser parser = new GrammarParser(tokens);
		ParseTree tree = parser.compilationUnit();
		System.out.println("analizando");
		MyVisitor<Object> loader = new MyVisitor<Object>();
		loader.visit(tree);*/
                new Interfaz();
	}

}
