
package com.unicundi.main;

import com.unicundi.controller.CCalculadora;
import com.unicundi.model.MCalculadora;
import com.unicundi.vista.VCalculadora;

/**
 * @author Anyi Leon 
 * @author Juan Pablo Martinez
 * @since 15/2020
 */
public class MainMVC {
    public static void main(String[] args) {
        
        /**
         * Objetos de las clases a integrar
         */
        VCalculadora vista = new VCalculadora();
        MCalculadora model = new MCalculadora();
        
        CCalculadora controller = new CCalculadora(vista, model);
        
        /**
         * llamar la vista
         */
        controller.iniciar();
        vista.setVisible(true);
        
        
    }
            
}
