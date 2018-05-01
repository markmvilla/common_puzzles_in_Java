//  Mark Villa
//  4/20/18
//  Reverse String In Place
// O(n) time, O(n) stack space. in place recursevly.
// O(n) time, O(1) space. in place itereatively swap.

public class p26 {

  public char[] reverse(char[] word) {
    char temp;
    for(int i=0; i<word.length/2; i++) {
      temp = word[i];
      word[i] = word[word.length-1-i];
      word[word.length-1-i] = temp;
    }
    return word;
  }

}
