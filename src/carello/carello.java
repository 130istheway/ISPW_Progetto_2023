package carello;

import java.util.ArrayList;
import java.util.List;

import Articoli.articoli;

/**
 * Questra dpvrebbe essere la classe che gestisce il carello
 * utente contiene i dati di utente in modo da poterlo reperire nel db
 * carellino è una lista che contiene gli articoli, usando il polimorfismo un articolo può contenere tutti gli articoli derivati da lui
 */
public class carello {
    private Utente utente;
    List<articoli> carellino = new ArrayList<articoli>();
}
