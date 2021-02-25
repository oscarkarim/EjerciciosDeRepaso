/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeRepaso;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Alreves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int input;
        int reversed=0;
        do {
            System.out.println("Elegir numero entre 0 y 9999: ");
            input = sc.nextInt();

            if (input < 0 || input >= 9999) {
                System.out.println("numero fuera de rango.!");
            }
        } while (input < 0 || input >= 9999);
         while(input != 0) {
            int digit = input % 10;
            reversed = reversed * 10 + digit;
            input /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
    
}
