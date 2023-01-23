public class Funciones {


    public static void main(String[] args) {
        double y = 3;

        circleArea(y);
        sphereArea(y);
        sphereVolumen(y);

        System.out.println("pesos a dolares: " + converToDolar( 200, "MXN"));

    }
        public static double circleArea(double r){
            return Math.PI * Math.pow(r, 2);
        }
        public static double sphereArea(double r){
            return 4 * Math.PI * Math.pow(r, 2);
        }
        public static double sphereVolumen(double r){
            return (4 / 3) * Math.PI * Math.pow(r, 3);
        }

    /**
     * Descripcion = funcion que especificando su moneda convierte una cantidad de dinero a dolares
     * @param quantity cantidad de dinero
     * @param currency tipo de moneda: solo acepta MXN o COP
     * @return quuantity devuelve la cantidad actualizada en dolares
     */
        public static double converToDolar(double quantity, String currency){

          switch (currency){
              case"MXN":
                  quantity = quantity * 0.052;
                  break;
              case "COP":
                  quantity = quantity * 0.00031;
                  break;

          }
            return quantity;
        }

    }

