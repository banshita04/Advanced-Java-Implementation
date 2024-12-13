package practicesprint1;

public interface NumberCategory {
	public boolean checkNumberCategory(int number1, int number2);

}

//(num1,num2)->{
//	int sum1 = 0, sum2 = 0;
//	for(int i = 1; i < num1/2; i++){
//		if(num1%i == 0)
//			sum1+=i;
//		}
//	for(int i =1; i < num2/2; i++) {
//		if(num2%i == 0)
//			sum2+=i;
//	}
//	
//	if(sum1 == num2 && sum2 == num1)
//		System.out.println(num1+" and "+num2+" are amicable numbers");
//	else
//		System.out.println(num1+" and "+num2+" are not amicable numbers")
//	};

	
//(num1, num2)->{
//	int product = num1 * num2;
//	int copy = product, rev = 0;
//	while(product>0) {
//		int b = product%10;
//		rev = rev*10 + b;
//		product = product/10;
//	}
//	
//	if(rev==copy)
//		return true;
//	else
//		return false;
//	
//};
