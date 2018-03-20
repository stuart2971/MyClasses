import sun.audio.*;
import java.io.*;


//Example:
// MyMusic music = new MyMusic("/Users/John/Documents/Coding/");
// music.play("sound.wav");

public class MyMusic{
  String PATH;
  MyMusic(String PATH){
    this.PATH = PATH;
  }
  public void play(String Image_Name){
    try{
      InputStream test = new FileInputStream(PATH + Image_Name);
      AudioStream BGM = new AudioStream(test);
      AudioPlayer.player.start(BGM);
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
