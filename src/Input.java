/**
 * @author Stefano
 * @author Simone
 */

import Articoli.ArticoliAlimentari.pane;
import Articoli.ArticoliAlimentari.pizza;
import Articoli.articoli;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        articoli nuovo = null; // Dichiaro nuovo inizializzato a null
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cosa si desidera inserire? pane|pizza");
        String scelta = scanner.nextLine();

        if (scelta.equals("pane")) {
            pane temporaneo = new pane();
            temporaneo.inserisciDati();
            nuovo = temporaneo;

        } else if(scelta.equals("pizza")){
            pizza temporaneo = new pizza();
            temporaneo.inserisciDati();
            nuovo = temporaneo;
        }

        if (nuovo != null) {
            System.out.println(nuovo.getId() + " " + nuovo.getNome_articolo() + " " + nuovo.getPrezzo_articolo() + " " + nuovo.getClass());
        }

        scanner.close();
    }
}