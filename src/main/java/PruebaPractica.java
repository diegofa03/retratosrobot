import java.util.Scanner;

public class PruebaPractica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean reinicio = false;
        do {
            String pelo1 = "WWWWWWWWW";
            String pelo2 = "\\\\\\//////";
            String pelo3 = "\"|||||||\"";
            String pelo4 = "|||||||||";

            System.out.println("Opción 1: " + pelo1);
            System.out.println("Opción 2: " + pelo2);
            System.out.println("Opción 3: " + pelo3);
            System.out.println("Opción 4: " + pelo4);

            System.out.print("Seleccione la opción de pelo: ");
            String opcionPelo = scanner.nextLine();

            while (opcionPelo.isEmpty()) {
                System.out.print("Seleccione la opción de pelo: ");
                opcionPelo = scanner.nextLine();
            }

            String ojos1 = "|  o o  |";
            String ojos2 = "|-(· ·)-|";
            String ojos3 = "|-(o o)-|";
            String ojos4 = "|  \\ /  |";

            System.out.println("Opción 1: " + ojos1);
            System.out.println("Opción 2: " + ojos2);
            System.out.println("Opción 3: " + ojos3);
            System.out.println("Opción 4: " + ojos4);

            System.out.print("Seleccione la opción de ojos: ");
            String opcionOjos = scanner.nextLine();
            while (opcionOjos.isEmpty()) {
                System.out.print("Seleccione la opción de ojos: ");
                opcionOjos = scanner.nextLine();
            }

            String orejas_nariz1 = "@   J   @";
            String orejas_nariz2 = "{   \"   }";
            String orejas_nariz3 = "[   j   ]";
            String orejas_nariz4 = "<   -   >";

            System.out.println("Opción 1: " + orejas_nariz1);
            System.out.println("Opción 2: " + orejas_nariz2);
            System.out.println("Opción 3: " + orejas_nariz3);
            System.out.println("Opción 4: " + orejas_nariz4);

            System.out.print("Seleccione la opción de orejas/nariz: ");
            String opcionOrejasNariz = scanner.nextLine();
            while (opcionOrejasNariz.isEmpty()) {
                System.out.print("Seleccione la opción de orejas/nariz: ");
                opcionOrejasNariz = scanner.nextLine();
            }

            String boca1 = "|  ===  |";
            String boca2 = "|   -   |";
            String boca3 = "|  ___  |";
            String boca4 = "|  ---  |";

            System.out.println("Opción 1: " + boca1);
            System.out.println("Opción 2: " + boca2);
            System.out.println("Opción 3: " + boca3);
            System.out.println("Opción 4: " + boca4);

            System.out.print("Seleccione la opción de boca: ");
            String opcionBoca = scanner.nextLine();
            while (opcionBoca.isEmpty()) {
                System.out.print("Seleccione la opción de boca: ");
                opcionBoca = scanner.nextLine();
            }

            String barbilla1 = "\\_______/";
            String barbilla2 = "\\,,,,,,,/";
            String barbilla3 = "\\......./";
            String barbilla4 = "\\mmmmmmm/";

            System.out.println("Opción 1: " + barbilla1);
            System.out.println("Opción 2: " + barbilla2);
            System.out.println("Opción 3: " + barbilla3);
            System.out.println("Opción 4: " + barbilla4);

            System.out.print("Seleccione la opción de barbilla: ");
            String opcionBarbilla = scanner.nextLine();
            while (opcionBarbilla.isEmpty()) {
                System.out.print("Seleccione la opción de barbilla: ");
                opcionBarbilla = scanner.nextLine();
            }

            System.out.println(opcionPelo);
            System.out.println(opcionOjos);
            System.out.println(opcionOrejasNariz);
            System.out.println(opcionBoca);
            System.out.println(opcionBarbilla);

            if (opcionPelo.equals("1")) {
                System.out.println(pelo1);
            } else if (opcionPelo.equals("2")) {
                System.out.println(pelo2);
            } else if (opcionPelo.equals("3")) {
                System.out.println(pelo3);
            } else if (opcionPelo.equals("4")) {
                System.out.println(pelo4);
            }

            if (opcionOjos.equals("1")) {
                System.out.println(ojos1);
            } else if (opcionOjos.equals("2")) {
                System.out.println(ojos2);
            } else if (opcionOjos.equals("3")) {
                System.out.println(ojos3);
            } else if (opcionOjos.equals("4")) {
                System.out.println(ojos4);
            }

            if (opcionOrejasNariz.equals("1")) {
                System.out.println(orejas_nariz1);
            } else if (opcionOrejasNariz.equals("2")) {
                System.out.println(orejas_nariz2);
            } else if (opcionOrejasNariz.equals("3")) {
                System.out.println(orejas_nariz3);
            } else if (opcionOrejasNariz.equals("4")) {
                System.out.println(orejas_nariz4);
            }

            if (opcionBoca.equals("1")) {
                System.out.println(boca1);
            } else if (opcionBoca.equals("2")) {
                System.out.println(boca2);
            } else if (opcionBoca.equals("3")) {
                System.out.println(boca3);
            } else if (opcionBoca.equals("4")) {
                System.out.println(boca4);
            }

            if (opcionBarbilla.equals("1")) {
                System.out.println(barbilla1);
            } else if (opcionBarbilla.equals("2")) {
                System.out.println(barbilla2);
            } else if (opcionBarbilla.equals("3")) {
                System.out.println(barbilla3);
            } else if (opcionBarbilla.equals("4")) {
                System.out.println(barbilla4);
            }

            System.out.println("Quiere realizar otro retrato?(1 = si, 2 = no): ");
            String decision = scanner.nextLine();
            if (decision.equals("1")) {
                reinicio = true;
            } else if (decision.equals("2")) {
                reinicio = false;
            }
        } while (reinicio == true);
    }

}
