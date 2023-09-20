/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pkg5;

/**
 *
 * @author AZHAR
 */import java.util.Scanner;
public class Tugas5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
       Scanner input = new Scanner(System.in);
        
        int i, n;
        float jum, x, rat;
        
        System.out.print("Banyak Data : ");
        n= input.nextInt();
        jum=0;
        i=1;
        
        while(i<=n){
            System.out.print("Data Ke-"+i+" : ");
            x=input.nextInt();
            jum += x;
            i++;
        }
        rat=jum/n;
        System.out.println("Jumlah : "+jum);
        System.out.println("Rata Rata : "+rat);
        // TODO code application logic here
    }
    
}
