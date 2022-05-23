/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buffers;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Morad
 */
public class BufferedReader_BufferedWriter {
    
      
    public static void main(String[] args) {
        
        //para leer lineas y no caracter a caracter
       File f = new File("apuntes2.txt");
           
        try{
           
            FileWriter fw = new FileWriter(f,true);//necesitamos file writer
            BufferedWriter bw = new BufferedWriter(fw);
            
            
            FileReader fr = new FileReader(f);//necesitamos file reader  
            BufferedReader br = new BufferedReader(fr);
            
            
           
            
            
            bw.write("prueba 1 usando buffered");
            bw.newLine();
            bw.write("seguimos usando");
            bw.newLine();//salto de linea
            bw.write("el final");
            
            bw.flush();
            
            String linea="";
            
            //(linea= br.readLine())!=null
            while(linea!=null){
                System.out.println(linea);
                linea= br.readLine();
            }
            
            
        }catch(IOException e){}
        
        
        
    }
    
}
