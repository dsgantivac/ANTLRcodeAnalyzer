/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.*;
import javax.swing.text.Element;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.*;

public class LineNumberingTextArea extends JTextPane {

    private JTextPane textArea;
    public Set criticos;

    public LineNumberingTextArea(JTextPane textArea) {
        this.textArea = textArea;
        setBackground(Color.LIGHT_GRAY);
        setEditable(false);
        criticos = new TreeSet();
    }

    public void updateLineNumbers() {
        getLineNumbersText();
    }
    private String getLineNumbersText() {
        setEditable(true);
        setText("");
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset1 = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, Color.red);
        AttributeSet aset2 = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, Color.black);
        int caretPosition = textArea.getDocument().getLength();
        Element root = textArea.getDocument().getDefaultRootElement();
        StringBuilder lineNumbersTextBuilder = new StringBuilder();
        for (int elementIndex = 1; elementIndex < root.getElementIndex(caretPosition) + 1; elementIndex++) {
            int len = getDocument().getLength();
            if (criticos.contains(elementIndex)) {
                setCaretPosition(len);
                setCharacterAttributes(aset1, false);
                replaceSelection(elementIndex+"\n");
            } else {
                setCaretPosition(len);
                setCharacterAttributes(aset2, false);
                replaceSelection(elementIndex+"\n");
                //setText(lineNumbersTextBuilder.toString());
            }
            lineNumbersTextBuilder.append(elementIndex).append(System.lineSeparator());

        }
        setEditable(false);
        return lineNumbersTextBuilder.toString();
    }
}
