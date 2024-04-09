/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14;

import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class Aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      String[] frutas = { "Laranja", "Manga", "Abacate", "Abacaxi" };  
        
      Scanner ler = new Scanner(System.in);
      boolean buscar = false;
      
      System.out.print("Informe uma Fruta: ");
      String f = ler.next();
      
        for (String fruta : frutas) {
            
            if (f.equals(fruta)) {
                buscar = true;
                break;
            }
        }
        
        if (buscar) {
            System.out.println("A fruta " + f + " foi encontrado no Array!");
        } else {
            System.out.println("A Fruta " + f + " não foi encontrado no Array!");
        }
        
    }
    
}
