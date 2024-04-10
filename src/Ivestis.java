import java.util.Scanner;

public class Ivestis {
    private Scanner scanner;

    public Ivestis() {
        scanner = new Scanner(System.in);
    }

    public Knyga pridetiKnyga (){
        System.out.println("Knygos pavadinimas");
        String p = scanner.nextLine();
        System.out.println("Knygos autorius");
        String a = scanner.nextLine();
        int m;
        do {
            System.out.println("Knygos metai");

            while (!scanner.hasNextInt()) {
                System.out.println("Ivedete neteisingai:");
                scanner.next();
            }
            m = scanner.nextInt();
        } while (m < 0);

        return new Knyga(p,a,m);
    }
}
