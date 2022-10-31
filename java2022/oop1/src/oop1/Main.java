package oop1;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("A Coffea Machine");
		product.setDiscount(7);
		product.setUnitPrice(7500);
		product.setUnitsInStock(15);
		product.setImageUrl("image1.jpg");	
		//System.out.println(product.name);
		
		Product product1 = new Product();
		product1.setName("B Coffea Machine");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(15);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();
		product2.setName("C Coffea Machine");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(15);
		product2.setImageUrl("image1.jpg");
		
		Product[] products = {product, product1,product2};
		
		System.out.println("<ul>");
		for (Product product3 : products) {
			System.out.println("<li>"+product3.getName()+"</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(0);
		individualCustomer.setPhone("05436490767");
		individualCustomer.setCustomerNumber("123456789");
		individualCustomer.setFirstName("Kağan");
		individualCustomer.setLastName("Orbay");
		
		CorporateCustomer corporateCustomer= new CorporateCustomer();
		corporateCustomer.setId(1);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("987654321");
		corporateCustomer.setPhone("02326549878");
		
		Customer[] customers= {individualCustomer,corporateCustomer};
	}

	
}
