public class Family {
    public static void main(String[] args) {

        String motherFullName = "Dora Sanchez";
        System.out.println("tu madre se llama " + motherFullName);

        int motherAge = 52;
        System.out.println("tu madre se llama " + motherFullName + " su edad es " + motherAge);

        char c ='z';
        int cI = c;
        System.out.println(cI);

        int i = 250;
        long iL = i;
        System.out.println(iL);

        short iS = (short)iL;
        System.out.println(iS);

        double d = 301.067;
        long dL = (long) d;
        System.out.println(dL);

        int iC = 100;
        double iA = 50000.66;
        float iB = iC + (float) iA;
        System.out.println(iB);

        int i1 = 737;
        int i12 = i1 * 100;
        byte i123 = (byte) i12;
        System.out.println(i123);

        double d1 = 298.638;
        double d2 = d1 / 25;
        long d3 = (long) d2;
        System.out.println(d3);


    }
}
