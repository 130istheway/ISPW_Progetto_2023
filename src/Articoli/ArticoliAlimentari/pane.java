package Articoli.ArticoliAlimentari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * La classe {@code pane} rappresenta un tipo specifico di articolo alimentare,
 * con attributi specifici come tempo di cottura, tempo di lievitatura, lievitatura naturale e descrizione.
 * Estende la classe {@code articoliAlimentari}.
 * @author Stefano
 * @author Simone
 */
public class pane extends articoliAlimentari{

    private int tempoCottura;
    private int tempoLievitatura;
    private boolean lievitatura;
    private String descrizione;

    /**
     * Costruttore di default. Inizializza gli attributi con valori predefiniti.
     */
    public pane() {
        super();
        this.tempoCottura = 0;
        this.tempoLievitatura = 0;
        this.descrizione = "NMUJJ";
        this.lievitatura = false;
    }

    /**
     * Costruttore che consente di specificare tutti gli attributi del pane.
     *
     * @param nome_articolo    Nome dell'articolo
     * @param prezzo_articolo  Prezzo dell'articolo
     * @param quantita_articolo Quantità dell'articolo
     * @param ingredienti      Lista degli ingredienti
     * @param peso             Peso dell'articolo
     * @param tempoCottura     Tempo di cottura del pane
     * @param tempoLievitatura Tempo di lievitatura del pane
     * @param lievitatura       Flag per indicare se la lievitatura è naturale o meno
     * @param descrizione      Descrizione dell'articolo
     */
    public pane(String nome_articolo, double prezzo_articolo, float quantita_articolo, List<String> ingredienti,
                double peso, int tempoCottura, int tempoLievitatura, boolean lievitatura, String descrizione) {
        super(nome_articolo, prezzo_articolo, quantita_articolo, ingredienti, peso);
        this.tempoCottura = tempoCottura;
        this.tempoLievitatura = tempoLievitatura;
        this.lievitatura = lievitatura;
        this.descrizione = descrizione;
    }

    /**
     * Imposta il tempo di cottura del pane.
     *
     * @param tempoCottura Tempo di cottura del pane
     */
    public void setTempoCottura(int tempoCottura) {
        this.tempoCottura = tempoCottura;
    }

    /**
     * Imposta il tempo di lievitatura del pane.
     *
     * @param tempoLievitatura Tempo di lievitatura del pane
     */
    public void setTempoLievitatura(int tempoLievitatura) {
        this.tempoLievitatura = tempoLievitatura;
    }

    /**
     * Imposta la lievitatura del pane.
     *
     * @param lievitatura Flag per indicare se la lievitatura è naturale o meno
     */
    public void setLievitatura(boolean lievitatura) {
        this.lievitatura = lievitatura;
    }

    /**
     * Imposta la descrizione dell'articolo.
     *
     * @param descrizione Descrizione dell'articolo
     */
    public void setDescrizione(String descrizione) {
        if (descrizione == null) {
            this.descrizione = "La descrizione per il pane deve essere ancora aggiornata dal fornaio";
        }
        this.descrizione = descrizione;
    }

    /**
     * Restituisce il tempo di cottura del pane.
     *
     * @return Tempo di cottura del pane
     */
    public int getTempoCottura() {
        return tempoCottura;
    }

    /**
     * Restituisce il tempo di lievitatura del pane.
     *
     * @return Tempo di lievitatura del pane
     */
    public int getTempoLievitatura() {
        return tempoLievitatura;
    }

    /**
     * Restituisce la lievitatura del pane.
     *
     * @return True se la lievitatura è naturale, altrimenti false
     */
    public boolean getLievitatura() {
        return lievitatura;
    }

    /**
     * Restituisce la descrizione dell'articolo.
     *
     * @return Descrizione dell'articolo
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Modifica la quantità dell'articolo con validazione.
     *
     * @param quantita Nuova quantità dell'articolo
     * @return True se la quantità è stata modificata con successo, altrimenti false
     */
    public boolean Cambia_Quantita_articolo(float quantita) {
        if (getQuantita_articolo() > quantita && quantita > ((float) (1 / 4))) {
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

                System.out.print("Inserire il tempo di cottura del pane: ");
                int tempoCottura = scanner.nextInt();
                setTempoCottura(tempoCottura);

                System.out.print("Inserire il tempo di lievitatura del pane: ");
                int tempoLievitatura = scanner.nextInt();
                setTempoLievitatura(tempoLievitatura);

                System.out.print("Inserisci se la lievitatura è naturale o meno (true/false): ");
                boolean lievitatura = scanner.nextBoolean();
                setLievitatura(lievitatura);

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

    /**
     * Override del metodo setIngredienti per gestire il caso in cui la lista degli ingredienti è vuota.
     *
     * @param ingredienti Lista degli ingredienti
     */
    @Override
    public void setIngredienti(List<String> ingredienti) {
        if (ingredienti.size() == 0) {
            ingredienti.add("Ingredienti non disponibili");
            setIngredienti(ingredienti);
        }
        super.setIngredienti(ingredienti);
    }
}

