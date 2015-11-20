/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metalslug_lp;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Izaquiel
 */
public class Controle implements KeyListener {
    public Cenario cenario;
    public Bala bala;
    public Controle (Cenario c)
    {
        cenario = c;
    }

    @Override
    public void keyTyped(KeyEvent e) {        
    }

    @Override    
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && cenario.jogador.getX()<=1200) {
                    cenario.jogador.sentido='d';
                    cenario.jogador.setLocation(
                    cenario.jogador.getX()+5,
                    cenario.jogador.getY());
                    cenario.jogador.posicao=cenario.jogador.getX();      
                    cenario.jogador.setIcon(new ImageIcon("src/metalslug_lp/andando_dir.gif"));
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT && cenario.jogador.getX()>=0) {
                    cenario.jogador.sentido='e';
                    cenario.jogador.setLocation(
                    cenario.jogador.getX()-5,
                    cenario.jogador.getY());
                    cenario.jogador.posicao=cenario.jogador.getX();  
                    cenario.jogador.setIcon(new ImageIcon("src/metalslug_lp/andando_esq.gif"));
        }    
        
        else if (e.getKeyCode() == KeyEvent.VK_W) {
                if(cenario.jogador.sentido=='d'){
                    cenario.jogador.setIcon(new ImageIcon("src/metalslug_lp/atira_dir.gif"));
                }
                else if(cenario.jogador.sentido=='e'){
                    cenario.jogador.setIcon(new ImageIcon("src/metalslug_lp/atira_esq.gif"));
                }                            
                cenario.bala=new Bala();
                cenario.bala.posicao = cenario.jogador.posicao;
                cenario.novoTiro(cenario.bala);
                new ThreadBala(cenario.bala,cenario,cenario.jogador.sentido).start();
        }
        
               
        else if (e.getKeyCode() == KeyEvent.VK_SPACE && cenario.jogador.getY()>= 250 && cenario.jogador.getX()>=-10 && cenario.jogador.getX()<=1150)
            {    
                if(cenario.jogador.sentido=='d'){
                    cenario.jogador.setLocation(
                    cenario.jogador.getX()+100,
                    cenario.jogador.getY()-50);  
                    cenario.jogador.posicao=cenario.jogador.getX(); 
                }
                else{
                    cenario.jogador.setLocation(
                    cenario.jogador.getX()-100,
                    cenario.jogador.getY()-50);  
                    cenario.jogador.posicao=cenario.jogador.getX();
                }
        }
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(cenario.jogador.getY()<250) {
            cenario.jogador.setLocation(
            cenario.jogador.getX(),
            cenario.jogador.getY()+50);
        }
        
        if(cenario.jogador.sentido=='d'){
            cenario.jogador.setIcon(new ImageIcon("src/metalslug_lp/parado.gif"));
            }
            else if(cenario.jogador.sentido=='e'){
            cenario.jogador.setIcon(new ImageIcon("src/metalslug_lp/atira_esq.gif"));
            }
            cenario.jogador.posicao=cenario.jogador.getX(); 
    }
  
}
