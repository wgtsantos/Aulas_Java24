/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula22;

import Classes.MovePlayer;
import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class Aula22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        MovePlayer.setLimiteDeCasas(30);
        
        MovePlayer p1 = new MovePlayer();
              
        p1.iniciarJogo();
                
        
        do {   
            System.out.print("Aperte enter para jogar! ");
            ler.nextLine();
            
            p1.jogarRodada();
        } while (!p1.verificaFimDoJogo());
 
        

    }
    
}
