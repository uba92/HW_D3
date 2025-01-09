package esercizio3;

public class Carrello {
    private Cliente clienteAssociato;
    private Articolo[] elencoArticoli;
    private double totaleCarrello = 0;

    //costruttore
    public Carrello(Cliente cliente) {
        this.clienteAssociato = cliente;
        this.elencoArticoli = new Articolo[0];
    }

    //getter
    public Cliente getClienteAssociato() {
        return this.clienteAssociato;
    }

    public Articolo[] getElencoArticoli() {
        return this.elencoArticoli;
    }

    public double getTotaleCarrello() {
        for(int i=0; i< elencoArticoli.length; i++) {
            int disponibilta = elencoArticoli[i].getAvailableItemNumber();
            if (disponibilta == 0) {
                System.out.println("Articolo non disponibile");
            } else {
                totaleCarrello += elencoArticoli[i].getPrice();
            }
        }
        return totaleCarrello;
    }

    //metodi per settare
    public void setClienteAssociato(Cliente nuovoCliente) {
        this.clienteAssociato = nuovoCliente;
    }

    public void setElencoArticoli(Articolo[] nuovoArticolo) {
        this.elencoArticoli = nuovoArticolo;
    }

}
