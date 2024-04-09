/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula20;

/**
 *
 * @author Suporte
 */
public class Aula20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Filme f1 = new Filme();
        Filme f2 = new Filme("Madame Teia", "Ação", 2, 180);
        
        Serie s1 = new Serie();
        Serie s2 = new Serie("Stranger Things", "Ficção", 9, 5);
        
        f1.setTitulo("Duna parte II");
        f1.setGenero("Ficção Científica");
        f1.setAvaliacao(7);
        f1.setDuracao(200);
        
        s1.setTitulo("The Boys");
        s1.setGenero("Ficção");
        s1.setAvaliacao(10);
        s1.setTemporadas(3);
        
        f1.exibirInfo();
        f2.exibirInfo();
        
        s1.exibirInfo();
        s2.exibirInfo();
        
    }
    
}
