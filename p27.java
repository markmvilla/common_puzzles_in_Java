//  Mark Villa
//  4/20/18
//  Reverse Words
//  O(n + w*l) (n = length w = amount of words l = length of words) time O(1) space. double revers in place.

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

  public char[] revChar(char[] word, int start, int end) {
      if (start == end) return;
      if ( end- start == 1 ) return ;
      char temp;
      for (int i=0; i<(end-start)/2 ; i++) {
          temp = word[i+ start] ;
          word[i + start] = word[end - i - 1] ;
          word[end - i -1] = temp ;
      }
      return word;
  }

}
