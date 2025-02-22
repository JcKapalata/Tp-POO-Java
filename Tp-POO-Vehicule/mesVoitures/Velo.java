package mesVoitures;

public class Velo implements Vehicule {
    public Velo(){

    }
    @Override
    public void demarrer(){
        System.out.println("Le vélo commence à rouler. ");
    }
    @Override
    public void arreter(){
        System.out.println("Le vélo s'arrete. ");
    }
    @Override
    public int getVitesseMax(){
        return 30;
    }
}
