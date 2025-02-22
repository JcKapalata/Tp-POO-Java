package mypackages;

public class Institution {
    // Creation d'attribut
    protected String nom;
    protected String pays;
    protected String type;
    protected int anneeCreation;

    public Institution(String nom, String pays, String type, int anneeCreation){
        this.nom = nom;
        this.pays = pays;
        this.type = type;
        this.anneeCreation = anneeCreation;
    }

    // Creation des accesseurs et du mutateurs nom
    public String getNomInstitution(){
        return nom;
    }
    public void setNominstitution(String nom){
        this.nom = nom;
    }
    // Creation des accesseurs et du mutateurs pays
    public String getPaysInstitution(){
        return pays;
    }
    public void setPaysInstitution(String pays){
        this.pays = pays;
    }
    // Creation des accesseurs et du mutateurs type
    public String getTypeInstitution(){
        return type;
    }
    public void setTypeInstitution (String type){
        this.type = type;
    }
    // Creation des accesseurs et du mutateurs annee de creation
    public int getAnneeCreationInstitution(){
        return anneeCreation;
    }
    public void setAnneeCreationInstitution(int anneeCreation){
        this.anneeCreation = anneeCreation;
    }

    // methode pour age de l'institution
    public int ageInstitution(){
        return 2025 - getAnneeCreationInstitution();
    }

    // methode pour description de l' institution
    public void description(){
        System.out.println("\t DESCRIPTION DE L'INSTITUION " + this.nom);
        System.out.println("Le nom de l' institution : "+ this.nom);
        System.out.println("Le pays de l' institution : "+ this.pays);
        System.out.println("Le type de l' institution : "+ this.type);
        System.out.println("Le annee de creation de l' institution : "+ this.anneeCreation);
        System.out.println("L' age actuel de l' institution : "+ ageInstitution() + " ans");
    }
}
