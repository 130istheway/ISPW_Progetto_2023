package Articoli.ArticoliAlimentari;

import java.util.List;

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

}
