/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializar;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 *
 * @author socce
 */
public class Serializador {

    public Serializador() {
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        
        try{
            FileOutputStream fos = new FileOutputStream("Objeto.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(fechaActual);
            oos.close();
        }catch(IOException ioe){}
    }
        
}
