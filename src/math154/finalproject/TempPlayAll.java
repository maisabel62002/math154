package math154.finalproject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


class TempPlayAll{
	
	TempPlayAll(String [] songs, String tracklist, Clip sound) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {	
		
		@SuppressWarnings("resource") //we can't close scanner yet at the end of the class
		Scanner scanner = new Scanner(System.in);
		String response = new String(); //response to options
		long[] duration = new long[songs.length+1]; //store accumulating duration for each song
		duration[0] = 0; //set 0 microsecond position time to index zero
		long len = 0; //determine current length
		long prev = 0; //since index zero has 0 value
		int i=1; //initialize the index we need to determine from index 1
		
		System.out.println("TRACKLIST:");
		System.out.println(tracklist);
		Thread.sleep(5000);
		
		for (String current : songs) { //for each loop to get the time position each song in full album
			File file = new File(current); //get file path
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(file); //set as audio
			//clip methods
			Clip clip = AudioSystem.getClip(); 
			clip.open(audioInput);
			duration [i]= prev + clip.getMicrosecondLength();
			prev = duration[i];
			clip.close();
			i++;
		}
		
		
		//start the whole album
		sound.start();
		
		while(!response.equals("Q")) {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("\nR = Reset\tQ = Quit\n\tP = play\n\tS = Stop\nB = Previous\tN = Next\n");
			System.out.println("---------------------------------------------------------------------");
			System.out.print("Enter your choice: ");
			
			response = scanner.next();
			response = response.toUpperCase();
			
			switch(response) {
				case ("P"): sound.start();
				break;
				case ("S"): sound.stop();
				break;
				case ("B"): len = sound.getMicrosecondPosition(); //play previous song using the current duration
							for(int j = duration.length-1; j>=0;j--) {
								if(len>duration[j]) {
									if(len<duration[1]) {//if the first song is still playing, just restart but notify the user
										sound.setMicrosecondPosition(0);
										System.out.println("This is the first song!");
									} else {
										sound.setMicrosecondPosition(duration[j-1]);
									}
									break;
								}
							}
				break;
				case ("N"): len = sound.getMicrosecondPosition(); //play next song using the current duration
							for(long j:duration) {
								if(len<j) {
									if (len > duration[duration.length-2]) { //if the last song is playing, do not make changes but notify the user
										System.out.println("This is the last song!");
									} else {
										sound.setMicrosecondPosition(j);
									}
									break;
								}
							}
				break;
				case ("R"): sound.setMicrosecondPosition(0);
				break;
				case ("Q"): sound.close();
				break;
				default: System.out.println("Not a valid response");
			}
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Thanks for listening.");
	}		
}
