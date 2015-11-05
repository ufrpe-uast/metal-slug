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
    public Controle (Cenario c)
    {
        cenario = c;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override    
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && cenario.jogador.getX()<=500)
        {
                    cenario.jogador.setLocation(
                    cenario.jogador.getX()+10,
                    cenario.jogador.getY());
                          
                    cenario.jogador.setIcon(new ImageIcon("src/metalslug_lp/andando_dir.gif"));
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT && cenario.jogador.getX()>=10)
            {
                    cenario.jogador.setLocation(
                    cenario.jogador.getX()-10,
                    cenario.jogador.getY());
            
                    cenario.jogador.setIcon(new ImageIcon("src/metalslug_lp/andando_esq.gif"));
        }    
        
        else if (e.getKeyCode() == KeyEvent.VK_W)
            {
                    cenario.jogador.setIcon(new ImageIcon("src/metalslug_lp/atira_dir.gif"));
            //cenario.personagem.setBounds(, y, width, height);
        }
        
               
        else if (e.getKeyCode() == KeyEvent.VK_SPACE && cenario.jogador.getY()>= 250 && cenario.jogador.getX()>=0 && cenario.jogador.getX()<=450)
            {    
                    cenario.jogador.setLocation(
                    cenario.jogador.getX()+100,
                    cenario.jogador.getY()-50);  
        }
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        cenario.jogador.setIcon(new ImageIcon("src/metalslug_lp/parado.gif"));
        if(cenario.jogador.getY()<250) {
            cenario.jogador.setLocation(
            cenario.jogador.getX(),
            cenario.jogador.getY()+50);
        }
        
        //cenario.inimigo.setLocation(cenario.inimigo.getY()-5, 250);
    }
  
}
