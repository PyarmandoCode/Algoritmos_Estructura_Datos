import java.util.ArrayList;
public class ArrayListUni {
    public static void main(String[] args) {
        ArrayList<Integer> lista =new ArrayList<>();
        //Anadir elementos a la lista
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        //Insertar un nuevo elemento a la tercera posicion
        lista.add(2,35);
        System.out.println("Lista despues de la insercion:"+lista);
        lista.remove(2);
        System.out.println("Lista despues de la insercion:"+lista);

    }    
}
