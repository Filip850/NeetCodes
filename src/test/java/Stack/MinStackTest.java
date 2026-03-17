package Stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.filip850.ArraysHashing.MinStack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinStackTest {


  @Test
  @DisplayName("Push affects top correctly")
  void push_affects_top_correctly() {
    MinStack stack = new MinStack();

    stack.push(5);
    assertEquals(5, stack.top());

    stack.push(10);
    assertEquals(10, stack.top());
  }

  @Test
  @DisplayName("Top returns last element")
  void top_test() {
    MinStack stack = new MinStack();

    stack.push(1);
    stack.push(2);
    stack.push(3);

    assertEquals(3, stack.top());
  }

  @Test
  @DisplayName("Get minimal value correctly")
  void getMin_test() {
    MinStack stack = new MinStack();

    stack.push(20);
    assertEquals(20, stack.getMin());

    stack.push(10);
    assertEquals(10, stack.getMin());

    stack.push(30);
    assertEquals(10, stack.getMin());

    stack.push(5);
    assertEquals(5, stack.getMin());
  }

  @Test
  @DisplayName("Pop removes element correctly")
  void pop_test() {
    MinStack stack = new MinStack();

    stack.push(10);
    stack.push(20);
    stack.push(5);

    stack.pop();
    assertEquals(20, stack.top());
    assertEquals(10, stack.getMin());

    stack.pop();
    assertEquals(10, stack.top());
    assertEquals(10, stack.getMin());
  }

}
