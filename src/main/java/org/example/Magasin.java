package org.example;

import java.security.PublicKey;
import java.util.List;

public class Magasin {


    private int id;
    private String adresse;
    private int capacite;

    private produit[] ensembleProduit;
    private  int cpt;


    public Magasin(int id , String adresse , int capacite )
    {
        this.id=id;
        this.adresse=adresse;
        this.capacite=capacite;
        this.ensembleProduit= new produit[capacite];
        this.cpt=0;

    }


    public void ajouterProduit(produit p)
    {
        if(cpt<capacite)
        {
            if (this.chercherProduit(p)) {
                this.ensembleProduit[cpt] = p;
                cpt++;
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


        for(int i =0;i < ensembleProduit.length;i++)
        {
            if (ensembleProduit[i].comparer(p)) {
                t = 1;
            }
        }
        if (t == 0) {
            return false;

        } else return true;
    }

}






