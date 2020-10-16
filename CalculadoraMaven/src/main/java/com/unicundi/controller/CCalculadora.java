package com.unicundi.controller;

import com.unicundi.model.MCalculadora;
import com.unicundi.vista.VCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Anyi Leon 
 * @author Juan Pablo Martinez
 * @since 15/2020
 */
public class CCalculadora implements ActionListener {

    /**
     * Definimos las otras clases, para manejar sus atributos y metodos
     */
    private VCalculadora vista = new VCalculadora();
    private MCalculadora modelo = new MCalculadora();
    

    /**
     * Constructor para obtener las clases aliadas
     * @param vista clase vista el diseño del programa
     * @param modelo clase modulo las variables del programa
     */
    public CCalculadora(VCalculadora vista, MCalculadora modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    /**
     * Metodo para definir los case en el switch
     */
    public enum MVC {
        BSumar,
        BResta,
        BMultiplicacion,
        BDivision
    }

    /**
     * Metodo para iniciar a visualizar la vista y su contenido
     */
    public void iniciar() {
        vista.setTitle("Calculadora");
        vista.setLocationRelativeTo(null);
        /**
         * Se llaman los botones de la vista para asignar en el switch
         */
        this.vista.BSumar.setActionCommand("BSumar");
        this.vista.BSumar.addActionListener(this);
        this.vista.BResta.setActionCommand("BResta");
        this.vista.BResta.addActionListener(this);
        this.vista.BMultiplicacion.setActionCommand("BMultiplicacion");
        this.vista.BMultiplicacion.addActionListener(this);
        this.vista.BDivision.setActionCommand("BDivision");
        this.vista.BDivision.addActionListener(this);
    }

    /**
     * Resive los parametros de la vista para sus respectivas operaciones
     * @param e Recibe los valores
     */
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
