
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//--------------------------------------------------------------

        // Hier sind die Objekte (Kunden der Bank)
        Benutzer _1111 = new Benutzer("Herr", "Özkan", "Sakin", 2500.56);
        Benutzer _2222 = new Benutzer("Herr", "Marcel", "Helmer", 3362.32);
        Benutzer _3333 = new Benutzer("Frau", "Sieglinde", "Qorchi", 4293.83);
        Benutzer _4444 = new Benutzer("Frau", "Lisa", "Herbert", 500.59);
//--------------------------------------------------------------------------------


        System.out.println("Willkommen bei Bank Sibmög");
        System.out.println("Bitte geben Sie Ihren Pin ein");

        String Pinabfrage = sc.nextLine();


// -----------------------------------------------------------------------------


        System.out.println("________________________");


        //Verschachtelte Switch/Case funktion
        //Die äußere switch/case funktion gibt den jeweiligen Nutzer und Kontostand wieder gibt
        // Die innere switch/case ist für die Ein- und Auszahlung.

        switch (Pinabfrage) {

            case "_1111":
                _1111.printInfo();
                System.out.println("Möchten sie Ein oder Auzahlen?");
                System.out.println("1 für Einzahlen");
                System.out.println("2 für  Auszahlen");
                int Auswahl = sc.nextInt();
                switch (Auswahl) {
                    case 1:
                        System.out.println("Wie viel möchten Sie Einzahlen?");
                        double Einzahlung = sc.nextInt();
                        System.out.println("Ihr neuer Kontostand beträgt: " + (_1111.getKontostand() + Einzahlung) + "€");
                        break;
                    case 2:
                        System.out.println("Wie viel möchten Sie Auszahlen?");
                        double Auszahlung = sc.nextInt();
                        System.out.println("Ihr neuer Kontostand beträgt: " + (_1111.getKontostand() - Auszahlung) + "€");
                        break;
                    default:
                        System.out.println("ungültige Eingabe");
                        break;

                }
                break;
            case "_2222":
                _2222.printInfo();
                System.out.println("Möchten sie Ein oder Auzahlen?");
                System.out.println("1 für Einzahlen");
                System.out.println("2 für  Auszahlen");
                int Auswahl1 = sc.nextInt();
                switch (Auswahl1) {
                    case 1:
                        System.out.println("Wie viel möchten Sie Einzahlen?");
                        double Einzahlung = sc.nextInt();
                        System.out.println("Ihr neuer Kontostand beträgt: " + (_2222.getKontostand() + Einzahlung) + "€");
                        break;
                    case 2:
                        System.out.println("Wie viel möchten Sie Auszahlen?");
                        double Auszahlung = sc.nextInt();
                        System.out.println("Ihr neuer Kontostand beträgt: " + (_2222.getKontostand() - Auszahlung) + "€");
                        break;
                    default:
                        System.out.println("ungültige Eingabe");
                        break;
                }


            case "_3333":
                _3333.printInfo();
                System.out.println("Möchten sie Ein oder Auzahlen?");
                System.out.println("1 für Einzahlen");
                System.out.println("2 für  Auszahlen");
                int Auswahl2 = sc.nextInt();
                switch (Auswahl2) {
                    case 1:
                        System.out.println("Wie viel möchten Sie Einzahlen?");
                        double Einzahlung = sc.nextInt();
                        System.out.println("Ihr neuer Kontostand beträgt: " + (_3333.getKontostand() + Einzahlung) + "€");
                        break;
                    case 2:
                        System.out.println("Wie viel möchten Sie Auszahlen?");
                        double Auszahlung = sc.nextInt();
                        System.out.println("Ihr neuer Kontostand beträgt: " + (_3333.getKontostand() - Auszahlung) + "€");
                        break;
                    default:
                        System.out.println("ungültige Eingabe");
                        break;
                }
                break;
            case "_4444":
                _4444.printInfo();
                System.out.println("Möchten sie Ein oder Auzahlen?");
                System.out.println("1 für Einzahlen");
                System.out.println("2 für  Auszahlen");
                int Auswahl3 = sc.nextInt();
                switch (Auswahl3) {
                    case 1:
                        System.out.println("Wie viel möchten Sie Einzahlen?");
                        double Einzahlung = sc.nextInt();
                        System.out.println("Ihr neuer Kontostand beträgt: " + (_3333.getKontostand() + Einzahlung) + "€");
                        break;
                    case 2:
                        System.out.println("Wie viel möchten Sie Auszahlen?");
                        double Auszahlung = sc.nextInt();
                        System.out.println("Ihr neuer Kontostand beträgt: " + (_3333.getKontostand() - Auszahlung) + "€");
                        break;
                    default:
                        System.out.println("ungültige Eingabe");
                        break;
                }
                break;
            default:
                System.out.println("ungültige Eingabe");
                break;
        }
//

        // -------------------------------------------------------------------


    }
}
