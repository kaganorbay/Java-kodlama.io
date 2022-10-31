package classesWithAttributes;

public class Product {
		
	private	int id;
	private	String name;
	private	String description;
	private	double price;
	private	int stockAmount;
	private	String colors;
	private	String kod;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getColors() {
		return colors;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}
	public String getKod() {
		return this.name.substring(0,2)+id;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}
	

		
}
