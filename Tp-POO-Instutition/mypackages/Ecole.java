package mypackages;

public class Ecole extends Institution{
    // Creation des attribut
    private String typeEcole;
    private int nbrClasse;
    private String nomPromoteur;

    // Creation du construteur
    public Ecole(String nom, String pays, String type, int anneeCreation, String typeEcole, int nbrClasse, String nomPromoteur){
        super(nom, pays, type, anneeCreation);
        this.typeEcole = typeEcole;
        this.nbrClasse = nbrClasse;
        this.nomPromoteur = nomPromoteur;
    }

    // Creation accesseur et mutateur du type d'ecole
    public String getTypeEcole (){
        return typeEcole;
    }
    public void setTypeEcole (String type_ecole){
        this.typeEcole = type_ecole;
    }

    // Creation acceusseur et mutateur du nombre de classe
    public  int getNbrClasse (){
        return nbrClasse;
    }
    public void setNbrClasse (int nbr_classe){
        this.nbrClasse = nbr_classe;
    }

    // Creation accesseur et mutateur pour le Nom du recteur
    public String getNomPromoteur (){
        return nomPromoteur;
    }
    public void setNomPromoteur (String nom_promoteur){
        this.nomPromoteur = nom_promoteur;
    }

    // Creation du methode description pour l' Ecole
    @Override
    public void description(){
        super.description();
        System.out.println("Type de l' ecole : "+ this.typeEcole);
        System.out.println("Nombre de classe : "+ this.nbrClasse);
    }

    // Creation du methode qui affiche le nom promoteur
    public void affichePromteur(){
        System.out.println("Le nom du promoteur "+ this.nom +" : "+ this.nomPromoteur);
    }
}
