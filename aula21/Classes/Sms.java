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
public class Sms extends Notificacao{
    
    protected String num_tel;
    
    public Sms() {
        super();
    }
    
    public Sms(String remetente, String destinatario, String num_tel) {
        super(remetente, destinatario);
        this.num_tel = num_tel;
    }

    @Override
    public void enviar(String mensagem) {
        
        System.out.println("------------- SMS -----------"); 
        System.out.println("Sms enviado para: " + destinatario); 
        System.out.println("Mensagem: " + mensagem);
        System.out.println("De: " + remetente); 
        System.out.println("Contato: " + num_tel);      
        System.out.println("--------------------------------"); 
        
    }

    public String getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }
    
}
