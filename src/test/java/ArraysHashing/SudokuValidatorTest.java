package ArraysHashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.filip850.ArraysHashing.SudokuValidator;

public class SudokuValidatorTest {

  private final SudokuValidator sudokuValidator;

  public SudokuValidatorTest() {
    this.sudokuValidator = new SudokuValidator();
  }

  @Test
  @DisplayName("Valid sudoku testcase")
  void isSudokuValid_valid() {
    char[][] board = {
        {'1','2','.','.','3','.','.','.','.'},
        {'4','.','.','5','.','.','.','.','.'},
        {'.','9','8','.','.','.','.','.','3'},
        {'5','.','.','.','6','.','.','.','4'},
        {'.','.','.','8','.','3','.','.','5'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','.','.','.','.','.','2','.','.'},
        {'.','.','.','4','1','9','.','.','8'},
        {'.','.','.','.','8','.','.','7','9'}
    };
    Assertions.assertTrue(sudokuValidator.isValidSudoku(board));
  }

  @Test
  @DisplayName("Invalid sudoku subbox")
  void isSudokuValid_invalidSubbox() {
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

  @Test
  @DisplayName("Invalid sudoku column")
  void isSudokuValid_invalidColumn() {
    char[][] board = {
        {'1','2','.','.','3','.','.','.','.'},
        {'4','.','.','5','.','.','.','.','.'},
        {'.','9','8','.','.','.','.','.','3'},
        {'5','.','.','.','6','.','.','.','4'},
        {'.','.','.','8','.','3','.','.','5'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','.','.','.','.','.','2','.','.'},
        {'.','.','.','4','1','9','.','.','8'},
        {'1','.','.','.','8','.','.','7','9'}
    };
    Assertions.assertFalse(sudokuValidator.isValidSudoku(board));
  }


  @Test
  @DisplayName("Invalid sudoku row")
  void isSudokuValid_invalidRow() {
    char[][] board = {
        {'1','2','.','.','3','.','.','.','.'},
        {'4','.','.','5','.','.','.','.','.'},
        {'.','9','8','.','.','3','.','.','3'},
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