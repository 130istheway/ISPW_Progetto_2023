package Carello.Articoli;

import java.util.List;

import Carello.Articoli.ArticoliAlimentari.*;
//import Carello.Articoli.ArticoliNonAlimentari.*;
//import Qualsiasi articolo si desideri purchè derivi da Carello.Articoli, non dovrebbe essere necessario poichè * pensera ad includere tutto


public abstract class factory {

    public static articoli factoryProdotto(List<Object> ins){
        
        articoli art;
        System.out.println("Si sta inserendo da riga di comando nell'app nella factory " + ins.getFirst());

        String tipo = (String)ins.getFirst();
        ins.remove(0);

        switch (tipo) {
            case "pane":
                pane pane = new pane();
                pane.inserisciDati(ins);
                art = pane;
                break;

            case "pizza":
                pizza pizza = new pizza();
                pizza.inserisciDati(ins);
                art = pizza;
                break;

            //case per altri prodotti, basta aggiungere qui la condizzione
            
            default:
                art = null;
                break;
        }
        return art;
    }
}
