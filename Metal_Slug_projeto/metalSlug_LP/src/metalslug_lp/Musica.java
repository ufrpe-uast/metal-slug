/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metalslug_lp;
import java.awt.event.*;
import javax.swing.*;
import sun.audio.*;
import java.io.*;

/**
 *
 * @author Ivo
 */
public class Musica {
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        JButton button = new JButton("Clique");
        frame.add(button);
        button.addActionListener(new Al());
        frame.show(true);
            
    }
    
    

    private static class Al implements ActionListener {
        @Override
        public final void actionPerformed(ActionEvent e) {
            music();
            
        }}



public static void music()
{
    AudioPlayer MGP = AudioPlayer.player;
    AudioStream BGM;
    AudioData MD;

    ContinuousAudioDataStream loop = null;
    
try{
    BGM = new AudioStream(new FileInputStream("the_walking_dead_theme.mp3"));
    MD = BGM.getData();
    loop = new ContinuousAudioDataStream(MD);

}catch(IOException error){}

MGP.start(loop);
}
}
