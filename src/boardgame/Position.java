package boardgame;

public class Position {
	
	private int rown;
	private int column;
	
	public Position(int row, int column) {
		this.rown = row;
		this.column = column;
	}

	public int getRown() {
		return rown;
	}

	public void setRown(int rown) {
		this.rown = rown;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return rown + ", " + column;
	}
	

}
