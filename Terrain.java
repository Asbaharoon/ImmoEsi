import java.util.Date;

public class Terrain extends Bien{

	public Terrain(Proprietaire proprietaire, boolean meuble, int nbrPieces, String wilaya, float superficie, Transaction transaction,
			int negociabilite,  Date dateDajout, String photoUrl, boolean visibilte,
			float prix,String descriptif, String statusJuridique, int facades) {
		super(proprietaire, wilaya, superficie, transaction, negociabilite, descriptif, dateDajout, photoUrl,
				 statusJuridique, visibilte, prix);
		this.statusJuridique = statusJuridique;
		this.facades = facades;
		
	}
	
	private String statusJuridique ;
	private int facades;
	
	public void afficher() { 
		super.afficher();
		System.out.println("\n Ce Terrain a comme statusJuridique :" + statusJuridique +  "\nIl a : " + facades + " facades");
	}
	
	@Override
	public double PrixFinal() {
		if(super.getTransaction()==Transaction.VENTE) {
			
		if (facades >= 1) {
		return (super.PrixFinal() + 0.05 * facades);
	}
		else {
			return super.PrixFinal();
		}
	}
		else { 
			return 0 ;
		}
	}
}
