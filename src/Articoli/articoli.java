package Articoli;



public abstract class articoli {
    private int id;
    private String nome_articolo;
    private double prezzo_articolo;
    protected float quantita_articolo;

    public void setId(int id) {
        this.id = id;
    }

    public void setNome_articolo(String nome_articolo) {
        this.nome_articolo = nome_articolo;
    }

    public void setPrezzo_articolo(double prezzo_articolo) {
        this.prezzo_articolo = prezzo_articolo;
    }

    public void setQuantita_articolo(float quantita_articolo) {
        this.quantita_articolo = quantita_articolo;
    }

    public int getId() {
        return id;
    }

    public String getNome_articolo() {
        return nome_articolo;
    }
    
    public double getPrezzo_articolo() {
        return prezzo_articolo;
    }

    public float getQuantita_articolo() {
        return quantita_articolo;
    }
    
}
