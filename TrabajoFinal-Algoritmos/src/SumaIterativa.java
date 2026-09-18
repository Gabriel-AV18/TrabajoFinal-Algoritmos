public class SumaIterativa {
    long sumaIterativa(long n) {
        long suma = 0;
        for (long i = 1; i <= n; i++) {
            suma = suma +i;
        }
        return suma;
    }

}
