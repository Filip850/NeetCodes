package ArraysHashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.filip850.ArraysHashing.TopKFrequent;

import java.util.Arrays;

public class TopKFrequentTest {
  private final TopKFrequent topKFrequent;


  public TopKFrequentTest() {
    this.topKFrequent = new TopKFrequent();
  }

  @Test
  @DisplayName("Two the most frequent numbers")
  void twoK() {
    assertTopK(new int[]{1,2,2,3,3,3}, 2, new int[]{2,3});
  }

  @Test
  @DisplayName("One the most frequent number")
  void oneK() {
    assertTopK(new int[]{7,7}, 1, new int[]{7});
  }

  private void assertTopK(int[] input, int k, int[] expected) {
    int[] actual = topKFrequent.topKFrequent(input, k);

    Arrays.sort(expected);
    Arrays.sort(actual);

    Assertions.assertArrayEquals(expected, actual);
  }

}
