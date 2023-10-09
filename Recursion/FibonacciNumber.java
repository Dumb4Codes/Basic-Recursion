public class FibonacciNumber {
    // Array to cache computed Fibonacci numbers
    private static long[] fibonacciCache;

    public static void main(String[] args) {
        int n = 50; // Calculate Fibonacci numbers up to the 50th position

        fibonacciCache = new long[n + 1]; // Initialize cache array for Fibonacci numbers
        
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " "); // Calculate and print the Fibonacci number at position i
        }
    }

    private static long fibonacci(int n) {
        // Base case: Fibonacci numbers for 0 and 1 are themselves
        if (n <= 1)
            return n;

        // Check if the Fibonacci number for 'n' has already been computed and cached
        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n]; // Return the cached value
        }

        // Calculate the 'n'-th Fibonacci number recursively
        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
        
        // Cache the calculated Fibonacci number for future use
        fibonacciCache[n] = nthFibonacciNumber;

        // Return the calculated Fibonacci number
        return nthFibonacciNumber;
    }
}
