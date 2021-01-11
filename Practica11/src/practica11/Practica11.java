/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author socce
 */
public class Practica11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("*************** Actividad 1 *****************");
        
        try{
            File archivo = new File("miArchivo.txt");
            System.out.println(archivo.exists());
            boolean seCreo = archivo.createNewFile();
            System.out.println("Se creo? "+seCreo);
            System.out.println(archivo.exists());
            
            
        }catch(IOException e){}
        
        System.out.println("*************** Actividad 2 *****************");
        System.out.println("FileOutputStream");
        FileOutputStream fos = null;
        byte[] buffer = new byte[81];
        int nBytes;
        try{
            System.out.println("Escribe el texto a guardar en el archivo: ");
            nBytes = System.in.read(buffer);
            fos = new FileOutputStream("fos.txt");
            fos.write(buffer, 0, nBytes);
        }catch(IOException ioe){}
        finally{
            if(fos != null){
                try{
                   fos.close(); 
                }catch(IOException i){}
            }
        }
        System.out.println("*************** Actividad 3 *****************");
        System.out.println("FileInputStream");
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("fos.txt");
            nBytes = fis.read(buffer, 0, 81);
            String textoLeido = new String(buffer, 0 , nBytes);
            System.out.println("Texto leido: "+textoLeido);
        }catch(IOException o){}
        finally{
            if(fis != null){
                fis.close();
            }
        }
    }
}
