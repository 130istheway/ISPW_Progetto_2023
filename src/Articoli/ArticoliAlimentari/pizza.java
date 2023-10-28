package Articoli.ArticoliAlimentari;

import Articoli.ArticoliAlimentari.articoliAlimentari;

public class pizza extends articoliAlimentari{
    private int tempoCottura;
    private int tempoLievitatura;
    private boolean lievitatura;
    private boolean dimensione;
    private String descrizzione;


    public void setLievitatura(boolean lievitatura) {
        this.lievitatura = lievitatura;
    }

    public void setTempoCottura(int tempoCottura) {
        this.tempoCottura = tempoCottura;
    }

    public void setTempoLievitatura(int tempoLievitatura) {
        this.tempoLievitatura = tempoLievitatura;
    }

    public void setDimensione(boolean dimensione) {
        this.dimensione = dimensione;
    }

    public void setDescrizzione(String descrizzione) {
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