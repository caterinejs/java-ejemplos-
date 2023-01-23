public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

    //pongo la operacion matematica que quiero hacer despues del Math.

        //esta devuleve un entero hacia arriba
        System.out.println(Math.ceil(x));

        //esta devuleve un entero hacia abajo
        System.out.println(Math.floor(x));

        //esta devuleve un numero elevado a otro
        System.out.println(Math.pow(x, y));

        //esta devuleve el numero mayor
        System.out.println(Math.max(x, y));

        //devuelve la raiz cuadrada de un numero
        System.out.println(Math.sqrt(y));

        //area de un circulo
       //pi *r2
        System.out.println(Math.PI * Math.pow(y,2));

        //area de una esfera
        //4 *PI*r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //volumen de una esfera
        //(4/3)*pi *r3
        System.out.println((4/3) * Math.PI * Math.pow(y, 2));

    }
}
