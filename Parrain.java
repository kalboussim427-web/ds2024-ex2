package ex2ds;

public class Parrain extends Personne {
	private static int comptrP = 1;
    private int idParrain;
    private int nombreEnfantsParraines;
    public static final int MAX = 100;
    private Enfant[] mesEnfants;

    public Parrain(String nom, String prenom, int age) {
        super(nom, prenom, age);
        this.idParrain = comptrP++;
        this.nombreEnfantsParraines = 0;
        this.mesEnfants = new Enfant[MAX];
    }
    public void ajouterEnfant(Enfant enfant) {
        if (nombreEnfantsParraines < MAX) {
            mesEnfants[nombreEnfantsParraines] = enfant;
            nombreEnfantsParraines++;
        }
    }
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("ID parrain: " + idParrain + ", nombre d'enfants: " + nombreEnfantsParraines);
        System.out.println("--- enfants parraines ---");
        for (int i = 0; i < nombreEnfantsParraines; i++) {
            mesEnfants[i].afficherInfos();
        }
    }

    public int getnbreEnfantsParraines() {
        return nombreEnfantsParraines;
    }

    public Enfant[] getMesEnfants() {
        return mesEnfants;
    }
}
    


