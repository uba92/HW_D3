package esercizio2;

public class Main2 {
    public static void main(String[] args) {

        SIM sim1 = new SIM("333****333");

        sim1.aggiornaCredito(3.5);

        Call[] listaChiamate = new Call[5];
        listaChiamate[0] = new Call("333***123",  20);
        listaChiamate[1] = new Call("333***121",  10);
        listaChiamate[2] = new Call("333***122",  6);
        listaChiamate[3] = new Call("333***120",  15);
        listaChiamate[4] = new Call("333***125",  18);

        sim1.aggiornaCallList(listaChiamate);

        sim1.stampaDati();
    }
}
