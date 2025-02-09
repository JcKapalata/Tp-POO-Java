import mypackages.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Instatiation de la class institution et se mutateurs
        Institution institution1 = new Institution();
        institution1.setNominstitution("Jean");
        institution1.setPaysInstitution("Rdc");
        institution1.setTypeInstitution("C");
        institution1.setAnneeCreationInstitution(2001);

        
        // Instatiation de la class Universite et ses mutateurs
        Universite universite1 = new Universite();
        universite1.setNbrFaculte(6);
        universite1.setSystemeEnseignement("LMD");
        universite1.setNomRecteur("Eric");

        Universite universite2 = new Universite();
        universite2.setNbrFaculte(4);
        universite2.setSystemeEnseignement("LMD");
        universite2.setNomRecteur("PAUL");

        // Instatiation de la class Ecole et ses mutateurs
        Ecole ecole1 = new Ecole();
        ecole1.setTypeEcole("Primaire");
        ecole1.setNbrClasse(12);
        ecole1.setNomPromoteur("Alain");

        Ecole ecole2 = new Ecole();
        ecole2.setTypeEcole("Secondaire");
        ecole2.setNbrClasse(30);
        ecole2.setNomPromoteur("Vincent");

        Ecole ecole3 = new Ecole();
        ecole3.setTypeEcole("Primaire");
        ecole3.setNbrClasse(18);
        ecole3.setNomPromoteur("Destin");

        // Affichage Description de l'institution
        System.out.println("");
        institution1.descriptionInstitution();
        System.out.println("");

        // Affichage Description Universite
        universite1.descriptionUniversite();
        universite2.descriptionUniversite();
        System.out.println("");

        // Affichage Description Ecole
        ecole1.descriptionEcole();
        ecole2.descriptionEcole();
        ecole3.descriptionEcole();
        System.out.println("");
        
        // Affichage nom des 2 Recteur
        universite1.afficheNomRecteur();
        universite2.afficheNomRecteur();
        System.out.println("");

        // Affichage nom des 3 promoteur
        ecole1.affichePromteur();
        ecole2.affichePromteur();
        ecole3.affichePromteur();

    }
}
