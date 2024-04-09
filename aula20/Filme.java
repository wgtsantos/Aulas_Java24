/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula20;

/**
 *
 * @author Suporte
 */
public class Filme extends SenaiFlix {
    
    private int duracao;
    
    public Filme(){
        super();
    }
    
    public Filme(String titulo, String genero, int avaliacao, int duracao) {
        super(titulo, genero, avaliacao);
        this.duracao = duracao;
    }
    
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Duração: " + duracao + " minutos.");
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    
    
    
}
