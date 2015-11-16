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
<<<<<<< HEAD:Metal_Slug_projeto/metalSlug_LP/src/metalslug_lp/Jogador.java
=======
    public int posicao=250;
    public char sentido='d'; /*direito: d, esquerdo: e*/
    public boolean podeAtirar = true;
>>>>>>> 32f16de8afeb14c952d38777aca196785b529e28:src/metalslug_lp/Jogador.java
    
    public Jogador() {
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
