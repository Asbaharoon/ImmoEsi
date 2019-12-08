import java.util.Date;

public abstract class Bien {

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
	
	public abstract void afficher();
	public abstract float PrixFinal();
	
	
}
