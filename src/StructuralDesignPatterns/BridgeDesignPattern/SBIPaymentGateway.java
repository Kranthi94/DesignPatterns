// Created by Kranthi on 05/08/18.


// Question
//
//

// Things to Learn
//
//
package StructuralDesignPatterns.BridgeDesignPattern;

public class SBIPaymentGateway implements PaymentGateway {

    @Override
    public void processPayment() {
        System.out.println("Making payment through SBI payment gateway");
    }
}
