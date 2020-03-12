/**
 * @auteur Cheratt karim
 * @license MIT Licence
 * Derniere mise a jour : 11/03/2020 , jj/mm/aaaa
 */

package app.ift2821.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class MainWindow{

	
	/**
	 * Initialize the contents of the app.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void initialize() 
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		
		// main window
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(1024, 700);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPan = new JPanel(new BorderLayout());
		mainPan.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		
		
		ToolPanel toolPanel = new ToolPanel();
		mainPan.add(toolPanel ,  BorderLayout.NORTH);
		
		// ==================================================================
		// entity content		
		
		CentralPanel cPanel = new CentralPanel();	    
		mainPan.add(cPanel , BorderLayout.CENTER);
		
		
		mainFrame.getContentPane().add(mainPan);
		mainFrame.setVisible(true);
	}

}
