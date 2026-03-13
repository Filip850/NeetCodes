package ArraysHashing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.filip850.ArraysHashing.ProductExceptSelf;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductExpectSelfTest {

  private final ProductExceptSelf productExceptSelf;

  public ProductExpectSelfTest() {
    this.productExceptSelf = new ProductExceptSelf();
  }

  @Test
  @DisplayName("Is product correct")
  void isProductCorrect() {
    assertAll(() -> {
      assertArrayEquals(new int[]{48, 24, 12, 8}, productExceptSelf.productExceptSelf(new int[]{1, 2, 4, 6}));
      assertArrayEquals(new int[]{0, -6, 0, 0, 0}, productExceptSelf.productExceptSelf(new int[]{-1, 0, 1, 2, 3}));
    });
  }


}
