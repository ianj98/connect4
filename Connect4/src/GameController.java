import java.util.Scanner;

public class GameController {

	static Scanner keyboard = new Scanner(System.in);
	
	public static Boolean makeMove(Player p, Board board) {
		//initialize temp variable column
		int col = 0;
		
		//prompt user to enter column
		System.out.println(p.getColor() + " player enter the number 1-7 of the column that you want to place your piece");
		col = keyboard.nextInt();
		
		while(col < 1 || col > 7) {
			System.out.println("The column number must be an integer 1-7");
			col = keyboard.nextInt();
		}
		
		return board.rowSettledForColumn(col-1, p.playPiece());
	}
	
	public static int playGame(Player p1, Player p2, Board board) {
		Boolean p1Turn = true;
		Boolean winner = false;
		int moves = 0;
		
		while(!winner && moves < 42){
			if(p1Turn) {
				while(!makeMove(p1,board));
			}
			else {
				while(!makeMove(p2,board));
			}
			board.showBoard();
			winner = board.checkWinner();
			p1Turn = !p1Turn;
			moves++;
		}
		
		return 0;
		
	}

	public static void main(String[] args) {
		
		//initialize players
		Player player1 = new Player("red");
		Player player2 = new Player("black");
		
		//initialize board
		Board board = new Board();
		
		playGame(player1, player2, board);
		
//		board.rowSettledForColumn(0, new Piece("black"));
//		board.rowSettledForColumn(1, new Piece("black"));
//		board.rowSettledForColumn(0, new Piece("black"));
//		board.rowSettledForColumn(1, new Piece("black"));
//		board.rowSettledForColumn(2, new Piece("black"));
//		board.rowSettledForColumn(0, new Piece("black"));
//		board.rowSettledForColumn(2, new Piece("red"));
//		board.rowSettledForColumn(2, new Piece("black"));
//		board.rowSettledForColumn(2, new Piece("red"));
//		board.rowSettledForColumn(2, new Piece("red"));
//		board.rowSettledForColumn(3, new Piece("red"));
//		board.rowSettledForColumn(2, new Piece("black"));
//		board.rowSettledForColumn(3, new Piece("black"));
//		board.rowSettledForColumn(0, new Piece("red"));
//		board.rowSettledForColumn(3, new Piece("red"));
//		board.rowSettledForColumn(3, new Piece("black"));
//		board.rowSettledForColumn(3, new Piece("red"));
//		board.rowSettledForColumn(1, new Piece("red"));
//		board.rowSettledForColumn(1, new Piece("red"));
//		board.rowSettledForColumn(4, new Piece("red"));
//		board.rowSettledForColumn(5, new Piece("red"));
//		board.rowSettledForColumn(6, new Piece("black"));
//		board.rowSettledForColumn(6, new Piece("black"));
//		board.rowSettledForColumn(6, new Piece("black"));
//		board.rowSettledForColumn(6, new Piece("black"));
//		
//		
//
//		
//		
//		
//		//show board
//		board.showBoard();
//		
//		board.checkWinner();
		
		
		
//		//returns true if its player 1's turn, false if player 2's
//		private Boolean onesMove = true;
//		
//		while(!winner) {
//			if(onesMove) {
//				player1.play();
//			}
//			else {
//				player2.play();
//			}
//			onesMove = !onesMove;
//			checkforWinner();
//		}
	}

}
