import java.util.Date;

public class Maison extends Habitable{

	
	public Maison(Proprietaire proprietaire, boolean meuble, int nbrPieces, String wilaya, float superficie, Transaction transaction,
			int negociabilite, String descriptif, Date dateDajout, String photoUrl, String type, boolean visibilte,
			float prix, int nbretages, boolean dispoGarage, boolean dispoJardin, boolean dispoPiscine,
			boolean superficieHabitable) {
		super(proprietaire, meuble, nbrPieces, wilaya, superficie, transaction, negociabilite, descriptif, dateDajout, photoUrl, type,
				visibilte, prix, prix);

		this.nbretages = nbretages;
		this.dispoGarage = dispoGarage;
		this.dispoJardin = dispoJardin;
		this.dispoPiscine = dispoPiscine;
		
	}
	private int nbretages;
	private int nbrPieces;
	private boolean dispoGarage;
	private boolean dispoJardin;
	private boolean dispoPiscine;
	private boolean superficieHabitable;
	
	
	@Override
			
	public void afficher () { 
		super.afficher();
		System.out.println("\n son nombre d'etages est de " +this.nbretages + " etages" 
		+ "\n Garage : " + this.dispoGarage + "\n Jardin : " + this.dispoJardin + "\n Piscine : " + this.dispoPiscine + 
		"sa superficie habitable est de :" + this.superficieHabitable);
	}

	@Override
	public double PrixFinal() {
		
		if (super.getTransaction() == Transaction.VENTE)  {
			
		if ( dispoGarage || dispoPiscine || dispoJardin ) { 
			
			return (super.PrixFinal() + 0.05 *super.getPrix());
		}
		else { 
			return super.PrixFinal();
		}
	}
		if(super.getTransaction() == Transaction.LOCATION) { 
			if(dispoPiscine) { 
				return (super.PrixFinal() + 50000);
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
