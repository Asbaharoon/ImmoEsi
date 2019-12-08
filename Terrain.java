import java.util.Date;

public class Terrain extends Bien{

	public Terrain(Proprietaire proprietaire, boolean meuble, int nbrPieces, String wilaya, float superficie, Transaction transaction,
			int negociabilite,  Date dateDajout, String photoUrl, boolean visibilte,
			float prix,String descriptif, String statusJuridique) {
		super(proprietaire, wilaya, superficie, transaction, negociabilite, descriptif, dateDajout, photoUrl,
				 statusJuridique, visibilte, prix);
		this.statusJuridique = statusJuridique;
		
	}
	
	private String statusJuridique ;
	
	
	public void afficher() { 
		System.out.println("Ce bien est un " +this.getType() +" \n son proprietere est : " + this.getProprietaire() + "\n "
				+ "\n"  + "Status : \n "  + "\n Le nombre de pieces est : " + this.getNbrPieces()
				+ " \n" + " ce bien est situe dans la wilaya de : " + this.getWilaya() + "\n" + " Sa superficie est egale a : " + this.getSuperficie()+ 
				"\n cet article est pour : " + this.getTransaction() + "\n elle negociable de " +this.getNegociabilite() + "DA" + 
				"\n elle a ete ajoute le : " + this.getDateDajout() + "\n un liean vers ses photos + " + this.getPhotoUrl() 
				+ "Le prix est de" + this.getPrix() + "DA" + "\n status juridique :" + this.getDescriptif()  + "\n ceci est son descriptif : \n" + this.getDescriptif() );
	}
	
	@Override
	public float PrixFinal() {
		// TODO Auto-generated method stub
		return 0;
	}
}
