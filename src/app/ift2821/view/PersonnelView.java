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


public class PersonnelView extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String[] HEADER = {"id-Employe" , "Nom" , "Categorie"};
	
	public static final String[][] DATA = {
			{"id-employe-1" , "Clark Kent"  , "Categorie employe 1"},
			{"id-employe-2" , "Lex Luthor" , "Categorie Employe 2"},
			{"id-employe-3" , "Bruce Wayne"  , "Categorie 3"}
	};
	
	public PersonnelView() {
		super( new BorderLayout());

		//this.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JTable table = new JTable(DATA , HEADER);
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane , BorderLayout.CENTER);
	}

}
