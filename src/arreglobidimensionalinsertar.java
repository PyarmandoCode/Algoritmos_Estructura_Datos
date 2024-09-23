public class arreglobidimensionalinsertar {
    public static void main(String[] args) {
        int[][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        //Mostrar el arreglo original
        System.out.println("Arreglo Original");
        imprimirMatriz(matriz);

        //Insertar un nuevo elemento en la posicion (1,1)
        int fila=1;
        int columna=1;
        int nuevovalor=99;
        matriz[fila][columna]=nuevovalor;

        //Mostrar el arreglo despues de la Insercion
        System.out.println("\n Arreglo despues de la insercion del elemento");
        imprimirMatriz(matriz);


    }
    // Metodo para imprimir el arreglo bidimensional
    public static void imprimirMatriz(int[][] matriz) {
        for (int i=0; i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
