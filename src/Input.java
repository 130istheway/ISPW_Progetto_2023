/**
 * La classe {@code Input} rappresenta una classe di input interattivo
 * per l'inserimento di articoli, come pane o pizza.
 * Gli autori di questa classe sono Stefano e Simone.
 *
 * @author Stefano
 * @author Simone
 */
import Articoli.ArticoliAlimentari.pane;
import Articoli.ArticoliAlimentari.pizza;
import Articoli.articoli;

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
        Scanner scanner = new Scanner(System.in);
        articoli nuovo = null; // Dichiaro nuovo inizializzato a null

        boolean inputValido = false;

        while (!inputValido) {
            try {
                System.out.println("Cosa si desidera inserire? pane|pizza");
                String scelta = scanner.nextLine();

                if (scelta.equals("pane")) {
                    pane temporaneo = new pane();
                    temporaneo.inserisciDati();
                    nuovo = temporaneo;
                    inputValido = true; // L'input è valido, usciamo dal ciclo.
                } else if (scelta.equals("pizza")) {
                    pizza temporaneo = new pizza();
                    temporaneo.inserisciDati();
                    nuovo = temporaneo;
                    inputValido = true; // L'input è valido, usciamo dal ciclo.
                } else {
                    System.out.println("Scelta non valida. Si prega di inserire 'pane' o 'pizza'.");
                }
            } catch (Exception e) {
                System.out.println("Errore durante l'inserimento. Riprova.");
                scanner.nextLine(); // Pulisce l'input errato.
            }
        }

        if (nuovo != null) {
            System.out.println(nuovo.getId() + " " + nuovo.getNome_articolo() + " " + nuovo.getPrezzo_articolo() + " " + nuovo.getClass());
        }

        scanner.close();
    }
}