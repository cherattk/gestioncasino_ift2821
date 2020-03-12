/**
 * @auteur Cheratt karim
 * @license MIT Licence
 * Derniere mise a jour : 11/03/2020 , jj/mm/aaaa
 */

package app.ift2821.view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class FournisseurView extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String[] HEADER = {"idFournisseur" , "Nom" , "Adresse" , "telephone"};
	
	public static final String[][] DATA = {
			{"id-fournisseur-A" , "Microsoft corporation"  , "800 Boulevard de Maisonneuve East, Montréal, QC H2L 4M8" , "514-123-4567"},
			{"id-fournisseur-B" , "Goole inc" , "1000 Boulevard Michèle-Bohec, Blainville, QC J7C 5L6" , "514-800-5678"},
			{"id-fournisseur-C" , "IBM inc"  , "7575 Boul Henri-Bourassa O, Saint-Laurent, QC H4S 2E2" , "514-700-4561"}
	};
	
	public FournisseurView() {
		super( new BorderLayout());

		//this.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JTable table = new JTable(DATA , HEADER);
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane , BorderLayout.CENTER);
	}

}
