
public class ProductTest {

	public static void main(String[] args) {

		String product = "Apples";
		String description = "just the normal fruit";
		double price = 0.75;
		int max = 20;
		
		Product p = new Product(product, description, price, max);
		System.out.println(p.toString());
		System.out.println("Price Each: " + p.getProductPrice() + " Max Quantity: " + p.getMaxQuantity());
	}

}
