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
    public Personagem personagem;
    
    public Cenario(Personagem p)
    {
    super("Metal Slug Java");
        personagem = p;
        
        setLayout(null);       
        
        add(personagem);
        personagem.setBounds(0, 250, 100, 50);

        
        setVisible(true);
        setSize(640,400);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        fundo = new JLabel(new ImageIcon("src/metalslug_lp/background.png"));
        add(fundo);
        fundo.setBounds(0, 0, 640, 365);
                
        addKeyListener(new Controle(this));
    }
    
    
}
