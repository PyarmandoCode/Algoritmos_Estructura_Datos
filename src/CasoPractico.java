// import java.util.Scanner;
// public class CasoPractico {
//     static class Estudiante {
//         String nombre;
//         double calificacion;

//         Estudiante(String nombre,double calificacion) {
//             this.nombre=nombre;
//             this.calificacion=calificacion;
            
//         }
//     }
//     public static void main(String[] args) {
//         Scanner scanner= new Scanner(System.in);
//         System.out.print("Ingrese el numero de estudiantes:");
//         int numestudiantes = scanner.nextInt();
//         scanner.nextLine();//Limpiar el buffer

//         Estudiante[] estudiantes = new Estudiante[numestudiantes];

//         //Agregar estudiantes y sus calificaciones

//         for (int i =0;i<numestudiantes;i++){
//             System.out.print("Ingrese el nombre del estudiante " + (i+1)+": ");
//             String nombre=scanner.nextLine();//variable

//             System.out.print("Ingrese la calificacion del estudiante " + nombre +": ");
//             double calificacion=scanner.nextDouble();
//             scanner.nextLine(); //variable

//             estudiantes[i]=new Estudiante(nombre, calificacion);//LLenado los valores al array

//         }

//         System.out.println("\nListado de estudiantes y sus calificaciones:");
//         for (Estudiante estudiante:estudiantes){
//             System.out.println(estudiante.nombre+": "+estudiante.calificacion);
//         }

//         //Buscando estudiante por nombre
//         System.out.println("\nIngrese el nombre del estudiante a buscar:");
//         String nombuscar=scanner.nextLine();
//         boolean encontrado=false;

//         for (Estudiante estudiante:estudiantes) {
//             if (estudiante.nombre.equalsIgnoreCase(nombuscar)) {
//                 System.out.println("Estudiante encontrado:" +estudiante.nombre + " Con calificacion " + estudiante.calificacion);
//                 encontrado=true;
//                 break;

//             }
//         }

//         if(!encontrado) {
//             System.out.println("Estudiante no encontrado");
//         }
//     }
    
// }
