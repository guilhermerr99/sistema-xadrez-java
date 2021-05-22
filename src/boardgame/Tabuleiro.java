package boardgame;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Pe�a[][] pe�as;
	
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pe�as = new Pe�a[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	public Pe�a pe�a(int linha, int coluna) {
		return pe�as[linha][coluna];
	}
	public Pe�a pe�a(Position position) {
		return pe�as[position.getLinha()][position.getColuna()];
	}
}
