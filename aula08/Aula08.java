/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08;

import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class Aula08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double num1, num2, result;
        boolean check;

        System.out.println("Insira um número: ");
        num1 = ler.nextDouble();
        
        System.out.println("Insira outro número: ");
        num2 = ler.nextDouble();

        do {
            
        check = false;
            
        System.out.println("Escolha qual será a forma de cálculo: ");
        System.out.println("1.SOMAR / 2.SUBTRAIR / 3.MULTIPLICAR / 4. DIVIDIR");
        int calc = ler.nextInt();
                
        switch (calc) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if(num2 != 0) {
                    result = num1 / num2;
                } else {
                    result = num2 / num1;
                }
                break;
            default:
                System.out.println("Opção de Cálculo inválida!");
                result = 0;
        }
        
        if(result == 0){
            check = true;
        } 
        
    } while (check);
       
        System.out.printf("O resultado do cálculo escolhido é : %.2f\n ", result);
        
    }
    
}
