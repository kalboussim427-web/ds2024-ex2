package ex2ds;

public class Enfant extends Personne {
	private static int comptr = 0;
    private int idEnfant;
    private String classe;

    public Enfant(String nom, String prenom, int age) {
        super(nom, prenom, age);
        this.idEnfant = ++comptr;
    }

    public Enfant(String nom, String prenom, int age, String classe) {
        this(nom, prenom, age);
        this.classe = classe;
    }
    
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("ID enfant: " + idEnfant + ", classe: " + classe);
    }

    public String getClasse() {
        return classe;
    }
}
	


