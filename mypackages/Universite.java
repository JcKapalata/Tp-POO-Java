package mypackages;

public class Universite extends Institution{
    // Creation des attribut
    private int nbrFaculte;
    private String systemeEnseigement;
    private String nomRecteur;

    public Universite(){

    }

    // Creation accesseur et mutateur Nbre de faculte
    public int getNbrFaculte(){
        return nbrFaculte;
    }
    public void setNbrFaculte(int n_Faculte){
        nbrFaculte = n_Faculte;
    }
    // Creation accesseur et mutateur Systeme d'enseignement
    public String getSystemeEnseignement(){
        return systemeEnseigement;
    }
    public void setSystemeEnseignement(String syst_Enseignement){
        systemeEnseigement = syst_Enseignement;
    }
    // Creation accesseur et mutateur du nom du recteur
    public String getNomRecteur(){
        return nomRecteur;
    }
    public void setNomRecteur(String n_Recteur){
        nomRecteur = n_Recteur;
    }

    // Creation du methode Description
    public void descriptionUniversite(){
        System.out.println("\t DESCRIPTION DE L'UNIVERSITE");
        System.out.println("Nombre de faculte : "+ getNbrFaculte());
        System.out.println("Systeme d' enseignement : "+ getSystemeEnseignement());
    }

    // Creation d'une methode qui affiche nom du Recteur
    public void afficheNomRecteur(){
        System.out.println("Le nom du recteur : "+ getNomRecteur());
    }
}
