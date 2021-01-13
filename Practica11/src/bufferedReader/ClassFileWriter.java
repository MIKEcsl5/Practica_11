/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedReader;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * clase ClassFileWriter, aqui se escribio dentro de un archivo y se leyo el contenido de un archivo
 * @author Equipo D
 */
public class ClassFileWriter {
    public static void main(String[] args) {
        /**
         * Actividad 4: escribir en un archivo con datos de entrada por teclado
         */
        System.out.println("*************** Actividad 4 *****************");
        System.out.println("InputStreamReader");
        String texto = "";
        BufferedReader br;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escriba texto");
            texto = br.readLine();
            FileWriter fw = new FileWriter("fw.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println(texto);
            salida.println("segunda linea");
            salida.close();
        }catch(IOException ioe2){}
        
        /**
         * Leer contenido de un archivo de entrada linea por linea hasta el final del archivo
         */
        System.out.println("*************** Actividad 5 *****************");
        System.out.println("FileReader");
        try{
            FileReader fr = new FileReader("fw.txt");
            br = new BufferedReader(fr);
            System.out.println("conteniedo del archivo");
            String linea = br.readLine();
            System.out.println("");
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
        }catch(IOException ioe3){}
    }
}
