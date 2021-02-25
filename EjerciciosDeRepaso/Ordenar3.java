/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeRepaso;
import java.util.Scanner;

public class Ordenar3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);   
    int num, i, j, temp;
    num = 3;
 
    int arreglo[] = new int[num];
 
    System.out.println("escribir " + num + " numeros enteros: ");
 
    for (i = 0; i < num; i++) 
      arreglo[i] = scanner.nextInt();
 
    for (i = 0; i < ( num - 1 ); i++) {
      for (j = 0; j < num - i - 1; j++) {
        if (arreglo[j] < arreglo[j+1]) 
        {
          temp = arreglo[j];
          arreglo[j] = arreglo[j+1];
          arreglo[j+1] = temp;
        }
      }
    }
    System.out.println("Numeros de mayor a menor:");
 
    for (i = 0; i < num; i++) 
      System.out.println(arreglo[i]);
}
}
