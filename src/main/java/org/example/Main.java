package org.example;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


produit p = new produit(1,"delice","lait",3) ;
        produit c = new produit(1,"delice","lait",3) ;

if (produit.comparer(p,c))
{
    System.out.println("Produit identique");
}
else
    System.out.println ("Produit different");


        if (p.comparer(c))
        {
            System.out.println("Produit identique");
        }
        else
            System.out.println ("Produit different");

        Magasin a = new Magasin (0,"tunis",20);
a.afficherMagasin();




    }



        }


