/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula15;

import java.util.Arrays;

/**
 *
 * @author Suporte
 */
public class Aula15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numeros = { 10, 5, 23, 18, 8, 25 }; 
        
        String[] frutas = { "Laranja", "Manga", "Abacate", "Abacaxi" };
        
        int num = 23;
        String fruta = "Manga";
        
        // int result = Arrays.binarySearch(numeros, num);
        int result = Arrays.binarySearch(frutas, fruta);
        
        if(result >= 0) {
            System.out.println("Valor Encontrado na posição " + result);
        } else {
            System.out.println("Valor não Encontrado na posição " + result);
        }
        
    }
    
}
