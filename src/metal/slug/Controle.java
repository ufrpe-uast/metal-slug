/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metal.slug;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author helder
 */
public class Controle implements KeyListener{
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
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            System.out.println("oi");
            cenario.personagem.setLocation(
                    cenario.personagem.getX()+10,
                    cenario.personagem.getY());
                          
            cenario.personagem.setIcon(new ImageIcon("src/metal/slug/andando_dir.gif"));
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT &&cenario.personagem.getX()>=10)
            {
            cenario.personagem.setLocation(
                    cenario.personagem.getX()-10,
                    cenario.personagem.getY());
            
            cenario.personagem.setIcon(new ImageIcon("src/metal/slug/andando_esq.gif"));
        }    
        
        else if (e.getKeyCode() == KeyEvent.VK_W)
            {
            
            cenario.personagem.setIcon(new ImageIcon("src/metal/slug/atira.gif"));
            //cenario.personagem.setBounds(, y, width, height);
            
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        cenario.personagem.setIcon(new ImageIcon("src/metal/slug/parado.gif"));        
    }
    
}
