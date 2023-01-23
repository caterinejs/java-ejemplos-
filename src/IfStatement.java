public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            //send file
            fileSended++;
            System.out.println("archivo enviado");
            int i = 0;
            i++;
        }else {
            System.out.println("enciende tu buetooth");
        }
        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
    }
}
