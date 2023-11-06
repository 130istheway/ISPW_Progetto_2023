package carello;

import java.util.ArrayList;
import java.util.List;

import Articoli.articoli;

/**
 * Questra dovrebbe essere la classe che gestisce il carello
 * utente contiene i dati di utente in modo da poterlo reperire nel db
 * carellino è una lista che contiene gli articoli, usando il polimorfismo un articolo può contenere tutti gli articoli derivati da lui
 * dovrebbe esserci anche il metodo che cntrolla che il pagamento sia avvenuto, inserire un modo per saltare il controllo o fare in modo che inserendo una specifica carta si possa avere la transazione gia eseguita solo per test, per poi pensare a crteare un vero metodo per pagare "realmente"
 */
public class carello {
    //private Utente utente;
    List<articoli> carellino = new ArrayList<articoli>();
    boolean pagato = false;

    public carello(List<articoli> carello, boolean pagato) {
        this.carellino = carello;
        this.pagato = pagato;
    }

    public void setCarellino(List<articoli> carello) {
        this.carellino = carello;
    }

    public void setPagato(boolean pagato) {
        this.pagato = pagato;
    }

    public List<articoli> getCarellino() {
        return carellino;
    }

    public boolean getPagato(){
        return pagato;
    }

}
