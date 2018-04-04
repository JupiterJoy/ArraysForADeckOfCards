import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Random;

public class UserChoice {//main
	String input = "";

	public void askDoorLight() {//ask door light
		input = JOptionPane.showInputDialog("Do you: Go right toward the door or, go left and grab the flashlight? (enter door or light)");
	}// ask door light
	
	public String getDoorLight(){//get door light
		return input;
	}//get door light
	
	public void askDoorCamera(){//ask door camera
		input = JOptionPane.showInputDialog("Do you: Keep moving toward the door, or move toward the camera? (enter door or camera)");
	}//ask door camera
	
	public String getDoorCamera(){//get door camera
		return input;
	}//get door camera
	
	public void askHallBatt(){//ask hallway batteries
		input= JOptionPane.showInputDialog("Do you: Stay in the room and search for batteries, or go out into the hallway? (enter batteries or hallway)");
	}//ask hallway batteries
	public String getHallBatt(){//get hallway batteries
		return input;
	}//get hallway batteries
	

}//main
