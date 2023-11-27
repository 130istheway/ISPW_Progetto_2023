package Carrello.Articoli.ArticoliAlimentari;

import Carrello.Articoli.articoli;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe {@code articoliAlimentari} rappresenta un tipo di articolo che è anche alimentare,
 * con attributi specifici come la lista degli ingredienti e il peso.
 * Estende la classe {@code articoli}.
 * @author Stefano
 * @author Simone
 */
public class articoliAlimentari extends articoli {

    /** Lista degli ingredienti dell'articolo alimentare */
    private List<String> ingredienti = new ArrayList<>();

    /** Peso dell'articolo alimentare */
    private double peso;

    /**
     * Costruttore di default. Inizializza gli attributi con valori predefiniti.
     */
    public articoliAlimentari() {
        super();
        this.ingredienti = new ArrayList<>();
        this.peso = 0.0;
    }

    /**
     * Costruttore che consente di specificare tutti gli attributi dell'articolo alimentare.
     *
     * @param nome_articolo    Nome dell'articolo
     * @param prezzo_articolo  Prezzo dell'articolo
     * @param quantita_articolo Quantità dell'articolo
     * @param ingredienti      Lista degli ingredienti
     * @param peso             Peso dell'articolo
     */
    public articoliAlimentari(String nome_articolo, double prezzo_articolo, float quantita_articolo, List<String> ingredienti, double peso) {
        super(nome_articolo, prezzo_articolo, quantita_articolo);
        this.ingredienti = ingredienti;
        this.peso = peso;
    }

    /**
     * Imposta la lista degli ingredienti dell'articolo alimentare.
     *
     * @param ingredienti Lista degli ingredienti
     */
    public void setIngredienti(List<String> ingredienti) {
        this.ingredienti = ingredienti;
    }

    /**
     * Imposta il peso dell'articolo alimentare.
     *
     * @param peso Peso dell'articolo
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Restituisce la lista degli ingredienti dell'articolo alimentare.
     *
     * @return Lista degli ingredienti
     */
    public List<String> getIngredienti() {
        return ingredienti;
    }

    /**
     * Restituisce il peso dell'articolo alimentare.
     *
     * @return Peso dell'articolo
     */
    public double getPeso() {
        return peso;
    }
}