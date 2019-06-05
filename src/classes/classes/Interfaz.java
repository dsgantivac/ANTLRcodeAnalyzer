/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import javax.swing.text.Utilities;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import classes.GrammarLexer;

/**
 *
 * @author Diego
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    private String codigo;
    LineNumberingTextArea lineNumberingTextArea;
    StringReader inputString;
    BufferedReader in;
    ANTLRInputStream input;
    GrammarLexer lexer;
    CommonTokenStream tokens;
    GrammarParser parser;
    ParseTree tree;
    public static final int low_use = 2;
    public static final int high_use = 10;

    public Interfaz() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        initComponents();
        lineNumberingTextArea = new LineNumberingTextArea(editor);
        jScrollPane2.setRowHeaderView(lineNumberingTextArea);
        editor.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent documentEvent) {
                lineNumberingTextArea.updateLineNumbers();
            }

            @Override
            public void removeUpdate(DocumentEvent documentEvent) {
                lineNumberingTextArea.updateLineNumbers();
            }

            @Override
            public void changedUpdate(DocumentEvent documentEvent) {
                lineNumberingTextArea.updateLineNumbers();
            }
        });
        String text = "";

        try {
            file = new File("input.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (br.ready()) {
                text += br.readLine();
                text += "\n";
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        editor.setText(text);
        editor.addCaretListener(new CaretListener() {
            public void caretUpdate(CaretEvent e) {
                int row = getRow(e.getDot(), (JTextComponent) e.getSource());
                int col = getColumn(e.getDot(), (JTextComponent) e.getSource());
                status.setText("Fila: " + row + " Columna: " + col);
            }
        });
        //analizar();
        inputString = new StringReader(editor.getText());
        in = new BufferedReader(inputString);
        try {
            input = new ANTLRInputStream(in);
            lexer = new GrammarLexer(input);
            tokens = new CommonTokenStream(lexer);
            parser = new GrammarParser(tokens);
            tree = parser.compilationUnit();
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        metodos_largos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        goWebsite(metodos_largos,"https://refactoring.guru/smells/long-method");
        codigo_dup.setCursor(new Cursor(Cursor.HAND_CURSOR));
        goWebsite(codigo_dup,"https://refactoring.guru/smells/duplicate-code");
        muchos_parametros.setCursor(new Cursor(Cursor.HAND_CURSOR));
        goWebsite(muchos_parametros,"https://refactoring.guru/smells/long-parameter-list");
        clases_largas.setCursor(new Cursor(Cursor.HAND_CURSOR));
        goWebsite(clases_largas,"https://refactoring.guru/smells/large-class");
        switch_if.setCursor(new Cursor(Cursor.HAND_CURSOR));
        goWebsite(switch_if,"https://refactoring.guru/smells/switch-statements");
        cod_muerto.setCursor(new Cursor(Cursor.HAND_CURSOR));
        goWebsite(cod_muerto,"https://refactoring.guru/smells/dead-code");
        nombres_smell.setCursor(new Cursor(Cursor.HAND_CURSOR));
        goWebsite(nombres_smell,"http://hilton.org.uk/blog/naming-smells");
        data_clums.setCursor(new Cursor(Cursor.HAND_CURSOR));
        goWebsite(data_clums,"https://refactoring.guru/smells/data-clumps");
        //this.getContentPane().setBackground(Color.red);
        this.setVisible(true);
        JScrollPane sc= new JScrollPane(this.getContentPane());
        sc.setVerticalScrollBar(new JScrollBar());
        this.setContentPane(sc);
        
    }

    public static int getRow(int pos, JTextComponent editor) {
        int rn = (pos == 0) ? 1 : 0;
        try {
            int offs = pos;
            while (offs > 0) {
                offs = Utilities.getRowStart(editor, offs) - 1;
                rn++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rn;
    }

    public static int getColumn(int pos, JTextComponent editor) {
        try {
            return pos - Utilities.getRowStart(editor, pos);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    private void goWebsite(JLabel website,String url) {
        website.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI(url));
                } catch (URISyntaxException | IOException ex) {
                    //It looks like there's a problem
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        editor = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        malosOlores = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        var_poco_use = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        var_mucho_use = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        fun_mucho_use = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        fun_poco_use = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        duplicados = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        codigo_dup = new javax.swing.JLabel();
        metodos_largos = new javax.swing.JLabel();
        muchos_parametros = new javax.swing.JLabel();
        clases_largas = new javax.swing.JLabel();
        switch_if = new javax.swing.JLabel();
        cod_muerto = new javax.swing.JLabel();
        nombres_smell = new javax.swing.JLabel();
        cod_muerto1 = new javax.swing.JLabel();
        cod_muerto2 = new javax.swing.JLabel();
        data_clums = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        status1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador de Malos Olores");
        setPreferredSize(new java.awt.Dimension(1197, 832));
        setSize(new java.awt.Dimension(997, 769));
        getContentPane().setLayout(null);

        editor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editorKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(editor);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 60, 471, 699);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 140, 40);

        status.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        status.setText("Fila: 1 Columna: 1");
        getContentPane().add(status);
        status.setBounds(10, 770, 391, 18);

        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        malosOlores.setEditable(false);
        malosOlores.setColumns(20);
        malosOlores.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        malosOlores.setLineWrap(true);
        malosOlores.setRows(5);
        jScrollPane1.setViewportView(malosOlores);

        jTabbedPane1.addTab("Malos Olores", jScrollPane1);

        jPanel1.setLayout(null);

        jLabel2.setText("Variables Muy Usadas");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 30, 110, 20);

        var_poco_use.setEditable(false);
        var_poco_use.setColumns(20);
        var_poco_use.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        var_poco_use.setLineWrap(true);
        var_poco_use.setRows(5);
        jScrollPane5.setViewportView(var_poco_use);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(330, 50, 300, 250);

        jLabel3.setText("Variables Poco Usadas");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(340, 30, 120, 14);

        var_mucho_use.setEditable(false);
        var_mucho_use.setColumns(20);
        var_mucho_use.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        var_mucho_use.setLineWrap(true);
        var_mucho_use.setRows(5);
        jScrollPane6.setViewportView(var_mucho_use);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(10, 50, 280, 240);

        jLabel4.setText("Funciones Muy Usadas");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 310, 110, 20);

        fun_mucho_use.setEditable(false);
        fun_mucho_use.setColumns(20);
        fun_mucho_use.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        fun_mucho_use.setLineWrap(true);
        fun_mucho_use.setRows(5);
        jScrollPane7.setViewportView(fun_mucho_use);

        jPanel1.add(jScrollPane7);
        jScrollPane7.setBounds(10, 340, 280, 300);

        jLabel5.setText("Funciones Poco Usadas");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(350, 310, 120, 20);

        fun_poco_use.setEditable(false);
        fun_poco_use.setColumns(20);
        fun_poco_use.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        fun_poco_use.setLineWrap(true);
        fun_poco_use.setRows(5);
        jScrollPane8.setViewportView(fun_poco_use);

        jPanel1.add(jScrollPane8);
        jScrollPane8.setBounds(340, 340, 300, 300);

        jTabbedPane1.addTab("Estadisticas", jPanel1);

        duplicados.setColumns(20);
        duplicados.setRows(5);
        jScrollPane3.setViewportView(duplicados);

        jTabbedPane1.addTab("Codigo Duplicado", jScrollPane3);

        jPanel2.setLayout(null);

        codigo_dup.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        codigo_dup.setForeground(new java.awt.Color(0, 51, 204));
        codigo_dup.setText(" - Codigo duplicado");
        jPanel2.add(codigo_dup);
        codigo_dup.setBounds(20, 40, 290, 20);

        metodos_largos.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        metodos_largos.setForeground(new java.awt.Color(0, 51, 204));
        metodos_largos.setText(" - Metodos muy Largos");
        jPanel2.add(metodos_largos);
        metodos_largos.setBounds(20, 10, 290, 20);

        muchos_parametros.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        muchos_parametros.setForeground(new java.awt.Color(0, 51, 204));
        muchos_parametros.setText(" - Demasiados Parametros");
        jPanel2.add(muchos_parametros);
        muchos_parametros.setBounds(20, 70, 290, 20);

        clases_largas.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        clases_largas.setForeground(new java.awt.Color(0, 51, 204));
        clases_largas.setText(" - Clases muy Largas");
        jPanel2.add(clases_largas);
        clases_largas.setBounds(20, 100, 290, 20);

        switch_if.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        switch_if.setForeground(new java.awt.Color(0, 51, 204));
        switch_if.setText("- Switch/If Complejos");
        jPanel2.add(switch_if);
        switch_if.setBounds(30, 130, 290, 20);

        cod_muerto.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        cod_muerto.setForeground(new java.awt.Color(0, 51, 204));
        cod_muerto.setText("- Codigo muerto");
        jPanel2.add(cod_muerto);
        cod_muerto.setBounds(30, 220, 290, 20);

        nombres_smell.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        nombres_smell.setForeground(new java.awt.Color(0, 51, 204));
        nombres_smell.setText("- Nombres metodos/variables");
        jPanel2.add(nombres_smell);
        nombres_smell.setBounds(30, 160, 320, 20);

        cod_muerto1.setFont(new java.awt.Font("Monospaced", 2, 16)); // NOI18N
        cod_muerto1.setText("      What? How can code \"smell\"??");
        jPanel2.add(cod_muerto1);
        cod_muerto1.setBounds(110, 330, 450, 40);

        cod_muerto2.setFont(new java.awt.Font("Monospaced", 2, 14)); // NOI18N
        cod_muerto2.setText("“ Well it doesn't have a nose... but it definitely can stink!");
        jPanel2.add(cod_muerto2);
        cod_muerto2.setBounds(60, 370, 530, 40);

        data_clums.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        data_clums.setForeground(new java.awt.Color(0, 51, 204));
        data_clums.setText("- Data Clumps");
        jPanel2.add(data_clums);
        data_clums.setBounds(30, 190, 290, 20);

        jScrollPane4.setViewportView(jPanel2);

        jTabbedPane1.addTab("¿Como corregirlos?", jScrollPane4);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(500, 50, 660, 710);

        jButton1.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons-5-300x300.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1110, 10, 40, 40);

        jButton2.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_ic_folder_open_48px_352375.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(370, 10, 50, 40);

        jButton3.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_save_1608823.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 10, 40, 40);

        status1.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        status1.setText("David Santiago Gantiva - Diego Duarte Camacho");
        getContentPane().add(status1);
        status1.setBounds(510, 770, 391, 18);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editorKeyTyped
    }//GEN-LAST:event_editorKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        analizar();
    }//GEN-LAST:event_jButton1ActionPerformed
    File file;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        final JFileChooser fc = new JFileChooser();
        System.out.println(file.getParent());
        fc.setCurrentDirectory(file.getParentFile());
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            System.out.println("Opening: " + file.getAbsolutePath() + ".\n");
            String text = "";
            try {
                BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));
                while (br.ready()) {
                    text += br.readLine();
                    text += "\n";
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
            editor.setText(text);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(file.getParentFile());
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            FileWriter fw;
            try {
                fw = new FileWriter(file);
                fw.write(editor.getText());
                fw.close();
                JOptionPane.showMessageDialog(rootPane, "Guardado Satisfactoriamente");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    public void analizar() {
        malosOlores.setText("");
        duplicados.setText("");
        inputString = new StringReader(editor.getText());
        in = new BufferedReader(inputString);
        try {
            input = new ANTLRInputStream(in);
            lexer = new GrammarLexer(input);
            tokens = new CommonTokenStream(lexer);
            parser = new GrammarParser(tokens);
            tree = parser.compilationUnit();
            System.out.println("analizando");
            MyVisitor<Object> loader = new MyVisitor<Object>();
            loader.visit(tree);
            for (int i = 0; i < loader.adv.size(); i++) {
                this.malosOlores.append(loader.adv.get(i).toString());
                lineNumberingTextArea.criticos = loader.criticos;
                lineNumberingTextArea.updateLineNumbers();

            }
            for (int i = 0; i < loader.dupAux.size(); i++) {
                duplicados.append(loader.dup.poll());
                duplicados.append("\n\n");
            }
            variables(loader);
            funciones(loader);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
    public void variables(MyVisitor<Object> loader){
        var_poco_use.setText("");
        var_mucho_use.setText("");
        String key;
        int value;
        Set<String> keys = loader.VARIABLES.keySet();

        //impresion de variables
        for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();) {
            key = iterator.next();
            value = loader.VARIABLES.get(key);
            if(value<=low_use){
                var_poco_use.append("-la variable "+key+" se usa "+value+" veces\n");
            }else if(value>= high_use){
                var_mucho_use.append("-la variable "+key+" se usa "+value+" veces\n");
            }
        }
    }
    public void funciones(MyVisitor<Object> loader){
        fun_poco_use.setText("");
        fun_mucho_use.setText("");
        String key;
        int value;
        Set<String> keys = loader.FUNCIONES.keySet();

        //impresion de variables
        for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();) {
            //System.out.println("FUNCIOENS");
            key = iterator.next();
            value = loader.FUNCIONES.get(key);
            if(value<=low_use){
                fun_poco_use.append("-la funcion "+key+" se usa "+value+" veces\n");
            }else if(value>= high_use){
                fun_mucho_use.append("-la funcion "+key+" se usa "+value+" veces\n");
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clases_largas;
    private javax.swing.JLabel cod_muerto;
    private javax.swing.JLabel cod_muerto1;
    private javax.swing.JLabel cod_muerto2;
    private javax.swing.JLabel codigo_dup;
    private javax.swing.JLabel data_clums;
    private javax.swing.JTextArea duplicados;
    private javax.swing.JTextPane editor;
    private javax.swing.JTextArea fun_mucho_use;
    private javax.swing.JTextArea fun_poco_use;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea malosOlores;
    private javax.swing.JLabel metodos_largos;
    private javax.swing.JLabel muchos_parametros;
    private javax.swing.JLabel nombres_smell;
    private javax.swing.JLabel status;
    private javax.swing.JLabel status1;
    private javax.swing.JLabel switch_if;
    private javax.swing.JTextArea var_mucho_use;
    private javax.swing.JTextArea var_poco_use;
    // End of variables declaration//GEN-END:variables
}
