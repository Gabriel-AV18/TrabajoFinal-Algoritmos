public class NumeroMenor {
    //Version Mejorada
    //Ahora Es Reutilizable
    int menor (int[] arreglo){
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++){
            if (arreglo[i] < menor){
                menor = arreglo[i];
            }
        }
        return menor;
    }
}
