import java.util.Date;

public  class Bien implements Comparable {
		
	
	public Bien(Proprietaire proprietaire, String wilaya, float superficie, Transaction transaction,
			int negociabilite, String descriptif, Date dateDajout, String photoUrl, String type, boolean visibilte,
			float prix) {
		super();
		this.wilaya = wilaya;
		this.superficie = superficie;
		this.transaction = transaction;
		this.negociabilite = negociabilite;
		this.descriptif = descriptif;
		this.dateDajout = dateDajout;
		this.photoUrl = photoUrl;
		this.type = this.getClass().toString();
		this.visibilte = visibilte;
		this.prix = prix;
	}
	
	private Proprietaire proprietaire;
	private int nbrPieces;
	private String wilaya;
	private float superficie;
	private Transaction transaction;
	private float negociabilite ;
	private String descriptif;
	private Date dateDajout;
	private String photoUrl;
	private String type; // will use instanceof to string to define which type is the good
	private boolean visibilte; //essentiel pour l'archivage
	private float prix;
	private float prixM2;
	
	public void afficher(){ 
		System.out.println("Ce bien est un " +this.getType() +" \n son proprietere est : " + this.getProprietaire() + "\n "
				+ "\n"  + "Status : \n "  + "\n Le nombre de pieces est : " + this.getNbrPieces()
				+ " \n" + " ce bien est situe dans la wilaya de : " + this.getWilaya() + "\n" + " Sa superficie est egale a : " + this.getSuperficie()+ 
				"\n cet article est pour : " + this.getTransaction() + "\n elle negociable de " +this.getNegociabilite() + "DA" + 
				"\n elle a ete ajoute le : " + this.getDateDajout() + "\n un lien vers ses photos + " + this.getPhotoUrl() 
				 + "DA" + "\n status juridique :" + this.getDescriptif()  + "\n ceci est son descriptif : \n" + this.getDescriptif() );
	}
	public double PrixFinal() { 
		double prx = 0;
		if ((transaction == Transaction.VENTE ) || (transaction == Transaction.ECHANGE) )
		{
			if ( prix < 5000000) { 
				if(this.prixM2 < 50000)  {
					prx = (prix + prix * 0.03);
				}
				else { 
					prx =  (prix + prix * 0.035);
				}
			}
			if ((  prix >= 5000000) && ( prix < 15000000) ) { 
				if (this.prixM2 < 50000)  {
					prx =  (prix + prix*1.02);
				}
				else { 
					prx =  (prix + prix*1.025);
				}
			}
			else
			{ 
				if ( prixM2 <70000) { 
					prx =  (prix + prix*0.01);
				}
				
				else { 
					prx =  (prix + prix*0.02);
				}
			}
			
		return prx;
			
			
		}
		if ( transaction == Transaction.LOCATION) { 
			if (superficie < 60 ) {
				if (prixM2 < 50000) {
				prx =  (prix + prix*0.01);
			}
				else { 
					prx =  (prix + prix*0.015);
				}
			}
			if ((superficie >= 60 ) && (superficie<=150)) { 
				if (prixM2 < 50000) { 
					prx =  (prix + prix*0.02);
				}
				else { 
					prx =  (prix + prix*0.015);
				}
			}
			else { 
				if ( prixM2<50000) { 
					prx =  (prix +prix*0.03);
				}
				else { 
					prx =  (prix + prix*0.035);
				}
			}
		}
		return prx;
		
	}
	
	
	public Proprietaire getProprietaire() {
		return proprietaire;
	} 
	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}
	public int getNbrPieces() {
		return nbrPieces;
	}
	public void setNbrPieces(int nbrPieces) {
		this.nbrPieces = nbrPieces;
	}
	public String getWilaya() {
		return wilaya;
	}
	public void setWilaya(String wilaya) {
		this.wilaya = wilaya;
	}
	public float getSuperficie() {
		return superficie;
	}
	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public float getNegociabilite() {
		return negociabilite;
	}
	public void setNegociabilite(float negociabilite2) {
		this.negociabilite = negociabilite2;
	}
	public String getDescriptif() {
		return descriptif;
	}
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	public Date getDateDajout() {
		return dateDajout;
	}
	public void setDateDajout(Date dateDajout) {
		this.dateDajout = dateDajout;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isVisibilte() {
		return visibilte;
	}
	public void setVisibilte(boolean visibilte) {
		this.visibilte = visibilte;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	@Override
		public int compareTo(Object o) { //WARNING !!!! Compare to is manually written and not overriden
			return this.getDateDajout().compareTo(((Bien)o).getDateDajout());
	}


	
	

	
}
