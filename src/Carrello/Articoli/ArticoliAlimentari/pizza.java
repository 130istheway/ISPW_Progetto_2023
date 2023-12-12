package Carrello.Articoli.ArticoliAlimentari;

import singleton.MyScanner;

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

    private int tempoCottura;
    private boolean lievitatura, dimensione;
    private String descrizione;

    /**
     * Costruttore di default. Inizializza gli attributi con valori predefiniti.
     */
    public pizza() {
        super();
        this.tempoCottura = 0;
        this.lievitatura = false;
        this.dimensione = false;
        this.descrizione = "NULLPIZZA";
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
    public pizza(String nome_articolo, double prezzo_articolo, float quantita_articolo, List<String> ingredienti, double peso, int tempoCottura, boolean lievitatura, boolean dimensione, String descrizione) {
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

    /** */
    public int getTempoCottura() {
        return tempoCottura;
    }

    /** */
    public boolean getLievitatura() {
        return lievitatura;
    }

    /** */
    public boolean getDimensione() {
        return dimensione;
    }

    /* */
    public String getDescrizione() {
        return descrizione;
    }


    /**
     * Modifica la quantità dell'articolo con validazione.
     *
     * @param quantita Nuova quantità dell'articolo
     * @return True se la quantità è stata modificata con successo, altrimenti false
     */
    public void Cambia_Quantita_articolo(int quantita) throws IllegalArgumentException{
        if (getQuantita_articolo() > quantita && getQuantita_articolo() > 0) {
            setQuantita_articolo(quantita);
        } else {
            throw new IllegalArgumentException("illegal quantità");
        }
    }


    @SuppressWarnings (value="unchecked")

    public void inserisciDati(List<Object> ins){

        setNome_articolo((String)ins.get(0));
                
        setPrezzo_articolo((double)ins.get(1));
                
        setQuantita_articolo((float)ins.get(2));
        
        setIngredienti((List<String>)ins.get(3));
                
        setPeso((double)ins.get(4));
                
        setTempoCottura((int)ins.get(5));

        setLievitatura((boolean)ins.get(6));

        setDimensione((boolean)ins.get(7));

        setDescrizione((String)ins.get(8));
    
    }
}

