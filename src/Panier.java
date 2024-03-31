import java.util.ArrayList;

public class Panier implements Article {
    ArrayList <Produit> Liste;
    ArrayList <ProduitFrais> ListeFrais;
    int poidsTotal = 0;
    private int id;
    static int cpt = 1;

    int i;
    String s = "";
    public Panier () {
        Liste = new ArrayList <> ();
        ListeFrais = new ArrayList <> ();
        setId(cpt++);
    }
    public int getId(){
        return id;
    }
    public void setId (int n){
        id = n;
    }
    public void ajoutProduit (Produit p) {
        poidsTotal = poidsTotal + p.getPoids();
        int test = poidsTotal;
        if (test <= 10000){
            Liste.add(p);
        }
        else {
            System.out.println("erreur : panier trop lourd");
        }
    }
    public void ajoutProduit (ProduitFrais p) {
        poidsTotal = poidsTotal + p.getPoids();
        int test = poidsTotal;
        if (test <= 10000){
            ListeFrais.add(p);
        }
        else {
            System.out.println("erreur : panier trop lourd");
        }
    }
    public boolean supprimerProduit(Produit p) {
        int pos;
        if (Liste.contains(p)) {
            pos = Liste.indexOf(p);
            Liste.remove(pos);
            poidsTotal = poidsTotal - p.getPoids();
            return true;
        }
        else {
            return false;
        }
    }
    public boolean supprimerProduit(ProduitFrais p) {
        int pos;
        if (ListeFrais.contains(p)) {
            pos = ListeFrais.indexOf(p);
            ListeFrais.remove(pos);
            poidsTotal = poidsTotal - p.getPoids();
            return true;
        }
        else {
            return false;
        }
    }
    public int nombreProduit (){
        if ((Liste.isEmpty())&&(ListeFrais.isEmpty())) {
            return 0;
        }
        else {
            return Liste.size() + ListeFrais.size() ;
        }
    }
    //L'ordre de grandeur de prixTotal() est de Liste.size() + 2
    public String prixTotal () {
        int i;
        int somme = 0;
        for (i=0; i < Liste.size(); i++) {
            somme += Liste.get(i).prix;
        }
        return (String.format("%d.%02d", somme / 100 , somme % 100));
    }


    public String toString (){
        s = "";
        for (i=0; i<Liste.size();i++){
            s = s + Liste.get(i).toString() + "\n";
        }
        for (i=0; i<ListeFrais.size();i++){
            s = s + ListeFrais.get(i).toString() + "\n";
        }
        return "panier" + getId() + "["+ nombreProduit() + " article(s)] \n" + s;
    }
}
