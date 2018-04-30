//  Mark Villa
//  4/20/18
//  Find Duplicate. Space Edition. Beast Mode.
//  O(n) time, O(1) space. in place tagging. necessary req. include having int values within a range smaller than the array length
//  O(n) time, O(1) space. as linked list. see here https://github.com/jasonkwong11/interview-cake-answers/blob/master/41-find-repeat-space-hard/index.js

public class p41 {

  public static int findDuplicateInPlace(int[] arr) {
    int dup = -1;
    for (int i = 0; i < arr.length; i++) {
      if(arr[Math.abs(arr[i])] >=0)
         arr[Math.abs(arr[i])] *= -1;
      else {
        dup = Math.abs(arr[i]);
        break;
      }
    }
    return dup;
  }
  
}
