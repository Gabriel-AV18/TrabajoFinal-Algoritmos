public class FactorialIterativo {
    long factorial(long n){
        long resultado = 1;
        for (long i = 1; i <= n; i++){
            resultado = resultado * i;
        }
        return resultado;
    }
}
