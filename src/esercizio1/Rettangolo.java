package esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }
    public double perimetro() {
        return (altezza+larghezza)*2;
    }

    public double area() {
        return altezza*larghezza;
    }

}
