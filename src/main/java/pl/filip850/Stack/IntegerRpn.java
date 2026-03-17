package pl.filip850.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class IntegerRpn {


  public int evalRPN(String[] tokens) {
    Deque<Integer> stack = new ArrayDeque<>();
    for (String t : tokens) {
      switch (t) {
        case "+":
          stack.push(stack.pop() + stack.pop());
          break;
        case "-": {
          int b = stack.pop();
          int a = stack.pop();
          stack.push(a - b);
          break;
        }
        case "*":
          stack.push(stack.pop() * stack.pop());
          break;
        case "/": {
          int b = stack.pop();
          int a = stack.pop();
          stack.push(a / b);
          break;
        }
        default:
          stack.push(Integer.parseInt(t));
      }
    }
    return stack.pop();
  }
}
