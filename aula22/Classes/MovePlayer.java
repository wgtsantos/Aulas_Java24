/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Interfaces.CheckJogo;
import Interfaces.JogoDeTabuleiro;

/**
 *
 * @author Suporte
 */
public class MovePlayer implements JogoDeTabuleiro, CheckJogo{
    
    private int posicaoAtualJogador;
    private int posicaoAtualCpu;
    private static int limiteDeCasas;

    public MovePlayer(){
        
    }
    
    public MovePlayer(int limiteDeCasas) {
        this.posicaoAtualJogador = 0;
        this.posicaoAtualCpu = 0;
        MovePlayer.limiteDeCasas = limiteDeCasas;
    }

    @Override
    public void iniciarJogo() {
        
        System.out.println("Jogo iniciado!! Chegue até a casa " + getLimiteDeCasas() + " para vencer!");
        this.setposicaoAtualJogador(0);
        this.setposicaoAtualCpu(0);
        
    }

    @Override
    public void jogarRodada() {
        
        int avancoJogador = (int) (Math.random() * 6) + 1;
        posicaoAtualJogador += avancoJogador;
        System.out.println("Você avançou " + avancoJogador + " casas. Sua posição atual é " + posicaoAtualJogador);
        
        if (this.verificaFimDoJogo()) {
             this.finalizarJogo();
             
        } else {
            
        int avancoCpu = (int) (Math.random() * 6) + 1;
        posicaoAtualCpu += avancoCpu;
        System.err.println("Seu Adversário avançou " + avancoCpu + " casas. A Posição atual dele é " + posicaoAtualCpu);
        
           if (this.verificaFimDoJogo()) {
             this.finalizarJogo();
            }
        
        }

    }

    @Override
    public boolean verificaFimDoJogo() {
        return posicaoAtualJogador >= limiteDeCasas || posicaoAtualCpu >= limiteDeCasas;
    }

    @Override
    public void finalizarJogo() {
        
        if (posicaoAtualJogador >= limiteDeCasas) {
            System.out.println("Parabéns!! você venceu o jogo!!!");
        } else {
            System.err.println("Seu Adversário venceu o jogo!!!");
        }
        
        
    }

    public int getLimiteDeCasas() {
        return limiteDeCasas;
    }

    public static void setLimiteDeCasas(int limiteDeCasas) {
        MovePlayer.limiteDeCasas = limiteDeCasas;
    }

    public int getposicaoAtualJogador() {
        return posicaoAtualJogador;
    }

    public void setposicaoAtualJogador(int posicaoAtualJogador) {
        this.posicaoAtualJogador = posicaoAtualJogador;
    }
    
    public int getposicaoAtualCpu() {
        return posicaoAtualCpu;
    }

    public void setposicaoAtualCpu(int posicaoAtualCpu) {
        this.posicaoAtualCpu = posicaoAtualCpu;
    }
    
}
