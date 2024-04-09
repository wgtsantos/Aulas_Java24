/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23;

/**
 *
 * @author Suporte
 */
public class Livro extends Midia{
    
    private String autor;
    
    public Livro() {
        super();
    }
    
    public Livro(String titulo, int anoLancamento, String autor) {
        super(titulo, anoLancamento);
        this.autor = autor;
    }

    @Override
    public void exibirMidias() {
        System.out.println("---------- Lista de Livros -------------");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Ano de Lançamento: " + this.getAnoLancamento());
        System.out.println("Diretor: " + this.getAutor());
        System.out.println("-----------------------------------------");
        
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
