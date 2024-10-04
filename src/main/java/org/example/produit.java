package org.example;

import java.util.Date;

public class produit {
     int id;
     String lib ;
     String marque ;
     float prix ;
     Date dateExp ;
     private static int nbr_produit=0;

    public static int getNbr_produit() {
        return nbr_produit;
    }

    public produit (int id , String lib , String marque , float prix) {
        this.id =id ;
        this.lib =lib ;
        this.marque =marque ;
        this.prix =prix ;
this.nbr_produit++ ;
    }
    public void afficher()
    {
        System.out.println("Id:"+this.id +"\nlib:"+this.lib+"\nmarque:"+this.marque+"\nprix"+this.prix);
    }

    @Override
    public String toString() {
        return "produit{" +
                "id=" + id +
                ", lib='" + lib + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';

    }
    public boolean comparer (produit p)
    {
        if ((this.prix == p.prix)&& (this.lib==p.lib) &&(this.id==p.id))
        {
            return true;
    }
    else
    return false;

    }
    public static boolean comparer (produit p , produit c )
    {
        if(p.comparer(c)) {
            return true;
        }
        else return false;
        }

}

