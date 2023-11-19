package Carello;


import Carello.Articoli.articoli;
import Carello.Articoli.factory;
import Carello.Articoli.ArticoliAlimentari.pane;


import java.util.ArrayList;
import java.util.List;


/**
 * La classe {@code carello} gestisce il carrello dell'utente, contenente gli articoli selezionati per l'acquisto.
 * La lista del carrello utilizza il polimorfismo per gestire tutti gli articoli derivati dalla classe base {@code articoli}.
 * Include funzionalità per il controllo del pagamento e la gestione dei dati utente.
 * @author Stefano
 * @author Simone
 */
public class carello{
    /** Lista degli articoli nel carrello */
    List<articoli> carellino = new ArrayList<articoli>();

    /** Flag che indica se il pagamento è stato effettuato */
    boolean pagato = false;

    /**stringhe per riconoscere il tipo del articolo */
    String pane = "Carello.Articoli.ArticoliAlimentari.pane";

    private static carello Instance = null;

    public static carello getInstance() {
        if (Instance == null) {
            Instance = new carello();
        }
        return Instance;
    }
    
    
    public static carello getInstance(List<articoli> carello, boolean pagato) {
        if (Instance == null) {
            Instance = new carello(carello, pagato);
        }
        return Instance;
    }


    protected carello(){
        this.carellino = new ArrayList<articoli>();
        this.pagato = false;
    }


    /**
     * Costruttore della classe {@code carello}.
     *
     * @param carello Lista degli articoli nel carrello
     * @param pagato  Flag che indica se il pagamento è stato effettuato
     */
    protected carello(List<articoli> carello, boolean pagato) {
        this.carellino = carello;
        this.pagato = pagato;
    }

    /**
     * Imposta la lista degli articoli nel carrello.
     *
     * @param carello Lista degli articoli nel carrello
     */
    public void setCarellino(List<articoli> carello) {
        this.carellino = carello;
    }

    /**
     * Imposta lo stato di pagamento.
     *
     * @param pagato Flag che indica se il pagamento è stato effettuato
     */
    public void setPagato(boolean pagato) {
        this.pagato = pagato;
    }

    /**
     * Restituisce la lista degli articoli nel carrello.
     *
     * @return Lista degli articoli nel carrello
     */
    public List<articoli> getCarellino() {
        return carellino;
    }

    /**
     * Restituisce lo stato del pagamento.
     *
     * @return {@code true} se il pagamento è stato effettuato, {@code false} altrimenti
     */
    public boolean getPagato() {
        return pagato;
    }


    public boolean aggiungiProdotto(articoli prodotto) {
        try {
            this.carellino.add(prodotto);
            return true;
        } catch (Exception e) {
            System.err.println("problem whit the insertion of the articolo");
            return false;
        }
    }
    
    
    public boolean aggiungiProdotto(String s) {
        articoli prodotto = factory.factoryProdotto(s);
        try {
            this.carellino.add(prodotto);
            return true;
        } catch (Exception e) {
            System.err.println("problem whit the insertion of the articolo");
            return false;
        }
    }


    public boolean elimina(int id) {
        for (articoli articoli : carellino) {
            if (articoli.getId() == id) {
                carellino.remove(articoli);
                return true;
            }
        }
        return false;
    }


    public boolean modificaQuantita(int id, int quantity) {
        for (articoli articoli : carellino) {
            if (articoli.getId() == id) {
                articoli.setQuantita_articolo(quantity);;
                return true;
            }
        }
        return false;
    }


    public void stampaCarellino() {
        for (articoli articoli : carellino) {
            System.out.print("ID: " + articoli.getId() + ", Nome: " + articoli.getNome_articolo() + ", Prezzo: " + articoli.getPrezzo_articolo() + ", ClasseDelProdotto: " + articoli.getClass() + "  -> : ");
            Class<?> c = articoli.getClass();
            if (c.getName() == pane){
                pane temp = (pane)articoli;
                System.out.println("TempoCottura: " + temp.getTempoCottura() + ", Ingredienti: " + temp.getIngredienti() + ", Descrizione: " + temp.getDescrizione());
            }
            
        }
    }

}
