import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MainProgram {// class
	public static void main(String[] args) {// main
		UserChoice choice = new UserChoice();
		MainStory story = new MainStory();
		
		story.WakeUp();
		choice.askDoorLight();
		choice.getDoorLight();
		
		if(choice.getDoorLight().equalsIgnoreCase("door")){//if door
			story.goDoor();
			choice.askDoorCamera();
			choice.getDoorCamera();
				if(choice.getDoorCamera().equalsIgnoreCase("door")){//if door 2
					story.goDoor2();
				}//if door 2
				if(choice.getDoorCamera().equalsIgnoreCase("camera")){//if camera
					story.goCamera();
				}//if camera
		}//if door
		if(choice.getDoorLight().equalsIgnoreCase("light")){//if light
			story.goLight();
			choice.askHallBatt();
			choice.getHallBatt();
				if(choice.getHallBatt().equalsIgnoreCase("")){
					
				}
		}//if light 

	}// main

}// class
