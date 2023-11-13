package org.lessons.java.shop;

public class Main {
	
	public static void main(String[] args) {
		
        Prodotto[] prodotti = {
                new Prodotto("Prodotto1", "Descrizione1", 50.0, 22.0),
                new Prodotto("Prodotto2", "Descrizione2", 30.0, 18.0),
                new Prodotto("Prodotto3", "Descrizione3", 75.0, 25.0),
                new Prodotto("Prodotto4", "Descrizione4", 40.0, 20.0)
            };

          
            for (int i = 0; i < prodotti.length; i++) {
            	
                System.out.println(prodotti[i].toString());
                System.out.println("------------------------------");
                
            }
	}
	
}
