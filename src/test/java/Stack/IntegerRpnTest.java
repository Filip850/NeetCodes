package Stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.filip850.Stack.IntegerRpn;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerRpnTest {
  private final IntegerRpn integerRpn;

  public IntegerRpnTest() {
    this.integerRpn = new IntegerRpn();
  }

  @Test
  @DisplayName("Correct tokens test for RPN")
  void evalRpn_whenCorrectTokens_thenReturnCorrectOutput() {
    assertEquals(5, integerRpn.evalRPN(new String[]{"1","2","+","3","*","4","-"}));
  }
}
