public class FibonacciIterativo {
    long serieFibonacci(long n) {
        long n1=0;
        long n2=1;
        long suma = 0;
        if (n == 0||n == 1)
            return n;
        else {
            for (int i = 2; i <= n; i++) {
                suma = n1+n2;
                n1 = n2;
                n2 = suma;
            }
        }
        return suma;
    }
}
