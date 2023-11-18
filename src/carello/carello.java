

import java.util.ArrayList;
import java.util.List;
import Articoli.articoli;

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


    private static carello Instance = null;


    public static carello getInstance(List<articoli> carello, boolean pagato) {
        if (Instance == null) {
            Instance = new carello(carello, pagato);
        }
        return Instance;
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

}
