package esercizio2;

public class SIM {
    private String phoneNumber;
    private double credit;
    private Call[] callList;

    //costruttore
    public SIM(String num) {
        this.phoneNumber = num;
        this.credit = 0;
        this.callList = new Call[5];
    }

    public void stampaDati() {
        System.out.println("Numero di telefono: " + this.phoneNumber);
        System.out.println("Credito residuo: " + this.credit);

        for (int i=0; i<callList.length; i++) {

            if(callList[i] != null) {
                System.out.println( "Chiamata " + (i+1) + ": " + callList[i].getCallNumb() + " Durata: " + callList[i].getDuration());
            }


        }
    }

    public void aggiornaCredito(double newCredit) {
        this.credit = this.credit + newCredit;
    }

    public void aggiornaCallList(Call[] listaChiamate) {
        this.callList = listaChiamate;
    }
}
