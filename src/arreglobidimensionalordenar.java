import java.util.Arrays;
public class arreglobidimensionalordenar {
    public static void main(String[] args) {
         // Declaración e inicialización de un arreglo bidimensional
         int[][] matriz = {
            {9, 5, 3},
            {8, 2, 4},
            {6, 7, 1}
        };
        // Mostrar el arreglo original
        System.out.println("Arreglo original:");
        imprimirMatriz(matriz);
        //Convertir el arreglo bidimensional a un arreglo udimimensional
        int filas=matriz.length;
        int columnas=matriz[0].length;
        int[] arregloUnidimensional= new int [filas*columnas];//No hay elementos en el array
        int index=0;
        for (int i=0; i<filas;i++) {
            for(int j=0;j<columnas;j++) {
                arregloUnidimensional[index++]=matriz[i][j];
            }
        }
        //Ordenar el arreglo unidimensional
        Arrays.sort(arregloUnidimensional);
        //Convertir el arreglo unidimensional de nuevo a bidimensional
        index=0;
        for (int i=0; i<filas;i++) {
            for (int j=0 ; j<columnas;j++) {
                matriz[i][j]=arregloUnidimensional[index++];
            }

        }
        //Mostrar el arreglo ordenado
        System.out.println("\nArreglo Ordenado");
        imprimirMatriz(matriz);
        
    }
     // Método para imprimir el arreglo bidimensional
     public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
