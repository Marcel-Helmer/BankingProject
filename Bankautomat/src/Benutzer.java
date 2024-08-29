
public class Benutzer {

    //Eigenschaften der Klasse

    String Vorname;
    String Nachname;
    String Anrede;
    double Kontostand;


    // Konstruktor

    public Benutzer(String Anrede, String Vorname, String Nachname, double Kontostand) {
        this.Anrede = Anrede;
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Kontostand = Kontostand;
    }

    // Getter-Methoden

    public String getAnrede() {
        return this.Anrede;
    }

    public String getVorname() {
        return this.Vorname;
    }

    public String getNachname() {
        return this.Nachname;
    }

    public double getKontostand() {
        return this.Kontostand;
    }


    // Ausgabe der Kundeninformation und Kontostand

    public void printInfo() {
        System.out.println(this.Anrede + " " + this.Vorname + " " + this.Nachname);
        System.out.println("Ihr Kontostand beträgt: " + this.Kontostand + "€");
    }


        /*
        //TODO diese Setter methode anwenden, um den Kontostand zu aktuallisieren

    public void setKontostand(double Kontostand){
        this.Kontostand = Kontostand;

         */
}




