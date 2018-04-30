//  Mark Villa
//  4/20/18
//  Find Duplicate. Space Edition.
 // O(n) time, O(n) space. hashmap.
 // O(n) time, O(n) space. count array.

public class p40 {

  public static int findDuplicateUsingHashMap(int[] nums) {
    HashMap <Integer, Integer> hashmap = new HashMap <> ();
    for (int i = 0; i < nums.length; i++) {
      if (hashmap.containsKey(nums[i])) {
        return nums[i];
      } else {
        hashmap.put(nums[i], 0);
      }
    }
    return -1;
 }
 
  public static int findDuplicateUsingCountArray(int[] nums) {
    int[] mem = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      if (mem[nums[i]] > 0) {
        return nums[i];
      } else {
        mem[nums[i]] += 1;
      }
    }
    return -1;
  }
  
}
