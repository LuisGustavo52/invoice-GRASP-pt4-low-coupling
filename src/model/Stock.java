package model;

import java.util.HashMap;
import java.util.Map;

public class Stock {

	private Map<String, StockItem> stockItems;
	
	public Stock() {
		stockItems = DataBase.getStocks();
	}
	
	public boolean sellItem(String code, int quantity) {
		StockItem item = stockItems.get(code);
		item.decreaseStock(quantity);
		
		if(item.getQuantity()>=0) {
			return true;
		}else {
			return false;
		}
	}

}
