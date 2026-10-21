package ex2ds;

public class Personne {
    private String nom;
    private String prenom;
    private int age;

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        setAge(age);
    }

    public void afficherInfos() {
        System.out.println("nom : " + nom + ", prenom : " + prenom + ", age : " + age);
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String getNom() {
    	return nom;
    	}
    public String getPrenom() {
    	return prenom;
    	}
    public int getAge() {
    	return age;
    	}
}