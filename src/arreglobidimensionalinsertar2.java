public class arreglobidimensionalinsertar2 {
    public static void main(String[] args) {
        //Declarar un arreglo bidimensional de 3 filas y columnas
        int[][] matriz= new int[3][3]; //Instanciando la matriz


    //Insertar elementos en la matriz usuando bucles anidados
    int valor = 1; // Valor inicial para insetar en la matriz
    for (int i = 0; i<matriz.length; i++ ){
        for (int j=0; j < matriz[i].length; j++) {
            matriz[i][j] = valor; //Asigna el valor a la posicion[i][j]
            valor++;//Incremento el valor para el proximo elemento

        }
    } 

    //Imprimir la matriz para verificar los valores insertados
    System.out.println("Elementos de la matriz");
    for (int i=0; i<matriz.length;i++) {
        for (int j=0; j<matriz[i].length;j++) {
            System.out.print(matriz[i][j] + "\t"); //Imprimir los elementos con tabulacion
        }
        System.out.println();//Salto de linea en cada fila
    }
 }
}
