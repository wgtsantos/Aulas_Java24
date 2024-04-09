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
public class Chat extends Notificacao{
    
 
    public Chat() {
        super();
    }
    
    public Chat(String remetente, String destinatario) {
        super(remetente, destinatario);
    }
    
    @Override
    public void enviar(String mensagem) {
        
        System.out.println("------------- CHAT -----------"); 
        System.out.println("Chat enviado para: " + destinatario); 
        System.out.println("Mensagem: " + mensagem);
        System.out.println("De: " + remetente);   
        System.out.println("--------------------------------"); 
        
    }
    
}
