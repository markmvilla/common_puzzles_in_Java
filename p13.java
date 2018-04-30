// Mark Villa
// 4/20/18
// Array of Products
//  O(lg n) time, O(n) space. in place recursive binary search
//  O(lg n) time, O(1) space. in place iterative binary search

public class p13 {

  public static int rotationSearchDict(String[] dict, int startIndex, int endIndex) {
    //floats get floored "toward" zero so rotation will be midIndex+1
    int midIndex = (startIndex + endIndex) / 2;
    if (startIndex == midIndex) {
      return midIndex + 1;
    } else if (dict[startIndex].compareTo(dict[midIndex]) > 0) {
      return rotationSearchDict(dict, startIndex, midIndex);
    } else {
      return rotationSearchDict(dict, midIndex, endIndex);
    }
  }
  
}
