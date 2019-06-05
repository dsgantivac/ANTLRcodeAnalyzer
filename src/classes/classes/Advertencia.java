/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Diego
 */
public class Advertencia {
    private String texto;
    private int fila;
    private int col;
    private int filaAux;
    private int colaAux;
    private int tipo;
    private String value;
    

    public Advertencia(String texto, int fila, int col, int tipo) {
        this.texto = texto;
        this.fila = fila;
        this.col = col;
        this.tipo = tipo;
    }

    public Advertencia(String texto, int fila, int col, int filaAux, int colaAux, int tipo) {
        this.texto = texto;
        this.fila = fila;
        this.col = col;
        this.filaAux = filaAux;
        this.colaAux = colaAux;
        this.tipo = tipo;
    }

    public Advertencia(String texto,String value,int fila,int tipo) {
        this.texto = texto;
        this.fila = fila;
        this.value = value;
        this.tipo = tipo;
    }
    

    @Override
    public String toString() {
        String out="";
        switch(tipo){
            case 1:
                out=String.format("-"+texto,fila,col);
                break;
            case 2:
                out =String.format("-"+texto,fila,col,filaAux,colaAux);
                break;
            case 3:
                out =String.format("-"+texto,value,fila);
        }
        return out;
    }
    
    
    
}
