package mypackages;

public class Universite extends Institution{
    // Creation des attribut
    private int nbrFaculte;
    private String systemeEnseigement;
    private String nomRecteur;

    public Universite(String nom, String pays, String type, int anneeCreation, int nbrFaculte, String systemeEnseigement, String nomRecteur){
        super(nom, pays, type, anneeCreation);
        this.nbrFaculte = nbrFaculte;
        this.systemeEnseigement = systemeEnseigement;
        this.nomRecteur = nomRecteur;
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
    @Override
    public void description(){
        super.description();
        System.out.println("Nombre de faculte : "+ this.nbrFaculte);
        System.out.println("Systeme d' enseignement : "+ this.systemeEnseigement);
    }

    // Creation d'une methode qui affiche nom du Recteur
    public void afficheNomRecteur(){
        System.out.println("Le nom du recteur de l'universite " + this.nom + " : "+ this.nomRecteur);
    }
}
