class Main
{
		public static void main(String[] args)
	{
			int n = 3;
		System.out.println("nth Fibonacci number is " + fib(n));
	}
		public static int fib(int n)
	{
		if (n <= 1) {
			return n;
		}
		int previousFib = 0, currentFib = 1;
		for (int i = 0; i < n - 1; i++)
		{
			int newFib = previousFib + currentFib;
			previousFib = currentFib;
			currentFib = newFib;
		}
		return currentFib;
	}
}