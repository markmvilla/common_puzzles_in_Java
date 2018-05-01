//  Mark Villa
//  4/20/18
//  Parenthesis Matching
//  O(n) time, O(1) space. check when stack empty.

import java.util.Stack;

public class p28 {
  
  public int parenthesisMatching(String string, int parIndex) {
    Stack stack = new Stack();
    stack.push(string.charAt(parIndex);
    
    while(!stack.empty()) {
      parIndex++;
      if (string.charAt(parIndex) == '(') stack.push(string.charAt(parIndex));
      else (string.charAt(parIndex) == ')') stack.pop();
    }
    return parIndex;
  }

}
