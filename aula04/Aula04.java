/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04;

import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
        float nota1, nota2, nota3, media;
        String nome;
        
        System.out.print("Informe o nome do aluno(a): ");
        nome = ler.next();
        
        System.out.print("Informe a primeira nota: ");
        nota1 = ler.nextFloat();
        
        System.out.print("Informe a segunda nota: ");
        nota2 = ler.nextFloat();
        
        System.out.print("Informe a terceira nota: ");
        nota3 = ler.nextFloat();
        
        media = (nota1 + nota2 + nota3)/3;
        
        // System.out.println("A media das notas é: " + media);
        
        if (media >= 60) {
            
            System.out.println("Prezado(a) " + nome + ", voce foi Aprovado, sua nota Final e " + media);
            
        } else if (media >= 40 && media < 60){
            System.out.println("Prezado(a) " + nome + ", voce esta de recuperacao, sua nota Final e " + media);

        } else {
            System.out.printf("Prezado(a) " + nome + ", voce foi Reprovado, sua nota Final e " + media);
 
        }
        
    }
    
}
