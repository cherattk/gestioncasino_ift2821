/**
 * @auteur Cheratt karim
 * @license MIT Licence
 * Derniere mise a jour : 11/03/2020 , jj/mm/aaaa
 */

package app.ift2821.view;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class InstallationView extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String[] HEADER = {"idInstallation" , "idTechnicien" , "idFournisseur" , "Cout ($CAD)" , "nom_installation" , "categorie" , "date_achat"};
	
	public static final String[][] DATA = {
			{"id-insta-1" , "id-tech-1"  , "id-fournisseur-A" , "53050.00" , "super nom de la machine 1" , "machine categorie 1" , "25/03/2020"},
			{"id-insta-2" , "id-tech-2"  , "id-fournisseur-B" , "50000.13" , "super nom de la machine 2" , "machine categorie 12" , "13/05/2019"},
			{"id-insta-3" , "id-tech-3"  , "id-fournisseur-C" , "75000.12" , "super nom de la machine 3" , "machine categorie 25" , "01/12/2018"},
			{"id-insta-4" , "id-tech-3"  , "id-fournisseur-C" , "45000.75" , "super nom de la machine 4" , "machine categorie 5" , "03/09/2015"}
	};
	
	public InstallationView() {
		super( new BorderLayout());

		//this.setBorder(BorderFactory.createLineBorder(Color.black));
		
		// =================================================

		Box searchForm = new SearchForm("Filter Installation");		
		this.add(searchForm , BorderLayout.NORTH);
		
		// =================================================
		JTable table = new JTable(DATA , HEADER);
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		this.add(scrollPane , BorderLayout.CENTER);
	}

}
