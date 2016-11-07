package com.lab12.roshambo;

import java.util.Scanner;

public class Player3 extends Player {
Scanner scan = new Scanner(System.in);
String setName = " ";

	@Override
	public void name() {
		System.out.println("Please enter your Name: ");
		setName = scan.next();
		System.out.println("You're name is " + setName + ".");
	}

	@Override
	public Roshambo value() {
		System.out.println(setName + "Please select either,  1: Rock, 2: Paper or, 3: Scissors by number: ");
		int pChoice = scan.nextInt();
		pChoice = RpsValidation.rps(pChoice); 
	
		
		if (pChoice == 1) {
			System.out.println(setName + " chose " + Roshambo.ROCK + ".");
			return Roshambo.ROCK;
		
		} else if  (pChoice == 2) 
			return Roshambo.PAPER;
		System.out.println(setName + "chose " + Roshambo.PAPER + ".");
		{
		System.out.println(setName + " chose " + Roshambo.SCISSORS + ".");
		return Roshambo.SCISSORS;
		
}
}
}