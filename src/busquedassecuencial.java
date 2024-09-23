public class busquedassecuencial {
    public static void main(String[] args) {
        int[] arreglo = {10, 23, 45, 70, 11, 15};
        int elemento = 70;

        // Llamada al método de búsqueda secuencial
        int resultado = busquedaSecuencial(arreglo, elemento);

        // Mostrar resultado
        if (resultado == -1) {
            System.out.println("El elemento no está en el arreglo.");
        } else {
            System.out.println("El elemento se encuentra en el índice: " + resultado);
        }
    }

    // Método para realizar búsqueda secuencial
    public static int busquedaSecuencial(int[] arreglo, int elemento) {
        // Recorre el arreglo para encontrar el elemento
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return i; // Devuelve el índice donde se encuentra el elemento
            }
        }
        return -1; // Devuelve -1 si el elemento no se encuentra en el arreglo
    }
}
