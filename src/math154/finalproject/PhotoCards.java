package math154.finalproject;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class PhotoCards extends JFrame {
 
	private static final long serialVersionUID = 1L;
	private ImageIcon cover;
	private JLabel coverLabel;
	private JFrame coverFrame;
	private ImageIcon group;
	private JLabel groupLabel;
	private JFrame groupFrame;
	private ImageIcon unique;
	private JLabel uniqueLabel;
	private JFrame uniqueFrame;
	
	PhotoCards (String[] filename) throws IOException{//adding images to GUI

		coverFrame = new JFrame("Cover Photo"); //name or type of photo
		try {
			cover = new ImageIcon (ImageIO.read(new File(filename[0]))); //index for file name
		} catch (IOException e) {
			e.printStackTrace();
		}
		coverLabel = new JLabel(cover); //put image icon in a label so that it can be visibly w/ the help of GUI
		coverFrame.add(coverLabel); //put the label in a frame or a window in the screen
		coverFrame.setVisible(true);
		coverFrame.pack(); //fitting size to pop in the screen
		
		groupFrame = new JFrame("Group Photo");
		try {
			group = new ImageIcon (ImageIO.read(new File(filename[1])));
		} catch (IOException e) {
			e.printStackTrace();
		}
		groupLabel = new JLabel(group);
		groupFrame.add(groupLabel);
		groupFrame.setVisible(true);
		groupFrame.pack();
		
		uniqueFrame = new JFrame("Lucky Photo");
		try {
			unique = new ImageIcon (ImageIO.read(new File(filename[2])));
		} catch (IOException e) {
			e.printStackTrace();
		}
		uniqueLabel = new JLabel(unique);
		uniqueFrame.add(uniqueLabel);
		uniqueFrame.setVisible(true);
		uniqueFrame.pack();
	}
	
}
/*
JFrame frame;
JLabel dispField;
ImageIcon image;
JFrame frame1;
JLabel dispField1;
ImageIcon image1;

public Photocards () throws IOException {
	
	frame = new JFrame ("KPOP PHOTOCARDS");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	image = new ImageIcon (ImageIO.read(new File("PENTAGON_CEREMONY.jpg")));
	dispField = new JLabel(image);
	frame.add(dispField);
	frame.pack();
	frame.setVisible(true);
	
	frame1 = new JFrame ("KPOP PHOTOCARDS");
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	image1 = new ImageIcon (ImageIO.read(new File("1_UByV88BRwSdYKBjIIDy1ug.png")));
	dispField1 = new JLabel(image1);
	frame1.add(dispField1);
	frame1.pack();
	frame1.setVisible(true);
}
public static void main(String[] args) throws IOException {
	Photocards i = new Photocards();
}
}

*/