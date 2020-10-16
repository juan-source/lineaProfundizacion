/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicundi.controller;

import com.unicundi.model.MCalculadora;
import com.unicundi.vista.VCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author paola
 */
public class CCalculadora implements ActionListener {

    private VCalculadora vista = new VCalculadora();
    private MCalculadora modelo = new MCalculadora();

    public CCalculadora(VCalculadora vista, MCalculadora modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public enum MVC {
        BSumar,
        BResta,
        BMultiplicacion,
        BDivision
    }

    public void iniciar() {
        vista.setTitle("Calculadora");
        vista.setLocationRelativeTo(null);
        
        this.vista.BSumar.setActionCommand("BSumar");
        this.vista.BSumar.addActionListener(this);
        this.vista.BResta.setActionCommand("BResta");
        this.vista.BResta.addActionListener(this);
        this.vista.BMultiplicacion.setActionCommand("BMultiplicacion");
        this.vista.BMultiplicacion.addActionListener(this);
        this.vista.BDivision.setActionCommand("BDivision");
        this.vista.BDivision.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setValor1(Integer.parseInt(vista.TextValor1.getText()));
        modelo.setValor2(Integer.parseInt(vista.TextValor2.getText()));
        switch (MVC.valueOf(e.getActionCommand())) {
            case BSumar:
                modelo.suma();
                vista.LabelResultado.setText(String.valueOf(modelo.getResultado()));
                break;
            case BResta:
                modelo.resta();
                vista.LabelResultado.setText(String.valueOf(modelo.getResultado()));
                break;
            case BMultiplicacion:
                modelo.multiplicacion();
                vista.LabelResultado.setText(String.valueOf(modelo.getResultado()));
                break;
            case BDivision:
                modelo.division();
                vista.LabelResultado.setText(String.valueOf(modelo.getResultado()));
                break;
        }

    }
    
    
    
}
