/**
 * La classe {@code Input} rappresenta una classe di input interattivo
 * per l'inserimento di articoli, come pane o pizza.
 * Gli autori di questa classe sono Stefano e Simone.
 *
 * @author Stefano
 * @author Simone
 */

import carello.carello;
import singleton.MyScanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * La classe {@code Input} gestisce l'input interattivo per l'inserimento
 * di articoli alimentari come pane o pizza.
 */
public class Input {
    /**
     * Il metodo principale che avvia l'input interattivo.
     *
     * @param args Argomenti della riga di comando (non utilizzati in questo contesto)
     */
    public static void main(String[] args) {

        Scanner scanner = MyScanner.getInstance();
        carello cart = carello.getInstance();

        boolean inputValido = false, reinput = true, cech = true;

        while (reinput){

            reinput = false;

            while (!inputValido) {
            
                try {
                    System.out.print("\nCosa si desidera inserire? pane|pizza\tstampare\t~\t");
                    String scelta = scanner.nextLine();

                    if (scelta.equals("pane") || scelta.equals("pizza")) {

                        System.out.print("Scegliere come inserire l'input\t\t0) classe\t1) lista\t:\t");
                        int inputSceltaInserimento = scanner.nextInt();

                        scanner.nextLine(); // Consuma il resto della linea

                        if (inputSceltaInserimento == 0) {

                            cart.aggiungiProdotto(scelta);
                            inputValido = true; // L'input è valido, usciamo dal ciclo.

                        } else{

                            List<Object> list = new ArrayList<Object>();
                            list.add(scelta);
                            
                            try {
                                System.out.print("Inserisci il nome dell'articolo: ");
                                String nome = scanner.nextLine();
                                list.add(nome);
                                
                                System.out.print("Inserisci il prezzo dell'articolo: ");
                                double prezzo = scanner.nextDouble();
                                list.add(prezzo);

                                System.out.print("Inserisci la quantità dell'articolo: ");
                                float quantita = scanner.nextFloat();
                                list.add(quantita);

                                scanner.nextLine(); // Consuma il resto della linea

                                List<String> ingredienti = new ArrayList<String>();
                                boolean condition;
                                do {
                                    System.out.print("Inserire un ingrediente: ");
                                    String ingrediente = scanner.nextLine();
                                    ingredienti.add(ingrediente);

                                    System.out.print("Vuoi inserire un altro ingrediente? (true/false): ");
                                    condition = scanner.nextBoolean();
                                    scanner.nextLine(); // Consuma il resto della linea
                                } while (condition);
                                list.add(ingredienti);

                                System.out.print("Inserisci il peso dell'articolo: ");
                                double peso = scanner.nextDouble();
                                list.add(peso);

                                
                                System.out.print("Inserire il tempo di cottura: ");
                                int tempoCottura = scanner.nextInt();
                                list.add(tempoCottura);

                                
                                if (scelta.equals("pane")) {
                                System.out.print("Inserire il tempo di lievitatura del pane: ");
                                int tempoLievitatura = scanner.nextInt();
                                list.add(tempoLievitatura);
                                }


                                System.out.print("Inserisci se la lievitatura è naturale o meno (true/false): ");
                                boolean lievitatura = scanner.nextBoolean();
                                list.add(lievitatura);


                                if (scelta.equals("pizza")) {
                                System.out.print("Inserisci la dimensione della pizza (tonda o rettangolare) (true/false): ");
                                boolean dimensione = scanner.nextBoolean();
                                list.add(dimensione);
                                }

                                scanner.nextLine(); // Consuma il resto della linea

                                System.out.print("Inserisci la descrizione dell'articolo: ");
                                String descrizione = scanner.nextLine();
                                list.add(descrizione);

                                inputValido = true;
                            } catch (Exception e) {
                                System.out.println("Inserimento non valido. Riprova.");
                                scanner.nextLine(); // Consuma il resto della linea
                            }

                            if(inputValido) {
                                cart.aggiungiProdotto(list);
                                inputValido = true; // L'input è valido, usciamo dal ciclo.
                            }
                        }
                    }else if(scelta.equals("stampare")){
                        if (cart != null) {
                            System.out.print(cart.getClass() + "  :  Dati: \n");
                            cart.stampaCarellino();
                        }
                    } else if (scelta.equals("quit")) {
                        cech = false;
                        inputValido = true;
                    } else {
                        System.out.println("Scelta non valida. Si prega di inserire 'pane' o 'pizza'.");
                        }
                } catch (Exception e) {

                    System.out.println("Errore durante l'inserimento. Riprova.");
                    scanner.nextLine(); // Pulisce l'input errato.
                }
            }
            inputValido = false;
            
            if(cech){
                try {
                    System.out.print("\n------------------------------------------------------------------------\nTornare al menu principale (true/false):  ");
                    reinput = scanner.nextBoolean();
                    System.out.println("------------------------------------------------------------------------\n");
                    scanner.nextLine();
                } catch (Exception e) {

                    System.out.println("Errore durante l'inserimento. Riprova.");
                    scanner.nextLine(); // Pulisce l'input errato.
                }
            }

        }
    }
}
















