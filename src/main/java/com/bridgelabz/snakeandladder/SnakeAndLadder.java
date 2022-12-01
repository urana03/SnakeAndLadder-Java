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
	
	}
}