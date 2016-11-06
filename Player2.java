package com.lab12.roshambo;

import java.util.Random;
import java.util.Scanner;

public class Player2 extends Player {
	
	
	@Override
	public void name() {
		System.out.println("You have chosen Rando Calrissian");
		
	}

	@Override
	public Roshambo value() {
		Scanner scn  = new Scanner(System.in);
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(3-1+1) + 1;
        System.out.println(randomNumber);
        Roshambo oppChoice = null;
     
        if (randomNumber == 1)
        	oppChoice = Roshambo.ROCK;
         else if  (randomNumber == 2)
            oppChoice = Roshambo.PAPER; 
         else if  (randomNumber == 3)
        	oppChoice = Roshambo.SCISSORS;
		return oppChoice;
        }
		
  
	}

		
/* switch (randomNumber) {
case 1: randomNumber = 1;
	return Roshambo.ROCK;
case 2: randomNumber = 2;
	return Roshambo.PAPER;

case 3: randomNumber = 3;
return Roshambo.SCISSORS;
}
return Roshambo.PAPER; */

	

