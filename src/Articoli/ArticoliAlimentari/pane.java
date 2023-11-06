package Articoli.ArticoliAlimentari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pane extends articoliAlimentari {
    private int tempoCottura;
    private int tempoLievitatura;
    private boolean lievitatura;
    private String descrizione;

    public pane() {
        super();
        this.tempoCottura = 0;
        this.tempoLievitatura = 0;
        this.descrizione = "NMUJJ";
        this.lievitatura = false;
    }

    public pane(String nome_articolo, double prezzo_articolo, float quantita_articolo, List<String> ingredienti, double peso, int tempoCottura, int tempoLievitatura, boolean lievitatura, String descrizione) {
        super(nome_articolo, prezzo_articolo, quantita_articolo, ingredienti, peso);
        this.tempoCottura = tempoCottura;
        this.tempoLievitatura = tempoLievitatura;
        this.lievitatura = lievitatura;
        this.descrizione = descrizione;
    }

    public void setTempoCottura(int tempoCottura) {
        this.tempoCottura = tempoCottura;
    }

    public void setTempoLievitatura(int tempoLievitatura) {
        this.tempoLievitatura = tempoLievitatura;
    }

     public void setLievitatura(boolean lievitatura) {
        this.lievitatura = lievitatura;
    }

    public void setDescrizzione(String descrizione) {
        if (descrizione == null) {
            this.descrizione = "La descrizione per il pane deve essere ancora aggiornata dal fornaio";
        }
        this.descrizione = descrizione;
    }

    public int getTempoCottura() {
        return tempoCottura;
    }

    public int getTempoLievitatura() {
        return tempoLievitatura;
    }

    public boolean getLievitatura() {
        return lievitatura;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public boolean Cambia_Quantita_articolo(float quantita) {
        if (getQuantita_articolo() > quantita && quantita > ((float) (1 / 4))) {
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
                setDescrizzione(descrizione);

                inputValido = true;
            } catch (Exception e) {
                System.out.println("Inserimento non valido. Riprova.");
                scanner.nextLine(); // Consuma il resto della linea
            }
        }

        scanner.close();
    }

    @Override
    public void setIngredienti(List<String> ingredienti) {
        if (ingredienti.size() == 0) {
            ingredienti.add("Ingredienti non disponibili");
            setIngredienti(ingredienti);
        }
        super.setIngredienti(ingredienti);
    }
}
