package esercizio2;

public class Call {
    private String callNumber;
    private double durata;

    //metodo costruttore
    public Call(String callNumb, double duration) {
        this.callNumber = callNumb;
        this.durata = duration;
    }

    public String getCallNumb() {
        return this.callNumber;
    }

    public double getDuration() {
        return this.durata;
    }

}
