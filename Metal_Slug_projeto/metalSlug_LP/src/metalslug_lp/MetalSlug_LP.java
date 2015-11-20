/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metalslug_lp;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Izaquiel
 */
public class MetalSlug_LP {
   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String nome = null;
            while(nome == null || nome.equals("")){
                nome = JOptionPane.showInputDialog("Digite seu nome para iniciar: ");
                if(nome == null || nome.equals("")){
                    JOptionPane.showMessageDialog(null, "Nome inválido!");
                }
            }
        
        
        Jogador player = new Jogador();
        new Cenario(player,nome);
    }    
}    
