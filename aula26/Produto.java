/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula26;

/**
 *
 * @author Suporte
 */
public class Produto {
    
    private String nome;
    private double preco;
    private int qtde;
    
    public Produto() {
        
    }
    
    public Produto(String nome, double preco, int qtde) {
        
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
        
    }
    
    public double exibirOrcamento(){
        double total = getPreco() * getQtde();
        return total;  
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    
           
        
}
