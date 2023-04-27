package idcard;

import java.util.ArrayList;
import java.util.List;

import framework.Factory;
import framework.Product;

public class TvFactory extends Factory {

	List<Product> productList = new ArrayList<>();

	public List<Product> getProductList() {
		return productList;
	}
	@Override
	protected Product createProduct(String owner) {
		return new Tv(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		productList.add(product);
	}
}
