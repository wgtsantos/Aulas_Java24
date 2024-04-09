/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class Aula17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner ler = new Scanner(System.in);
       
       List<String> nome = new ArrayList<>();
       List<Integer> idade = new ArrayList<>();
       
       boolean check;
       int i = 0;
       
        do { 
            
            System.out.print("Informe o nome do Cliente: ");
            nome.add(i, ler.next());
            
            System.out.print("Informe a idade do Cliente " + nome.get(i) + ": ");
            idade.add(i, ler.nextInt());
            
            System.out.println("Deseja Cadastrar outro Cliente? 1.SIM / 2.NÃO");
            int resp = ler.nextInt();
            
            check = (resp == 1);
            
            i++;
            
        } while (check);
        
        System.out.println("Foram cadastrados " + nome.size() + " Cliente(s)");
        
        System.out.println("Deseja visualizar os clientes cadastrados? 1.SIM / 2.NÃO");
        int opt = ler.nextInt();
        
        if (opt == 1) {
            
            for (int j = 0; j < nome.size(); j++) {
                
                System.out.println("Cliente 0" + j + ": " + nome.get(j));
                System.out.println("Idade: " + idade.get(j));
                System.out.println("----------------------------------------");                
            }
            
        } else {
            System.out.println("Sistema Finalizado!");
        }
        
    }
    
}
