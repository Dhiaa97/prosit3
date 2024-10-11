package org.example;

public class vendeur extends employe{


    private  int tauxDeVente;

    public vendeur(int id, String nom, String adresse, float nbrHeure, int tauxDeVente) {
        super(id, nom, adresse, nbrHeure);
        this.tauxDeVente = tauxDeVente;
    }

    public vendeur(int tauxDeVente) {
        super();
        this.tauxDeVente = tauxDeVente;
    }


    @Override
    public String toString() {
        return super.toString()+"vendeur{" +
                "tauxDeVente=" + tauxDeVente +
                '}';
    }

    @Override
    public double calculerSalaire() {
        double salaireFixe = 450.0;
        return salaireFixe * tauxDeVente / 100;
    }
}
