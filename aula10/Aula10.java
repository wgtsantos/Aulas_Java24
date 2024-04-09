/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10;

/**
 *
 * @author Suporte
 */
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      int[] numeros = { 10, 5, 23, 18, 8, 25 };
       
      String[] frutas = { "Laranja", "Manga", "Abacate", "Abacaxi" };
      
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println("=> " + numeros[i]);
            
        }
        
        System.out.println("------------------------------------");
        
        for (String fruta : frutas) {
        
            System.out.println("=> " + fruta);
            
        }
        
    }
    
}
