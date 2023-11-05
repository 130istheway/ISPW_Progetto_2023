/**
 * @author Stefano
 * @author Simone
 */

import Articoli.ArticoliAlimentari.pane;
import Articoli.articoli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Input {
    public static void main(String[] args) {
        articoli nuovo = new pane();
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


            List<String> ingredienti = new ArrayList<String>();
            boolean condition = false;

            do  {
                scanner.nextLine();
                System.out.print("Inserire l'ingrediente della pizza: ");
                String ingrediente = scanner.nextLine();

                ingredienti.add(ingrediente);

                System.out.print("Se ne vuole inserire un altro (true/false): ");
                condition = scanner.nextBoolean();
            } while (condition);


            System.out.print("Inserisci il peso dell'articolo: ");
            double peso = scanner.nextDouble();

            System.out.println("Inserire il tempo di cottura del pane: ");
            int tempoCottura = scanner.nextInt();

            System.out.println("Inserire il tempo di lievitatura del pane: ");
            int tempoLievitattura = scanner.nextInt();

            System.out.print("Inserisci se la lievitatura è naturale o meno (true/false): ");
            boolean lievitatura = scanner.nextBoolean();

            scanner.nextLine();
            System.out.print("Inserisci la descrizione dell'articolo: ");
            String descri = scanner.nextLine();

            nuovo = new pane(nome, prezzo, quantita, ingredienti, peso, tempoCottura, tempoLievitattura, lievitatura, descri);
        }

        System.out.println(nuovo.getId() + "   Nome:" + nuovo.getNome_articolo()+ "      Prezzo" + nuovo.getPrezzo_articolo());

        scanner.close();
    }
}