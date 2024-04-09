/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula19;

/**
 *
 * @author Suporte
 */
public class Pessoa {
    
    private String nome;
    private String telefone;
    private String cpf;
    private int idade;
    
    public Pessoa() {
        
    }
    
    public Pessoa( String nome, String telefone, String cpf, int idade) {
        
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.idade = idade;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

        
    
}
