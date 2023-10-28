package Articoli.ArticoliAlimentari;

import Articoli.articoli;

import java.util.ArrayList;
import java.util.List;

public abstract class articoliAlimentari extends articoli {
    private List<String> ingredienti = new ArrayList<>();
    private double peso;

    public void setIngredienti(List<String> ingredienti) {
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
