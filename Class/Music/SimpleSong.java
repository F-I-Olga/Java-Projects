/*
Simplified version with little adaptability
*/

//Libraries needed for sound support
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.MidiChannel;


public class SimpleSong
{
	public static MidiChannel[] channels;
	public static String [] notes = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
	
	public static void main( String[] args ) 
	{
		
		try {
			//Create a synthesizer object
			Synthesizer synth = MidiSystem.getSynthesizer();
			//Open the object so we can use it
			synth.open();
			
			//We are only using 1 channel, but get them all
			channels = synth.getChannels();
			
			//Play song
			play("6D",  1000);
			rest(500);
			play("6D",  300);
			play("6C#", 300);
			play("6D",  1000);
			rest(500);
			play("6D",  300);
			play("6C#", 300);
			play("6D",  1000);
			play("6E",  300);
			play("6E",  600);
			play("6G",  300);
			play("6G",  600);
			rest(500);	
						
			//clean up
			synth.close();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}


	//Given a note string and a duration  play the note
	public static void play(String note, int duration) throws InterruptedException
	{
			int VOLUME = 80; // between 0 et 127
			
			// * start playing a note
			channels[0].noteOn(id(note), VOLUME );
			// * wait
			Thread.sleep( duration );
			// * stop playing a note
			channels[0].noteOff(id(note));
	}

	//Put the program to sleep to simulate a rest
	public static void rest(int duration) throws InterruptedException
	{
		Thread.sleep(duration);
	}
	
	//Given the string name of a note calculate the int value needed to play that note
	public static int id(String note)
	{
		int octave = Integer.parseInt(note.substring(0, 1));
		String noteE = note.substring(1);
		
		int index;
		for(index = 0; index< notes.length; index++) if (noteE.equals(notes[index])) break;
		
		return index + 12 * octave + 12;	
	}
	
}