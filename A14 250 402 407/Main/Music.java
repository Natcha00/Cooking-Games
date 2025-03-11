package Main;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music{
    Clip clip;
    URL[] soundURL = new URL[10];

    public Music() {
        soundURL[0] = getClass().getResource("/Sound/BG.wav");// bgm
        soundURL[1] = getClass().getResource("/Sound/Click.wav");//click
        soundURL[2] = getClass().getResource("/Sound/SFX_UI_Cancel.wav");
        soundURL[3] = getClass().getResource("/Sound/hungry.wav");
        soundURL[4] = getClass().getResource("/Sound/dontbuy.wav");
        soundURL[5] =  getClass().getResource("/Sound/Irsshimase.wav");
        soundURL[6] = getClass().getResource("/Sound/Level Up 2 (miniclip).wav");

    }

    public void setFiles(int i) {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
   public void play(){
    clip.start();
   }
    
    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop(){
        clip.stop();
    }
    
}