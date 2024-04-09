/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula20;

/**
 *
 * @author Suporte
 */
public class Serie extends SenaiFlix {
    
    private int temporadas;
    
    public Serie() {
        super();
    }
    
    public Serie(String titulo, String genero, int avaliacao, int temporadas) {
        super(titulo, genero, avaliacao);
        this.temporadas = temporadas;        
    }
    
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Temporadas: " + temporadas);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    
    
}
