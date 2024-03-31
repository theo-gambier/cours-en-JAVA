public class Test {
    public static void main (String[] args){
        /*Produit produit = new Produit("cereales",500L);
        System.out.println(produit.getPrix());
        System.out.println(produit.getName());
        System.out.println(produit);
        Produit Lait = new Produit("lait",403L);
        System.out.println(Lait);*/

        /*Produit produit1 = new Produit("cereales", 500L);
        Produit produit2 = new Produit("caviar", 50000L);
        Produit produit3 = new Produit("eau", 101L);
        Panier pan = new Panier();
        pan.ajoutProduit(produit1);
        pan.ajoutProduit(produit2);
        pan.ajoutProduit(produit3);
        System.out.println(pan.nombreProduit());
        System.out.println(pan.prixTotal()); */

        /*Panier pan = new Panier();
        Produit produit = new Produit("cereales", 500L);
        pan.ajoutProduit(produit);
        pan.supprimerProduit(new Produit("cereales", 500L));
        System.out.println(pan.nombreProduit()); // affiche: 0 */

        /*Produit produit2 = new Produit("caviar", 50000L, 6000);
        Produit produit3 = new Produit("eau", 101L, 5000);
        Produit produit4 = new Produit("lait", 300L, 4000);
        Panier pan = new Panier();
        pan.ajoutProduit(produit2);
        pan.ajoutProduit(produit3);
        pan.  */

        /*Produit produit1 = new Produit("cereales", 501L, 1000);
        Produit produit2 = new Produit("caviar", 50000L, 500);
        Produit produit3 = new Produit("eau", 500L, 5000);
        Panier pan = new Panier();
        pan.ajoutProduit(produit1);
        pan.ajoutProduit(produit2);
        pan.ajoutProduit(produit3);
        // pan.ajoutProduit(produit3); // produit une erreur
        pan.supprimerProduit(new Produit("eau", 500L, 5000));
        // pan.ajoutProduit(produit3); // produit une erreur
        pan.supprimerProduit(new Produit("eau", 500L, 5000));
        pan.ajoutProduit(produit3); // ajout possible! */


       /* Panier c1 = new Panier();
        System.out.println(c1.getId()); // affiche: 1
        Produit produit1 = new Produit("cereales", 501L, 1000);
        c1.ajoutProduit(produit1);
        Produit produit2 = new Produit("caviar", 50000L, 500);
        c1.ajoutProduit(produit2);
        System.out.println(c1.getId()); // affiche: 1
        Panier c2 = new Panier();
        Panier c3 = new Panier();
        Produit produit3 = new Produit("eau", 500L, 5000);
        c3.ajoutProduit(produit3);
        System.out.println(c2.getId()); // affiche: 2
        System.out.println(c3.getId()); // affiche: 3

       // System.out.println(c1.prixTotal());
       // System.out.println(c1);


        System.out.println(c1); // affiche: panier 1 [2 article(s)]
        // cereales: 5.01 €
        // caviar: 500.00 €

        System.out.println(c2); // affiche: panier 2 [0 article(s)]

        System.out.println(c3); // affiche: panier 3 [1 article(s)]
        // eau: 5.00
        */


        /*Produit produit1 = new Produit("cereales", 500L, 1000);
        System.out.println(produit1); // affiche: cereales: 5.00€
        ProduitFrais frais = new ProduitFrais("Saumon", 1450L, 800, "01-12-2022");
        System.out.println(frais); // affiche: B:01-12-2022 Saumon: 14.50€*/

        /*Produit tin = new Produit("sardine", 500L, 500);
        ProduitFrais frais = new ProduitFrais("sardine", 500L, 500, "01-12-2022");
        Panier pan = new Panier();
        pan.ajoutProduit(frais);
        pan.supprimerProduit(tin);
        System.out.println(pan);*/


        /*Ticket t = new Ticket("R1 - W-F", 9000L);
        Payable payable = new Payable(t);
        System.out.println(payable.label()); // affiche: R1 - W-F
        System.out.println(payable.cout()); // affiche: 9000
        System.out.println(payable.taxe()); // affiche: 2250*/

        /*Facture facture = new Facture();
        Ticket t = new Ticket("R2 - W-F", 9000L);
        Payable payable = new Payable(t);
        Ticket ticket = new Ticket("M2 - R1",12000L);
        facture.ajout(payable);
        facture.ajout(ticket);*/


        /*Facture facture = new Facture();
        Ticket t = new Ticket("R2 - W-F", 9000L);
        Payable payable = new Payable(t);
        Ticket ticket = new Ticket("M2 - R1",12000L);
        facture.ajout(payable);
        facture.ajout(ticket);
        Produit produit = new Produit("cereales", 500L, 1000);
        facture.ajout(produit);*/

        Produit tin = new Produit("sardine", 500L, 500);
        ProduitFrais frais = new ProduitFrais("sardine", 500L, 500, "01-12-2022");
        ProduitFrais frais2 = new ProduitFrais("sardine x3", 1500L, 1500, "01-12-2022");
        System.out.println(tin.getTaxe()); // affiche: 1000
        System.out.println(frais.getTaxe()); // affiche: 1000
        System.out.println(frais2.getTaxe()); // affiche: 990

        Facture facture = new Facture();
        facture.ajout(tin);
        facture.ajout(frais);
        facture.ajout(frais2);
        System.out.println(facture.montantTotal()); // affiche: 2500
        System.out.println(facture.taxeTotale()); // affiche: 248

    }
}
