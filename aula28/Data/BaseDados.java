/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author Suporte
 */
public class BaseDados {
    
    private ArrayList<Cliente> clientes = new ArrayList<>();
    
    public ArrayList Clientes() {
        
        getClientes().add(new Cliente(1, "João Marcos", "joao@gmail.com", "987.765.433-10", "Masculino" ,"(31) 98543-4532", 25, "Noturno", "Minas Gerais"));
        getClientes().add(new Cliente(2, "Maria Silva", "maria@email.com", "123.456.789-00", "Feminino", "(31) 98765-4321", 30, "Diurno", "São Paulo"));
        getClientes().add(new Cliente(3, "Pedro Oliveira", "pedro@outlook.com", "555.123.789-12", "Masculino", "(31) 98765-4321", 28, "Noturno", "Rio de Janeiro"));
        getClientes().add(new Cliente(4, "Ana Souza", "ana@yahoo.com", "789.321.654-09", "Feminino", "(31) 98765-4321", 22, "Matutino", "Bahia"));
        getClientes().add(new Cliente(5, "Carlos Santos", "carlos@hotmail.com", "456.789.123-45", "Masculino", "(31) 98765-4321", 40, "Vespertino", "Paraná"));
        getClientes().add(new Cliente(6, "Laura Mendes", "laura@gmail.com", "987.654.321-00", "Feminino", "(31) 98765-4321", 35, "Noturno", "Santa Catarina"));
        getClientes().add(new Cliente(7, "Rafael Lima", "rafael@live.com", "111.222.333-44", "Masculino", "(31) 98765-4321", 27, "Diurno", "Goiás"));
        getClientes().add(new Cliente(8, "Fernanda Costa", "fernanda@outlook.com", "222.333.444-55", "Feminino", "(31) 98765-4321", 33, "Noturno", "Pernambuco"));
        getClientes().add(new Cliente(9, "Lucas Almeida", "lucas@yahoo.com", "333.444.555-66", "Masculino", "(31) 98765-4321", 29, "Matutino", "Ceará"));
        getClientes().add(new Cliente(10, "Isabela Rodrigues", "isabela@gmail.com", "444.555.666-77", "Feminino", "(31) 98765-4321", 24, "Vespertino", "Rio Grande do Sul")); 
       
       return getClientes();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
}
