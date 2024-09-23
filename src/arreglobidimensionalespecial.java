import java.util.Scanner;
public class arreglobidimensionalespecial {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Definir una matriz cuadrada de 3x3
        int n=3;
        int[][] matriz=new int[n][n];

        //Solicitar al usuario que ingrese los valores de la matriz
        System.out.println("Ingrese los elementos de la matriz cuadrada 3x3");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.println("Elemento  [" + i + "][" + j +"]:");
                matriz[i][j]=scanner.nextInt(); //Almacena el valor ingresado por el usuario
            }
        }

        //Imprimir la matriz cuadra
        System.out.println("\nMatriz Cuadrada Ingresada");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(matriz[i][j] +"\t"); //Imprimir cada elemento
            }
            System.out.println();
    }
    
  }
}