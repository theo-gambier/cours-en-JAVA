public class Payable extends Ticket{
    String label;
    Long cout;
    Long taxe;
    Payable p;

    public Payable (Ticket t) {
        label = t.getReference();
        cout = t.getPrix();
        taxe = t.getTaxe();
    }
    public Payable (Produit p) {
        label = p.getName();
        cout = p.getPrix();
        taxe = p.getPrix()/10;
    }
    public String getLabel (){
        return label;
    }
    public Long getCout (){
        return cout;
    }
    public Long getTaxe() {
        return taxe;
    }
    public String label (){
        return getLabel();
    }
    public Long cout (){
        return getCout();
    }
    public Long taxe () {
        return getTaxe();
    }
}

