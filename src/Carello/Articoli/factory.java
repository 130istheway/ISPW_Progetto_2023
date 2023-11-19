package Carello.Articoli;

import Carello.Articoli.ArticoliAlimentari.pane;
import Carello.Articoli.ArticoliAlimentari.pizza;


public abstract class factory {

    public static articoli factoryProdotto(String tipo){
        articoli art;
        switch (tipo) {
            case "pane":
                pane pane = new pane();
                pane.inserisciDati();
                art = pane;
                break;

            case "pizza":
                pizza pizza = new pizza();
                pizza.inserisciDati();
                art = pizza;
                break;

            default:
                art = null;
                break;
        }
        return art;
    }
}
