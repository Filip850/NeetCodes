package ArraysHashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.filip850.ArraysHashing.SudokuValidator;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SudokuValidatorTest {

  private final SudokuValidator sudokuValidator;

  public SudokuValidatorTest() {
    this.sudokuValidator = new SudokuValidator();
  }


  @Test
  @DisplayName("Is sudoku valid")
  void isSudokuValid() {
    char[][] board = {
        {'1','2','.','.','3','.','.','.','.'},
        {'4','.','.','5','.','.','.','.','.'},
        {'.','9','1','.','.','.','.','.','3'},
        {'5','.','.','.','6','.','.','.','4'},
        {'.','.','.','8','.','3','.','.','5'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','.','.','.','.','.','2','.','.'},
        {'.','.','.','4','1','9','.','.','8'},
        {'.','.','.','.','8','.','.','7','9'}
    };
    Assertions.assertFalse(sudokuValidator.isValidSudoku(board));
  }
}
