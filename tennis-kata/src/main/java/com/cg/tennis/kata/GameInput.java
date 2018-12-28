package com.cg.tennis.kata;

import java.util.Scanner;

import com.cg.tennis.kata.core.Game;
import com.cg.tennis.kata.core.TennisGameGUI;

public class GameInput {
	public static void main (String[] args){
		TennisGameGUI ui = new TennisGameGUI();
		ui.prompt();
		ui.print("Please enter player one name: ");
		//String playerOneName = new Scanner(System.in).nextLine();

		Scanner scannerOne = new Scanner(System.in);
		String playerOneName = scannerOne.nextLine();
		
		ui.print("Please enter player two name: ");
		
		Scanner scannerTwo = new Scanner(System.in);
		String playerTwoName = scannerTwo.nextLine();
		
		ui.print("Press enter to start the game...");
		
		new Scanner(System.in).nextLine();
		
		scannerOne.close();
		scannerTwo.close();
		
		Game game = new Game(ui, playerOneName, playerTwoName);
		game.start();
		ui.exit();
	}
}