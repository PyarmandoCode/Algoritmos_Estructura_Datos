//Este es un algoritmo de ordenamiento basado en la mejora del ordenamiento por inserción. En lugar de comparar elementos adyacentes, compara elementos que están a un cierto intervalo o "gap". Este intervalo se reduce gradualmente hasta que se realiza un ordenamiento por inserción.

public class Shell {
    public static void main(String[] args) {
        int[] arreglo = {12, 34, 54, 2, 3};

        System.out.println("Arreglo antes de ser ordenado:");
        imprimirArreglo(arreglo);

        // Llamada al método de Shell Sort
        shellSort(arreglo);

        System.out.println("\nArreglo después de ser ordenado:");
        imprimirArreglo(arreglo);
    }

    // Método de ordenamiento Shell
    public static void shellSort(int[] arreglo) {
        int n = arreglo.length;

        // Comienza con un "gap" grande, luego lo reduce
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Realiza un ordenamiento por inserción para este "gap"
            for (int i = gap; i < n; i++) {
                // Almacena el valor actual
                int temp = arreglo[i];

                // Desplaza los elementos previamente ordenados
                int j;
                for (j = i; j >= gap && arreglo[j - gap] > temp; j -= gap) {
                    arreglo[j] = arreglo[j - gap];
                }

                // Coloca el valor actual en su posición correcta
                arreglo[j] = temp;
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

//Explicación:
// Ciclo exterior (for (gap = n / 2; gap > 0; gap /= 2)): Se reduce el tamaño del intervalo o "gap" desde la mitad del tamaño del arreglo hasta 1. El algoritmo comienza ordenando elementos que están lejos unos de otros y reduce el "gap" a medida que se acerca a un ordenamiento final por inserción.

// Ciclo interior (for (int i = gap; i < n; i++)): Este ciclo recorre los elementos con el "gap" actual y realiza un ordenamiento por inserción para elementos que están separados por este intervalo.

// Intercambio o desplazamiento (for (j = i; j >= gap && arreglo[j - gap] > temp; j -= gap)): Si el elemento que está a una distancia gap es mayor que el valor actual (temp), se intercambian, y este proceso se repite para todos los elementos a la izquierda.

// Colocación en la posición correcta (arreglo[j] = temp): Al final de cada iteración, se coloca el elemento actual en su posición correcta dentro del subarreglo ordenado.