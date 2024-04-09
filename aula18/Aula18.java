/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula18;

/**
 *
 * @author Suporte
 */
public class Aula18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        
        p1.nome = "Mouse";
        p1.marca = "Logitech";
        p1.preco = 26.80;
        p1.qtde = 8;
        
        p2.nome = "Teclado";
        p2.marca = "Corsair";
        p2.preco = 316.80;
        p2.qtde = 3;
        
        p1.alterarValor(125.00);
        p2.alterarValor(357.99);
        
        p1.desconto(0.10);
        p2.desconto(0.25);
        
        p1.alterarQtde(4);
        p2.alterarQtde(-3);
        
        p1.mostrarProduto();
        p1.somaTotal();
        
        p2.mostrarProduto();
        p2.somaTotal();
    }
    
}
