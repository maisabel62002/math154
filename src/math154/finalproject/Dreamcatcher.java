package math154.finalproject;

class Dreamcatcher implements Content{//default
	
	@Override //annotations to return different values in each method
	public String fullSong() {
		//String dreamFullSong = "C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Girl_Group\\[Full Album] DC.wav";
		String dreamFullSong = "Girl_Group\\[Full Album] DC.wav";
		return dreamFullSong;
	}

	@Override
	public String[] songFiles() {
		//String[] dreamSongFiles = {"C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Girl_Group\\Intro.wav", "C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Girl_Group\\Odd Eye.wav", "C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Girl_Group\\Wind Blows.wav", "C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Girl_Group\\Poison Love.wav", "C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Girl_Group\\4 Memory.wav", "C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Girl_Group\\New days.wav", "C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Girl_Group\\Odd Eye (Inst.).wav"};
		String[] dreamSongFiles = {"Girl_Group\\Intro.wav", "Girl_Group\\Odd Eye.wav", "Girl_Group\\Wind Blows.wav", "Girl_Group\\Poison Love.wav", "Girl_Group\\4 Memory.wav", "Girl_Group\\New days.wav", "Girl_Group\\Odd Eye (Inst.).wav"};
		return dreamSongFiles;
	}

	@Override
	public String songTitles() {
		String dreamSongTitles = "(1) Introduction\n(2) Odd Eye\n(3) Wind Blows\n(4) Poison Love\n(5) 4 Memory\n(6) New days\n(7) Odd Eye (Instrumental)\n";
		return dreamSongTitles;
	}

	@Override
	public String[] imageFiles() {
		//String[] dreamImageFiles = {"C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Pictures\\Dreamcatcher_-_Dystopia_Road_to_Utopia.png", "C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Pictures\\dreamcatcher.png", "C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Pictures\\dc.jpg"};
		String[] dreamImageFiles = {"Pictures\\Dreamcatcher_-_Dystopia_Road_to_Utopia.png", "Pictures\\dreamcatcher.png", "Pictures\\dc.jpg"};
		return dreamImageFiles;
	}



}
