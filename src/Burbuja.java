//Aquí tienes un ejemplo del algoritmo de ordenamiento burbuja (Bubble Sort) en Java, que es uno de los métodos más simples para ordenar un arreglo. Funciona comparando pares de elementos adyacentes y los intercambia si están en el orden incorrecto. Este proceso se repite hasta que todo el arreglo está ordenado.

public class Burbuja {
    public static void main(String[] args) {
        int[] arreglo = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Arreglo antes de ser ordenado:");
        imprimirArreglo(arreglo);

        // Llamada al método de ordenamiento burbuja
        burbuja(arreglo);

        System.out.println("\nArreglo después de ser ordenado:");
        imprimirArreglo(arreglo);
    }

    // Método de ordenamiento burbuja
    public static void burbuja(int[] arreglo) {
        int n = arreglo.length;
        // Recorre todo el arreglo
        for (int i = 0; i < n - 1; i++) {
            // Recorre el arreglo desde 0 hasta n-i-1
            // El último i elementos ya estarán ordenados
            for (int j = 0; j < n - i - 1; j++) {
                // Intercambia si el elemento actual es mayor que el siguiente
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    // Método para imprimir el arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}


// Explicación:
// Ciclo exterior (for (i = 0; i < n - 1; i++)): Este ciclo recorre el arreglo varias veces para asegurarse de que todos los elementos estén en el lugar correcto.
// Ciclo interior (for (j = 0; j < n - i - 1; j++)): Este ciclo compara cada par de elementos adyacentes. Si el elemento actual es mayor que el siguiente, se intercambian.
// Intercambio: Utilizamos una variable temporal temp para intercambiar dos elementos.
// Impresión: Se muestra el arreglo antes y después de aplicar el ordenamiento.
// El ordenamiento burbuja tiene una complejidad temporal de O(n^2) en el peor de los casos, por lo que no es el algoritmo más eficiente para grandes conjuntos de datos, pero es fácil de entender y de implementar.
    

