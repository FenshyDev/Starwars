package view;
import javax.swing.*;
import java.awt.event.ActionListener;
public class Cashier extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField productId  = new JTextField(5);
	private JLabel productLabel = new JLabel("Product: ");
	private JTextField quantity = new JTextField(2);
	private JLabel quantityLabel = new JLabel("Quantity: ");
	private JTextField price = new JTextField(5);
	private JLabel pay = new JLabel("To pay: ");
	private JButton addButton = new JButton("Add");
	
	public Cashier(){
		this.setTitle("Cashier View");
		JPanel panel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		price.setEditable(false);
		quantity.setText("1");
		panel.add(productLabel);
		panel.add(productId);
		panel.add(quantityLabel);
		panel.add(quantity);
		panel.add(addButton);
		panel.add(pay);
		panel.add(price);
		this.setVisible(true);
		this.add(panel);
		this.pack();
		
	}
	public String getId(){
		return productId.getText();
	}
	public int getQuantity(){
	    return Integer.parseInt(quantity.getText());
	}
	public double getPrice(){
		return Double.parseDouble(price.getText());
	}
	
	public void setPrice(String str ){
		price.setText(str);
	}
	
	public void addPriceListener(ActionListener listenForAddButton){
		addButton.addActionListener(listenForAddButton);
	}
	public void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
