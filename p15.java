// Mark Villa
// 4/20/18
// Fibonacci
// O(2^n) time, O(n) space. recursively. O(2^n) time, O(n) space.
// O(n) time, O(1) space. dynamicly iterativly (bottom-up).
// O(lgn) time, O(lgn) space. dynamicaly iterate matrix.

class p15 {

  public static int fibonacciRecursely(int n) {
    if (n<=0) return n;
    return fib(n-1) + fib(n-2);
  }
	
	public static int fibonacciIteratively(int n) {
		int a = 0, b = 1, temp;
		if (n == 0) return a;
		for (int i=2; i<=n; i++) {
			temp = a+b;
			a = b;
			b = temp;
		}
		return b;
	}	
	
}
