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
public class Cenario extends JFrame{
    public JLabel fundo;
    public int fase;
    public Jogador jogador;
    public Inimigo inimigo;
    public Bala bala;
        
    
    
    
     
    public Cenario(Personagem p)
    {   
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
        
        
                        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addKeyListener(new Controle(this));
         
        fundo = new JLabel(new ImageIcon("src/metalslug_lp/background.png"));
        add(fundo);
        fundo.setBounds(0, 0, 640, 365);
        
        
        
        
       
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
    }
   
}
