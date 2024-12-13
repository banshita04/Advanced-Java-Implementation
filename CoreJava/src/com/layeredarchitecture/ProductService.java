package com.layeredarchitecture;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ProductService {
	ProductRepository pr = new ProductRepository();


	public void setPr(ProductRepository pr) {
		this.pr = pr;
	}

	public List<String> getAllProductNames(){
		List<Product> plist = pr.getAllProducts();

		//List<String> list = plist.stream().map(p->p.getProdName()).collect(Collectors.toList());

		List<String> ls = pr.getAllProducts().stream().map(p->p.getProdName()).
				collect(Collectors.toList());
		return ls;	
	}

	public Map<String, Float> getProductNameAndPriceSortByPrice(){
		//use toMap( , ) of Stream
		List<Product> plist = pr.getAllProducts();
		Map<String, Float> m = plist.stream().sorted((p,q)->p.getPrice()<q.getPrice()?1:-1).
				collect(Collectors.toMap(p->p.getProdName(),q->q.getPrice()));
		return m;
	}
	public Product getCheapestProduct() {
		List<Product> plist = pr.getAllProducts();
		return plist.stream().min((p,q)->p.getPrice()<q.getPrice()?-1:1).get();
	}
	public long getCountProductByRating(float rating) {
		List<Product> plist = pr.getAllProducts();
		long c = plist.stream().filter(p->p.getRatings()==rating).count();
		return c;
	}
	public float totalCost() {
		List<Product> plist = pr.getAllProducts();
		return (float) plist.stream().mapToDouble(p->p.getPrice()).sum();
	}
	public List<Product> searchProductByName(String name){
		List<Product> plist = pr.getAllProducts();
		return plist.stream().filter(p->p.getProdName().equals(name)).collect(Collectors.toList());

	}
	public List<Product> getTopThreeCostliestProducts(){
		List<Product> plist = pr.getAllProducts();
		//		plist.stream().sorted((p,q)->p.getPrice().compareTo(q.getPrice())).limit(3).collect(Collectors.toList()));
		return plist.stream().sorted((p,q)->p.getPrice()>q.getPrice()?-1:1).
				limit(3).collect(Collectors.toList());
	}
}
