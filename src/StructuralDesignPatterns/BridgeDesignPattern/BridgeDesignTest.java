// Created by Kranthi on 05/08/18.


// Question
//
//

// Things to Learn
//
//
package StructuralDesignPatterns.BridgeDesignPattern;

public class BridgeDesignTest {

    public static void main(String[] args){

        CardPayment hdfcCardPayment = new CardPayment(new HDFCPaymentGateway());

        hdfcCardPayment.makePayment();

        CardPayment sbiCardPayment = new CardPayment(new SBIPaymentGateway());

        sbiCardPayment.makePayment();

        NetBanking hdfcNetBanking = new NetBanking(new HDFCPaymentGateway());

        hdfcNetBanking.makePayment();

        NetBanking sbiNetBanking = new NetBanking(new SBIPaymentGateway());

        sbiNetBanking.makePayment();
    }
}
