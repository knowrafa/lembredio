/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembredio;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import sun.applet.Main;

/**
 *
 * @author elrafa
 */
public class Audio {
    public void playAudio(int tempo, boolean flag) throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException{
        Clip clip = AudioSystem.getClip();
        URL url = getClass().getResource("/audio/smb_die.wav");
        URL urlToHot = this.getClass().getResource("/audio/smb_die.wav");
        System.out.println(urlToHot);
        AudioClip  audio = Applet.newAudioClip(url);
        if(flag) audio.loop();
        else audio.stop();
        
    }
}
