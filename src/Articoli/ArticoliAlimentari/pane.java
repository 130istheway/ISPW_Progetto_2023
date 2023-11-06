package Articoli.ArticoliAlimentari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Articoli.ArticoliAlimentari.articoliAlimentari;

public class pane extends articoliAlimentari{
    private int tempoCottura;
    private int tempoLievitatura;
    private boolean lievitatura;
    private String descrizzione;

    public pane(){
        super();
        this.tempoCottura = 0;
        this.tempoLievitatura = 0;
        this.descrizzione = "NMUJJ";
        this.lievitatura = false;
    }

    public pane(String nome_articolo, double prezzo_articolo, float quantita_articolo, List<String> ingredienti, double peso, int tempoCottura, int tempoLievitatura, boolean lievitatura, String descrizzione){
        super(nome_articolo, prezzo_articolo, quantita_articolo, ingredienti, peso);
        this.tempoCottura = tempoCottura;
        this.tempoLievitatura = tempoLievitatura;
        this.lievitatura = lievitatura;
        this.descrizzione = descrizzione;
    }

    /**
     * Impostare la lievitatura naturale del pane
     * 
     * @param lievitatura BOOLEAN serve a capire se la lievitatura è naturale oppure no
     * @return a void 
     */
    public void setLievitatura(boolean lievitatura) {
        this.lievitatura = lievitatura;
    }

    /**
     * Imposta il tempo di cottura in minuti, acetta solo un int (32 bit)
     * 
     * @param tempoCottura int il numero di minuti della cottura
     * @return void
     */
    public void setTempoCottura(int tempoCottura) {
        this.tempoCottura = tempoCottura;
    }

    public void setTempoLievitatura(int tempoLievitatura) {
        this.tempoLievitatura = tempoLievitatura;
    }

    public void setDescrizzione(String descrizzione) {
        if (descrizzione == null) {
            this.descrizzione = "La descizioen per la pizza deve essere ancora aggiornata del fornaio";
        }
        this.descrizzione = descrizzione;
    }

    public int getTempoCottura() {
        return tempoCottura;
    }

    public int getTempoLievitatura() {
        return tempoLievitatura;
    }

    public boolean getLievitatura(){
        return lievitatura;
    }

    public String getDescrizzione() {
        return descrizzione;
    }


    /**
     * Modifica la qunatità di questa istanza con la possibilità di avere anche porzioni tipo 1/4 1/2 3/4
     * 
     * @param quantita É la quantità che voglio avere
     * @return [boolean] flase se l'operazione non è avvenuta per colpa della quantità che era maggiore di quella disponibile oppure la quantita disponibile è minore di 1/4
     */
    public boolean Cambia_Quantita_articolo(float quantita){

        if (getQuantita_articolo() > quantita && quantita > ((float)(1/4))){
            setQuantita_articolo(quantita);
            return true;
        }
        else {
            return false;
        }

    }

    public void inserisciDati(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome dell'articolo: ");
        String nome = scanner.nextLine();
        setNome_articolo(nome);

        System.out.print("Inserisci il prezzo dell'articolo: ");
        double prezzo = scanner.nextDouble();
        setPrezzo_articolo(prezzo);

        System.out.print("Inserisci la quantita dell'articolo: ");
        float quantita = scanner.nextFloat();
        setQuantita_articolo(quantita);

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

        scanner.close();
    }


    /**
     * Questro è un overrive
     * 
     * @param ingedienti 
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
