public class TicTacToe {
	
	public static void main(String[] args) {
		char[][] board = new char[3][3];
		
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				board[x][y] = '_';
			}
		}
		
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				System.out.print(board[x][y]);
				System.out.print(' ');
			}
			System.out.println();
		}
	}
?
}