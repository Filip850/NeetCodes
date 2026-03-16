package pl.filip850.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketValidation {
  public boolean isValid(String s){
    //If all brackets needs to be closed String always need to be %2==0 (need to has opening and closing tags)
    //We adding to Stack until closing bracket appears then starting to pop from stack.
    // If there is an bracket that is not correct closing one order has been mismatched.
    if(s.length()%2 != 0) return false;
    Deque<Character> openingBrackets = new ArrayDeque<>(); //Deque is better in java, but it can be stack also
    for (Character ch : s.toCharArray()){
      switch (ch) {
        case '{', '[', '(' -> openingBrackets.push(ch);
        default -> {
          if (openingBrackets.isEmpty()) return false; // If nothing on stack

          Character opBracket = openingBrackets.pop();
          switch (opBracket) {
            case '{' -> {
              if (ch != '}') return false;
            }
            case '[' -> {
              if (ch != ']') return false;
            }
            case '(' -> {
              if (ch != ')') return false;
            }
          }

        }
      }
    }
    return openingBrackets.isEmpty();
  }
}
