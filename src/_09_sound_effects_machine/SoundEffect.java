package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoundEffect implements ActionListener {
	static JButton oneButton = new JButton();
	static JButton twoButton = new JButton();
	  public static void main(String[] args) {  
		 SoundEffect sound = new SoundEffect();
		 sound.effectGui();
		  
		  
	  }
	
		   void effectGui() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		JLabel label = new JLabel();
		oneButton.setText("Saw sounds.");
		twoButton.setText("Some music.");
		panel.add(oneButton);
		panel.add(twoButton);
		frame.add(panel);
		oneButton.addActionListener(this);
		twoButton.addActionListener(this);
		frame.pack();
		
		
		
	}
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==oneButton) {
			playSound("saw.wav");
		}else {
			playSound("saw.wav");
			}
	
	}
	  

}
