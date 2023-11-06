/**
 * @author Stefano
 * @author Simone
 */

import Articoli.ArticoliAlimentari.pane;
import Articoli.ArticoliAlimentari.pizza;
import Articoli.articoli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tempCodeRunnerFile {
    public static void main(String[] args) {
        articoli nuovo = null; // Dichiaro nuovo inizializzato a null
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cosa si desidera inserire? pane|pizza");
        String scelta = scanner.nextLine();

        if (scelta.equals("pane")) {
            System.out.print("Inserisci il nome dell'articolo: ");
            String nome = scanner.nextLine();

            System.out.print("Inserisci il prezzo dell'articolo: ");
            double prezzo = scanner.nextDouble();

            System.out.print("Inserisci la quantita dell'articolo: ");
            float quantita = scanner.nextFloat();

            scanner.nextLine(); // Consuma il resto della linea

            List<String> ingredienti = new ArrayList<String>();
            boolean condition;

            do {
                System.out.print("Inserire l'ingrediente del pane: ");
                String ingrediente = scanner.nextLine();

                ingredienti.add(ingrediente);

                System.out.print("Se ne vuole inserire un altro (true/false): ");
                condition = scanner.nextBoolean();
                scanner.nextLine(); // Consuma il resto della linea
            } while (condition);

            System.out.print("Inserisci il peso dell'articolo: ");
            double peso = scanner.nextDouble();

            System.out.print("Inserire il tempo di cottura del pane: ");
            int tempoCottura = scanner.nextInt();

            System.out.print("Inserire il tempo di lievitatura del pane: ");
            int tempoLievitatura = scanner.nextInt();

            System.out.print("Inserisci se la lievitatura è naturale o meno (true/false): ");
            boolean lievitatura = scanner.nextBoolean();

            scanner.nextLine(); // Consuma il resto della linea

            System.out.print("Inserisci la descrizione dell'articolo: ");
            String descrizione = scanner.nextLine();

            nuovo = new pane(nome, prezzo, quantita, ingredienti, peso, tempoCottura, tempoLievitatura, lievitatura, descrizione);
        }else if(scelta.equals("pizza")){
            System.out.print("Inserisci il nome dell'articolo: ");
            String nome = scanner.nextLine();

            System.out.print("Inserisci il prezzo dell'articolo: ");
            double prezzo = scanner.nextDouble();

            System.out.print("Inserisci la quantita dell'articolo: ");
            float quantita = scanner.nextFloat();

            scanner.nextLine(); // Consuma il resto della linea

            List<String> ingredienti = new ArrayList<String>();
            boolean condition;

            do {
                System.out.print("Inserire l'ingrediente del pane: ");
                String ingrediente = scanner.nextLine();

                ingredienti.add(ingrediente);

                System.out.print("Se ne vuole inserire un altro (true/false): ");
                condition = scanner.nextBoolean();
                scanner.nextLine(); // Consuma il resto della linea
            } while (condition);

            System.out.print("Inserisci il peso dell'articolo: ");
            double peso = scanner.nextDouble();

            System.out.print("Inserire il tempo di cottura del pane: ");
            int tempoCottura = scanner.nextInt();

            System.out.print("Inserisci se la lievitatura è naturale o meno (true/false): ");
            boolean lievitatura = scanner.nextBoolean();

            System.out.print("Inserisci la dimensione della pizza tonda o rettangolare (true/false): ");
            boolean dimensione = scanner.nextBoolean();

            scanner.nextLine(); // Consuma il resto della linea

            System.out.print("Inserisci la descrizione dell'articolo: ");
            String descrizione = scanner.nextLine();

            nuovo = new pizza(nome, prezzo, quantita, ingredienti, peso, tempoCottura, lievitatura, dimensione, descrizione);
        }

        if (nuovo != null) {
            System.out.println(nuovo.getId() + " " + nuovo.getNome_articolo() + " " + nuovo.getPrezzo_articolo());
        }

        scanner.close();
    }
}