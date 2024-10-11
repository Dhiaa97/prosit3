package org.example;

public class caissier extends employe{

    private float numeroDeCaisse;

    public caissier(int id, String nom, String adresse, float nbrHeure, float numeroDeCaisse) {
        super(id, nom, adresse, nbrHeure);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public caissier() {
        super();
        this.numeroDeCaisse = numeroDeCaisse;
    }


    @Override
    public String toString() {
        return super.toString()+"caissier{" +
                "numeroDeCaisse=" + numeroDeCaisse +
                '}';
    }

    @Override
    public double calculerSalaire() {
        double tauxHoraire = 5.0;
        double salaire = 0.0;

        if (super.getNbrHeure() > 180) {
            salaire = (180 * tauxHoraire) + ((super.getNbrHeure() - 180) * tauxHoraire * 1.15);
        } else {
            salaire = super.getNbrHeure()* tauxHoraire;
        }

        return salaire;
    }
}
