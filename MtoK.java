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
public class MtoK {
    
   static double mlTokm(double ml){
    
       return 1.60934 * ml;
   }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Enter miles");
        
        Scanner sc = new Scanner(System.in);
        double ml = (double) sc.nextDouble();
        
        System.out.println("Kilometer" + mlTokm(ml) + "KM");
    }
    
}
