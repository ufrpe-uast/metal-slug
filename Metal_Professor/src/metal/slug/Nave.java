/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metal.slug;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author helder
 */
class Nave extends JLabel{
   public int vida;
   public int forca;
   
   public Nave (String enderecoImagem)
   {
       super(new ImageIcon(enderecoImagem));
   }
   
}
