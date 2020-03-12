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


public class ServiceView extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 // format data : jj/mm/aaaa
	public static final String[] HEADER = {"id-technicien" , "id-installation", "Date" , "Cout ($cad)"};
	
	public static final String[][] DATA = {
			{"id-tech-1" , "id-insta-1"  , "17/05/2015" , "300.25"},
			{"id-tech-2" , "id-insta-2" , "15/05/2013" , "545.23"},
			{"id-tech-3" , "id-insta-3"  , "03/13/1999" , "154.45"},
			{"id-tech-1" , "id-insta-4"  , "28/07/1995" , "300.25"}
	};
	
	public ServiceView() {
		super( new BorderLayout());

		//this.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JTable table = new JTable(DATA , HEADER);
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane , BorderLayout.CENTER);
	}

}
