/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metalslug_lp;

/**
 *
 * @author Izaquiel
 */
public class Jogador extends Personagem {
    public int pontos;
    public int posicao=250;
    public char sentido='d'; /*direito: d, esquerdo: e*/
    
    public Jogador ()
    {
        super("src/metalslug_lp/parado.gif");
    }

    void setActionMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void setSentindo(char sentido) {
        this.sentido = sentido;
    }
    
    char getSentido() {
        return this.sentido;
    }
}
