/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23;

/**
 *
 * @author Suporte
 */
public class Filme extends Midia{
    
    private String nomeDiretor;
    
    public Filme() {
        super();
    }
    
    public Filme(String titulo, int anoLancamento, String nomeDiretor) {
        super(titulo, anoLancamento);
        this.nomeDiretor = nomeDiretor;
    }

    @Override
    public void exibirMidias() {
        System.out.println("---------- Lista de Filmes -------------");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Ano de Lançamento: " + this.getAnoLancamento());
        System.out.println("Diretor: " + this.getNomeDiretor());
        System.out.println("-----------------------------------------");
        
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }
    
}
