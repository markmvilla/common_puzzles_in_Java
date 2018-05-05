//  Mark Villa
//  4/20/18
//  Recursive String Permutation
//  O(n^2 * n!) time, undetermined space. base: length = 0. recursive: for each letter (truncated original, updated perm).

class p31 {
  
  void permutation(String str) {
    permutation(str, "");
  }
  
	public static void permutation(String original, String perm) {
	    if (original.length() == 0)
	      System.out.println(perm);
	   else {
	      for (int i = 0; i < original.length(); i++) 
	        permutation(original.substring(0,i) + original.substring(i + 1), perm + original.charAt(i));
	    }   
	}
  
}
