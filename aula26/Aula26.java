/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula26;

import javax.swing.JOptionPane;

/**
 *
 * @author Suporte
 */
public class Aula26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        
        try {
            
            p1.setNome(String.valueOf(JOptionPane.showInputDialog(
                    null,"Informe o nome do produto:",
                    "Orçamento", 
                    JOptionPane.INFORMATION_MESSAGE)));
            
            p1.setPreco(Double.parseDouble(JOptionPane.showInputDialog(
                    null,"Informe o valor do produto:",
                    "Orçamento", 
                    JOptionPane.INFORMATION_MESSAGE)));
            
            p1.setQtde(Integer.parseInt(JOptionPane.showInputDialog(
                    null,"Informe a Quantidade:",
                    "Orçamento", 
                    JOptionPane.INFORMATION_MESSAGE)));
            
            JOptionPane.showMessageDialog(null,
                    "Nome do produto: " + p1.getNome() + "\n" +
                    "Preço: " + p1.getPreco() + "\n" +
                    "Quantidade: " + p1.getQtde() + "\n" +
                    "Valor Total á pagar: " + p1.exibirOrcamento(),
                    "Orçamento Final", 
                    JOptionPane.INFORMATION_MESSAGE);
            
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, 
                    "Os dados informados são inválidos!", 
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
}
