package com.lab12.roshambo;

import java.util.Scanner;

public class RpsValidation {
	
	static Scanner scan = new Scanner(System.in);
	
	public static int opp(int opp) {
		
		while ((!(opp == 1)) && (!(opp == 2)) && (!(opp ==3))) {
			System.out.println("Please enter a valid opponenet number");
			opp = scan.nextInt(); }
			
			if ((opp == 1) || (opp == 2) || (opp==3));
			return opp;
	}
		
		public static int rps(int rps) {
			while ((!(rps == 1)) && (!(rps == 2)) && (!(rps == 3))) {
				System.out.println("Please enter a valid weapon selection");
				rps = scan.nextInt(); }
				
			if ((rps == 1) || (rps == 2) || (rps == 3));
			return rps;
			}
		
		public static String answer(String answer) {
			while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n") ) {
				
				if (answer.equalsIgnoreCase("y"));
				
				else if (!answer.equalsIgnoreCase("n")); {
				System.out.println("Please enter a valid answer");
				answer = scan.next(); }
				
				if (answer.equalsIgnoreCase("n")) {
				break; }	
		}
			return answer;
	
		}

		
}
	