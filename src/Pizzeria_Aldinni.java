import javax.swing.*;

public class Pizzeria_Aldinni {

    static String[][] tabla_pizza = new String[5][5];

    public static void main(String[] args) {
        int cantidad_pizzas = Integer.parseInt(JOptionPane.showInputDialog("cuantas pizzas pa?"));
        //este for es para la cantidad de pizzas
        if (cantidad_pizzas <= 5 && cantidad_pizzas > 0) {
            for (int i = 0; i < cantidad_pizzas; i++) {
                tabla_pizza[i][4] = "5000";
                int cantidad_ingredientes = 0;
                int e = 0;
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
                    switch (eleccion) {
                        case "1":
                            tabla_pizza[i][4] = (Integer.parseInt(tabla_pizza[i][4]) + 500) + "";
                            tabla_pizza[i][e] = "Jamon";
                            e++;
                            break;
                        case "2":
                            tabla_pizza[i][4] = (Integer.parseInt(tabla_pizza[i][4]) + 900) + "";
                            tabla_pizza[i][e] = "Pepperoni";
                            e++;
                            break;
                        case "3":
                            tabla_pizza[i][4] = (Integer.parseInt(tabla_pizza[i][4]) + 700) + "";
                            tabla_pizza[i][e] = "pollo";
                            e++;
                            break;
                        case "4":
                            tabla_pizza[i][4] = (Integer.parseInt(tabla_pizza[i][4]) + 300) + "";
                            tabla_pizza[i][e] = "Tomate";
                            e++;
                            break;
                        case "5":
                            tabla_pizza[i][4] = (Integer.parseInt(tabla_pizza[i][4]) + 1200) + "";
                            tabla_pizza[i][e] = "Atun";
                            e++;
                            break;
                        case "6":
                            tabla_pizza[i][4] = (Integer.parseInt(tabla_pizza[i][4]) + 400) + "";
                            tabla_pizza[i][e] = "Albaca";
                            e++;
                            break;
                        case "7":
                            tabla_pizza[i][4] = (Integer.parseInt(tabla_pizza[i][4]) + 800) + "";
                            tabla_pizza[i][e] = "Champiñones";
                            e++;
                            break;
                        case "0":
                            cantidad_ingredientes = 5;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "ingrese el numero de los ingredientes en la lista");
                            cantidad_ingredientes--;
                    }
                    cantidad_ingredientes++;
                }
                System.out.print(tabla_pizza[i][0] + "|");
                System.out.print(tabla_pizza[i][1] + "|");
                System.out.print(tabla_pizza[i][2] + "|");
                System.out.print(tabla_pizza[i][3] + "|");
                System.out.println(tabla_pizza[i][4] + "|");


                System.out.println("-------------------------------------------");
                if (i <= cantidad_pizzas - 2) {
                    JOptionPane.showMessageDialog(null, "siguiente pizza");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "por favor ingrese un numero valido");
        }
        switch (cantidad_pizzas) {
            case 1:
                System.out.println("El precio total es: " + tabla_pizza[0][4]);
                break;
            case 2:
                System.out.println("El precio total es: " + (Integer.parseInt(tabla_pizza[0][4]) + Integer.parseInt(tabla_pizza[1][4])));
                break;
            case 3:
                System.out.println("El precio total es: " + (Integer.parseInt(tabla_pizza[0][4]) + Integer.parseInt(tabla_pizza[1][4]) +
                        Integer.parseInt(tabla_pizza[2][4])));
                break;
            case 4:
                System.out.println("El precio total es: " + (Integer.parseInt(tabla_pizza[0][4]) + Integer.parseInt(tabla_pizza[1][4]) +
                        Integer.parseInt(tabla_pizza[2][4]) + Integer.parseInt(tabla_pizza[2][4])));
                break;
            case 5:
                System.out.println("El precio total es: " + (Integer.parseInt(tabla_pizza[0][4]) + Integer.parseInt(tabla_pizza[1][4]) +
                        Integer.parseInt(tabla_pizza[2][4]) + Integer.parseInt(tabla_pizza[3][4]) + Integer.parseInt(tabla_pizza[4][4])));
                break;
        }
    }
}
