package app;

import xadrez.Match;


public class Programa {

	public static void main(String[] args) {

		
		Match chessMatch = new Match();
		UI.printTabuleiro(chessMatch.getPeças());
		
	}

}
