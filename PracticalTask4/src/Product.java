
public class Product {

	private String name;
	private double price;
	private int quantity;
	
	private static double maxprice=0;
	private static String nameofproductofmaxprice;
	private static int maxquantity;
	
	private static String nameofbiggestquantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		if(price>maxprice) {
			maxprice=price;
			nameofproductofmaxprice=name;
		}
		if(quantity>maxquantity) {
			maxquantity=quantity;
			nameofbiggestquantity=name;
		}
	}
	
	public Product() {}
	
	
	
	
	public static double getMaxprice() {
		return maxprice;
	}

	public static String getNameofproductofmaxprice() {
		return nameofproductofmaxprice;
	}

	public static int getMaxquantity() {
		return maxquantity;
	}

	public static String getNameofbiggestquantity() {
		return nameofbiggestquantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	};
	
	
	
	
	
}
