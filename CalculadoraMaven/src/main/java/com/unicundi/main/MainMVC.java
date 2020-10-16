/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicundi.main;

import com.unicundi.controller.CCalculadora;
import com.unicundi.model.MCalculadora;
import com.unicundi.vista.VCalculadora;

/**
 *
 * @author paola
 */
public class MainMVC {
    public static void main(String[] args) {
        VCalculadora vista = new VCalculadora();
        MCalculadora model = new MCalculadora();
        
        CCalculadora controller = new CCalculadora(vista, model);
        
        controller.iniciar();
        vista.setVisible(true);
        
        
    }
            
}
