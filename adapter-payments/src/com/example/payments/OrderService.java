package com.example.payments;

public class OrderService {

    public OrderService() {
    }

    public String charge(PaymentGateway provider, String customerId, int amountCents) {
        return provider.charge(customerId, amountCents);
    }
}