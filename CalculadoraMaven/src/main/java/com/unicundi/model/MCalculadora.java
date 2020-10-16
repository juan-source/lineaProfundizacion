
package com.unicundi.model;
/**
 * @author Anyi Leon 
 * @author Juan Pablo Martinez
 * @since 15/2020
 */
public class MCalculadora {
    /**
     * Definimos variables para procesos
     */
    private int valor1;
    private int valor2;
    private int resultado;

    /**
     * Constructor vacio
     */
    public MCalculadora() {
    }
    
    /**
     * En los get obtenemos los datos, y en los set enviamos los datos
     * @return variables
     */
    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    /***
     * Metodos para las operaciones a realizar
     */
    public void suma(){
        resultado = valor1 + valor2;
    }
    
    public void resta(){
        resultado = valor1 - valor2;
    }
    
    public void multiplicacion(){
        resultado = valor1 * valor2;
    }
    
    public void division(){
        resultado = valor1 / valor2;
    }
}
