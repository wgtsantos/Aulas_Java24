/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula18;

/**
 *
 * @author Suporte
 */
public class Produto {
    
    String nome;
    String marca;
    int qtde;
    double preco;
    double total;
    
    void mostrarProduto() {
        
        System.out.println("---------------------------");
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Quantidade: " + qtde);
        System.out.println("Preço: " + preco);
    }
    
    void alterarValor(double valor) {
        
        double novoValor = valor;
        preco = novoValor;
    }
    
    void desconto(double desc) {
        
        double result = preco - (preco * desc);
        preco = result;
    }
    
    void alterarQtde(int qt) {
        
        qtde += qt;
        
    }
    
    void somaTotal() {
        
        if (qtde <= 0) {
            System.out.println("Produto Esgotado!!");
        }
        
        total = preco * qtde;
        System.out.println("Valor total dos " + nome + "s" );
        System.out.printf("=> %.2f\n" , total);
        
    }
    
}
