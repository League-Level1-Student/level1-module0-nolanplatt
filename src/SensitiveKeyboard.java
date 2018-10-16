import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SensitiveKeyboard implements KeyListener {


	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	
 public static void main(String[] args) {
	  new SensitiveKeyboard().createUI();
	}
 
 
	 void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		panel.setVisible(true);
		label.setText("Press any key");
		frame.addKeyListener(this);
		
		
	}
	 
	 static void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	          }
	     }


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("test");
		speak("ouch");
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	}
