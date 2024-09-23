public class arreglobidimensionalbus {
    public static void main(String[] args) {
         //Declaracion e inicializacion de un arreglo bidimensional de 3 filas y 4 columnas
         int[][] matriz = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
        };
        //Elemento que deseamos buscar
        int elementoBuscado=87;
        boolean encontrado=false;

        //Recorrer el arreglo para buscar el elemento
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) {
                if (matriz[i][j] == elementoBuscado) {
                    System.out.println("Elemento:" + elementoBuscado + " encontrado en la posicion (" + i + ", " + j + ")");
                    encontrado=true;
                    break; //Salimos del Bucle
                }
            }
           if (encontrado) {
            break;//Salimos del bucle
           } 
        }
        if (!encontrado) {
            //System.out.println("Elemento " + elementoBuscado + " no encontrado en la matriz");
            System.out.println(String.format("Elemento %s  no encontrado en la matriz",elementoBuscado));

        }
    }
    
}
