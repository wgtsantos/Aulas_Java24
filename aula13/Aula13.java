/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13;

import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      int[] numeros = { 10, 5, 23, 18, 8, 25 }; 
      
      Scanner ler = new Scanner(System.in);
      boolean buscar = false;
      
      System.out.print("Informe um número: ");
      int num = ler.nextInt();
      
        for (int i = 0; i < numeros.length; i++) {
            
            if (num == numeros[i]) {
                buscar = true;
                break;
            }
            
        }
        
        if (buscar) {
            System.out.println("O número " + num + " foi encontrado no Array!");
        } else {
            System.out.println("O número " + num + " não foi encontrado no Array!");
        }
        
    }
    
}
