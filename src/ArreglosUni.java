public class ArreglosUni {
    public static void main(String[] args) {
        //Declarar e inicializar una array unidimensional de numeros
        int[] numeros={10,20,30,40,50};
        //Accediendo a elementos
        System.out.println("Primer elemento:" + numeros[0]);
        System.out.println("Segundo elemento:" + numeros[1]);
        System.out.println("Ultimo elemento:" + numeros[4]);

        //Modificando un elemento
        numeros[2]=100;
        //Recorrer el arreglo
        System.out.println("Elementos del Arreglo");
        for (int numero:numeros) {
            System.out.println(numero);
        }
    }
    
}
