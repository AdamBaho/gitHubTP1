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
			Attentes = "Pass� le cours � 100% ";
				
		String cv = "\n" + "Nom : " + nom + "\n"
				 + "Pr�nom : " + prenom + "\n"
				 + "Formation : " + Formation + "\n"
				 + "Exp�rience(s) : " + Experience + "\n"
				 + "Competence(s) : " + Competences + "\n"
				 + "Attentes : " + Attentes; + "\n"

		return cv;
	}
	
}

