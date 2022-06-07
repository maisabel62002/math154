package math154.finalproject;

class Pentagon implements Content{//default
	
	@Override //annotations to return different values in each method
	public String fullSong() {
		//String pentaFullSong = "C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Boy_Group\\[Full Album] PENTAGON– CEREMONY.wav";
		String pentaFullSong = "Boy_Group\\[Full Album] PENTAGON– CEREMONY.wav";
		return pentaFullSong;
	}

	@Override
	public String[] songFiles() {
		//String[] pentaSongFiles = {"C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Boy_Group\\Critical Beauty.wav", "C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Boy_Group\\Lucky (Lucky).wav", "C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Boy_Group\\Nothing (Nothing).wav", "C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Boy_Group\\Spectacular.wav", "C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Boy_Group\\Thank you (Jinho, Hui).wav", "C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Boy_Group\\Beautiful (Prod. by Il Hoon Jung Of BTOB).wav"};
		String[] pentaSongFiles = {"Boy_Group\\Critical Beauty.wav", "Boy_Group\\Lucky (Lucky).wav", "Boy_Group\\Nothing (Nothing).wav", "Boy_Group\\Spectacular.wav", "Boy_Group\\Thank you (Jinho, Hui).wav", "Boy_Group\\Beautiful (Prod. by Il Hoon Jung Of BTOB).wav"};
		return pentaSongFiles;
	}

	@Override
	public String songTitles() {
		String pentaSongTitles = "(1) Critical Beauty\n(2) Lucky\n(3) Nothing\n(4) Spectacular\n(5) Thank You\n(6) Beautiful\n";
		return pentaSongTitles;
	}

	@Override
	public String[] imageFiles() {
		//String[] pentaImageFiles = {"C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Pictures\\PENTAGON_CEREMONY.jpg", "C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Pictures\\pentagon.jpg", "C:\\Users\\Toshiba\\Downloads\\ISABEL\\Eclipse\\FINAL PROJECT\\Final Project\\Pictures\\Duo.png"};
		String[] pentaImageFiles = {"Pictures\\PENTAGON_CEREMONY.jpg", "Pictures\\pentagon.jpg", "Pictures\\Duo.png"};
		return pentaImageFiles;
	}

}
