/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula23;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Suporte
 */
public class Aula23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       List<Midia> colecoes = new ArrayList<>();
       
       colecoes.add(new Filme("O Hobbit 1", 2012, "Peter Jackson"));
       colecoes.add(new Filme("Interestelar", 2014, "Christopher Nolan"));
       colecoes.add(new Filme("Oppenheimer", 2023, "Christopher Nolan"));
       
       colecoes.add(new Livro("Poderoso Chefão", 1969, "Mário Puzo"));
       colecoes.add(new Livro("Assasinato no Expresso do Oriente", 2014, "Agatha Christie"));
       colecoes.add(new Livro("Jogos Vorazes Em Chamas", 2008, "Suzanne Collins"));

        for (Midia colecao : colecoes) {
            
            colecao.exibirMidias();
            
        }
       
       
    }
    
}
