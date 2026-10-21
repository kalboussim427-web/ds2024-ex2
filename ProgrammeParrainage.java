package ex2ds;

public class ProgrammeParrainage {
	public static void main(String[] args) {
        
        Parrain[] parrains = new Parrain[10];
        parrains[0] = new Parrain("Ali", "Ben Ali", 40);
        parrains[1] = new Parrain("Salah", "Ben Salah", 35);
        parrains[2] = new ParrainMensuel("Tounes", "Ben Tounes", 45, 100.0);

        
        Enfant[] enfants = new Enfant[1025];
        enfants[0] = new Enfant("Farah", "ben Farah", 10, "quatrième année ");
        enfants[1] = new Enfant("Amel", "ben Amel", 12, "Sixième année");
        enfants[2] = new Enfant("Fedy", "Ben Fedy", 11, "Sixième année");
        enfants[3] = new Enfant("Sarra", "Ben Sarra", 9, "Troisième année");

        
        parrains[0].ajouterEnfant(enfants[0]);

        
        parrains[2].ajouterEnfant(enfants[1]);
        parrains[2].ajouterEnfant(enfants[2]);

        
        int totalEnfants = 0;
        for (int i = 0; i < parrains.length; i++) {
            if (parrains[i] != null) {
                totalEnfants += parrains[i].getnbreEnfantsParraines();
            }
        }
        System.out.println("nombre total d'enfants parraines: " + totalEnfants);

        
        System.out.println("\n--- enfants parraines en sixième annee ---");
        for (int i = 0; i < parrains.length; i++) {
            if (parrains[i] != null) {
                Enfant[] mesE = parrains[i].getMesEnfants();
                for (int j = 0; j < parrains[i].getnbreEnfantsParraines(); j++) {
                    if (mesE[j].getClasse().equals("Sixième année")) {
                        mesE[j].afficherInfos();
                    }
                }
            }
        }

        
        double totalVirements = 0;
        for (int i = 0; i < parrains.length; i++) {
            if (parrains[i] instanceof ParrainMensuel) {
                totalVirements += ((ParrainMensuel) parrains[i]).calculerVirementTotal();
            }
        }
        System.out.println("\nMontant total des virements mensuels: " + totalVirements);
    }

}
