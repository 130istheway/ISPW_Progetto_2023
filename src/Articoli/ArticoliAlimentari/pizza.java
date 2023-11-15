package Articoli.ArticoliAlimentari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * La classe {@code pizza} rappresenta un tipo specifico di articolo alimentare,
 * con attributi specifici come tempo di cottura, lievitatura, dimensione e descrizione.
 * Estende la classe {@code articoliAlimentari}.
 * @author Stefano
 * @author Simone
 */
public class pizza extends articoliAlimentari {

    /** Tempo di cottura della pizza */
    private int tempoCottura;

    /** Flag per indicare se la pizza è lievitata o meno */
    private boolean lievitatura;

    /** Flag per indicare la dimensione della pizza (tonda o rettangolare) */
    private boolean dimensione;

    /** Descrizione della pizza */
    private String descrizione;
    

    /**
     * Costruttore di default. Inizializza gli attributi con valori predefiniti.
     */
    public pizza() {
        super();
        this.tempoCottura = 0;
        this.lievitatura = false;
        this.dimensione = false;
        this.descrizione = "NUKK";
    }

    /**
     * Costruttore che consente di specificare tutti gli attributi della pizza.
     *
     * @param nome_articolo    Nome dell'articolo
     * @param prezzo_articolo  Prezzo dell'articolo
     * @param quantita_articolo Quantità dell'articolo
     * @param ingredienti      Lista degli ingredienti
     * @param peso             Peso dell'articolo
     * @param tempoCottura     Tempo di cottura della pizza
     * @param lievitatura       Flag per indicare se la pizza è lievitata o meno
     * @param dimensione       Flag per indicare la dimensione della pizza
     * @param descrizione      Descrizione dell'articolo
     */
    public pizza(String nome_articolo, double prezzo_articolo, float quantita_articolo, List<String> ingredienti,
                 double peso, int tempoCottura, boolean lievitatura, boolean dimensione, String descrizione) {
        super(nome_articolo, prezzo_articolo, quantita_articolo, ingredienti, peso);
        this.tempoCottura = tempoCottura;
        this.lievitatura = lievitatura;
        this.dimensione = dimensione;
        this.descrizione = descrizione;
    }

    /**
     * Imposta il tempo di cottura della pizza.
     *
     * @param tempoCottura Tempo di cottura della pizza
     */
    public void setTempoCottura(int tempoCottura) {
        this.tempoCottura = tempoCottura;
    }

    /**
     * Imposta la lievitatura della pizza.
     *
     * @param lievitatura Flag per indicare se la pizza è lievitata o meno
     */
    public void setLievitatura(boolean lievitatura) {
        this.lievitatura = lievitatura;
    }

    /**
     * Imposta la dimensione della pizza.
     *
     * @param dimensione Flag per indicare la dimensione della pizza
     */
    public void setDimensione(boolean dimensione) {
        this.dimensione = dimensione;
    }

    /**
     * Imposta la descrizione della pizza.
     *
     * @param descrizione Descrizione della pizza
     */
    public void setDescrizione(String descrizione) {
        if (descrizione == null) {
            this.descrizione = "La descrizione per la pizza deve essere ancora aggiornata dal fornaio";
        }
        this.descrizione = descrizione;
    }

    /**
     * Modifica la quantità dell'articolo con validazione.
     *
     * @param quantita Nuova quantità dell'articolo
     * @return True se la quantità è stata modificata con successo, altrimenti false
     */
    public boolean Cambia_Quantita_articolo(int quantita) {
        if (getQuantita_articolo() > quantita && getQuantita_articolo() > 0) {
            setQuantita_articolo(quantita);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Inserisce i dati dell'articolo interattivamente da tastiera.
     */
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

