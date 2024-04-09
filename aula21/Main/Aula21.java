/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula21;

import Abstrata.Notificacao;
import Classes.Chat;
import Classes.Email;
import Classes.Sms;
import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class Aula21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        String dest, remet, email, contato, msg;
        Notificacao send;
        
        System.out.println("-------Sistema de envio de Mensagens------");
        System.out.print("Informe o nome do Destinatário: ");
        dest = ler.nextLine();
        
        System.out.print("Informe seu nome: ");
        remet = ler.nextLine();
        
        System.out.println("Informe sua Mensagem: ");
        msg = ler.nextLine();
        
        System.out.println("---------------- MENU ---------------");
        System.out.println("Escolha as opções Abaixo: ");
        System.out.println("1.E-MAIL ----------------------");
        System.out.println("2.SMS -------------------------");
        System.out.println("3.CHAT -------------------------");
        System.out.print("=> ");
        int opt = ler.nextInt();
        
        switch (opt) {
            case 1:
                System.out.print("Informe e-mail do destinatário: ");
                String mail = ler.next();
                send = new Email(remet, dest, mail);
                send.enviar(msg);
                break;
            case 2:
                System.out.print("Informe o telefone do destinatário: ");
                String tel = ler.next();
                send = new Sms(remet, dest, tel);
                send.enviar(msg);
                break;
            case 3:
                send = new Chat(remet, dest);
                send.enviar(msg);
                break;
            default:
                System.out.println("Opção inválida! Erro ao enviar mensagem!");   
                System.out.println("Tente novamente!");   
        }
    }
    
}
