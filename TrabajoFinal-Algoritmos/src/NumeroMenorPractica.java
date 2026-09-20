public class NumeroMenorPractica {
    //Version Orginal Entregada En La Practica
    public static int NumeroMenorPractica(int [] A) {
        int minimo =A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] < minimo) {
                minimo = A[i];
            }
        }
        return minimo;
    }
    public static void main(String[] args) {
        int[] arreglo= {5,4,1,2,45,2};
        System.out.println("Minimo"+ NumeroMenorPractica(arreglo));
    }
}
