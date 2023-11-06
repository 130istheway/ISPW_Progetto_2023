package Articoli.ArticoliAlimentari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Articoli.ArticoliAlimentari.articoliAlimentari;

public class pizza extends articoliAlimentari{
    private int tempoCottura;
    boolean lievitatura;
    private boolean dimensione;
    private String descrizzione;

    public pizza(){
        super();
        this.tempoCottura = 0;
        this.lievitatura = false;
        this.dimensione = false;
        this.descrizzione = "NUKK";
    }

    public pizza(String nome_articolo, double prezzo_articolo, float quantita_articolo, List<String> ingredienti, double peso, int tempoCottura, boolean lievitatura, boolean dimensione ,String descrizzione){
        super(nome_articolo, prezzo_articolo, quantita_articolo, ingredienti, peso);
        this.tempoCottura = tempoCottura;
        this.lievitatura = lievitatura;
        this.dimensione = dimensione;
        this.descrizzione = descrizzione;
    }


    public void setTempoCottura(int tempoCottura) {
        this.tempoCottura = tempoCottura;
    }

    /**
     * Impostare la lievitatura naturale del pane
     * 
     * @param lievitatura BOOLEAN serve a capire se la lievitatura è naturale oppure no
     * 
     * @return a void 
     */
    public void setLievitatura(boolean lievitatura) {
        this.lievitatura = lievitatura;
    }

    public void setDimensione(boolean dimensione) {
        this.dimensione = dimensione;
    }

    public void setDescrizzione(String descrizzione) {
        if (descrizzione == null) {
            this.descrizzione = "La descizione per la pizza deve essere ancora aggiornata del fornaio";
        }
        this.descrizzione = descrizzione;
    }

    public int getTempoCottura() {
        return tempoCottura;
    }

    public boolean getDimensione(){
        return dimensione;
    }

    public String getDescrizzione() {
        return descrizzione;
    }


    public boolean Cambia_Quantita_articolo(int quantita){

        if (getQuantita_articolo() > quantita && getQuantita_articolo() > 0){
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

        System.out.print("Inserisci se la lievitatura è naturale o meno (true/false): ");
        boolean lievitatura = scanner.nextBoolean();
        setLievitatura(lievitatura);

        System.out.print("Inserisci la dimensione della pizza tonda o rettangolare (true/false): ");
        boolean dimensione = scanner.nextBoolean();
        setDimensione(dimensione);

        scanner.nextLine(); // Consuma il resto della linea

        System.out.print("Inserisci la descrizione dell'articolo: ");
        String descrizione = scanner.nextLine();
        setDescrizzione(descrizione);

        scanner.close();
    }

}
