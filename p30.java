//  Mark Villa
//  4/20/18
//  Permutation Palindrome
//  O(n*lgn) time, O(1) space. sort and iterate with double count.
//  O(n) time, O(n) space. keep count.

public class p30 {

  public static boolean isPermPal(String string) {
    if(string.length%2 == 0) {
      int sum = 0;
      for(int i=0; i< string.length(); i++) {
        sum ^= string.charAt(i);
      }
      return (sum==0);
    }
    else {
      HashSet<String> mySet= new HashSet<String>();
      for(int i=0; i< string.length(); i++) {
        if(mySet.contains(string.charAt(i))
          mySet.remove(string.charAt(i));
        else
          mySet.add(string.charAt(i));
      }
      return mySet.size <= 1;
    }
    return -1
  }
  
}
