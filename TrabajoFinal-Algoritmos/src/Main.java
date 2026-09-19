import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char continuar ;
        do {
            System.out.println("1.- Suma Iterativa");
            System.out.println("2.- Suma Recursiva");
            System.out.println("3.- Factorial Iterativo");
            System.out.println("4.- Factorial Recursiva");
            System.out.println("5.- Fibonacci Iterativo");
            System.out.println("6.- Fibonacci Recursiva");
            System.out.println("7.- Fibonacci Dinamico");
            System.out.println("8.- Arreglo Ordenado");
            System.out.println("9.- Numero Menor");
            System.out.println("10.- Backtracking Subconjuntos");

            System.out.println("Seleccione Una Opcion");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    SumaIterativa si = new SumaIterativa();

                    System.out.println("Ingrese n");
                    int n = sc.nextInt();

                    System.out.println("El Resultado Es." + si.sumaIterativa(n));
                    break;
                case 2:
                    SumaRecursiva sr = new SumaRecursiva();

                    System.out.println("Ingrese n");
                    long n1 = sc.nextLong();

                    System.out.println("El Resultado Es." + sr.sumar(n1));
                    break;
                case 3:
                    FactorialIterativo fi = new FactorialIterativo();
                    System.out.println("Ingrese n");
                    long n2 = sc.nextLong();

                    System.out.println("El Resultado Es." + fi.factorial(n2));
                    break;
                case 4:
                    FactorialRecursivo ff = new FactorialRecursivo();
                    System.out.println("Ingrese n");
                    long n3 = sc.nextLong();

                    System.out.println("El Resultado Es." + ff.factorial(n3));
                    break;
                case 5:
                    FibonacciIterativo fi2 = new FibonacciIterativo();
                    System.out.println("Ingrese n");
                    long n4 = sc.nextLong();

                    System.out.println("El Resultado Es." + fi2.serieFibonacci(n4));
                    break;
                case 6:
                    FibonacciRecursivo fi3 = new FibonacciRecursivo();
                    System.out.println("Ingrese n");
                    int n5 = sc.nextInt();

                    System.out.println("El Resultado Es." + fi3.serieFibonacci(n5));
                    break;
                case 7:
                    FibonacciDinamico fi4 = new FibonacciDinamico();
                    System.out.println("Ingrese n");
                    int n6 = sc.nextInt();

                    System.out.println("El Resultado Es." + fi4.fibonacci(n6));
                    break;
                case 8:
                    System.out.println("De Cuantos Numeros Sera El Arreglo");
                    int tam= sc.nextInt();

                    int[] arreglo= new int[tam];

                    for (int i = 0; i < arreglo.length; i++) {
                        System.out.println("Ingrese El Elemento " + (i+1) + ": ");
                        arreglo[i] = sc.nextInt();
                    }
                    ArregloOrdenado ar = new ArregloOrdenado();
                    ar.orden(arreglo);

                    for (int num : arreglo) {
                        System.out.println(num+"");
                    }
                    break;
                case 9:
                    System.out.println("De Cuantos Numeros Sera El Arreglo");
                    int tam2= sc.nextInt();

                    int[] arreglo2= new int[tam2];
                    for (int i = 0; i < arreglo2.length; i++) {
                        System.out.println("Ingrese El Elemento " + (i+1) + ": ");
                        arreglo2[i] = sc.nextInt();
                    }
                    NumeroMenor nm = new NumeroMenor();
                    System.out.println("El Numero Menor Es." + nm.menor(arreglo2));
                    break;
                case 10:
                    System.out.println("De Cuantos Numeros Sera El Arreglo");
                    int tam3= sc.nextInt();

                    int[] arreglo3= new int[tam3];
                    for (int i = 0; i < tam3; i++) {
                        System.out.println("Ingrese El Elemento " + (i+1) + ": ");
                        arreglo3[i] = sc.nextInt();
                    }
                    System.out.println("Valor K:");
                    int K= sc.nextInt();

                    BacktrackingSubconjuntos bs = new BacktrackingSubconjuntos();
                    System.out.println("Sub Conjunto Entontrado:");
                    bs.buscar(arreglo3,K,0,0,"");
                    break;
            }
            System.out.println("Desea Realizar Otra Operacion ? (S/N)");
            continuar = sc.next().toUpperCase().charAt(0);

        }while (continuar == 'S');

        System.out.println("Fin De La Practica");
        sc.close();

    }

}
