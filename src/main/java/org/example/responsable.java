package org.example;

public class responsable extends employe {

    private float prime;

    public responsable(int id, String nom, String adresse, float nbrHeure, float prime) {
        super(id, nom, adresse, nbrHeure);
        this.prime = prime;
    }


    public responsable() {
        super();
        this.prime = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "responsable{" +
                "prime=" + prime +
                '}';
    }

    @Override
    public double calculerSalaire() {
        double tauxHoraire = 10.0;
        double salaire = 0.0;

        if (super.getNbrHeure() > 160) {
            salaire = (160 * tauxHoraire) + ((super.getNbrHeure()  - 160) * tauxHoraire * 1.2);
        } else {
            salaire =super.getNbrHeure()  * tauxHoraire;
        }

        return salaire + prime;

    }
    public void afficherPrime() {
        System.out.println("Prime de " + super.getNom() + ": " + prime + " DT");
    }
}
