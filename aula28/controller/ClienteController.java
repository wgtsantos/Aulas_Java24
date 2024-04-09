/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Data.BaseDados;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 *
 * @author Suporte
 */
public class ClienteController {
    
    BaseDados bd = new BaseDados();
    
    public void CadastrarCliente(int id, String nome, String email, String cpf, String sexo, String contato, int idade, String preferencia, String estado){
        
        bd.Clientes().add(new Cliente(id, nome, email, cpf, sexo, contato, idade, preferencia, estado));
        
    }
    
    public void exibirCadastro(){
        
        int x = bd.getClientes().size() - 1;
        
        JOptionPane.showMessageDialog(null, 
                "ID: " + bd.getClientes().get(x).getId() + "\n" +
                "Nome: " + bd.getClientes().get(x).getNome() + "\n" +
                "E-mail: " + bd.getClientes().get(x).getEmail() + "\n" +
                "CPF: " + bd.getClientes().get(x).getCpf() + "\n" +
                "Sexo: " + bd.getClientes().get(x).getSexo()+ "\n" +
                "Contato: " + bd.getClientes().get(x).getContato() + "\n" +
                "Idade: " + bd.getClientes().get(x).getIdade() + "\n" +
                "Preferência: " + bd.getClientes().get(x).getPreferencia() + "\n" +
                "Estado: " + bd.getClientes().get(x).getEstado(), 
                "Informações do Cadastro",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void listarClientes(){
               
        for (Cliente cliente : bd.getClientes()) {
            
            System.out.println(cliente.getNome());
        }  
    }
    
}
