import java.util.InputMismatchException;
import java.util.Scanner;

public class tallerLab1 {
    public static void main(String[] args) {
        String libros [][]=new String[100][3];
        agregarLibro(libros, "El Hobbit", "J.R.R Tolkien", "Ed. Planeta");
        System.out.println("Total de libros: "+totalLibros(libros));;
    }


    public static void menu(){
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Opcion ingresada por el usuario

        while (!salir); {
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro");
            System.out.println("3. Mostrar espacios usados");
            System.out.println("4. Mostrar espacios disponibles");
            System.out.println("5. Mostrar toda la coleccion");
            System.out.println("6. Salir");
            System.out.println("Escribe una de las opciones");
            opcion = teclado.nextInt();
            try {
                switch (opcion) {
                    case 1:
                        System.out.println("has seleccionado la opcion 1");
                        break;
                    case 2:
                        System.out.println("Buscar libro");
                        break;
                    case 3:
                        System.out.println("Espacios usados");
                        break;
                    case 4:
                        System.out.println("Espacios disponibles");
                        break;
                    case 5:
                        System.out.println("Coleccion");
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Error al ingresar el numero");
                teclado.next();
            }
        }
    }
    public static String[][] agregarLibro(String misLibros[][],String titulo, String autor, String editorial){
        int numeroLibros=1;
        for (int i=0;i<numeroLibros;i++){
            misLibros[i][0]=titulo;
            misLibros[i][1]=autor;
            misLibros[i][2]=editorial;
        }
        numeroLibros++;
        return misLibros;
    }
    public static int totalLibros(String misLibros[][]){
        int total=0;
        while (misLibros[total][0]!=""){
            total++;
        }

        return total;
    }

}
