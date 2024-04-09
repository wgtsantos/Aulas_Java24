/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula06;

import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int num, var_ini, var_fim;
        
        System.out.println("Informe o divisor: ");
        num = ler.nextInt();
        
        System.out.println("Informe o intervalo dos numeros que poderão ser divisiveis por "+ num);
        
        System.out.println("Informe o valor inicial: ");
        var_ini = ler.nextInt();
        System.out.println("Informe o valor Final: ");
        var_fim = ler.nextInt();
        
        System.out.println("Os números divisiveis por " + num + " do intervalo informado são: ");
        
        for (int i = var_ini; i <= var_fim; i++) {
            
            if (i % num == 0) {
                
                System.out.println(i);
            } 
        }    
    }
    
}
