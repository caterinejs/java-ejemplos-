public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono 200

        salary = salary + 200;
        System.out.println(salary);

        //pension: 50 descuento

        salary = salary -50;
        System.out.println(salary);

        //2 horas extra 30cly
        // comida = 45

        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //actualizando cadenas de texto
        String employeeName = "caterine jaramillo";
        employeeName = employeeName + " sanchez";
        System.out.println(employeeName);

        employeeName = " ana sofia " + employeeName;
        System.out.println("tu nombre es " + employeeName);
    }
}
