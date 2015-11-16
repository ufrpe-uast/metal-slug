/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metalslug_lp;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Izaquiel
 */
public class Personagem extends JLabel {
    public int life;
    public int forca;
    public int posicao;
    public char sentido='d';
    
    public Personagem (String enderecoImagem)
    {
    super(new ImageIcon(enderecoImagem));
    }
}
