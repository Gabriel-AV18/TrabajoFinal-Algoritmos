public class algoBinario {
    public static int algoBinario(int [] Arreglo, int clave){
        //Se declaran las variables necesarias para el algoritmo
        int central, bajo, alto;
        int valorCentral;

        /* Al inicio se contempla todo el arreglo */
        bajo = 0;
        alto = Arreglo.length -1;

        while (bajo <= alto){
            //Calculamos la posicion central
            central = (bajo + alto)/2;
            //Se obtiene el valor que se encuentre en esa posicion
            valorCentral = Arreglo[central];
            if (clave == valorCentral){
                return central;//clave encontrada
                /*return Arreglo[central]; en esta línea podemos llamar el valor en lugar del índice si asi se desea
                * esto normalmente no se usa por si se llega atener un caso donde el valora a buscar es -1*/
            } else if (clave < valorCentral) {
                alto = central - 1; //ir a la mitad izquierda
            }else {
                bajo = central + 1;//ir a la mitad derecha
            }
        }
        return -1;// clave no encontrada
    }
    public static void main(String[] args) {
        //Introducimos Un Arreglo válido
        int [] Arreglo = {-8,4,5,9,12,18,25,40,60};
        //Valor (clave) a buscar
        int clave = 40;
        //LLamamos al metodo
        int posicion = algoBinario(Arreglo, clave);
        //Se muestra el resltado de la busqueda
        if  (posicion == -1){
            System.out.println("No existe el valor");
        }else{
            System.out.println("Clave encontrada en la posicion " + posicion);
        }
    }
}
