/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03;

import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class Aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int num1, num2, num3, calc;
        
        System.out.println("Informe um n?mero: ");
        num1 = ler.nextInt();
        
        System.out.println("Informe outro n?mero: ");
        num2 = ler.nextInt();
        
        System.out.println("Informe mais um n?mero: ");
        num3 = ler.nextInt();
        
        calc = num1 + num2 + num3;
        
        System.out.println("O resultado do c?lculo ?: " + calc);
        
    }
    
}
