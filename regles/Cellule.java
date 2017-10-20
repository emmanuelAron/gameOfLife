
public class Cellule {

	/***
		author Emmanuel ARON
	
	***/
	private boolean etat;//false = mort , true = vivant
	private int nbVoisins;

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public int getNombreVoisins() {
		return nbVoisins;
	}

	
	
	public int getNbVoisins() {
		System.out.println("toto");
		return nbVoisins;
	}

	public void setNbVoisins(int nbVoisins) {
		this.nbVoisins = nbVoisins;
	}

	public Cellule() {
		super();
	}

	public Cellule(boolean etat, int nbVoisins) {
		super();
		this.etat = etat;
		this.nbVoisins = nbVoisins;
	}
	public Cellule(boolean etat){
		super();
		this.etat = etat;
	}
	@Override
	public String toString() {
		return "etat: "+etat + " ; nombre de voisins: "+nbVoisins;
	}
}
