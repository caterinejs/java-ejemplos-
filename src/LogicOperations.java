public class LogicOperations {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        //OPERADORES DE ASIGNACION
        System.out.println("a es igual a b " + (a == b));
        System.out.println("a es diferente a b " + (a != b));

        //OPERADORES RELACIONALES
        System.out.println("a es menor a b " + (a < b));
        System.out.println("a es mayor a b " + (a > b));
        System.out.println("a es menor o igual a b " + (a <= b));
        System.out.println("a es mayor o igual a b " + (a >= b));

        if (a == b) {
            System.out.println("a es igual a b");
        } else if ((a != b) && (a >b)) {
            System.out.println("a es diferente a b");

        } else if (a < b) {
            System.out.println("a es menor a b");

        } else if (a > b) {
            System.out.println("a es mayor a b");

        } else if (a <= b) {
            System.out.println("a es menor o igual a b");

        } else if (a >= b) {
            System.out.println("a es mayor o igual a b");
        }

    }
}