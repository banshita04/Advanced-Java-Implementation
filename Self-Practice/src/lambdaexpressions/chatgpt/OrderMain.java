package lambdaexpressions.chatgpt;

import java.util.List;
import java.util.stream.Collectors;

public class OrderMain {
	public static void main(String[] args) {
		List<Order> orderList = List.of(
				new Order(1, "Alice", 75.0),
			    new Order(2, "Bob", 45.0),
			    new Order(3, "Charlie", 150.0),
			    new Order(4, "David", 20.0),
			    new Order(5, "Eve", 100.0)
				);
		
		List<Integer> filteredOrder = getFilteredOrderIds(orderList);
		System.out.println(filteredOrder);
		
	}
	public static List<Integer> getFilteredOrderIds(List<Order> orderList){
		return orderList
		.stream()
		.filter(o->o.getOrderAmount()>50)
		.sorted((o1,o2)->Double.compare(o1.getOrderAmount(), o2.getOrderAmount()))
		.map(Order::getOrderId)
		.collect(Collectors.toList());
		
	}
}
