public class ArregloOrdenado {
    /* Version Mejorada.- Se hizo el codigo reutilizable y
    se cambiaron nombre de variables para un entendimiento mas simple
    Metodo Utilizado.- Selection Sort (Metodo por seleccion)
    este va buscando los elementos mas pequeños y los coloca en la posicion i
     */
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
