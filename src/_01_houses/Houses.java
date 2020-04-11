package _01_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	
	static Robot rob = new Robot();
		public void run() {
			rob.setWindowColor(0,0,0);
			rob.setPenWidth(10);
			rob.setSpeed(50);
			rob.penDown();
			rob.setX(30);
			rob.setY(550);
			

		for(int i = 0; i < 4; i++) {
			String meth="ha";
			String input = JOptionPane.showInputDialog(null, "How high do you want the houses to be. (small, MEDium, LARGE)");
			String cOLOR = JOptionPane.showInputDialog(null, "What color do you want?(Red, Green, or Blue)");
			if(input.equalsIgnoreCase("Small") || input.equalsIgnoreCase("Medium")) {
			 meth =  JOptionPane.showInputDialog(null, "Do you want the house to have a pointy roof or a flat roof.");
			}else {
				meth = "Flat";
			}
			
		if (meth.equalsIgnoreCase("Flat")) {
			makeHouseFlat(input, cOLOR);
		}else if(meth.equalsIgnoreCase("Pointy")) {
			makeHousePointy(input, cOLOR);
		}
		 rob.hide();
		}
	}
	public void makeHouseFlat(String height, String color) {
		
		int tall=0;
		if(height.equalsIgnoreCase("Small")) {
			 tall = 180;
		}else if(height.equalsIgnoreCase("Medium")) {
			 tall = 300;
		}else if(height.equalsIgnoreCase("Large")) {
			 tall = 500;
		}
	    rob.setAngle(0);
	    if(color.equalsIgnoreCase("Blue")) {
	    	rob.setPenColor(40,40,200);
	    }else if(color.equalsIgnoreCase("Green")) {
	    	rob.setPenColor(40,200,40);
	    }else if(color.equalsIgnoreCase("Red")) {
	    	rob.setPenColor(200,40,40);
	    }
	    
		rob.move(tall);
		rob.turn(90);
		rob.move(60);
		rob.turn(90);
		rob.move(tall);
		rob.turn(-90);
		rob.setPenColor(60,200,100);
		rob.move(40);
		
	
}
public void makeHousePointy(String height, String color) {
		
		int tall=0;
		if(height.equalsIgnoreCase("Small")) {
			 tall = 180;
		}else if(height.equalsIgnoreCase("Medium")) {
			 tall = 300;
		}else if(height.equalsIgnoreCase("Large")) {
			 tall = 500;
		}
	    rob.setAngle(0);
	    if(color.equalsIgnoreCase("Blue")) {
	    	rob.setPenColor(40,40,200);
	    }else if(color.equalsIgnoreCase("Green")) {
	    	rob.setPenColor(40,200,40);
	    }else if(color.equalsIgnoreCase("Red")) {
	    	rob.setPenColor(200,40,40);
	    }
	    
		rob.move(tall-20);
		rob.turn(45);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(45);
		rob.move(tall-20);
		rob.turn(-90);
		rob.setPenColor(60,200,100);
		rob.move(40);
		
	
}
}