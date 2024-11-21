package model;

import java.util.ArrayList;
import java.util.List;

public class SalesManager {
	Stock stock;
	Sale sale;	

	public SalesManager(){
		this.sale = new Sale();
		this.stock = new Stock();
	}	

	public String addSaleItem(String code, int quantity){
		if(stock.sellItem(code, quantity)) {
			sale.createSaleItem(code, quantity);
			return "Item de venda adicionado com sucesso!";
		}else {
			return "Não há estoque para essa quantia de itens!";
		}
	}
	
	public void setPaymentMethod(String paymentMethod) {
		sale.setPaymentMethod(paymentMethod);
	}

	public List<String> getInvoice(){
		List<String> invoice = new ArrayList<>();
		
		for (String item : sale.getItems())
			invoice.add(item);
		
		invoice.add("Total: "+ sale.getTotal());
		invoice.add("Forma de Pagamento: "+ sale.getPaymentMethod());
		invoice.add("Valor a ser pago: "+ sale.getFinalPrice());
		
		return invoice;
	}
}