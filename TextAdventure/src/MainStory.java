import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MainStory {// class
	public void WakeUp() {// wake up
		JOptionPane.showMessageDialog(null,"You wake up in a small, dimly lit room. The floors are caked with dirt, with small patches of cracked cement beneath them.");
		JOptionPane.showMessageDialog(null,"You're sitting on an old, rusty cot. As you look around, you see a door to your right, and a flashlight on the ground to the left.");
	}// wake up
	public void goDoor(){//go door
		JOptionPane.showMessageDialog(null, "You slowly get out of bed, careful not to make a noise. However, as you stand up, you hear a mechanical sound coming from above the bed.");
		JOptionPane.showMessageDialog(null,"You look above the bed to see a security camera pointed directly at you. As you step closer to the door, you realize that the camera is following "
				+ "your every movement.");
	}//go door
	public void goLight(){//go light
		JOptionPane.showMessageDialog(null, "As you get out of bed, you quickly stretch your arms up above your head, hitting your hand on an unknown object.");
		JOptionPane.showMessageDialog(null, "You look at your hand, with bits of metal and glass now stuck to your knuckles. You look up to see a partly smashed security camera"
				+ " on the wall above your bed.");
		JOptionPane.showMessageDialog(null,"You carefully pull the small shards out of your skin, then use part of the dirty sheet at the bottom of the cot to bandage your hand.");
		JOptionPane.showMessageDialog(null,"As you get out of bed, you hear a loud banging on the metal door, accompanied by a muffled voice and the sound of the lock opening. You"
				+ " breathe a sigh of relief as the sound of footsteps heading away from your cell echoes all around you. You then walk over to the flashlight and pick it up.");
		JOptionPane.showMessageDialog(null,"As you slip the flashlight into your belt loop, the door slowly swings open, revealing a pitch balck hallway.");
		JOptionPane.showMessageDialog(null, "You grab the flashlight and try to turn it on, but nothing happens. You screw off the bottom to see that there are no batteries.");
		JOptionPane.showMessageDialog(null,"You look down the hallway and see a small, dim light at the end.");
	}//go light
	public void goDoor2(){//go door 2
		JOptionPane.showMessageDialog(null, "You turn your back to the camera and continue walking toward the door. As you reach the door, you can hear muffled voices from the other side.");
		JOptionPane.showMessageDialog(null,"You try the door knob to find it locked. As you let go, the voices go quiet. A few seconds later you hear the lock click open");
		JOptionPane.showMessageDialog(null, "As you step back from the door, it slams open, revealing a large guard. He laughs as he steps toward you and injects some sort of syringe "
				+ "into your neck. You black out");
		JOptionPane.showMessageDialog(null,"You have died");
	}//go door 2
	public void goCamera(){//go camera
		JOptionPane.showMessageDialog(null,"You turn your back to the door and walk to the camera. As you get closer, a small red light goes off, and the room goes dark");
		JOptionPane.showMessageDialog(null,"Before you can do anything, you can hear the door slam open and footsteps rush into the room. As you turn toward the door, you're hit hard in the face."
				+ " You black out.");
		JOptionPane.showMessageDialog(null, "You have died");
	}//go camera

}// class
