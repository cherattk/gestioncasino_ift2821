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


public class TechnicienView extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String[] HEADER = {"id-technicien" , "Nom" , "Adresse" , "telephone"};
	
	public static final String[][] DATA = {
			{"id-tech-1" , "Natasha Romanoff"  , "2900 Boulevard Edouard-Montpetit, Montréal, QC H3T 1J4" , "514-123-4567"},
			{"id-tech-2" , "Stan Lee" , "845 Rue Sherbrooke Ouest, Montréal, QC H3A 0G4" , "514-800-5678"},
			{"id-tech-3" , "Tony Stark"  , "405 Rue Sainte-Catherine Est, Montréal, QC H2L 2C4" , "514-700-4561"}
	};
	
	public TechnicienView() {
		super( new BorderLayout());

		//this.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JTable table = new JTable(DATA , HEADER);
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane , BorderLayout.CENTER);
	}

}
