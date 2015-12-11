package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.ShopService;
import view.Cashier;
import view.Customer;

public class Controller {
	
	ShopService shop;
	Cashier cashierui;
	Customer customerui;
	SQL_Controller sqlController;
	
	public Controller(){
		shop= new ShopService();
		sqlController=new SQL_Controller();
		cashierui = new Cashier();
		this.cashierui.addPriceListener(new CalculateListener());
		customerui = new Customer();
	}

	public String getTotalPriceOverview() {
		return shop.getTotalPriceOverview();		
	}
class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
				
				try{
					shop.invoiceListAddProduct(cashierui.getQuantity(),sqlController.sql.getProduct(cashierui.getId()));
					cashierui.setPrice(shop.getTotalPriceOverview());
				
				}

				catch(NumberFormatException ex){
					cashierui.displayErrorMessage("This input is not a number, hence it is not valid.");
					
				} catch(IllegalArgumentException ie){
					System.out.println("illegal arg");
					cashierui.displayErrorMessage(ie.getMessage());
				} catch(Exception ex){
					System.out.println("exception e");
					cashierui.displayErrorMessage(ex.getMessage());
				}
				
			}
		
	}
}