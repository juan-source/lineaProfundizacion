
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
    private int decimal;
    private String binario;

    /**
     * Constructor vacio
     */
    public MCalculadora() {
    }
    
    /**
     * En los get obtenemos los datos, y en los set enviamos los datos
     * @return variables
     */
    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public String getBinario() {
        return binario;
    }

    public void setBinario(String binario) {
        this.binario = binario;
    }

   
    
    
}
