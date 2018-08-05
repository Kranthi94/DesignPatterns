// Created by Kranthi on 05/08/18.


// Question
//
//

// Things to Learn
//
//
package StructuralDesignPatterns.BridgeDesignPattern;

public class CardPayment extends Payment {

    private PaymentGateway paymentGateway;

    public CardPayment(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    @Override
    void makePayment() {
        paymentGateway.processPayment();
    }
}
