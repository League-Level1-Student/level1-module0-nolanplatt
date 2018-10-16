import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {

	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton ducks = new JButton();
	JButton frog = new JButton();
	JButton unicorns = new JButton();
	
	
	public static void main(String[] args) {
		new CutenessTV().setupUI();

	}
	
	void setupUI() {
		frame.add(panel);
		frame.setVisible(true);
		panel.setVisible(true);
		panel.add(ducks);
		panel.add(frog);
		panel.add(unicorns);
		ducks.setText("Play Ducks  Video");
		frog.setText("Play Frog Video");
		unicorns.setText("Play Unicorns Video");
		ducks.addActionListener(this);
		frog.addActionListener(this);
		unicorns.addActionListener(this);
		frame.pack();
	}
	
	
	
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}
	
	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();

		
		if(buttonPressed == ducks) {
			showDucks();
		}
		if(buttonPressed == frog) {
			showFrog();
		}
		else if (buttonPressed == unicorns) {
			showFluffyUnicorns();
		}
		
	}
}
