package service;

import entity.Invoice;

public interface PaymentStrategy {
    void pay(Invoice invoice);
}
