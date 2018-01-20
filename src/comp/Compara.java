/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp;

/**
 *
 * @author isamach
 */
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
 
public class Compara
{
    public static void main(String[] args) throws IOException
    {
        
     
        try
        {
            BufferedReader lee1 =new BufferedReader(new FileReader("O1.txt"));
            BufferedReader lee2 =new BufferedReader(new FileReader("O2.txt"));
            
            String linea1="", linea2 = "";
            System.out.println("Comparando Archivos...");
            int cont1=0, cont2=0;
            
            while(linea1!=null || linea2!=null)
            {
              linea1=lee1.readLine();
              linea2=lee2.readLine();
              if(linea1!=null){
                  cont1++;
              }
              if(linea2!=null){
                  cont2++;
              }
            };
            System.out.println("Fin de comparacion de los archivos...\n");
            System.out.println("El primer archivo tiene "+cont1+" Lineas");
            System.out.println("El segundo archivo tiene "+cont2+" Lineas");
            if(cont1 == cont2){
                System.out.println("Los archivos comparados son iguales");
            }
            else{
                System.out.println("Los archivos comparados son diferentes");
            }
            lee1.close();
            lee2.close();
        }
        finally
        {
          System.out.println("fin...");
        }
    }
}
