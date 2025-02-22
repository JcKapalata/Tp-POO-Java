import mypackages.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Instatiation de la class institution et se mutateurs
        Institution institution1 = new Institution("Polytechnique", "RDC",
                 "Publique", 1955);
        Institution institution2 = new Institution("Santé publique", "RDC", 
                 "Privée", 1960);

        
        // Instatiation de la class Universite et ses mutateurs
        Universite universite1 = new Universite("ULPGL GOMA", "RDC", "Publique", 1991, 7, "LMD","Dr. WASSO MISONA");
        Universite universite2 = new Universite("ISTA GOMA", "RDC",  "Publique", 1993, 5, "LMD", "Dr. KAMBALE MONDO Augustin");

        // Instatiation de la class Ecole et ses mutateurs
        Ecole ecole1 = new Ecole("INSTITUT HIMBI", "RDC", "Publique", 1993, "Secondaire", 27, "KAKULE KASEREKA WAKATA");
        Ecole ecole2 = new Ecole("ITIG GOMA", "RDC",  "Publique", 1955, "Secondaire", 32, "PERE NAZAIRE MULOKO");
        Ecole ecole3 = new Ecole("EP. ASIFIWE", "RDC", "Publique", 1991, "Primaire", 15,  "KAMBALE MIHINDO ESAI");

        // Affichage Description de l'institution
        institution1.description();
        institution2.description();
        System.out.println("");

        // Affichage Description Universite
        universite1.description();
        universite2.description();
        System.out.println("");

        // Affichage Description Ecole
        ecole1.description();
        ecole2.description();
        ecole3.description();
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
