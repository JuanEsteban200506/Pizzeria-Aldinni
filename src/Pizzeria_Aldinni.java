import javax.swing.*;

public class Pizzeria_Aldinni {

    static String[][] tabla_pizza = new String[5][6];

    public static void main(String[] args) {
        //-un cliente puede comprar maximo 5 pizzas
        //-el valor base de una pizza es de $5000
        //-puede haber un maximo de 4 ingredientes
        //ingrdientes: jamon=500/peperoni=900/pollo=700/tomate=300
        //atun=1200/albaca=400/champiñines=800
        //-se debe calcular el valor de cada pizza
        //se debe calcular el valor total
        int VALOR_BASE = 5000;
        int cantidad_pizzas = Integer.parseInt(JOptionPane.showInputDialog("cuantas pizzas pa?"));
        //este for es para la cantidad de pizzas
        for (int i = 0; i < cantidad_pizzas; i++) {
            tabla_pizza[i][5]=5000+"";
            int cantidad_ingredientes = 0;
            //este while es para los ingredientes
            while (cantidad_ingredientes < 4) {
            String menu = "ELIJA SUS INGREDIENTES MOR (MAXIMO 4)\n" +
                    "1. jamon = 500\n" +
                    "2. peperoni = 900\n" +
                    "3. pollo = 700\n" +
                    "4. tomate = 300\n" +
                    "5. atun = 1200\n" +
                    "6. albaca = 400\n" +
                    "7. champiñones = 800\n" +
                    "0. terminar pizza";

            String eleccion = JOptionPane.showInputDialog(menu);

//en este switch se suma el valor de los ingredientes
                switch (eleccion) {
                    case "1":
                        tabla_pizza[i][5]=(Integer.parseInt(tabla_pizza[i][5])+500)+"";
                        break;
                    case"2":
                        tabla_pizza[i][5]=(Integer.parseInt(tabla_pizza[i][5])+900)+"";
                }
                System.out.println(tabla_pizza[i][5]);
                cantidad_ingredientes++;
            }
        }


    }


}
