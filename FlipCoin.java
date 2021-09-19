package com.basic_core_programe;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {

		int  countHead=0, countTail=0;
		double percentHead=0, percentTail=0;

		System.out.println("Enter Number of time you want to flip the coin: ");

		Scanner s = new Scanner(System.in);
		int input= s.nextInt();
		s.close();

		//generating random value between 0 and 1
		Random a = new Random();
		double result=0;

		for (int i=1; i <= input; i++) {

			result = a.nextInt(2);

			if (result == 0)
			{
				countHead += 1;
				System.out.println("Heads");
			}
			else {
				countTail += 1;
				System.out.println("Tails");
			}

		}
		percentHead =(float) countHead / input*100;
		percentTail =(float) countTail / input*100;

		System.out.println("Total head: " + countHead);
		System.out.println("Total head: " + countTail);

		System.out.println("Percentage of head: " + percentHead + " %");
		System.out.println("Percentage of tail: " + percentTail + " %");


	}
}	