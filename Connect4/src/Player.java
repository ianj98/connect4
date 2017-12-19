
public class Player {
	
	private static int RED_CODE = 1;
	private static int BLACK_CODE = 2;
	private static int INITIAL_PIECES = 24;
	
	private int colorCode;
	private String color;
	private Piece[] pieces;
	private int numPieces;
	
	
	public Player(String c) {
		color = c;
		if(color == "red") {
			colorCode = RED_CODE;
		}
		else if (color == "black") {
			colorCode = BLACK_CODE;
		}
		
		pieces = new Piece[INITIAL_PIECES];
		
		for(int i = 0; i < INITIAL_PIECES; i++) {
			pieces[i] = new Piece(color);
		}	
		numPieces = 24;
	}
	
	public Piece playPiece() {
		Piece playedPiece = pieces[pieces.length - 1];
		numPieces -= 1;
		Piece[] newPieces = new Piece[numPieces];
		for(int i = 0; i < numPieces; i++) {
			newPieces[i] = pieces[i];
		}
		pieces = newPieces;
		return playedPiece;
	}
	
	public String getColor() {
		return color;
	}
}
