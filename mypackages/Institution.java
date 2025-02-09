package mypackages;

public class Institution {
    // Creation d'attribut
    private String nom;
    private String pays;
    private String type;
    private int anneeCreation;

    public Institution(){
        
    }

    // Creation des accesseurs et du mutateurs nom
    public String getNomInstitution(){
        return nom;
    }
    public void setNominstitution(String n){
        nom = n;
    }
    // Creation des accesseurs et du mutateurs pays
    public String getPaysInstitution(){
        return pays;
    }
    public void setPaysInstitution(String p){
        pays = p;
    }
    // Creation des accesseurs et du mutateurs type
    public String getTypeInstitution(){
        return type;
    }
    public void setTypeInstitution (String t){
        type = t;
    }
    // Creation des accesseurs et du mutateurs annee de creation
    public int getAnneeCreationInstitution(){
        return anneeCreation;
    }
    public void setAnneeCreationInstitution(int a){
        anneeCreation = a;
    }

    // methode pour age de l'institution
    public int ageInstitution(){
        return 2025 - getAnneeCreationInstitution();
    }

    // methode pour description de l' institution
    public void descriptionInstitution(){
        System.out.println("\t DESCRIPTION DE L'INSTITUION");
        System.out.println("Le nom de l' institution : "+ getNomInstitution());
        System.out.println("Le pays de l' institution : "+ getPaysInstitution());
        System.out.println("Le type de l' institution : "+ getTypeInstitution());
        System.out.println("Le annee de creation de l' institution : "+ getAnneeCreationInstitution());
        System.out.println("L' age actuel de l' institution : "+ ageInstitution() + " ans");
    }
}
