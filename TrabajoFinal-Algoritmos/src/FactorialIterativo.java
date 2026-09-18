public class FactorialIterativo {
    long factorial(int n){
        long resultado = 1;
        for (int i = 1; i <= n; i++){
            resultado = resultado * i;
        }
        return resultado;
    }
}
