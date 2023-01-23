import java.util.Scanner;

public class DoWhileLop {
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("selecciona el numero de la opcion deseada");
            System.out.println("1 movies");
            System.out.println("2 series");
            System.out.println("0 salir");

           //para escribir con el teclado
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 0:
                    System.out.println("gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("movies");
                    break;
                case 2:
                    System.out.println("series");
                    break;
                default:
                    System.out.println("selecciona una opcion correcta");
            }
        }while(response != 0);
        System.out.println("se termino el programa");
    }
}
