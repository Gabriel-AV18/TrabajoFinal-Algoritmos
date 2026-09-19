public class ArregloOrdenado {
    void orden (int[] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            for (int j = i; j < arreglo.length; j++){
                if (arreglo[j] < arreglo[i]){
                    int menor = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = menor;
                }
            }
        }
    }
}
