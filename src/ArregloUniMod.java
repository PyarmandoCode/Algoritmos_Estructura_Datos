import java.util.Arrays;
public class ArregloUniMod {
    public static void main(String[] args) {
        int[] arreglo = {10,20,30,40,50} ; //Arreglo Original
        int posicion =2 ; //Posicion donde se va a insertar el nuevo elemento (la tercera posicion)
        int nuevoElemento=25; //Elemento que se va a insertar
        //Crear un nuevo arreglo con un tamaño mayor
        int[] nuevoArreglo=new int[arreglo.length +1];
        //Copiar elementos antes de la posicion de insercion
        for (int i = 0; i<posicion;i++) {
            nuevoArreglo[i]=arreglo[i];
        }
        //Inserta el nuevo elemento
        nuevoArreglo[posicion]=nuevoElemento;
        //Copiar los elementos restantes
        for (int i=posicion;i<arreglo.length;i++){
            nuevoArreglo[i+1]=arreglo[i];
        }
        System.out.println("Arreglo despues de la insercion"+Arrays.toString(nuevoArreglo));

    }
    
}
