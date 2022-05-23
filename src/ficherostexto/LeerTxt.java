/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherostexto;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Morad
 */
public class LeerTxt {

    

    public static void main(String[] args) {

        try {
            
            File f = new File("apuntes.txt");
            FileReader fr = new FileReader(f);
            //leemos el fichero y lo mostramos por pantalla

            int cadena = fr.read();
            while (cadena != -1) {
                System.out.print((char) cadena);
                cadena = fr.read();
            }
            fr.close();

        } catch (IOException e) {
        }
    }

}
