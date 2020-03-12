/**
 * @auteur Cheratt karim
 * @license MIT Licence
 * Derniere mise a jour : 11/03/2020 , jj/mm/aaaa
 */

package app.ift2821.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JPanel;

import javax.swing.JTabbedPane;

public class CentralPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CentralPanel(){
		super(new BorderLayout());
		
		//this.setPreferredSize(new Dimension(500, 200));
		
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.add(new InstallationView() , "Installation");
		tabbedPane.add(new TechnicienView() , "Technicien");
		tabbedPane.add(new FournisseurView() , "Fournisseur");
		tabbedPane.add(new PersonnelView() , "Personnel");
		tabbedPane.add(new RecetteView() , "Recette");
		tabbedPane.add(new ServiceView() , "Service");
		tabbedPane.add(new AffecterView() , "Affecter");
		
        this.add(tabbedPane, BorderLayout.CENTER);
		
	}
	
}
