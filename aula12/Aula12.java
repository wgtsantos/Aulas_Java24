/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12;

import java.util.Arrays;

/**
 *
 * @author Suporte
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int[] numeros = { 10, 5, 23, 18, 8, 25 };
       
       int limite = 3;
       
       int[] num_limit = Arrays.copyOf(numeros, limite);
       
       System.out.println(Arrays.toString(num_limit));
        
    }
    
}
