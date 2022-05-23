/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherostexto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Morad
 */
public class EscribirTxt {
    
    public static void main(String[] args) {
           
        File f = new File("apuntes.txt");
        
        try{
            //crea el fichero si no existe
            //si ponemos true escribe desde el final
            FileWriter fw = new FileWriter(f,true);
            fw.write("Esto es la primera linea");
            
            //para salto de linea
            fw.write("\r\n");
            
            fw.write(97);//a minuscula del caracter asci
           
            
            //cerramos el stream
            fw.close();
            
           
            
        }catch(IOException e){
            System.out.println("error "+ e);
        }
        
        
    }
           
}
