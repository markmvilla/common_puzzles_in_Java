//  Mark Villa
//  4/20/18
//  Which Appears Twice
//  O(n) time, O(1) space. use triangluar sum.

import java.lang.Math;

public class p33 {

  public int findRepeat(int[] input) {
    int calculatedSum = (java.lang.Math.pow(input.length,2) + input.lengt)/2;
    int actualSum = 0;
    for(int i = 0; i < input.length; i++) {
      actualSum += input[i];
    }
    return actualSum -calculatedSum;
  }
  
}
