public class FibonacciRecursivo {
    long serieFibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return serieFibonacci(n-1)+serieFibonacci(n-2);
    }
}
