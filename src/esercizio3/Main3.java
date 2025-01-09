package esercizio3;

import java.util.Date;

public class Main3 {
    public static void main (String[] args) {
        Articolo item1 = new Articolo("0000", "webcam", 99.99, 5);

        Articolo item2 = new Articolo("1111", "smartphone", 499.99, 10);

        Articolo item3 = new Articolo("2222", "PC", 799.99, 15);

        Articolo item4 = new Articolo("3333", "Monitor", 299.99, 20);

        Articolo item5 = new Articolo("4444", "Tablet", 399.99, 1);

        Cliente cliente1 = new Cliente("A000", "Topo", "Gigio", "topo@gigio.com", new Date());

        Carrello carrello1 = new Carrello(cliente1);

        System.out.println(item1.getDescription() + " " + item1.getItemCode() + " " + item1.getPrice() + "$ " + "Disponibiltà: " + item1.getAvailableItemNumber());
        System.out.println(item2.getDescription() + " " + item2.getItemCode() + " " + item2.getPrice() + "$ " + "Disponibiltà: " + item2.getAvailableItemNumber());
        System.out.println(item3.getDescription() + " " + item3.getItemCode() + " " + item3.getPrice() + "$ " + "Disponibiltà: " + item3.getAvailableItemNumber());
        System.out.println(item4.getDescription() + " " + item4.getItemCode() + " " + item4.getPrice() + "$ " + "Disponibiltà: " + item4.getAvailableItemNumber());
        System.out.println(item5.getDescription() + " " + item5.getItemCode() + " " + item5.getPrice() + "$ " + "Disponibiltà: " + item5.getAvailableItemNumber());

        item5.addsAvailableItems(9);

        System.out.println(item5.getDescription() + " " + item5.getItemCode() + " " + item5.getPrice() + "$ " + "Disponibiltà: " + item5.getAvailableItemNumber());

        System.out.println("Cliente: " + cliente1.getFirstname() + " " + cliente1.getLastname());

//        Articolo[] listaArticoliNelCarrello = {item3, item1};

        carrello1.setElencoArticoli(new Articolo[]{item3, item1});

        double totCarrello = carrello1.getTotaleCarrello();

        System.out.println("Il totoale del carrello è: " + totCarrello);
    }
}
