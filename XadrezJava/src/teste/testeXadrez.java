/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import xadrez.Bispo;
import xadrez.Cavalo;
import xadrez.Peao;
import xadrez.Peca;

/**
 *
 * @author Admin
 */
public class testeXadrez {
    
    public static void main(String [] args){
        
        
        Peca peao = new Peao();
        Peca cavalo = new Cavalo();
        Peca bispo = new Bispo();
        
        peao.movimento();
        cavalo.movimento();
        bispo.movimento();
        
        
        System.out.println(peao instanceof Peca);
        System.out.println(cavalo instanceof Peca);
        System.out.println(bispo instanceof Peca);
        
    }
    
}
