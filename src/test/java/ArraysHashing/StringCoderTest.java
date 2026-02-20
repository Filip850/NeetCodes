package ArraysHashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.filip850.ArraysHashing.StringCoder;

import java.util.ArrayList;
import java.util.List;

public class StringCoderTest {

  private final StringCoder coder;

  public StringCoderTest() {
    this.coder = new StringCoder();
  }

  @Test
  @DisplayName("Should make correct frame")
  void testFrames(){
    Assertions.assertEquals("##2##zz##5##tEst1", coder.encode(List.of("zz", "tEst1")));
  }

  @Test
  @DisplayName("Should make correct decoding")
  void testFramesDecode(){
    Assertions.assertEquals(new ArrayList<>(List.of("zz", "tEst1")), coder.decode("##2##zz##5##tEst1"));
  }

}
