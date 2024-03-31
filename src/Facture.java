import java.util.ArrayList;

public class Facture {
    ArrayList <Ticket> listeTicket;
    ArrayList <Payable> listePayable;
    ArrayList <Produit> listeProduit;
    ArrayList <ProduitFrais> listeProduitFrais;

    public Facture (){
        listeTicket = new ArrayList<>();
        listePayable = new ArrayList<>();
        listeProduit = new ArrayList<>();
        listeProduitFrais = new ArrayList<>();
    }
    public void ajout (Payable p){
        listePayable.add(p);
    }
    public void ajout (Ticket t){
        listeTicket.add(t);
    }
    public void ajout (Produit p){
        listeProduit.add(p);
    }
    public void ajout (ProduitFrais p){
        listeProduitFrais.add(p);
    }
    public Long taxeTotale () {
        Long somme = 0L;
        int i;
        for (i=0; i<listeProduitFrais.size(); i++){
            somme += listeProduitFrais.get(i).taxe;
        }
        for (i=0; i<listeProduit.size(); i++){
            somme += listeProduit.get(i).taxe;
        }
        for (i=0; i<listeTicket.size(); i++){
            somme += listeTicket.get(i).taxe;
        }
        for (i=0; i<listePayable.size(); i++){
            somme += listePayable.get(i).taxe;
        }
        return somme;
    }
    public Long montantTotal () {
        Long somme = 0L;
        int i;
        for (i=0; i<listeProduitFrais.size(); i++){
            somme += listeProduitFrais.get(i).prix;
        }
        for (i=0; i<listeProduit.size(); i++){
            somme += listeProduit.get(i).prix;
        }
        for (i=0; i<listeTicket.size(); i++){
            somme += listeTicket.get(i).prix;
        }
        for (i=0; i<listePayable.size(); i++){
            somme += listePayable.get(i).prix;
        }
        return somme;
    }
}
