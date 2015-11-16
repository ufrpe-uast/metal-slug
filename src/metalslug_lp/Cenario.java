/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metalslug_lp;

import java.awt.Color;
import javafx.scene.layout.BackgroundImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author Izaquiel
 */
public class Cenario extends JFrame {
    
    public JLabel fundo;
    public int fase;
    public Jogador jogador;
    public Inimigo inimigo;
    public Bala bala;
<<<<<<< HEAD:Metal_Slug_projeto/metalSlug_LP/src/metalslug_lp/Cenario.java
        
    
    
    
=======
>>>>>>> 32f16de8afeb14c952d38777aca196785b529e28:src/metalslug_lp/Cenario.java
     
    public Cenario(Personagem p) {   
        super("Metal Slug Java");
        
        setVisible(true);
        setSize(640,400);
        setResizable(true);
        
        jogador = (Jogador) p;
        
        setLayout(null);       
        
        jogador.posicao=0;
        jogador.life=200;
        add(jogador);
        jogador.setBounds(jogador.posicao, 250, 100, 50);
        
        new ThreadJogador(this,jogador).start();
        
        novoInimigo();
        
<<<<<<< HEAD:Metal_Slug_projeto/metalSlug_LP/src/metalslug_lp/Cenario.java
        
                        
=======
        inimigo = new Inimigo();
        inimigo.setBounds(500, 255, 40, 40);
        add(inimigo);
        
>>>>>>> 32f16de8afeb14c952d38777aca196785b529e28:src/metalslug_lp/Cenario.java
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addKeyListener(new Controle(this));
         
        fundo = new JLabel(new ImageIcon("src/metalslug_lp/background.png"));
        add(fundo);
        fundo.setBounds(0, 0, 640, 365);
        
<<<<<<< HEAD:Metal_Slug_projeto/metalSlug_LP/src/metalslug_lp/Cenario.java
        
        
        
       
    }
    
    
    public void novoTiro(Bala bala1){
       bala1.setBounds(bala.posicao, 250, 100, 50);
       add(bala1);
        ajusteFundo();
    }
    
    public void novoInimigo(){
        inimigo = new Inimigo();
        inimigo.posicao=600;
        inimigo.life=100;
        inimigo.setBounds(inimigo.posicao, 250, 100, 50);
        add(inimigo);
        repaint();
        new ThreadInimigo(inimigo,this).start();
    }
    
    public void ajusteFundo(){
        remove(fundo);
        add(fundo);
=======
        new ThreadInimigo(inimigo);
    }
    
    public void tiro(Bala bala1) {
        add(bala);
    }
    
    public void novoTiro(Bala bala1) {       
       bala1.setBounds(jogador.posicao, 250, 100, 50);
       add(bala1);
       remove(fundo);
       add(fundo);
>>>>>>> 32f16de8afeb14c952d38777aca196785b529e28:src/metalslug_lp/Cenario.java
    }
    
}
