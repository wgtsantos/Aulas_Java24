/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrata;

/**
 *
 * @author Suporte
 */
public abstract class Notificacao {
    
    protected String remetente;
    protected String destinatario;
    
    public Notificacao() {
        
    }
    
    public Notificacao(String remetente, String destinatario) {
        this.remetente = remetente;
        this.destinatario = destinatario;
    }
    
    public abstract void enviar(String mensagem);

    public String getRemenete() {
        return remetente;
    }

    public void setRemenete(String remenete) {
        this.remetente = remenete;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
      
}
