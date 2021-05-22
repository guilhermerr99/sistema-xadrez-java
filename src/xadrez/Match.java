package xadrez;

import boardgame.Tabuleiro;

public class Match {

	
	private Tabuleiro tabuleiro;
	
	public Match() {
		tabuleiro = new Tabuleiro(8, 8);
	}
	
	public XadrezPeça[][] getPeças(){
		XadrezPeça[][] mat = new XadrezPeça[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i=0;i<tabuleiro.getColunas(); i++) {
			for(int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (XadrezPeça) tabuleiro.peça(i, j);
			}
		}
	return mat;
	}
}
