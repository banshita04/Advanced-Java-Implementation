package lambdaexpressions.chatgpt;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductMain {
	public static void main(String[] args) {
		List<Product> products = List.of(
				new Product("Laptop", "Electronics", 999.99),
			    new Product("Smartphone", "Electronics", 499.99),
			    new Product("Headphones", "Electronics", 89.99),
			    new Product("T-shirt", "Clothing", 19.99),
			    new Product("Jeans", "Clothing", 49.99),
			    new Product("Blender", "Home Appliances", 99.99),
			    new Product("Microwave", "Home Appliances", 150.00)
				);
		
		Map<String, Long> productMap = getProductCOuntByCategory(products);
		
		for(Map.Entry<String, Long> entry : productMap.entrySet()) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
		
	}
	public static Map<String, Long> getProductCOuntByCategory(List<Product> productList){
		
		return productList
		.stream()
		.filter(p->p.getPrice()>100)
		.collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));
		
	}
}
