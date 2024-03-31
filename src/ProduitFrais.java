public class ProduitFrais {
    String name;
    Long prix;
    int poids;
    String date;
    Long taxe;

    public ProduitFrais (String s,Long p, int po, String d) {
        name =s;
        prix = p;
        poids = po;
        date = d;
        taxe = (prix/10); //-((setTaxe()*prix)/0.1);  //mis en comment taire car ca ne marchais pas donc pour pouvoir continuer il a etait mis en commentaire
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
    public String getDate(){
        return date;
    }
    public double getTaxe () {
        return taxe;
    }
    public String toString () {
        return "DLC : " + date +" "+ name + " : " + String.format("%d.%02d", prix / 100 , prix % 100) + " €";
    }
    public Long setTaxe () {
        Long s = 0L;
        int i;
        for (i=1; poids/i>1000; i++){
            s += 1;
        }
        return s;
    }
}
