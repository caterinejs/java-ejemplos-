public class Casting {
    public static void main(String[] args) {

        //en un año ubicar 30 perritos
        //cuantos ubique por mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //estimación
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //exactitud
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);

        double c = a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);
    }
}
