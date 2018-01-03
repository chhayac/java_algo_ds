package dynamicProgramming;

public class Fibonacci {

	public static int fibonacci1(int n) {
		int f[] = new int[n+1];
		f[0] = 0;
		f[1] = 1;
		
		for (int i = 2; i <= n; ++i) {
			f[i] = f[i-1] + f[i-2];
		}
		
		return f[n];
	}
	
	public static int fibonacci2(int n) {
		int a = 0;  /* First term */
		int b = 1;  /* Second term */
		
		if (n == 0) {
			return a;
		}
		
		int c; 		/* Final term */
		for (int i = 2; i <= n; ++i) {
			c = a + b;
			b = c;
			a = b;
		}
		return b;
	}
	
	public static void main(String[] args) {
		int n1 = 9;
		int n2 = 8;
		System.out.println("Fibonacci sequence's " + n1 + "th term is " + fibonacci1(n1));
		System.out.println("Fibonacci sequence's " + n2 + "th term is " + fibonacci1(n2));
	}

}
