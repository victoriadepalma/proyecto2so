/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2so;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author dianasilvadeornelas
 */
public class SoundHandler {
    public static void RunMusic(String path){
        try{
        AudioInputStream inputStream=AudioSystem.getAudioInputStream(new File(path));
        Clip clip=AudioSystem.getClip();
        clip.open(inputStream);
        clip.loop(0);
        
        }catch(UnsupportedAudioFileException | IOException | LineUnavailableException e){
        }
    
}
}