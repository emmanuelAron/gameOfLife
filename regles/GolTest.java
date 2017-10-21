package regles;
import org.junit.Test;

import static org.junit.Assert.*;


public class GolTest {
	/***
		author Emmanuel ARON
	
	***/
	Cellule cell ;
	Gol gol;
	
	/**
	 * -peuplee:
	 * chaque cellule vivante avec 1 ou 0 voisins meurt.(par solitude)
	 * chaque cellule vivante avec 4 voisins ou plus meurt (surpopulation)
	 * chaque cellule vivante avec 2 ou 3 voisins survit
	 * -vide:
	 * chaque cellule vide avec 3 voisins se peuple.
	 * 
	 */
	
	@Test
	public void cellulePeuple_avec_0_ou_1_voisin_meurt(){
		
		cell = new Cellule(true);
		gol = new Gol(cell);
		assertEquals(gol.etatNouvellePhase(0,true), false);
		assertEquals(gol.etatNouvellePhase(1,true), false);
	}
	@Test
	public void cellulePeuple_avec_4_voisins_ou_plus_meurt(){
		cell = new Cellule(true);
		gol = new Gol(cell);
		assertEquals(gol.etatNouvellePhase(4,true), false);
	}
	
	@Test
	public void celluleVideAvec3voisinsSePeuple(){
		cell = new Cellule(false);
		gol = new Gol(cell);
		assertEquals(gol.etatNouvellePhase(3,false), true);
	}
	
	@Test
	public void cellulePeuple_avec_2_ou_3_voisin_survit(){
		
		cell = new Cellule(true);
		gol = new Gol(cell);
		assertEquals(gol.etatNouvellePhase(2,true), true);
		assertEquals(gol.etatNouvellePhase(3,true), true);
	}
	
}
