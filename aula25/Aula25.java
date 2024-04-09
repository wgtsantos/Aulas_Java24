/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula25;

import javax.swing.JOptionPane;

/**
 *
 * @author Suporte
 */
public class Aula25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num1, num2, total;
        
        try {
            
            num1 = Integer.valueOf(JOptionPane.showInputDialog(
                null, "Informe o primero número:",
                "Somar Números", 
                JOptionPane.INFORMATION_MESSAGE));
        
            num2 = Integer.valueOf(JOptionPane.showInputDialog(
                    null, "Informe o Segundo número:",
                    "Somar Números", 
                    JOptionPane.INFORMATION_MESSAGE));

            total = num1 + num2;

            JOptionPane.showMessageDialog(null, 
                    "A soma dos Números é igual à: " + total,
                    "Resultado", 
                    JOptionPane.INFORMATION_MESSAGE);
            
            
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, 
                    "Por favor, informe somente números inteiros!",
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            
        }

        
    }
    
}
