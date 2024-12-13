package task;

import java.util.List;


public class MapTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
   
        // Calculate sales tax for CA Transactions
        System.out.println("=== Widget Pro Sales Tax in CA ===");
      
        //to find tax in State CA
        System.out.println(TaxRate.byState(State.CA));
        
    }
}
