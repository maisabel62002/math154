package math154.finalproject;

class ChooseAlbum {
	Content miniAlbum(String album) {
		if (album.equals("dreamcatcher")) {
			return new Dreamcatcher();
		}else {
			return new Pentagon();
		}
	}
}

