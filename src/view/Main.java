package view;

import model.SalesManager;

public class Main {
	public static void main(String[] args) {
		SalesManager sale = new SalesManager();
		System.out.println(sale.addSaleItem("at", 2));
		System.out.println(sale.addSaleItem("ff", 1));
		System.out.println(sale.addSaleItem("msa", 4));
		
		sale.setPaymentMethod("cc");
		
		for (String item : sale.getInvoice())
			System.out.println(item);
		
	}
	
}
