package model;

public class StockItem {
	private Product product;
	private int quantity;
	
	public StockItem(String product, int quantity){
		this.quantity = quantity;
		String productData[] = DataBase.selectProduct(product);
		
		this.product = new Product();
		this.product.setDescription(productData[0]);
		this.product.setPrice(Double.parseDouble(productData[1]));
	}
	
	public void increaseStock(int valueToIncrease) {
		this.quantity += valueToIncrease;
	}
	
	public void decreaseStock(int valueToDecrease) {
		this.quantity -= valueToDecrease;
	}

	public int getQuantity() {
		return quantity;
	}
}
