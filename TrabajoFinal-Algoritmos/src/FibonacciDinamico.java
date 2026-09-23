public class FibonacciDinamico {
    long fibonacci(int n, long[] fib) {
        if (n == 0 || n == 1){
            return n;
        }
        else {
            if (fib[n] != -1) {
                return fib[n];
            } else {
                fib[n] = fibonacci(n - 1, fib) + fibonacci(n - 2, fib);
                return fib[n];
            }

        }

    }
}
