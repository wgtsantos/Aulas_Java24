/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07;

import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int num, soma = 0, opt;
        boolean check = true;
        
        System.out.println("Informe um número inteiro: ");
        num = ler.nextInt();
        
        while (check) {            
            
          soma = soma + num;
          
            System.out.println("Deseja informar mais um número? 1.SIM | 2.NÃO");
            opt = ler.nextInt();
            
            if (opt == 1) {
                
                check = true;
                System.out.println("Informe um número inteiro: ");
                num = ler.nextInt();
                
            } else {
                check = false;
                
            }
                        
        }
        
        System.out.println("A soma dos números digitados é: " + soma);
    }
    
}
