public class Ticket {
    String reference;
    Long prix;
    Long taxe;
    public Ticket (String s,Long p){
        reference = s;
        prix = p;
        taxe = prix/4;
    }

    public Ticket() {

    }

    public String getReference (){
        return reference;
    }
    public Long getPrix (){
        return prix;
    }
    public Long getTaxe (){
        return taxe;
    }
}
