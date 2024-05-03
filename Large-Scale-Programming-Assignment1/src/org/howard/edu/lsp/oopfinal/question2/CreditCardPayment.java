package org.howard.edu.lsp.oopfinal.question2;

class CreditCardPayment implements PaymentStrategy {
    private String CCNumber;
// making credit card number set to the string of numbers it will be given
    public CreditCardPayment(String creditCardNumber) {
        this.CCNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using credit card " + CCNumber);
    }
}
  