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
    
    public Controle (Cenario c) {
        cenario = c;
        cenario.jogador.setIcon(new ImageIcon("src/metalslug_lp/parado_dir.gif"));
    }

    @Override
    public void keyTyped(KeyEvent e) {        
    }

    @Override    
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && cenario.jogador.getX()<=500) {
            cenario.jogador.setSentindo('d');
            cenario.jogador.setLocation(cenario.jogador.getX()+10, cenario.jogador.getY());
            cenario.jogador.posicao=cenario.jogador.getX();      
            cenario.jogador.setIcon(new ImageIcon("src/metalslug_lp/andando_dir.gif"));
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT && cenario.jogador.getX()>=10) {
            cenario.jogador.setSentindo('e');
            cenario.jogador.setLocation(cenario.jogador.getX()-10, cenario.jogador.getY());
            cenario.jogador.posicao=cenario.jogador.getX();  
            cenario.jogador.setIcon(new ImageIcon("src/metalslug_lp/andando_esq.gif"));
        }    
        
        else if (e.getKeyCode() == KeyEvent.VK_W) {                               
            cenario.bala=new Bala();
            cenario.novoTiro(cenario.bala);
            cenario.tiro(cenario.bala);
            new ThreadBala(cenario.bala,cenario).start();

            if(cenario.jogador.getSentido() == 'd') {
                cenario.jogador.setIcon(new ImageIcon("src/metalslug_lp/atira_dir.gif"));
            }
            if(cenario.jogador.getSentido() == 'e') {
                cenario.jogador.setIcon(new ImageIcon("src/metalslug_lp/atira_esq.gif"));
            }                
        }
        
               
        else if (e.getKeyCode() == KeyEvent.VK_SPACE && cenario.jogador.getY()>= 250 && 
                cenario.jogador.getX()>=0 && cenario.jogador.getX()<=450) {    
            cenario.jogador.setLocation(
            cenario.jogador.getX()+100,
            cenario.jogador.getY()-50);  
        }        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(cenario.jogador.getSentido() == 'd')
            cenario.jogador.setIcon(new ImageIcon("src/metalslug_lp/parado_dir.gif"));
        
        if(cenario.jogador.getSentido() == 'e')
            cenario.jogador.setIcon(new ImageIcon("src/metalslug_lp/parado_esq.gif"));
        
        if(cenario.jogador.getY()<250) {
            cenario.jogador.setLocation(
            cenario.jogador.getX(),
            cenario.jogador.getY()+50);
        }        
    }
    
}
