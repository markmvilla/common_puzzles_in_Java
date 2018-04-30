//  Mark Villa
//  4/20/18
//  Highest Product of Three
//  O(n^3) time, O(1) space. brute force three loop. O(n^3) time, O(1) space
//  O(n) time, O(1) space. scan and combine.

public class p3 {

  public static int triplete(int[] arr) {
    int[] maxThree = new int[3];
    int[] minTwo = new int[2];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > maxThree[0]) {
          maxThree[2] = maxThree[1];
          maxThree[1] = maxThree[0];
          maxThree[0] = arr[i];
        }
        else if (arr[i] > maxThree[1]) {
          maxThree[2] = maxThree[1];
          maxThree[1] = arr[i];
        }
        else if (arr[i] > maxThree[2]) {
          maxThree[2] = arr[i];
        }

        if (arr[i] < minTwo[0]) {
          minTwo[1] = minTwo[0];
          minTwo[0] = arr[i];
        }
        else if( arr[i] <minTwo[1]) {
          minTwo[1] = arr[i];
        }
    }
    return Math.max(maxThree[0]*maxThree[1]*maxThree[2], minTwo[0]*minTwo[1]*maxThree[0]);
  }
  
}
