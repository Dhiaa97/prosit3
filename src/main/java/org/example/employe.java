package org.example;

public class employe {

    private int id;
    private String nom;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public float getNbrHeure() {
        return nbrHeure;
    }

    public void setNbrHeure(float nbrHeure) {
        this.nbrHeure = nbrHeure;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String adresse;
    private float nbrHeure;

    public employe(int id, String nom, String adresse, float nbrHeure) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeure = nbrHeure;
    }
    public employe() {
        this.id = 0;
        this.nom = "";
        this.adresse = "";
        this.nbrHeure = 0;
    }


    @Override
    public String toString() {
        return "employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nbrHeure=" + nbrHeure +
                '}';
    }
    public double calculerSalaire() {
        return 0.0; // Cette méthode sera redéfinie dans les sous-classes
    }

    public void afficherSalaire() {
        System.out.println("Salaire de " + nom + ": " + calculerSalaire() + " DT");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; 
        if (o == null || getClass() != o.getClass()) return false;

        employe employe = (employe) o;


        return id == employe.id &&
                nbrHeure == employe.nbrHeure &&
                nom.equals(employe.nom) &&
                adresse.equals(employe.adresse);
    }


}
