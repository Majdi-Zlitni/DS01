package principale;

public class Chercheur {
	String nom;
	String prenom;
	int numOrdinateur;
	
	public Chercheur (String nom, String prenom, int numOrdinateur) {
		
		this.nom=nom;
		this.prenom=prenom;
		this.numOrdinateur=numOrdinateur;
	}
	public void affiche( ){
		System.out.println("Le nom de chercheur est:"+nom);
		System.out.println("Le prenom de chercheur est:"+prenom);
		System.out.println("le numero d'ordinateur de"+nom+" "+prenom+" est "+ numOrdinateur);
		
	}
	public void equals(Chercheur c) {
		if (this.nom==c.nom & this.prenom==c.prenom & this.numOrdinateur==c.numOrdinateur) {
			System.out.println("les deux chercheur sont identique");
			}
		
	}
	
	
}
