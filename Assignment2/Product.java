
public final class Product {
	private final String productName;
	private final String productDescription;
	private final double productPrice;
	private final int maxQuantity;
	
	Product(String name, String description, double price, int maxQ) {
		this.productName = name;
		this.productDescription = description;
		this.productPrice = price;
		this.maxQuantity = maxQ;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public int getMaxQuantity() {
		return maxQuantity;
	}

	public String toString() {
		return productName + " | " + productDescription;
	}
}
