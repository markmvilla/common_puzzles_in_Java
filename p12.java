//Mark Villa
//4/20/18
//binary search. O(lgn) time O(1) space.
public class p12 {

  public static int binarySearch(int target, int[] input) {
  
    int floor = -1;
    int ceiling = input.length;

    while (ceiling - floor > 1) {
      guessIndex = floor + (ceiling - floor)/2;
      guessValue = input[guessIndex];
      
      if(guessValue == target) {
        return guessIndex
      }
      if(guessValue > target) {
        ceiling = guessIndex;
      }else {
        floor = guessIndex;
      }
      return -1;
    }
  }
  
}
