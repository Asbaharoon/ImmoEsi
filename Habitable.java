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
	
			System.out.println("Ce bien est un " +this.getType() +" \n son proprietere est : " + this.getProprietaire() + "\n "
					+ "\n"  + "Status : \n " + " meuble : " + this.meuble + "\n Le nombre de pieces est : " + this.getNbrPieces()
					+ " \n" + " ce bien est situe dans la wilaya de : " + this.getWilaya() + "\n" + " Sa superficie est egale a : " + this.getSuperficie()+ 
					"\n cet article est pour : " + this.getTransaction() + "\n elle negociable de " + this.getNegociabilite() + "DA" +  "\n ceci est son descriptif : \n" + this.getDescriptif()
					+"\n elle a ete ajoute le : " + this.getDateDajout() + "\n un liean vers ses photos + " + this.getPhotoUrl() 
					+ "Le prix est de" + this.getPrix() + "DA" );

	}

	@Override
	public abstract float PrixFinal();

}
