/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicundi.model;

/**
 *
 * @author paola
 */
public class MCalculadora {
    private int valor1;
    private int valor2;
    private int resultado;

    public MCalculadora() {
    }
    

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
