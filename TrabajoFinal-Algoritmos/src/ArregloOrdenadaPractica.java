public class ArregloOrdenadaPractica {
    //Version Del Codigo Entregada En CLase
    //Algoritmo Usado: Buble Sort (Metodo BUrbuja)
    /* Este compara un elemento con el siguiente e intercambia sus posiciones
    cuando el elemento de la izquierda es mayor que el de la derecha
     */
    public static void Orden (int[] A){
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length-1; j++){
                if (A[j] > A[j+1]){
                    int x =  A[j];
                    A[j] = A[j+1];
                    A[j+1] = x;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] A = { 14,25,54,365,45,1,2,12 };

        Orden(A);

        System.out.println("Arreglo Ordenado:");

        for (int i = 0 ; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
