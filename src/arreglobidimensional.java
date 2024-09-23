public class arreglobidimensional {
    public static void main(String[] args) {
        //Declaracion e inicializacion de un arreglo bidimensional de 3 filas y 4 columnas
        int[][] matriz = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
        };
        //Recorrer e imprimir los elementos de la matriz
        for (int i=0;i<matriz.length;i++) { //Itera sobre las filas
            for (int j=0; j<matriz[i].length;j++ ) { //Iterar sobre las columnas
                System.out.print(matriz[i][j]+ "\t");
            }
            System.out.println();//Salto de linea despues de imprimir cada fila

        }
    }
    
}
