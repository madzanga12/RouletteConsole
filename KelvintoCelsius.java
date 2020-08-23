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
public class KelvintoCelsius {
     
   static float Kelv_to_Cels(float Kelv){
       
   return (float) (Kelv - 273.15); 
   }
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        System .out.println("Input in Kelvin" );
         
        Scanner sc = new Scanner(System.in);
        float Kelv = (float) sc.nextDouble();
                  
               System .out.println("Kelvin entered is: " + Kelv);
         
      
        System .out.println ( "Output in Celsius = "
                             + Kelv_to_Cels(Kelv) +"℃"); 
    }
    
    
}
