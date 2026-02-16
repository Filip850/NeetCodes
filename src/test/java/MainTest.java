import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.filip850.Main;

public class MainTest {

  @Test
  @DisplayName("JUnit Init")
  void isTestRun(){
    Assertions.assertTrue(Main.testCheck());
  }
}
