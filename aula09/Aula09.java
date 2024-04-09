/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09;

/**
 *
 * @author Suporte
 */
public class Aula09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int[] numeros = { 10, 5, 23, 18, 8, 25 };
       
       String[] frutas = { "Laranja", "Manga", "Abacate", "Abacaxi" };
       
       int num = numeros[2];
       String fruta = frutas[3];
       
       System.out.println(num);
       System.out.println(fruta);
       
       int total_num = numeros.length;
       int total_f = frutas.length;
       
       System.out.println("Quantidade de Números no array: " + total_num);
       System.out.println("Quantidade de Frutas no array: " + total_f);
       
    }
    
}
