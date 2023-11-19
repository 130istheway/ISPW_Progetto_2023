package Carello.Articoli;

import Carello.Articoli.ArticoliAlimentari.*;
//import Carello.Articoli.ArticoliNonAlimentari.*;

//import Qualsiasi articolo si desideri purchè derivi da Carello.Articoli, non dovrebbe essere necessario poichè * pensera ad includere tutto


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

            //case per altri prodotti, basta aggiungere qui la condizzione
            
            default:
                art = null;
                break;
        }
        return art;
    }
}
