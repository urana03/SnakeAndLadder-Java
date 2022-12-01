package com.bridgelabz.snakeandladder;

import java.util.*;

public class SnakeAndLadder {
	
	public static final int start = 0;
	public static final int noPlay = 0;
	public static void main(String [] args){
		Random ran = new Random();
		int position = 0;
		int die = ran.nextInt(6)+1;
		System.out.println("Starting position of Player is :" + start);
		System.out.println(die);
		int condition = ran.nextInt(3);
		
		switch(condition) {
		case 0:
			System.out.println("It is no play");
			System.out.println("Player Position:"+position);
		break;
		case 1:
			System.out.println("It is a ladder");
			position = position +die;
			System.out.println("Player's position is "+position);
		break;
		case 2:
			System.out.println("It's a snake");
			position = position - die;
			if(position<0) {
				position = 0;
				System.out.println("Player's position: "+position);
			}
			else {
				System.out.println("Player's position: "+position);
			}
		}
		
	}
}