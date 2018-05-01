//  Mark Villa
//  4/20/18
//  Apple Stocks
//  O(n) time, O(1) space. greedily update minvalue and maxprofit.

public class p27 {

  public char[] reverseWords(char[] word) {
    revChar(word, 0, word.length-1);
    int len = 0 ;
    for (int i=0; i<word.length; i++) {
        if (word[i] == ' ') {
            revWord(sentence, i-len, i ) ;
            len = 0;
            continue;
        }
        len++ ;
    }
  }

}
