/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playsafe;


import java.util.Scanner;

/**
 *
 * @author User
 */
public class CelsiustoKelvin {
    
   /**
     * @param args the command line arguments
     */
    
   static float Cels_to_Kelv(float Cels){
       
   return (float) (Cels + 273.15); 
   }
   
   public static void main(String[] args) {
        // TODO code application logic here
        
        System .out.println("Input in Celsius" );
         
        
        Scanner sc = new Scanner(System.in);
        float Cels = (float) sc.nextDouble();
                 
               System .out.println("Celsius entered is: " + Cels);
         
      
        System .out.println ( "Output in Kelvin = "
                             + Cels_to_Kelv(Cels)+"K"); 
    }
     
}
