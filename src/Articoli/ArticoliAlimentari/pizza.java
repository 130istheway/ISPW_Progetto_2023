package Articoli.ArticoliAlimentari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pizza extends articoliAlimentari {
    private int tempoCottura;
    boolean lievitatura;
    private boolean dimensione;
    private String descrizione;

    public pizza() {
        super();
        this.tempoCottura = 0;
        this.lievitatura = false;
        this.dimensione = false;
        this.descrizione = "NUKK";
    }

    public pizza(String nome_articolo, double prezzo_articolo, float quantita_articolo, List<String> ingredienti, double peso, int tempoCottura, boolean lievitatura, boolean dimensione, String descrizione) {
        super(nome_articolo, prezzo_articolo, quantita_articolo, ingredienti, peso);
        this.tempoCottura = tempoCottura;
        this.lievitatura = lievitatura;
        this.dimensione = dimensione;
        this.descrizione = descrizione;
    }

    public void setTempoCottura(int tempoCottura) {
        this.tempoCottura = tempoCottura;
    }

    public void setLievitatura(boolean lievitatura) {
        this.lievitatura = lievitatura;
    }

    public void setDimensione(boolean dimensione) {
        this.dimensione = dimensione;
    }

    public void setDescrizione(String descrizione) {
        if (descrizione == null) {
            this.descrizione = "La descrizione per la pizza deve essere ancora aggiornata dal fornaio";
        }
        this.descrizione = descrizione;
    }

    public int getTempoCottura() {
        return tempoCottura;
    }

    public boolean getDimensione() {
        return dimensione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public boolean Cambia_Quantita_articolo(int quantita) {
        if (getQuantita_articolo() > quantita && getQuantita_articolo() > 0) {
            setQuantita_articolo(quantita);
            return true;
        } else {
            return false;
        }
    }

    public void inserisciDati() {
        Scanner scanner = new Scanner(System.in);

        boolean inputValido = false;

        while (!inputValido) {
            try {
                System.out.print("Inserisci il nome dell'articolo: ");
                String nome = scanner.nextLine();
                setNome_articolo(nome);

                System.out.print("Inserisci il prezzo dell'articolo: ");
                double prezzo = scanner.nextDouble();
                setPrezzo_articolo(prezzo);

                System.out.print("Inserisci la quantità dell'articolo: ");
                float quantita = scanner.nextFloat();
                setQuantita_articolo(quantita);

                scanner.nextLine(); // Consuma il resto della linea

                List<String> ingredienti = new ArrayList<String>();
                boolean condition;
                do {
                    System.out.print("Inserire un ingrediente: ");
                    String ingrediente = scanner.nextLine();
                    ingredienti.add(ingrediente);

                    System.out.print("Vuoi inserire un altro ingrediente? (true/false): ");
                    condition = scanner.nextBoolean();
                    scanner.nextLine(); // Consuma il resto della linea
                } while (condition);
                setIngredienti(ingredienti);

                System.out.print("Inserisci il peso dell'articolo: ");
                double peso = scanner.nextDouble();
                setPeso(peso);

                System.out.print("Inserire il tempo di cottura della pizza: ");
                int tempoCottura = scanner.nextInt();
                setTempoCottura(tempoCottura);

                System.out.print("Inserisci se la lievitatura è naturale o meno (true/false): ");
                boolean lievitatura = scanner.nextBoolean();
                setLievitatura(lievitatura);

                System.out.print("Inserisci la dimensione della pizza (tonda o rettangolare) (true/false): ");
                boolean dimensione = scanner.nextBoolean();
                setDimensione(dimensione);

                scanner.nextLine(); // Consuma il resto della linea

                System.out.print("Inserisci la descrizione dell'articolo: ");
                String descrizione = scanner.nextLine();
                setDescrizione(descrizione);

                inputValido = true;
            } catch (Exception e) {
                System.out.println("Inserimento non valido. Riprova.");
                scanner.nextLine(); // Consuma il resto della linea
            }
        }

        scanner.close();
    }
}
