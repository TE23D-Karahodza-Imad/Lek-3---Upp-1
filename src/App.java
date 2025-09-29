import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kuponger = 10; 
        boolean kör = true;

        System.out.println("Välkommen till Gröna Lund!");
        System.out.println("Du har ett åkhäfte med " + kuponger + " kuponger.\n");

        while (kör && kuponger > 0) {
            System.out.println("Välj en attraktion:");
            System.out.println("1. Cirkuskarusellen (2 kuponger, inga krav)");
            System.out.println("2. Fritt Fall (4 kuponger, 12 år & 140 cm)");
            System.out.println("3. Berg- och dalbana (3 kuponger, 120 cm)");
            System.out.println("4. Avsluta");
            System.out.print("Ditt val: ");
            int val = sc.nextInt();

            if (val == 4) {
                System.out.println("Tack för besöket!");
                break;
            }

            int kostnad = 0;
            boolean fårÅka = false;

            switch (val) {
                case 1:
                    kostnad = 2;
                    fårÅka = true; 
                    break;
                case 2:
                    kostnad = 4;
                    System.out.print("Ange ålder: ");
                    int ålder = sc.nextInt();
                    System.out.print("Ange längd (cm): ");
                    int längd = sc.nextInt();
                    if (ålder >= 12 && längd >= 140) {
                        fårÅka = true;
                    } else {
                        System.out.println("Du uppfyller inte kraven för Fritt Fall.");
                    }
                    break;
                case 3:
                    kostnad = 3;
                    System.out.print("Ange längd (cm): ");
                    int längd2 = sc.nextInt();
                    if (längd2 >= 120) {
                        fårÅka = true;
                    } else {
                        System.out.println("Du är tyvärr för kort för Berg- och dalbanan.");
                    }
                    break;
                default:
                    System.out.println("Ogiltigt val.");
            }

            if (fårÅka) {
                if (kuponger >= kostnad) {
                    kuponger -= kostnad;
                    System.out.println("Du åker! -" + kostnad + " kuponger. Kuponger kvar: " + kuponger);
                } else {
                    System.out.println("Du har inte tillräckligt med kuponger.");
                }
            }

            if (kuponger == 0) {
                System.out.println("Dina kuponger är slut! Dags att gå hem.");
                kör = false;
            }
        }

        sc.close();
    }
}
