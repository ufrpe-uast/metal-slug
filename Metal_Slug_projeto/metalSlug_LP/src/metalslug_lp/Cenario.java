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
    public JLabel pontos;
    public JLabel vida;
        
    
    
    
     
    public Cenario(Personagem p, String nome)
    {   
        super("Metal Slug Java");
        
        setVisible(true);
        setSize(1278,380);
        setResizable(true);
        
        jogador = (Jogador) p;
        
        setLayout(null);       
        
        jogador.posicao=-15;
        jogador.life=500;
        jogador.nome=nome;
        add(jogador);
        jogador.setBounds(jogador.posicao, 250, 100, 50);
        
        
        new ThreadJogador(this,jogador).start();
        
        novoInimigo();
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addKeyListener(new Controle(this));
         
        fundo = new JLabel(new ImageIcon("src/metalslug_lp/cenario_maior.png"));
        add(fundo);
        fundo.setBounds(0, 0, 1278, 360);
        
        pontos = new JLabel();
        vida = new JLabel();
        
        MostrarPontos(jogador.pontos);
        MostrarVida(jogador.life);
    }
    
   
    
    public void MostrarVida(int vidaJogador){
        remove(vida);
        vida.setBounds(550, 0, 300, 50);
        add(vida);
        vida.setText(jogador.nome+" "+vidaJogador);
        ajusteFundo();
    }
    
    public void MostrarPontos(int pontosJogador){
        remove(pontos);
        pontos.setBounds(650, 0, 300, 50);
        add(pontos);
        pontos.setText("Inimigos Mortos: "+pontosJogador);
        ajusteFundo();
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
