import java.awt.event.*;
import acm.program.GraphicsProgram;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Random;

import acm.util.*;
import acm.graphics.*;

public class HeartsCardGame extends GraphicsProgram {// start

	GImage[] cards = { new GImage("heartace.png"), new GImage("heart2.png"), new GImage("heart3.png"),
			new GImage("heart4.png"), new GImage("heart5.png"), new GImage("heart6.png"), new GImage("heart7.png"),
			new GImage("heart8.png"), new GImage("heart9.png"), new GImage("heart10.png"), new GImage("heartjack.jpg"),
			new GImage("heartqueen.png"), new GImage("heartking.jpg") };
	String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	int[] value = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };

	Random a = new Random();
	int randa = a.nextInt(12);

	Random b = new Random();
	int randb = b.nextInt(12);

	Random c = new Random();
	int randc = c.nextInt(12);

	Random d = new Random();
	int randd = d.nextInt(12);

	Random e = new Random();
	int rande = e.nextInt(12);

	Random f = new Random();
	int randf = f.nextInt(12);

	public void init() {// init
		setBackground(Color.BLACK);

		setSize(1000, 500);

		pause(100);

		cards[randa].setSize(100, 125);
		add(cards[randa], 10, 10);
		System.out.println(randa);

		pause(100);

		cards[randb].setSize(100, 125);
		add(cards[randb], 120, 10);
		System.out.println(randb);

		pause(100);

		cards[randc].setSize(100, 125);
		add(cards[randc], 230, 10);
		System.out.println(randc);

		pause(100);

		cards[randd].setSize(100, 125);
		add(cards[randd], 10, 200);
		System.out.println(randd);

		pause(100);

		cards[rande].setSize(100, 125);
		add(cards[rande], 120, 200);
		System.out.println(rande);

		pause(100);

		cards[randf].setSize(100, 125);
		add(cards[randf], 230, 200);
		System.out.println(randf);

	}// init

	public void run() {// run
		while (true) {// true
			int score1 = (randa+1)+(randb+1)+(randc+1);
			int score2 = (randd+1)+(rande+1)+(randf+1);
			
			GLabel s1 = new GLabel("Player 1:" + score1);
			GLabel s2 = new GLabel("Player2:" + score2);
			
			add(s1,500,100);
			s1.setColor(Color.WHITE);
			
			add(s2,500,300);
			s2.setColor(Color.WHITE);

		} // true

	}// run

}// end
