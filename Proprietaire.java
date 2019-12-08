import java.util.ArrayList;

public class Proprietaire {
 public ArrayList<Bien> getBiens() {
		return biens;
	}

	public void setBiens(ArrayList<Bien> biens) {
		this.biens = biens;
	}

public Proprietaire(String nom, String prenom, String email, String tel, String adr, ArrayList<Bien> biens) {
	this.nom = nom;
	this.prenom = prenom;;
	this.email  = email; 
	this.tel = tel;
	this.adresse = adr;
	this.biens = biens;
	 
 }
 private String  nom;
 private String prenom;
 private String email;
 private String tel;
 private String adresse;
 private ArrayList<Bien> biens = new ArrayList<Bien>();
 
 public void ajouter_Bien(Bien b) { 
	 this.biens.add(b);
 }

}
