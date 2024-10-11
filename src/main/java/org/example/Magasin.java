package org.example;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Magasin {


    private int id;
    private String adresse;
    private int capacite;

    private produit[] ensembleProduit;
    private  int cpt;
    private ArrayList<employe> employes;



    public Magasin(int id , String adresse , int capacite )
    {
        this.id=id;
        this.adresse=adresse;
        this.capacite=capacite;
        this.ensembleProduit= new produit[capacite];
        this.employes= new ArrayList<employe>();
        this.cpt=0;

    }
  public void AjouterEmployes(employe e)
  {
      this.employes.add(e);
  }

    public void ajouterProduit(produit p)
    {
        if(cpt<capacite)
        {
            if (!this.chercherProduit(p)) {
                this.ensembleProduit[cpt] = p;
                cpt++;
                System.out.println("Produit ajouté: " + p.lib);
            }
            else System.out.println("Produit existe");
        }
        else
            System.out.println("Magasin complet");
    }


    public void afficherMagasin()
    {
        System.out.println("Id:"+ this.id+
                "\nAdresse:"+ this.adresse+
                "\nCapcité:"+this.capacite);

        for(int i=0;i<cpt;i++)
        {
            this.ensembleProduit[i].afficher();
        }
    }
public boolean chercherProduit (produit p ){
        int t=0;


        for(int i =0;i < cpt;i++)
        {
            if (ensembleProduit[i].comparer(p)) {
                t = 1;
            }
        }
        if (t == 0) {
            return false;

        } else return true;
    }

    public void afficherSalairesEmployes() {
        System.out.println("Salaires des employés du magasin " + this.adresse + ":");
        for (employe e : employes) {
            e.afficherSalaire();
        }
    }

    public void afficherTousEmployes() {
        System.out.println("Liste des employés du magasin " + this.adresse + ":");
        for (employe e : employes) {
            System.out.println(e.toString()); // Affiche la méthode toString() de chaque employé
        }
    }


    public void afficherPrimesResponsables() {
        System.out.println("Primes des responsables du magasin " + this.adresse + ":");
        for (employe e : employes) {
            if (e instanceof responsable) {
                ((responsable) e).afficherPrime();
            }
        }
    }

}






