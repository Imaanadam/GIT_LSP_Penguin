package org.howard.edu.lsp.oopfinal.question2;

class BitcoinPayment implements PaymentStrategy {
    private String bcAddress;
// initilizing bit coin address 
    public BitcoinPayment(String bitcoinAddress) {
        this.bcAddress = bitcoinAddress;
    }
// implementing pay method with payment strategy 
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bitcoin address " + bcAddress);
    }
}