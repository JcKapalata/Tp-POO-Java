package mesVoitures;

public class Moto implements Vehicule {
    public Moto(){

    }
    @Override
    public void demarrer(){
        System.out.println("La moto demarre. ");
    }
    @Override
    public void arreter(){
        System.out.println("La moto s'arrete. ");
    }
    @Override
    public int getVitesseMax(){
        return 180;
    }
}
