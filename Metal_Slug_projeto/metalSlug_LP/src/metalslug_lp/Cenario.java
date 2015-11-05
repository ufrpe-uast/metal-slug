/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metalslug_lp;

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
        
        add(jogador);
        jogador.setBounds(0, 250, 100, 50);

        inimigo = new Inimigo();
        inimigo.setBounds(0, 250, 1250, 50);
        add(inimigo);
        
        //bala = new Bala();
                        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addKeyListener(new Controle(this));
         
        fundo = new JLabel(new ImageIcon("src/metalslug_lp/background.png"));
        add(fundo);
        //fundo.setBounds(0, 0, 640, 365);
                
        
        
        new ThreadInimigo(inimigo);
        
       
    }
    
    public void tiro(Bala bala1){
        add(bala);
       
       
    }
    
    public void novoTiro(Bala bala1){
       
        bala.setBounds(0, 250, 100, 50);
        
        
    }
   
}
