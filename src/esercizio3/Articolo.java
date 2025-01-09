package esercizio3;

public class Articolo {
    private String itemCode;
    private String description;
    private double price;
    private int availableItemNumber;

    public Articolo(String codice, String desc, double prezzo, int numeroArticoli) {
        this.itemCode = codice;
        this.description = desc;
        this.price = prezzo;
        this.availableItemNumber = numeroArticoli;
    }

    //metodi getter per recuperare le proprietà dell'articolo
    public String getItemCode() {
        return this.itemCode;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public int getAvailableItemNumber() {
       return this.availableItemNumber;
    }

    //metodi per settare le props dell'articolo

    public void addsAvailableItems(int newItems) {
        this.availableItemNumber += newItems;
    }
}
