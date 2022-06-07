package math154.finalproject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

class TempSelectSong {
	TempSelectSong (String [] kpop, String songs) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int check = 1; //while loop condition
		int songNum = 0;

		while(check!=0) {
			while(check!=0) {
							
				System.out.println(songs);
				System.out.println("Kindly enter the number of your chosen song: ");
				songNum = scanner.nextInt();
				scanner.nextLine();
				System.out.println();
				
				//check if the input is wrong
				if(songNum>=1 && songNum<=(kpop.length+1)) {
					break;
				}else {
					System.out.println("The input is invalid.\n");
					continue;
				}
			}
			
			//while loop is being used using the concept of a for loop
			//However, while loop is used instead of for loop because we both use increments and decrements
			int i = songNum-1; //for index value
			
			while (i>=0 && i<kpop.length) {
				
				String response = new String(); //refresh string response in case the user wants to choose another song again
				
				File file = new File(kpop[i]);
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(file);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();			
				
				System.out.println("Listening to song #" +songNum+ "!\n");

				
				
				while(!response.equals("Q") && !response.equals("N") && !response.equals("B")) {
					System.out.println("---------------------------------------------------------------------");
					System.out.println("\nL = Loop\tR = Reset\tO = Play Once\n\n\tP = Play\tS = Stop\n\nN = Next\tQ = Quit\tB = Previous\n");
					System.out.println("---------------------------------------------------------------------");
					System.out.print("Enter your choice: ");
					
					response = scanner.nextLine();
					response = response.toUpperCase();
					
					switch(response) {
						case ("P"): clip.start();
						break;
						case ("S"): clip.stop();
						break;
						case ("B"): if(i == 0) {
										clip.setMicrosecondPosition(0); //only restart automatically with the first song and notify user
										System.out.println("This is the first song!");
										response = "P";
									} else {
										clip.close();
									}
						break;
						case ("N"): if(i == kpop.length-1) { //no need to restart but only notify the user
										System.out.println("This is the last song!");
										response = "P";
									} else {
										clip.close();
									}
						break;
						case ("L"): clip.loop(Clip.LOOP_CONTINUOUSLY);
						break;
						case ("O"): clip.loop(0);
						break;
						case ("R"): clip.setMicrosecondPosition(0);
						break;
						case ("Q"): clip.close();
						break;
						default: System.out.println("Not a valid response");
					}
				}
				if (response.equals("B")) { //decrements
					i--;
					songNum--;
					continue;
				} if (response.equals("Q")) {//exit loop
					break;
				} else { //increments
					i++;
					songNum++;
				}
			}
			System.out.println("---------------------------------------------------------------------");
			System.out.println("Thanks for listening!");	

			//user is notified to make a choice in choosing to select another song arbitrarily
			System.out.println("Press \"ANY NUMBER\" to Choose Another Song");	
			System.out.println("Press \"0\" to Go Back to the Main Menu");	
			System.out.print("Enter your choice: ");
			try {
				check = scanner.nextInt();
			} catch (Exception e) { //wrong input can still potentially lead to main menu
				System.out.println("You did not enter a number. However, you shall proceed to thr Main Menu");
				break;
			}
		}
	}
}




