package org.example;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Magasin monoprix= new Magasin(1, "Menzah 6",20);
        Magasin carrefour= new Magasin(1, " centre-ville",20);

     // magasin carrefour
      employe c1= new caissier(1,"dhia"," centre-ville",55,1);
      employe c2= new caissier(1,"abacha"," centre-ville",60,1);
      employe r1= new responsable(1,"Fourat"," centre-ville",4,1500);
      employe v1= new vendeur(1,"Mostari"," centre-ville",60,90);

    carrefour.AjouterEmployes(c1);
    carrefour.AjouterEmployes(c2);
    carrefour.AjouterEmployes(r1);
    carrefour.AjouterEmployes(v1);

    carrefour.afficherTousEmployes();

    //carrefour.afficherSalairesEmployes();
  //  carrefour.afficherPrimesResponsables();

      // magasin monoprix

        employe v2= new vendeur(1,"Mourad","menzah 6",60,90);
        employe v3= new vendeur(1,"Mohsen","menzah 6",60,90);
        employe v4= new vendeur(1,"Ali","menzah 6",60,90);
        employe r2= new responsable(1,"Ahmed","menzah 6",4,1500);

    monoprix.AjouterEmployes(v2);
    monoprix.AjouterEmployes(v3);
    monoprix.AjouterEmployes(v4);
    monoprix.AjouterEmployes(r2);





/*
        // Création de quelques produits pour Carrefour
        produit p1 = new produit(101, "Lait", "Délice", 1.200f);
        produit p2 = new produit(102, "Café", "Nespresso", 12.500f);
        produit p3 = new produit(103, "Pain", "Sultan", 0.300f);

        // Ajout des produits au magasin Carrefour
        carrefour.ajouterProduit(p1);
        carrefour.ajouterProduit(p2);
        carrefour.ajouterProduit(p3);

        // Affichage du magasin Carrefour avec ses produits
        carrefour.afficherMagasin();

        // Création de quelques produits pour Monoprix
        produit p4 = new produit(201, "Jus", "Vital", 3.000f);
        produit p5 = new produit(202, "Eau Minérale", "Sabrine", 0.600f);

        // Ajout des produits au magasin Monoprix
        monoprix.ajouterProduit(p4);
        monoprix.ajouterProduit(p5);

        // Affichage du magasin Monoprix avec ses produits
        monoprix.afficherMagasin();

*/




    }
}


