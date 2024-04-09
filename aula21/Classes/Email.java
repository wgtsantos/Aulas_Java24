/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Abstrata.Notificacao;

/**
 *
 * @author Suporte
 */
public class Email extends Notificacao{
    
    protected String email;
    
    public Email() {
        super();
    }
    
    public Email(String remetente, String destinatario, String email) {
        super(remetente, destinatario);
        this.email = email;
    }

    @Override
    public void enviar(String mensagem) { 
        
        System.out.println("------------- E-MAIL -----------"); 
        System.out.println("E-mail enviado para: " + destinatario); 
        System.out.println("Mensagem: " + mensagem);
        System.out.println("De: " + remetente); 
        System.out.println("E-mail: " + email);      
        System.out.println("--------------------------------"); 
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
