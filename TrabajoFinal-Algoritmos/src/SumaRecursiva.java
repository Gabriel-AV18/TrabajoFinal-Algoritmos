public class SumaRecursiva {
    public static int sumar (int n){
        if (n == 1){
            return 1;
        }
        return n + sumar (n - 1);
    }
}
