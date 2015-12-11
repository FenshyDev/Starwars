package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Customer extends JFrame {

	/**
	 * Werkt nog niet volledig juist, zou de prijs van de kassa moeten laten zien, maar kan dit nog niet.
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField price = new JTextField(5);
	private JLabel pay = new JLabel("To pay: ");
	
	public Customer(){
		this.setTitle("Customer View");
		JPanel panel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		price.setEditable(false);
		panel.add(pay);
		panel.add(price);
		this.add(panel);
		this.pack();
	}

}
