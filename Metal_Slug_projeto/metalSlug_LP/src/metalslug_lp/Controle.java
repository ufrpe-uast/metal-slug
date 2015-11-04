/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metalslug_lp;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Izaquiel
 */
public class Controle implements KeyListener {
    public Cenario cenario;
    public Controle (Cenario c)
    {
        cenario =c;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && cenario.personagem.getX()<=500)
        {
            cenario.personagem.setLocation(
                    cenario.personagem.getX()+5,
                    cenario.personagem.getY());
                          
            cenario.personagem.setIcon(new ImageIcon("src/metalslug_lp/andando_dir.gif"));
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT && cenario.personagem.getX()>=10)
            {
            cenario.personagem.setLocation(
                    cenario.personagem.getX()-10,
                    cenario.personagem.getY());
            
            cenario.personagem.setIcon(new ImageIcon("src/metalslug_lp/andando_esq.gif"));
        }    
        
        else if (e.getKeyCode() == KeyEvent.VK_W)
            {
            cenario.personagem.setIcon(new ImageIcon("src/metalslug_lp/atira_dir.gif"));
            //cenario.personagem.setBounds(, y, width, height);
        }
        
               
        else if (e.getKeyCode() == KeyEvent.VK_SPACE && cenario.personagem.getY()>= 250 && cenario.personagem.getX()>=0 && cenario.personagem.getX()<=450)
            {    
                    cenario.personagem.setLocation(
                    cenario.personagem.getX()+100,
                    cenario.personagem.getY()-50);  
        }
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        cenario.personagem.setIcon(new ImageIcon("src/metalslug_lp/parado.gif"));
                    if(cenario.personagem.getY()<250){
                    cenario.personagem.setLocation(
                    cenario.personagem.getX(),
                    cenario.personagem.getY()+50);
                    }
    }
   
}
