/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author AZHAR
 */import java.util.Scanner;
import java.util.Locale;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /**
     * @param args the command line arguments
     */
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
      
    System.out.println("##  Program Java Menghitung Luas Segitiga  ##");
    System.out.println("=============================================");
    System.out.println();
     
    double a,t, luas;
 
    System.out.print("Input alas segitiga: ");
    a = input.nextDouble();
      
    System.out.print("Input tinggi segitiga: ");
    t = input.nextDouble();
  
    luas = 0.5 * a * t;
      
    System.out.println("Luas segitiga: "+luas);
 
  }
}
        // TODO code application logic here
    }
    
}
