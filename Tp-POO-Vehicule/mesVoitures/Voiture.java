package mesVoitures;

public class Voiture implements Vehicule {
    public Voiture(){

    }
    @Override
    public void demarrer(){
        System.out.println("La voiture demarre. ");
    }
    @Override
    public void arreter(){
        System.out.println("La voiture s'arrete. ");
    }
    @Override
    public int getVitesseMax(){
        return 200;
    }
    
}
