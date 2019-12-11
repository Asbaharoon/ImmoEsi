
public class Utilisateur extends Agence {
	
	public Utilisateur(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		
	}
	private String username;
	private String password;
	
	public void consulter(Agence a) { 
		for(Bien b : a.getBiens() ) {
			System.out.println(b.getClass());
			System.out.println(b.getTransaction());
		}
	}
	public  void envoyerMessage() { 
		
	}
	public void demanderTransaction() { 
		
	}
	public Bien[] recherche(Critere[] criteres) {
		return null;
		
	
		
	}
	public void visualiser(Bien b) { 
		b.afficher();
	}
	
}
