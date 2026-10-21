package ex2ds;

public class ParrainMensuel extends Parrain {
    private double virementMensuel;

    public ParrainMensuel(String nom, String prenom, int age, double virementMensuel) {
        super(nom, prenom, age);
        this.virementMensuel = virementMensuel;
    }

    public double calculerVirementTotal() {
        return getnbreEnfantsParraines() * virementMensuel;
    }

    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("virement mensuel par enfant: " + virementMensuel);
        System.out.println("virement total: " + calculerVirementTotal());
    }

    public double getvirementMensuel() {
        return virementMensuel;
    }
}
