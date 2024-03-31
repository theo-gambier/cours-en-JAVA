public class Produit implements Article {
    String name;
    Long prix;
    int poids;
    Long taxe;

    public Produit (String s,Long p, int po) {
        name =s;
        prix = p;
        poids = po;
        taxe = prix/10;
    }
    public String getName () {
        return name;
    }
    public Long getPrix () {
        return prix;
    }
    public int getPoids () {
        return poids;
    }
    public Long getTaxe(){
        return taxe;
    }
    public String toString () {
        return name + " : " + String.format("%d.%02d", prix / 100 , prix % 100) + " €";
    }
}
