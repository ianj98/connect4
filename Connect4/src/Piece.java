
public class Piece {
	
	private static int RED_CODE = 1;
	private static int BLACK_CODE = 2;
	
	//"red" or "black"
	private String color;
	//1 for "red", 2 for "black"
	private int colorCode;
	
	//empty pieces for start of game
	public Piece() {
		color = "empty";
		colorCode = 0;
	}
	
	public Piece(String c) {
		color = c;
		if(color == "red") {
			colorCode = RED_CODE;
		}
		else if (color == "black") {
			colorCode = BLACK_CODE;
		}
		
	}
	
	public int getColorCode() {
		return colorCode;
	}	
	
	public String getColor() {
		return color;
	}

}
