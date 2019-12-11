import java.util.Date;

public abstract class Habitable extends Bien {

	public Habitable(Proprietaire proprietaire ,boolean meuble, int nbrPieces, String wilaya, float superficie, Transaction transaction,
			int negociabilite, String descriptif, Date dateDajout, String photoUrl, String type, boolean visibilte,
			float prix,float surfaceHabitable) {
		super(proprietaire, wilaya, superficie, transaction, negociabilite, descriptif, dateDajout, photoUrl, type,
				visibilte, prix);
		this.surfaceHabitable = surfaceHabitable;
		this.meuble = meuble;
		this.nbrPieces = nbrPieces;
	}
	private float surfaceHabitable;
	private boolean meuble ;
	private int nbrPieces ;
	@Override
	public  void afficher() { 
	
			super.afficher();
			System.out.println("\n La surface habitable est de : " + surfaceHabitable + " \n Meublé : " + meuble + "\n Le nombres de pieces est de :" + nbrPieces);

	}

	

}
