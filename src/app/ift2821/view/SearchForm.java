/**
 * @auteur Cheratt karim
 * @license MIT Licence
 * Derniere mise a jour : 11/03/2020 , jj/mm/aaaa
 */

package app.ift2821.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class SearchForm extends Box implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	
	public SearchForm(String formName) {
		super(BoxLayout.X_AXIS);
		
//		this.setBorder(new LineBorder(Color.GREEN));
		this.setBackground(Color.RED);
		
		JLabel lblNewLabel = new JLabel(formName);
		this.add(lblNewLabel);
		
		JTextField textField = new JTextField();
		this.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.setActionCommand("PUSH_BTN");
		btnNewButton.addActionListener(this);
		this.add(btnNewButton);
		
	}
	
	public void actionPerformed(ActionEvent event) {
		
		String cmd = event.getActionCommand();
		switch (cmd) {
		case "PUSH_BTN":
			System.out.println("clicked button");
			System.out.printf("push value : %s " , this.textField.getText());
			break;

		default:
			break;
		}
		
	}
}
