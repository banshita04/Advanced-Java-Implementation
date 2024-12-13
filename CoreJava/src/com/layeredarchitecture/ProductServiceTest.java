package com.layeredarchitecture;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import com.layeredarchitecture.Product;
import com.layeredarchitecture.ProductRepository;
import com.layeredarchitecture.ProductService;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class ProductServiceTest {
	@Mock //testing framework create the productRepository here
	private static ProductRepository prodRepo;
	List<Product> plist=new ArrayList<>();
	@BeforeEach
	void init() {
		Product p1=new Product(101, "Chair", 10000, 4.5f);
		Product p2=new Product(102, "Bottle", 500, 4.7f);
		Product p3=new Product(103, "Table", 10000, 4.5f);
		Product p4=new Product(104, "Diary",  550,4.4f);
		Product p5=new Product(105, "Pen", 100, 4.2f);
		Product p6=new Product(106, "Lunch Box", 600, 4.1f);
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		plist.add(p5);
		plist.add(p6);
	}
	@Test
	void testCheapestProduct() {
		ProductService service=new ProductService();
		service.setPr(prodRepo); //stored the mock
		//PRE-CONDITION
		when(prodRepo.getAllProducts()).thenReturn(plist);
		
		Product p=service.getCheapestProduct();
		assertEquals("Pen", p.getProdName());
		verify(prodRepo,times(1)).getAllProducts();
	}
}


