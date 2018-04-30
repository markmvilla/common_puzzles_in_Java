// Mark Villa
// 4/20/18
// Fibonacci
// O(2^n) time, O(n) space. recursively. O(2^n) time, O(n) space.
// O(n) time, O(1) space. using memoization iteratively.

class p15 {

  public static int fibonacciRecursely(int n) {
    if (n<=0) return n;
    return fib(n-1) + fib(n-2);
  }
  
  public static int fibonacciIteratively(int n) {
    if(n <= 1) {
			return n;
		}
    
    int current = 0;
    int firstPrevious = 1;
    int secondPrevious = 0;
    
    for (int i = 2; i < n; i++) {
      current = firstPrevious + secondPrevious;
      firstPrevious = current;
      secondPrevious = firstPrevious;
    }
    return current;
  }
  
}
