public class BacktrackingSubconjuntos {
    void buscar (int[] arreglo,int K, int indice, int sumaActual,String subConjunto){
        if(sumaActual == K){
            System.out.println(subConjunto);
            return;
        }
        if (indice >= arreglo.length || sumaActual > K){
            return;
        }
        buscar(
                arreglo,
                K,
                indice +1,
                sumaActual + arreglo[indice],
                subConjunto + arreglo[indice] + ","
        );
        buscar(
                arreglo,
                K,
                indice +1,
                sumaActual,
                subConjunto
        );
    }
}
