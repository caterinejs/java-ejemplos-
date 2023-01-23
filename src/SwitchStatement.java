public class SwitchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Dark";

        switch(colorModeSelected){
                case "Light":
                    System.out.println("seleccionaste light mode");
                    break;
                case "Night": //ambar
                    System.out.println("seleccionaste mnight mode");
                    break;
                case "blue dark":
                    System.out.println("seleccionaste blue mode");
                    break;
                case "Dark":
                    System.out.println("seleccionaste dark");
                    break;
            default:
                System.out.println("selecciona una opcion");


            }
        }

    }

