package pl.filip850.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {
  // "pop, top and getMin will always be called on non-empty stacks."
  // So there will be no check in top pop and getMin methods
  Deque<Integer> stack;
  Deque<Integer> minStack;

  public MinStack() {
    stack = new ArrayDeque<>();
    minStack = new ArrayDeque<>();
  }

  public void push(int val) {
    stack.push(val);
    if(minStack.isEmpty()) {
      minStack.push(val);
      return;
    }
    if (val <= minStack.peek()) minStack.push(val);
  }

  public void pop() {
    if(stack.pop().equals(minStack.peek())) {
      minStack.pop();
    }
  }

  public int top() {
    return stack.peek(); //It will produce warning (see comment above)
  }

  public int getMin() {
    return minStack.peek(); //It will produce warning (see comment above)
  }
}

