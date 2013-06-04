/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.dahuapp.editor.gui;

/**
 *
 * @author Jean-Baptiste
 */
public class PrintHello {
    
    private final String str = "Hello !" ;

    public PrintHello() {
        System.out.print(str + " constructeur");
    }
    
    public void print() {
        System.out.println(str + " methode");
    } 
    
    public String getString() {
        return str ;
    }
}
