/**
 * @auteur Cheratt karim
 * @license MIT Licence
 * Derniere mise a jour : 11/03/2020 , jj/mm/aaaa
 */

package app.ift2821.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class ToolPanel extends JToolBar implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8285345829964006196L;
	
	static final String ACTION_CONNECT_DB = "connect_db";
	
	public ToolPanel() {
		
		JButton btnConnect = new JButton();
		ImageIcon imgIcon = new ImageIcon(getClass().getResource("/connect.png"));
		Image image = imgIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH);
		imgIcon = new ImageIcon(newimg);  // transform it back		

		btnConnect.setIcon(imgIcon);
		
		btnConnect.setActionCommand(ACTION_CONNECT_DB);
		btnConnect.addActionListener(this);
		this.add(btnConnect);
		
	}
	
	public void actionPerformed(ActionEvent event) {
		
		Object cmd = event.getActionCommand();
		if(cmd == ACTION_CONNECT_DB) {
			System.out.println("code pour se Connecter a la db");	
		}		
		
	}
}
