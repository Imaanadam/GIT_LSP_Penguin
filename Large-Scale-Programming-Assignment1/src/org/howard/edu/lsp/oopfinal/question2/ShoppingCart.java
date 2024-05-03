package org.howard.edu.lsp.oopfinal.question2;

public class ShoppingCart {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	
	    private PaymentStrategy paymentStrategy;
// method set
	    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
	        this.paymentStrategy = paymentStrategy;
	    }
// method to do checkout based on the payment  
	    public void checkout(double amount) {
	        paymentStrategy.pay(amount);
	    }
	}


