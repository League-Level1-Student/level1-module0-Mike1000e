package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


	public class FortuneCookieMainCode implements ActionListener {
		
        public void showButton() {
        	JFrame frame = new JFrame();
 		   JButton button = new JButton();
 		    frame.add(button);
 		    frame.pack();
        	   frame.setVisible(true);
        	   button.addActionListener(this);
        	   button.setText("Random button");

       }

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			 int rand = new Random().nextInt(2);
			JOptionPane.showMessageDialog(null, "Woohoo");
			if(rand==0) {
				JOptionPane.showMessageDialog(null, "You will not get corona");
			}else if(rand==1) {
				JOptionPane.showMessageDialog(null, "You will code today");
			}
		}
    }

