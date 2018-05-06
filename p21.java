//  Mark Villa
//  4/20/18
//  Unique int Among Duplicates
//  O(n) time, O(n) space. hashmap count and check which has 1 at the end.
//  O(n) time, O(1) space. xor to cancel duplicates out.

import java.util.*;

public class P21 {

    public static int singleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }
        return xor;
    }
    
    public static int singleNumber2(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for (int num : nums) {
        	if (hashmap.containsKey(num)) {
        		hashmap.put(num, hashmap.get(num)+1);
        	} else {
        		hashmap.put(num, 1);
        	}
        }
        for (HashMap.Entry<Integer, Integer> entry : hashmap.entrySet()) {
        	if (entry.getValue() == 1) {
        		return entry.getKey();
        	}
        }
        return 0;
    }
    
}
