package pl.filip850.ArraysHashing;

import java.util.HashSet;

public class SudokuValidator {

  public boolean isValidSudoku(char[][] board) {

    for (int i = 0; i < 9; i++) {
      HashSet<Character> sudokuRow = new HashSet<>();
      HashSet<Character> sudokuCol = new HashSet<>();
      for (int j = 0; j < 9; j++) {
        if (!sudokuRow.add(board[i][j])) return false;
        if (!sudokuCol.add(board[j][i])) return false;
      }
    }

    return true;
  }

  public char[] getFlatSubbox(char[][] board, int x, int y) {

    return new char[]{};
  }

}
