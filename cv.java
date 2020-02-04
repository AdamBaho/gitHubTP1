public class cv {
	
	public static void main() {
		System.out.print("Bienvenue chez Barette! \n");
		
		affiche();
	}
	
	public static String affiche(){
		String nom = "Baho ", 
			prenom = "Adam ", 
			Formation = "Informaticien ", 
			Experience = "Aucune ", 
			Competences = "Diverses ",
			Attentes = "Passé le cours à 100% ";
				
		String cv = "\n" + "Nom : " + nom + "\n"
				 + "Prénom : " + prenom + "\n"
				 + "Formation : " + Formation + "\n"
				 + "Expérience(s) : " + Experience + "\n"
				 + "Competence(s) : " + Competences + "\n"
				 + "Attentes : " + Attentes; + "\n"

		return cv;
	}
	
}

