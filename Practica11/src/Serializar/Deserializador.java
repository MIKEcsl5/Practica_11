/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializar;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

/**
 *
 * @author socce
 */
public class Deserializador {

    public Deserializador() {
        Date fecha = null;
        
        try{
            FileInputStream fis = new FileInputStream("Objeto.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            fecha = (Date) ois.readObject();
            ois.close();
        }catch(IOException e){
        }catch (ClassNotFoundException ex) {}
        System.out.println("saddsa ds: "+fecha);
        fecha = new Date();
        System.out.println("sad h3uihyiu:+ "+fecha);
    }
    
}
