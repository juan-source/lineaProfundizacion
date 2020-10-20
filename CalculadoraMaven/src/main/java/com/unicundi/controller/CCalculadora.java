package com.unicundi.controller;

import com.unicundi.model.MCalculadora;
import com.unicundi.vista.VCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * @author Anyi Leon 
 * @author Juan Pablo Martinez
 * @since 15/2020
 */
public class CCalculadora implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setDecimal(Integer.parseInt(vista.txtValor.getText()));

        obtenerBinario(modelo.getDecimal());
        vista.lbResultado.setText(modelo.getBinario());      
    }

    /**
     * Instanciamos las clases de vista y el controlador
    **/
    private VCalculadora vista;
    private MCalculadora modelo;
    /**
     * constructor de la clase controlador
    **/
    public CCalculadora(VCalculadora vista, MCalculadora modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnCorrer.addActionListener(this);
    }
    
    public void iniciar() {
        vista.setTitle("Procesos");
        vista.setLocationRelativeTo(null);
    }
    /**
     * obtenerBinario, metodo para convertir un numero decimal en binario
    **/
   public  void obtenerBinario(int numero){
       int exp, digito;
        int binario;
        String valor="";
        exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;           
                binario = (int) (binario + digito * Math.pow(10, exp));                                                   
                exp++;
                numero = numero/2;
        }
        valor = Integer.toString(binario);
        modelo.setBinario(valor);
   //return modelo.getBinario();
 }

}
