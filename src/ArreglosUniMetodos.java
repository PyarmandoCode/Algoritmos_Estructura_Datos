import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArreglosUniMetodos {
    public static void main(String[] args) {
        //Ordenar arreglos
        //int [] numeros={5,1,4,2,3};
        //Arrays.sort(numeros);
        //System.out.println(Arrays.toString(numeros));

        //Rellenar un arreglo con un valor especifico
        //int[] numeros=new int[5];//instanciar el arreglo
        //Arrays.fill(numeros, 7);//Agregando valores
        //System.out.println(Arrays.toString(numeros));

        //Rellenar del indice 1 al 3 con el valor 9
        //int[] numeros=new int[5];
        //Arrays.fill(numeros, 1,4,9); //Rellenar del indice 1 al 3 con el valor 9
        //System.out.println(Arrays.toString(numeros));

        //Copiar el contenido de un arreglo a otro  especificando la longitud del arreglo
        //int[] numeros={1,2,3};
        //int[] copia = Arrays.copyOf(numeros, 5);
        //System.out.println(Arrays.toString(copia));

        //Realizar una busqueda binaria de un arreglo ordenado.Retornar el indice del elemento buscado
        //int[] numeros={1,2,3,4,5};
        //int indice= Arrays.binarySearch(numeros, 3);
        //System.out.println(indice);

        //Convertir un arreglo en listas para manejar los metodos que tienen las colecciones
        String[] frutas={"Manzana","Banana","Cereza"};
        ArrayList<String>listafrutas = new ArrayList<>(Arrays.asList(frutas));
        
        //ArrayList<Integer>lista=new ArrayList<>();
        //lista.add(20);

        listafrutas.add("Mango");
        listafrutas.add("Uva");
        System.out.println(listafrutas);

    }
    
}
