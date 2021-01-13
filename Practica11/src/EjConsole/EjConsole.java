/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjConsole;

import java.io.Console;

/**
 *  clase EjConsole util para crear un Login (para su uso es necesario usar una terminal)
 * @author Equipo D
 */
public class EjConsole {
    
    public static void main(String[] args) {
        Console consola = System.console();
        System.out.println("usuario");
        String usuario = consola.readLine();
        System.out.println(usuario);
    }
}
