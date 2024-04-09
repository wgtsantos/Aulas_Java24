/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Suporte
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      int[] numeros = { 10, 5, 23, 18, 8, 25 };
       
      String[] frutas = { "Laranja", "Manga", "Abacate", "Abacaxi" };
            
      // Coloca a lista em Ordem alfabética (strings)
      Arrays.sort(frutas, Comparator.naturalOrder());
      System.out.println(Arrays.toString(frutas));
      
      // Reverte a lista de Palavras (strings)
      Arrays.sort(frutas, Comparator.reverseOrder());
      System.out.println(Arrays.toString(frutas));
      
      Arrays.sort(numeros); // Ordenar a Lista de Números Inteiros
      System.out.println(Arrays.toString(numeros));

    }
    
}
