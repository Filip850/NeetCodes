package Stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.filip850.Stack.BracketValidation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BracketValidationTest {
  private final BracketValidation bracketValidation;

  public BracketValidationTest() {
    this.bracketValidation = new BracketValidation();
  }

  @Test
  @DisplayName("True case validation - case []")
  void isValid_trueCase_simple(){
    assertTrue(bracketValidation.isValid("[]"));
  }

  @Test
  @DisplayName("True case validation - case ({[]})")
  void isValid_trueCase_medium(){
    assertTrue(bracketValidation.isValid("({[]})"));
  }

  @Test
  @DisplayName("True case validation - case ({[]}[])")
  void isValid_trueCase_hard(){
    assertTrue(bracketValidation.isValid("({[]}[])"));
  }

  @Test
  @DisplayName("False case validation - case [(])")
  void isValid_falseCase(){
    assertFalse(bracketValidation.isValid("[(])"));
  }

  @Test
  @DisplayName("False case validation - case )(")
  void isValid_falseCase_noOpBracket(){
    assertFalse(bracketValidation.isValid(")("));
  }
}
