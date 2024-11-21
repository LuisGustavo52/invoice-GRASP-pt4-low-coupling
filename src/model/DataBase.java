package model;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
	private static Map<String, String[]> products = 
			new HashMap<String, String[]>();
	
	private static Map<String, PaymentMethod> payments= 
			new HashMap<String, PaymentMethod>();
	
	private static Map<String, StockItem> stocks= 
			new HashMap<String, StockItem>();
					
	static {
		products.put("at", new String[] {"Arroz Tatiana" , "30"});
		products.put("ff", new String[] {"Feijão Fejó" , "20"});
		products.put("msa", new String[] {"Macarrão Santa Amália" , "15"});
		
		CreditCard creditCard1 = new CreditCard(5.0);
		DebitCard debitCard1 = new DebitCard(0.0);
		Cash cash1 = new Cash (5.0);
		
		payments.put("cc", creditCard1);
		payments.put("dc", debitCard1 );
		payments.put("c", cash1);
		
		StockItem riceStock = new StockItem("at", 100);
		StockItem beansStock = new StockItem("ff", 20);
		StockItem pastaStock = new StockItem("msa", 5);
		
		stocks.put("at", riceStock);
		stocks.put("ff", beansStock);
		stocks.put("msa", pastaStock);
	}
	
	public static String[] selectProduct(String code) {
		return products.get(code);
	}
	
	public static PaymentMethod selectPayment(String code) {
		return payments.get(code);
	}
	
	public static Map<String, StockItem> getStocks() {
		return new HashMap<String, StockItem>(stocks);
	}
	
}
