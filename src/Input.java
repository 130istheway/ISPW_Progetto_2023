/**
 * La classe {@code Input} rappresenta una classe di input interattivo
 * per l'inserimento di articoli, come pane o pizza.
 * Gli autori di questa classe sono Stefano e Simone.
 *
 * @author Stefano
 * @author Simone
 */

import Carello.carello;
import singleton.MyScanner;

import java.util.Scanner;


/**
 * La classe {@code Input} gestisce l'input interattivo per l'inserimento
 * di articoli alimentari come pane o pizza.
 */
public class Input {
    /**
     * Il metodo principale che avvia l'input interattivo.
     *
     * @param args Argomenti della riga di comando (non utilizzati in questo contesto)
     */
    public static void main(String[] args) {
        Scanner scanner = MyScanner.getInstance();
        carello cart = Carello.carello.getInstance();

        boolean inputValido = false;

        boolean reinput = true;

        while (reinput) {
            reinput = false;
            while (!inputValido) {
                try {
                    System.out.println("Cosa si desidera inserire? pane|pizza ~ ");
                    String scelta = scanner.nextLine();

                    if (scelta.equals("pane")) {
                        cart.aggiungiProdotto(scelta);
                        inputValido = true; // L'input è valido, usciamo dal ciclo.
                    } else if (scelta.equals("pizza")) {
                        cart.aggiungiProdotto(scelta);
                        inputValido = true; // L'input è valido, usciamo dal ciclo.
                    } else {
                        System.out.println("Scelta non valida. Si prega di inserire 'pane' o 'pizza'.");
                    }
                } catch (Exception e) {
                    System.out.println("Errore durante l'inserimento. Riprova.");
                    scanner.nextLine(); // Pulisce l'input errato.
                }
            }
            inputValido = false;
            
            System.out.println("\n------------------------------------------------------------------------\nInserire un altro articolo (true/false):");
            reinput = scanner.nextBoolean();
            System.out.println("------------------------------------------------------------------------\n");

            scanner.nextLine();
        }

        if (cart != null) {
            System.out.print(cart.getClass() + "  :  Dati: \n");
            cart.stampaCarellino();
        }


        scanner.close();
    }
}
