import java.util.Date;

public class Appartement extends Habitable {
	public Appartement(Proprietaire proprietaire,boolean meuble, int nbrPieces, String wilaya, float superficie, Transaction transaction,
			int negociabilite, String descriptif, Date dateDajout, String photoUrl, String type, boolean visibilte,
			float prix, int etage, boolean dispoAscenseur, TypeApp natureApp) {
		super(proprietaire, meuble, nbrPieces, wilaya, superficie, transaction, negociabilite, descriptif, dateDajout, photoUrl, type,
				visibilte, prix, prix);
		this.etage = etage;
		this.dispoAscenseur = dispoAscenseur;
		this.NatureApp = natureApp;
	
	}

	private int etage ;
	private boolean dispoAscenseur;
	private TypeApp NatureApp;
	
	public void afficher() { 
		super.afficher();
		System.out.println(" \n ce bien a " + this.etage + "etages"  + "\n Ascenceur : " + this.dispoAscenseur + "\n cet appartement est un : " + this.NatureApp  );
	}

	@Override
	public float PrixFinal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
