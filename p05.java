*(review code)
//  Mark Villa
//  4/20/18
//  Making Change
//  O(c*n) time, O(n) space. dynamicly iterate (bottom-up) through coins and mem array. for each index in memArray and each coin, if index >= coin, add combinations of remainder.

public class p5 {

  public static long change(int change, int[] coins) {
    int[] table = new int[change + 1];
    Arrays.fill(table,0);
    table[0] = 1;
    for (int i=0; i<coins.length; i++)
      for (int j=coins[i]; j<=change; j++)
        table[j] += table[j -coins[i]];
    return table[change];
  }

}
