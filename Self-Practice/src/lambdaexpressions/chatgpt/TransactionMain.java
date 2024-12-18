package lambdaexpressions.chatgpt;

import java.util.List;
import java.util.stream.Collectors;

public class TransactionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Transaction> transactionList = List.of(new Transaction(10, "credit", 1000),
				new Transaction(11, "debit", 400),
				new Transaction(12, "credit", 1900),
				new Transaction(13, "debit", 5000),
				new Transaction(14, "credit", 1100));
				
		List<Integer> creditTransactions = getCreditTransactionIds(transactionList);
		
		System.out.println(creditTransactions);
		
		
	}
	public static List<Integer> getCreditTransactionIds(List<Transaction> transactions){
		
		return transactions
		.stream()
		.filter(t-> t.getTransactionType().equals("credit"))
		.sorted((t1,t2)->Integer.compare(t2.getTransactionAmount(), t1.getTransactionAmount()))
		.map(Transaction::getTransactionId)
		.collect(Collectors.toList());
	}

}
