import java.util.*;
public class Agence {
	
	public Agence () {
		
	}
	private ArrayList<Bien> biens = new ArrayList<Bien>();
	private static int NbBien ;
	private ArrayList<Proprietaire> proprietaires = new ArrayList<Proprietaire>();
	
	public void insererBien(Agence a , Bien b ) { 
		a.getBiens().add(b);
		a.proprietaires.add(b.getProprietaire());
		this.NbBien ++ ;
	}
	
	public float calculerPrix(Bien b ) {
		return 0;
		
	}
	public void trier (Critere c) {
		
	}
	public void visualiser(Bien b) { 
		System.out.println(" ce bien est de type :" + b.getClass());
	}
	public void archiver(Bien b) { 
		b.setVisibilte(false);
	}
	public void supprimer(Bien b) {
		getBiens().remove(b);
	}
	public void afficher_prop(Proprietaire p ) { //affiche tous les biens d'un proprietaire donne
		for(Bien b : this.getBiens()) { 
			if(b.getProprietaire() == p) { 
				System.out.println(b.getProprietaire().getBiens());
			}
		}
	}
	public void afficher() { 
		for(Bien b : this.getBiens()) { 
			System.out.println(b);
		}
		
	}
	public void modifier_bien ( Bien b) { 
		System.out.println("what do you want to change in your article ?\n");
		// TODO sysout list of available modifications
		System.out.println("1 pour modifier la wilaya");
		System.out.println("2 pour modifier le nombre de pieces");
		System.out.println("3 pour modifier le proprietaire");//will throw an exception if owner doesnt exist
		System.out.println("4  pour modifier la superficie");
		System.out.println("5 pour modifier la type de la transaction");
		System.out.println("6 pour modifier la negociabilite");
		System.out.println("7 pour modifier le  descriptif");
		System.out.println("11 pour modifier le prix");
		System.out.println("9 pour modifier l'URL des photos");
		
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		int entier;
		do { 
			switch(choice) {
			case "1" :
				System.out.println("Taper la nouvelle wilaya ");
				 scan = new Scanner(System.in);
				 choice =  scan.nextLine();
				b.setWilaya(choice);
				break;
			case "2":
				System.out.println("Taper le nouveau nombre de pieces ");
				scan = new Scanner(System.in);
				entier =  scan.nextInt();
				b.setNbrPieces(entier);
				break;
			case "3" : 
				
				System.out.println("donner les nouvelles coordonnees du proprietaire ");
				System.out.println("Nom : ");
				String nom = scan.nextLine();
				System.out.println("Prenom : ");
				String prenom = scan.nextLine();
				System.out.println(" Email :");
				String email = scan.nextLine();
				System.out.println("Telephone : ");
				String tel = scan.nextLine();
				System.out.println("Adresse : ");
				String adr = scan.nextLine();
				ArrayList<Bien> biens = null ;
				biens.add(b);
				Proprietaire p = new Proprietaire(nom,prenom,email,tel,adr,biens) ;
				b.setProprietaire(p);
				break;
			case "4" : 
				System.out.println("Donner la nouvelle superficie");
				float superficie = scan.nextFloat();
				b.setSuperficie(superficie);
				break;
			case "5":
				System.out.println("Donner le nouveau type de transaction :");
				Transaction transaction = Transaction.valueOf(scan.next().toUpperCase());
				b.setTransaction(transaction);
				break;
			case "6" : 
				System.out.println("Taper le nouveau ttaux de negociabilite  :");
				float negociabilite = scan.nextFloat();
				b.setNegociabilite(negociabilite);
				break;
			case "7" :
				System.out.println("Rediger le nouveau descriptif de votre article : ");
				String descriptif = scan.nextLine();
				b.setDescriptif(descriptif);
				break;
			case "8" : 
				System.out.println("tapper le nouveau prix de votre article : ");
				float prix = scan.nextFloat();
				b.setPrix(prix);
				break;
			case "9" : 
				System.out.println("veuillez entrer le nouveau url de vos photos :");
				String photos = scan.nextLine();
				b.setPhotoUrl(photos);
				break;
				
			}
			
		}while(choice != "0");
	}

	public ArrayList<Bien> getBiens() {
		return biens;
	}

	public void setBiens(ArrayList<Bien> biens) {
		this.biens = biens;
	}

}
