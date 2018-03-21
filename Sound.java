import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

class Sound
{
	String source;
	
	public static void playSound(String file)
	{
		try{
			String soundName = file;
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		}catch(Exception e){}
	}
	
	Sound(String _source)
	{
		source = _source;
	}
	
	public void play()
	{
		playSound(source);
	}
}