import java.util.HashSet;
import java.util.List;

public class Sudoku {
	public int isValidSudoku(final List<String> a) {
	    boolean duplicate = false;
	    char [][] board = new char [9][9];
	    for(int i = 0; i < a.size(); i++) {
	        char [] temp = a.get(i).toCharArray();
	        board[i] = temp;
	    }
        for(int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<Character>();
            for(int j = 0; j < 9; j++) {
                
                if(board[i][j] != '.') {
                    duplicate = row.add(board[i][j]);
                    if(!duplicate) {
                        return 0;
                    }
                }
            }
        }
        for(int i = 0; i < 9; i++) {
            HashSet<Character> column = new HashSet<Character>();
            for(int j = 0; j < 9; j++) {
                
                if(board[j][i] != '.') {
                    duplicate = column.add(board[j][i]);
                    if(!duplicate) {
                        return 0;
                    }
                }
            }
        }
        for(int i = 0; i < 9; i++) {
            HashSet<Character> cube = new HashSet<Character>();
            for(int j = 0; j < 9; j++) {
                
                int RowIndex = 3*(i/3);
                int ColIndex = 3*(i%3);
                if(board[RowIndex + j/3][ColIndex + j%3]!='.' && !cube.add(board[RowIndex + j/3][ColIndex + j%3]))
                    return 0;
            }
        }
        
        return 1;
	}
	
	
}
