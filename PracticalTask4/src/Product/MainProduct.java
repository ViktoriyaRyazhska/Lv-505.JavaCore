package Product;

public class MainProduct {

	public static void main(String[] args) {

		Product p1 = new Product("Xlib", 10010, 5);
		Product p2 = new Product("Kovbasa", 50.50, 2);
		Product p3 = new Product("Sosiska", 40, 7);
		Product p4 = new Product("Varenyky", 30, 3);

		System.out.println("Products:" + p1 + " " + p2 + " " + p3 + " " + p4);
		
		System.out.println("The most expensive Price: " + Product.getMaxprice());
		System.out.println("The most expensive Product Name: " + Product.getNameofproductofmaxprice());
		
		System.out.println();
		
		System.out.println("The biggest quantity: " + Product.getMaxquantity());	
		System.out.println("Name of the product with the biggest quantity:" +Product.getNameofbiggestquantity());


	}

}
