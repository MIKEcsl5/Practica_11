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
 * Clase Serializador que codifica un objeto para ser guardado en un dispositivo de almacenamiento
 * @author Equipo D
 */
public class Serializador {
    /**
     * Constructo que al ser invocado crea un objeto de la clase Date y lo serializa
     */
    public Serializador() {
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        
        try{
            FileOutputStream fos = new FileOutputStream("Objeto.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(fechaActual);
            oos.close();
        }catch(IOException ioe){}
    }
        
}
