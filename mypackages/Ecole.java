package mypackages;

public class Ecole extends Institution{
    // Creation des attribut
    private String typeEcole;
    private int nbrClasse;
    private String nomPromoteur;

    // Creation du construteur
    public Ecole(){

    }

    // Creation accesseur et mutateur du type d'ecole
    public String getTypeEcole (){
        return typeEcole;
    }
    public void setTypeEcole (String type_ecole){
        typeEcole = type_ecole;
    }

    // Creation acceusseur et mutateur du nombre de classe
    public  int getNbrClasse (){
        return nbrClasse;
    }
    public void setNbrClasse (int nbr_classe){
        nbrClasse = nbr_classe;
    }

    // Creation accesseur et mutateur pour le Nom du recteur
    public String getNomPromoteur (){
        return nomPromoteur;
    }
    public void setNomPromoteur (String nom_promoteur){
        nomPromoteur = nom_promoteur;
    }

    // Creation du methode description pour l' Ecole
    public void descriptionEcole(){
        System.out.println("\t DESCRIPTION ECOLE");
        System.out.println("Type de l' ecole : "+ getTypeEcole());
        System.out.println("Nombre de classe : "+ getNbrClasse());
    }

    // Creation du methode qui affiche le nom promoteur
    public void affichePromteur(){
        System.out.println("Le nom du promoteur : "+ getNomPromoteur());
    }
}
