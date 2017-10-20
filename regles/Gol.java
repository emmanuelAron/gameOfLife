

public class Gol {

	/***
		author Emmanuel ARON
	
	***/
	Cellule cell ;
	
	Gol(){
		//cell = new Cellule(true);
	}
	Gol(Cellule cell){
		this.cell = cell;
	}
	
	/***
	 * 
	 * @param i : nb de voisins
	 * @param etat : etat initial
	 * @return
	 */
	public boolean etatNouvellePhase(int i,boolean etat) {
		 cell = new Cellule(etat);
		 //on set le nb de voisins de la cellule:
		 cell.setNbVoisins(i);
		 i = cell.getNombreVoisins();
			if(cell.isEtat() == true){//true = vivant
				if(cell.getNombreVoisins() == 0 || cell.getNombreVoisins() == 1){
					cell.setEtat(false);
					System.err.println("0 ou 1 voisins: etat cellule nouvelle phase: "+cell);
					
				}
				if(cell.getNombreVoisins() == 2 || cell.getNombreVoisins() == 3){
					cell.setEtat(true);
					System.err.println("2 ou 3 voisins: etat cellule nouvelle phase: "+cell);
				}
		}
		System.err.println("** etat retourné: "+cell.isEtat());
		return cell.isEtat();
	}
	
	
	
}