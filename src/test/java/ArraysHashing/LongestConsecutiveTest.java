package ArraysHashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.filip850.ArraysHashing.LongestConsecutive;

public class LongestConsecutiveTest {

  private final LongestConsecutive longestConsecutive;

  public LongestConsecutiveTest() {
    this.longestConsecutive = new LongestConsecutive();
  }

  @Test
  @DisplayName("Check is longest consecutive calculated correctly - Case 1")
  public void longestConsecutive_case1(){
    Assertions.assertEquals(4, longestConsecutive.longestConsecutive(new int[] {2,20,4,10,3,4,5}));
  }

  @Test
  @DisplayName("Check is longest consecutive calculated correctly - Case 2")
  public void longestConsecutive_case2(){
    Assertions.assertEquals(7, longestConsecutive.longestConsecutive(new int[] {0,3,2,5,4,6,1,1}));

  }
}
