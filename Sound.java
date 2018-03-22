import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

class Sound
{
	String source;
	
	//play sound from path: Sound.playSound("path/sound.wav");
	public static void playSound(String file)
	{
		try{
			String soundName = file;
			if(soundName.charAt(soundName.length() - 4) != '.')
			{
				soundName = soundName + ".wav";
			}
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	//constructor for sound object: Sound sound= new Sound("path/sound.wav")
	//use with sound.play()
	Sound(String _source)
	{
		source = _source;
	}
	
	public void play()
	{
		playSound(source);
	}
	
	//sound directory object: Sound.SoundDir dir = new Sound.SoundDir("path");
	//use with dir.playSound("sound.wav")
	public static class SoundDir
	{
	  String path;
		
	  SoundDir(String _path)
		{
	    path = _path;
			if(path.charAt(path.length() - 1) != '/')
			{
				path = path + "/";
			}
	  }
		
	  public void playSound(String file){
	    Sound.playSound(path + file);
	  }
	}
}