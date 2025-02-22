import mesVoitures.*;

public class AppVehicule {
    public static void main(String[] args) {
        Voiture voiture = new Voiture();
        Velo velo = new Velo();
        Moto moto = new Moto();

        System.out.println("\nTest de la voiture :");
        voiture.demarrer();
        voiture.arreter();

        System.out.println("La vitesse max est : " + voiture.getVitesseMax() + "Km/h" + "\n");

        System.out.println("Test du vélo :");
        velo.demarrer();
        velo.arreter();
        System.out.println("La vitesse max est : " + velo.getVitesseMax() + "Km/h" + "\n");

        System.out.println("Test de la moto :");
        moto.demarrer();
        moto.arreter();
        System.out.println("La vitesse max est : " + moto.getVitesseMax() + "Km/h" + "\n");
    }
}
