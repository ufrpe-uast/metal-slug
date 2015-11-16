/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metal.slug;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author helder
 */
public class Cenario extends JFrame {
    
    public Personagem personagem;
    public JLabel fundo;
    public Cenario(Personagem p)
    {
        super("Metal Slug Java");
        personagem = p;
        
        setLayout(null);       
        
        add(personagem);
        personagem.setBounds(0, 200, 200, 100);
       
        
        setVisible(true);
        setSize(640,360);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        fundo = new JLabel(new ImageIcon("src/metal/slug/background.png"));
        add(fundo);
        fundo.setBounds(0, 0, 640, 360);
                
        addKeyListener(new Controle(this));
    }
        
        
}
