package xadrez;

import boardgame.Tabuleiro;

public class Match {

	
	private Tabuleiro tabuleiro;
	
	public Match() {
		tabuleiro = new Tabuleiro(8, 8);
	}
	
	public XadrezPe�a[][] getPe�as(){
		XadrezPe�a[][] mat = new XadrezPe�a[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i=0;i<tabuleiro.getColunas(); i++) {
			for(int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (XadrezPe�a) tabuleiro.pe�a(i, j);
			}
		}
	return mat;
	}
}
