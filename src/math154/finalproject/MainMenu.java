package math154.finalproject;

import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.Clip;
import javax.swing.JFrame;


class MainMenu {

	MainMenu () {
		
		//initialization
		Scanner scan = new Scanner(System.in);
		int check = 1; //for while loop condition to be true
		int chosen = 0; //for choosing kpop group
		int option = 0; //for the option buttons in playing music

		String[] albumList = {"dreamcatcher", "pentagon"}; //albums available
		ChooseAlbum chooseAlbum = new ChooseAlbum(); //factory design pattern for choosing album content

		while(check!=0) {
			System.out.println("\n(1)DREAMCATCHER'S DYSTOPIA\t(2)PENTAGON'S CEREMONY\n");
			
			System.out.println("Kindly select an album:");
			chosen = scan.nextInt();
			
			//check if input is wrong
			if(chosen!= 1 && chosen!=2) {
				System.out.println("Your input is invalid.\n");
				continue;
			}else {
				break;
			}
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("ALBUM IS OPEN!");
		System.out.println("---------------------------------------------------------------------");
		
		Content kpopGroup = chooseAlbum.miniAlbum(albumList[chosen-1]);//specific content for minialbum of chosen kpop group
		
		//////////////////////////////////////////////////////////////////////////////////////////

		//photo card section using the pathway of pictures given from the specific content/ kpop group chosen
		System.out.println("\nLet's take a look at some photos!\n");

		try {
			PhotoCards photos = new PhotoCards (kpopGroup.imageFiles());
			photos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} catch (IOException e) {//we are dealing with files
			e.printStackTrace();
		} 
		
		/////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("*********************************************************************");
		System.out.println("\nNow it's time to play some music!\n");
		
		//main menu similar when playing a CD from a kpop album 
		while(check!=0) {
			while(check!=0) {
				System.out.println("===========================================================");
				System.out.println("MAIN MENU");
				
				System.out.println("\n(1) PLAY ALL\t(2) SELECT A SONG\n");
				System.out.println("Kindly enter your choice:");
				option = scan.nextInt();
				
				//check if input is wrong
				if(option!= 1 && option!=2) {
					System.out.println("Your input is invalid.\n");
					continue;
				}else {
					break;
				}
			}
			
			if(option==1) {//the user does not pick a song but play it in order further options are found in the template for play all
				try {
					Clip sound = new LoadClip().load(kpopGroup.fullSong());//just load full album
					new TempPlayAll (kpopGroup.songFiles(), kpopGroup.songTitles(), sound);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}if(option==2) {//the user is given a chance to play a specific song without listening to other music files
				try {
					new TempSelectSong (kpopGroup.songFiles(), kpopGroup.songTitles());
				} catch (IOException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				} 
			}
			
			System.out.println("===========================================================");
			/*after the songs are played or the user quits, they will be asked if they would like to go to the main menu
			 *where they can chose to play all or one song
			 *or they could pick exit and officially close the album
			 */
			System.out.println("Press \"ANY NUMBER\" to Proceed to Main Menu");	
			System.out.println("Press \"0\" to Exit");
			System.out.print("Enter your choice: ");
			try {
				check = scan.nextInt();	
			} catch (Exception e) { //wrong inputs can also make you close the album
				System.out.println("You did not enter a number. However, you shall exit the program");
				break;
			}
				
			
		}
		/////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("---------------------------------------------------------------------");
		System.out.println("ALBUM IS CLOSE!");
		System.out.println("---------------------------------------------------------------------");
		scan.close();
	}

}
