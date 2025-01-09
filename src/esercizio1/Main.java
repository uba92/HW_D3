package esercizio1;

public class Main {
    public static void main(String[] args) {
        
    Rettangolo rettangolo1 = new Rettangolo(5, 6);

    Rettangolo rettangolo2 = new Rettangolo(4, 5);

    Rettangolo rettangolo3 = new Rettangolo(3, 5);

    Rettangolo rettangolo4 = new Rettangolo(7, 5);

    System.out.println("Dati del primo rettangolo: ");
    stampaRettangolo(rettangolo1);

    System.out.println("Dati del secondo rettangolo: ");
    stampaRettangolo(rettangolo2);


    System.out.println("Dati di due rettangoli: ");
    stampaDueRettangoli(rettangolo3, rettangolo4);




    }

    public static void stampaRettangolo(Rettangolo rettangolo) {
        System.out.println("L'area del rettangolo è: " + rettangolo.area());
        System.out.println("Il perimetro del rettangolo è: " + rettangolo.perimetro());
    }

    public static void stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2) {
        System.out.println("L'area del primo rettangolo è: " + rett1.area());
        System.out.println("Il perimetro del primo rettangolo è: " + rett1.perimetro());
        System.out.println("L'area del secondo rettangolo è: " + rett2.area());
        System.out.println("Il perimetro del secondo rettangolo è: " + rett2.perimetro());

        double sommaAree = rett1.area() + rett2.area();

        double sommaPerimetri = rett1.perimetro() + rett2.perimetro();

        System.out.println("La somma delle aree è: " + sommaAree);
        System.out.println("La somma dei permietri è: " + sommaPerimetri);
    }
}