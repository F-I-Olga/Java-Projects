/*
Interface lab assignment. 
Study the below code and then make the changes outlined in the below comments
11-12-2020
*/
//OLGA INGABIRE
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.*;
import java.util.Scanner;

/*
10 Points
Task 1 : 	The below code is altered from a working program. Fix it so that it works again using the below instructions. 
			Add comments to improve the overall code quality and explain how it is working. Use web research where needed. 
*/
 
 
 /*
 10 Points
 Task 2 : Make this an interface and then add comments describing what it is for
 */
interface midiPlayer 
{
	String [] notes = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
	int VOLUME = 80; // 0-127
	
//This method prints all the available instruments
	public static void printInstruments()
		{
			System.out.println("Available Instruments are:");
			System.out.println("0. PIANO");
			System.out.println("1. HARPSICHORD");
			System.out.println("2. XYLOPHONE");
			System.out.println("3. CHURCH_ORGAN");
			System.out.println("4. REED_ORGAN");
			System.out.println("5.HARMONICA");
			System.out.println("6. GUITAR");
			System.out.println("7. ELECTRIC_GUITAR");
			System.out.println("8. VIOLIN");
			System.out.println("9. HARP");
			System.out.println("10. TIMPANI");
			System.out.println("11. TRUMPET");
			System.out.println("12. TROMBONE");
			System.out.println("13. OBOE");
			System.out.println("14. FLUTE");
			System.out.println("15. BANJO");
			System.out.println("16. STEEL_DRUMS");
		}
}




 /*
 10 Points
 Task 2 : Make this an interface and then add comments describing what it is for and what each method is for
 
interface MidiInstrument {
	public static int getMidiValue(String e);
}*/
interface midiInstrument
{
	//The midiValues for each instrument
	final int 	PIANO = 0,
				HARPSICHORD = 6,
				XYLOPHONE = 13,
				CHURCH_ORGAN = 19,
				REED_ORGAN = 20,
				HARMONICA = 22,
				GUITAR = 24,
				ELECTRIC_GUITAR = 27,
				VIOLIN = 40,
				HARP = 46,
				TIMPANI = 47,
				TRUMPET = 56,
				TROMBONE = 57,
				OBOE = 68,
				FLUTE = 73,
				BANJO = 105,
				STEEL_DRUMS = 114;
				
	//This methods takes a string value with an instrument name and returns the midvalue of the instrument
	public static int getMidiValue(String instrument)
	{
		if (instrument.equals("PIANO")) 			return 	PIANO;
		if (instrument.equals("HARPSICHORD")) 		return	HARPSICHORD;
		if (instrument.equals("XYLOPHONE")) 		return 	XYLOPHONE;
		if (instrument.equals("CHURCH_ORGAN")) 		return 	CHURCH_ORGAN;
		if (instrument.equals("REED_ORGAN")) 		return 	REED_ORGAN;
		if (instrument.equals("HARMONICA")) 		return 	HARMONICA;
		if (instrument.equals("GUITAR")) 			return 	GUITAR;
		if (instrument.equals("ELECTRIC_GUITAR")) 	return 	ELECTRIC_GUITAR;
		if (instrument.equals("VIOLIN")) 			return 	VIOLIN;
		if (instrument.equals("HARP")) 				return 	HARP;
		if (instrument.equals("TIMPANI")) 			return 	TIMPANI;
		if (instrument.equals("TRUMPET")) 			return 	TRUMPET;
		if (instrument.equals("TROMBONE")) 			return 	TROMBONE;
		if (instrument.equals("OBOE")) 				return 	OBOE;
		if (instrument.equals("FLUTE")) 			return 	FLUTE;
		if (instrument.equals("BANJO")) 			return 	BANJO;
		if (instrument.equals("STEEL_DRUMS")) 		return 	STEEL_DRUMS;
		
		else return 0;
	}
		
}

/*
20 Points 10 points ea
Task 3 : Examine how this code is supposed to work and implement the needed interfaces\
The class receives Instrument names and channels and plays instruments based on midiValues and notes.
		 Complete the other tasks listed within this class object (look for all caps)
*/
class Instrument implements midiPlayer
	{
		private String name; //instrument name. Has to match one of the options listed in the above interfaces
		private int midiValue; //numeric value used to tell the synth what instrument to mimic
	    private MidiChannel[] channels; //all the available midi channels
		
		//No argument constructor that implement the printInstruments method in midiInstrument interface
		public Instrument(){
			midiPlayer.printInstruments();
		}
		
		//SET TO PIANO BY DEFAULT
		public Instrument(MidiChannel[] channels)
		{
			this.channels = channels;
			midiValue=0;
		}
		
		//SET THE MIDIVALUE USING THE SENT NAME
		//THE METHOD FOR THIS HAS ALREADY BEEN CREATED
		public Instrument(MidiChannel[] channels, String name)
		{
			this.name=name; 
			this.channels=channels;
			if(name=="PIANO"){
				midiValue = 0;
			}
			else if(name=="HARPSICHORD"){
				midiValue = 6;
			}
			else if(name=="XYLOPHONE"){
				midiValue = 13;
			}
			else if(name=="CHURCH_ORGAN"){
				midiValue = 19;
			}
			else if(name=="REED_ORGAN"){
				midiValue = 20;
			}
			else if(name=="HARMONICA"){
				midiValue = 22;
			}
			else if(name=="GUITAR"){
				midiValue = 24;
			}
			else if(name=="ELECTRIC_GUITAR"){
				midiValue = 27;
			}
			else if(name=="VIOLIN"){
				midiValue = 40;
			}
			else if(name=="HARP"){
				midiValue = 46;
			}
			else if(name=="TIMPANI"){
				midiValue = 47;
			}
			else if(name=="TRUMPET"){
				midiValue = 56;
			}
			else if(name=="TROMBONE"){
				midiValue = 57;
			}
			else if(name=="OBOE"){
				midiValue = 68;
			}
			else if(name=="FLUTE"){
				midiValue = 73;
			}
			else if(name=="BANJO"){
				midiValue = 105;
			}
			else if(name=="STEEL_DRUMS"){
				midiValue = 114;
			}
			
		}
		public int getMidiValue(){return midiValue;}
		
	//This method plays the sent note given a duration	
	public void play(String note, int duration) throws InterruptedException
	{
			//changes the instrument based on the midiValue
			channels[0].programChange(midiValue);
		
			// * start playing a note
			channels[0].noteOn(id(note), VOLUME );
			// * wait
			Thread.sleep( duration );
			// * stop playing a note
			channels[0].noteOff(id(note));
	}
	
	//ADD COMMENT EXPLAINING PURPOSES OF THIS METHOD
	//This method calculates the integer value needed to play that note based on the String note given
	//ADD COMMENTS THROUGHOUT EXPLAINING WHAT IS HAPPENING
	private static int id(String note)
	{
		//This variable analyzes variable note's substrings and returns an integer.
		int octave = Integer.parseInt(note.substring(0, 1));
		String noteE = note.substring(1);
		
		int index;
		//This loop analyzes variables noteE and Values within the array notes and return an integer calculated value if they are not equal
		for(index = 0; index< notes.length; index++) if (noteE.equals(notes[index])) break;
		
		return index + 12 * octave + 12;	
	}
	
	//puts application to sleep to mimic a rest
	public void rest(int duration) throws InterruptedException
	{
		Thread.sleep(duration);
	}
	
}
 
 
/*

25 Points 5 each
TASK 4 : 	add comments explaining what this method is and does 
			implement any needed interfaces
			play the song in method song2
			finish the song based on the provided instructions within the song2 method
			print a list of possible instruments and let the user select what instrument to used
*/

public class InLab implements midiInstrument
{
	
	public static void main( String[] args ) {
		Scanner scn= new Scanner(System.in);
		
		
		try {
			// * Open a synthesizer
			Synthesizer synth = MidiSystem.getSynthesizer();
			MidiChannel[] channels;
			synth.open();
			channels = synth.getChannels();
			
			//No argument constructor to output the lsit of instruments
			Instrument ins1 = new Instrument();
			System.out.println("Enter a number (0-16) that corresponds with the instrument you'd like to play");
			//user inputs a number that will determine what instrument to play
			int sing= scn.nextInt();
			
			//switch case that will be based on the user input and create instrument constructors that
			switch(sing){
				case 0:
				Instrument ins20 = new Instrument(channels, "PIANO");
				song2(ins20);
				break;
				case 1:
				Instrument ins21 = new Instrument(channels, "HARPSICHORD");
				song2(ins21);
				break;
				case 2:
				Instrument ins22 = new Instrument(channels, "XYLOPHONE");
				song2(ins22);
				break;
				case 3:
				Instrument ins23 = new Instrument(channels, "CHURCH_ORGAN");
				song2(ins23);
				break;
				case 4:
				Instrument ins24 = new Instrument(channels, "REED_ORGAN");
				song2(ins24);
				break;
				case 5:
				Instrument ins25 = new Instrument(channels, "HARMONICA");
				song2(ins25);
				break;
				case 6:
				Instrument ins26 = new Instrument(channels, "GUITAR");
				song2(ins26);
				break;
				case 7:
				Instrument ins27 = new Instrument(channels, "ELECTRIC_GUITAR");
				song2(ins27);
				break;
				case 8:
				Instrument ins28 = new Instrument(channels, "VIOLIN");
				song2(ins28);
				break;
				case 9:
				Instrument ins29 = new Instrument(channels, "HARP");
				song2(ins29);
				break;
				case 10:
				Instrument ins210 = new Instrument(channels, "TIMPANI");
				song2(ins210);
				break;
				case 11:
				Instrument ins211 = new Instrument(channels, "TIMPANI");
				song2(ins211);
				break;
				case 12:
				Instrument ins212 = new Instrument(channels, "TROMBONE");
				song2(ins212);
				break;
				case 13:
				Instrument ins213 = new Instrument(channels, "OBOE");
				song2(ins213);
				break;
				case 14:
				Instrument ins214 = new Instrument(channels, "FLUTE");
				song2(ins214);
				break;
				case 15:
				Instrument ins215 = new Instrument(channels, "BANJO");
				song2(ins215);
				break;
				case 16:
				Instrument ins216 = new Instrument(channels, "STEEL_DRUMS");
				song2(ins216);
				break;
				default:
				System.out.println("Please choose between 1-16");
			}
			
			//Instrument ins = new Instrument(channels, "FLUTE");
			
			//song1(ins);
		
			// * finish up
			synth.close();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	//This is the song from the original demo
	public static void song1(Instrument ins)
	{
		
		try {
			ins.play("6D",  1000);    
			ins.rest(500);
			ins.play("6D",  300);
			ins.play("6C#", 300);
			ins.play("6D",  1000);
			ins.rest(500);
			ins.play("6D",  300);
			ins.play("6C#", 300);
			ins.play("6D",  1000);
			ins.play("6E",  300);
			ins.play("6E",  600);
			ins.play("6G",  300);
			ins.play("6G",  600);
			ins.rest(500);	
			}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	//This is the song I want you to play now
	public static void song2(Instrument ins)
	{
		try {
			ins.play("6C",  1500);
			ins.play("6C",  1500);
			ins.play("6C",  1000);
			ins.play("6D",  500);
			ins.play("6E",  1500);
			ins.play("6E",  1000);
			ins.play("6D",  500);
			ins.play("6E", 1000);
			ins.play("6F",  500);
			ins.play("6G",  3000);
			ins.play("7C",  500);
			ins.play("7C",  500);
			ins.play("7C",  500);
			ins.play("6G",  500);
			ins.play("6G",  500);
			ins.play("6G",  500);
			ins.play("6E", 500);
			ins.play("6E", 500);
			ins.play("6E", 500);
			ins.play("6G",  1000);//6th G for 1 second
			ins.play("6F",  500);//6th F for 1/2 a second
			ins.play("6E", 1000);//6th E for 1 second
			ins.play("6D", 500);//6th D for 1/2 a second
			ins.play("6C", 3000);//6th C for 3 seconds
			
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
		
}