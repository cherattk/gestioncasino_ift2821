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


public class RecetteView extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 // format data ==> jj/mm/aaaa
	 // format heure ==> heure:minutes:secondes
	
	public static final String[] HEADER = {"id-installation" , "Date", "Heure" , "Montant ($cad)"};
	
	public static final String[][] DATA = {
			{"id-insta-1" , "17/05/2020"  , "08:22:23" , "8000.25"},
			{"id-insta-2" , "17/05/2020" , "23:30:01" , "5345.23"},
			{"id-insta-3" , "22/09/2017"  , "23:55:36" , "9654.45"},
			{"id-insta-4" , "29/05/2013"  , "13:22:03" , "7524.23"}
	};
	
	public RecetteView() {
		super( new BorderLayout());

		//this.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JTable table = new JTable(DATA , HEADER);
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane , BorderLayout.CENTER);
	}

}
