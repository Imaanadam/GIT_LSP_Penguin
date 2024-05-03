package org.howard.edu.lsp.oopfinal.question2;

class PayPalPayment implements PaymentStrategy {
    private String emailUser;
// user with paypal will have a email to identify them
    public PayPalPayment(String emailAddress) {
        this.emailUser = emailAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal account " + emailUser);
    }
}