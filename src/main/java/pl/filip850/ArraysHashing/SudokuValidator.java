package pl.filip850.ArraysHashing;

import java.util.HashSet;

public class SudokuValidator {

  public boolean isValidSudoku(char[][] board) {

    for (int i = 0; i < 9; i++) {
      HashSet<Character> sudokuRow = new HashSet<>();
      HashSet<Character> sudokuCol = new HashSet<>();
      for (int j = 0; j < 9; j++) {
        if (board[i][j] != '.' && !sudokuRow.add(board[i][j])) return false;
        if (board[j][i] != '.' && !sudokuCol.add(board[j][i])) return false;
      }
    }

    for (int subboxNumber = 0; subboxNumber < 9; subboxNumber++) {
      HashSet<Character> sudokuSubbox = new HashSet<>();
      for (Character e : getFlatSubbox(subboxNumber, board)){
        if(e != '.' && !sudokuSubbox.add(e)) return false;
      }
    }

    return true;
  }


  //Optional: Made for better code readability. It can be micro optimised, but it is not STM or ESP code :>
  char[] getFlatSubbox(int num, char[][] board) {
    char[] box = new char[9];

    int startRow = (num / 3) * 3;
    int startCol = (num % 3) * 3;

    int boxIter = 0;
    for (int r = 0; r < 3; r++) {
      for (int c = 0; c < 3; c++) {
        box[boxIter++] = board[startRow + r][startCol + c];
      }
    }

    return box;
  }

}
