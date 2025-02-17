public class FibonacciComparison {

    public static void main(String[] args) {
        int[] testValues = {10, 30, 50};
        
        for (int n : testValues) {
            
            System.out.println("Testing Recursive Fibonacci for N = " + n + ":");
            long startTime = System.nanoTime();
            int resultRecursive = fibonacciRecursive(n);
            long endTime = System.nanoTime();
            System.out.println("Recursive Fibonacci result: " + resultRecursive);
            System.out.println("Recursive Time: " + (endTime - startTime) / 1000000.0 + " ms");

           
            System.out.println("\nTesting Iterative Fibonacci for N = " + n + ":");
            startTime = System.nanoTime();
            int resultIterative = fibonacciIterative(n);
            endTime = System.nanoTime();
            System.out.println("Iterative Fibonacci result: " + resultIterative);
            System.out.println("Iterative Time: " + (endTime - startTime) / 1000000.0 + " ms");
            
            System.out.println();
        }
    }

    
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
