public class cv {
	
	public static void main() {
		System.out.println("Bienvenue chez Barette! \n");
		
		affiche();
	}
	
	public static String affiche(){
		String nom = "Baho ", 
				prenom = "Adam ", 
				Formation = "Informaticien ", 
				Experience = "Aucune ", 
				Competences = "Diverses ",
				Attentes = "Pass� le cours � 100% ";
				
			
		String cv = "\n" + nom + prenom + Formation + Experience + Competences + Attentes;
		
		return cv;
	}
	
}

