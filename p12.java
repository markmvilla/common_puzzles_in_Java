//  Mark Villa
//  4/20/18
//  Find in Ordered Set
//   O(lgn) time O(1) space. binary search.

public class P12 {

  public static int binarySearch(int target, int[] input) {
    int floor = -1;
    int ceiling = input.length;

    while (ceiling - floor > 1) {
      guessIndex = floor + (ceiling - floor)/2;
      guessValue = input[guessIndex];
      
      if(guessValue == target)
        return guessIndex;
      if(guessValue > target) 
        ceiling = guessIndex;
      else 
        floor = guessIndex;
      return -1;
    }
  }
  
}
