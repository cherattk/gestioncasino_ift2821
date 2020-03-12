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


public class AffecterView extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 // format data : jj/mm/aaaa
	public static final String[] HEADER = {"id-employe" , "id-installation", "Date"};
	
	public static final String[][] DATA = {
			{"id-employe-1" , "id-insta-1"  , "17/05/2015"},
			{"id-employe-2" , "id-insta-2" , "15/05/2013"},
			{"id-employe-3" , "id-insta-3"  , "03/13/1999"},
			{"id-employe-1" , "id-insta-4"  , "28/07/1995"}
	};
	
	public AffecterView() {
		super( new BorderLayout());

		//this.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JTable table = new JTable(DATA , HEADER);
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane , BorderLayout.CENTER);
	}

}
