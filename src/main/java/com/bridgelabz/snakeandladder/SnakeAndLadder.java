package com.bridgelabz.snakeandladder;

import java.util.*;

public class SnakeAndLadder {
	
	public static final int start = 0;
	public static final int noPlay = 0;
	public static void main(String [] args){
		Random ran = new Random();
		int counter = 0;
		int position1 = 0;
		int position2 = 0;
		int turn = 0;
		int oldturn = 0;
		int condition;
		System.out.println("Starting position of Snake and Ladder is :" + start);
		while( position1 < 100 && position2 < 100){
			if( turn == 0 )
				System.out.println("Player 1 is playing");
			else
				System.out.println("Player 2 is playing");
			int die = ran.nextInt(6)+1;
			System.out.println("Player got : " + die);
			condition = (int) (Math.floor(Math.random() * 10 ) %3 );

			switch (condition)
			{
			case 0:
				System.out.println("Its No Play player stays at same position. ");
				break;
			case 1:
				System.out.println("Its  ladder. ");
				if(turn == 0)
					position1 += die;
				else
					position2 += die;
				if(position1 > 100) {
					position1 -= die;
					System.out.println("Position of player 1 is exceding so not counting " );
				}
				if(position2 > 100){
					position2 -= die;
					System.out.println(" Position of player 2 is exceding so not counting  " );
				}
				turn += 1;
				break;
			case 2:		
				System.out.println("Its snake. ");
				if(turn == 0)
					position1 -= die;
				else
					position2 -= die;
				if(position1 < 0) 
					position1 = 0;
				if(position2 < 0) 
					position2 = 0;
				break;
			}
			counter++;
			turn = (turn + 1 ) %2;
			if(oldturn == 0)
				System.out.println("Position of player 1 is : " + position1);
			else
				System.out.println("Position of player 2 is : " + position2);
			oldturn = turn;	
			System.out.println("\n");
		}
		System.out.println("Number of dies is rolled : " + counter);
		System.out.println("Player "+(turn + 1) + " is won.");
}
}