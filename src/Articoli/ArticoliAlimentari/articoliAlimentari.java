package Articoli.ArticoliAlimentari;

import Articoli.articoli;

import java.util.ArrayList;
import java.util.List;

public class articoliAlimentari extends articoli {
    private List<String> ingredienti = new ArrayList<>();
    private double peso;

    public articoliAlimentari(int id, String nome_articolo, double prezzo_articolo, float quantita_articolo, List<String> ingredienti, double peso) {
        super(id, nome_articolo, prezzo_articolo, quantita_articolo);
        setIngredienti(ingredienti);
        setPeso(peso);
    }

    public void setIngredienti(List<String> ingredienti) {
            this.ingredienti = ingredienti;
    }

    public void setPeso(double peso) {
    }

    public List<String> getIngredienti() {
        return ingredienti;
    }

    public double getPeso() {
        return peso;
    }


}
