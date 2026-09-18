public class SumaRecursiva {
    long sumar (long n){
        if (n == 1){
            return 1;
        }
        return n + sumar (n - 1);
    }
}
