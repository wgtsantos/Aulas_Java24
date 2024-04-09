/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula19;

/**
 *
 * @author Suporte
 */
public class Aula19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        
        Pessoa p2 = new Pessoa("Maria", "31 99876-5435", "432.654.876-56", 18);
        
        p1.setNome("Wellington");
        p1.setTelefone("31 93532-3145");
        p1.setCpf("123.678.543-67");
        p1.setIdade(25);
        
        
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Telefone: " + p1.getTelefone());
        System.out.println("CPF: " + p1.getCpf());
        System.out.println("Idade: " + p1.getIdade());
        
        System.out.println("-----------------------------------");
        
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Telefone: " + p2.getTelefone());
        System.out.println("CPF: " + p2.getCpf());
        System.out.println("Idade: " + p2.getIdade());
        
    }
    
}
