package Articoli.ArticoliAlimentari;

import java.util.List;

import Articoli.ArticoliAlimentari.articoliAlimentari;

public class pane extends articoliAlimentari{
    private int tempoCottura;
    private int tempoLievitatura;
    private boolean lievitatura;
    private String descrizzione;


    public pane(int id, String nome_articolo, double prezzo_articolo, float quantita_articolo, List<String> ingredienti, double peso, int tempoCottura, int tempoLievitatura, boolean lievitatura, String descrizzione){
        super(id, nome_articolo, prezzo_articolo, quantita_articolo, ingredienti, peso);
        setTempoCottura(tempoCottura);
        setLievitatura(lievitatura);
        setLievitatura(lievitatura);
        setDescrizzione(descrizzione);
    }

    public void setLievitatura(boolean lievitatura) {
        this.lievitatura = lievitatura;
    }

    public void setTempoCottura(int tempoCottura) {
        this.tempoCottura = tempoCottura;
    }

    public void setTempoLievitatura(int tempoLievitatura) {
        this.tempoLievitatura = tempoLievitatura;
    }

    public void setDescrizzione(String descrizzione) {
        if (descrizzione == null) {
            this.descrizzione = "La descizioen deve essere ancora aggiornata del fornaio";
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


    public boolean Cambia_Quantita_articolo(float quantita){

        if (getQuantita_articolo() > quantita && getQuantita_articolo() > 0){
            setQuantita_articolo(quantita);
            return true;
        }
        else {
            return false;
        }

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
