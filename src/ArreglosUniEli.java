import java.util.Arrays;
public class ArreglosUniEli {
    public static void main(String[] args) {
        int[] arreglo = {10,20,30,40,50}; //Arreglo original
        int posicion=2; //Posicion del elemento que se va a eliminar

        //Crear un nuevo arreglo con un tamaño menor
        int [] nuevoArreglo=new int[arreglo.length - 1];
        //Copiar los elementos antes y despues del elemento a eliminar
        for(int i=0;i<posicion;i++) {
            nuevoArreglo[i]=arreglo[i];
        }
        for (int i = posicion + 1; i< arreglo.length;i++){
            nuevoArreglo[i -1]=arreglo[i];
        }
        System.out.println("Arreglo despues de la eliminacion"+Arrays.toString(nuevoArreglo));
    }
    
}
