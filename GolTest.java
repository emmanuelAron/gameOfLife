import org.junit.Test;

import static org.junit.Assert.*;


public class GolTest {
	/***
		author Emmanuel ARON
	
	***/
	Cellule cell ;
	Gol gol;
	
	/**
	 * -peuplé:
	 * chaque cellule avec 1 ou 0 voisins meurt.(par solitude)
	 * chaque cellule avec 4 ou plus voisins meurt (surpopulation)
	 * chaque cellule avec 2 ou 3 voisins survit
	 * -vide:
	 * chaque cellule vide avec 3 voisins se peuple.
	 * 
	 */
	
	
	
	@Test
	public void cellulePeuplé_avec_0_ou_1_voisin_meurt(){
		
		cell = new Cellule(true);
		gol = new Gol(cell);
		assertEquals(gol.etatNouvellePhase(0,true), false);
		assertEquals(gol.etatNouvellePhase(1,true), false);
	}
	
	/*@Test
	public void celluleVide_avec_3_voisins-se_peuple(){
		
	}*/
	
	
	@Test
	public void cellulePeuplé_avec_2_ou_3_voisin_survit(){
		
		cell = new Cellule(true);
		gol = new Gol(cell);
		assertEquals(gol.etatNouvellePhase(2,true), true);
		assertEquals(gol.etatNouvellePhase(3,true), true);
	}
	
	
	
}
