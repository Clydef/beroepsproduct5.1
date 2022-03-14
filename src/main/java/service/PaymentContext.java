package service;

import entity.Invoice;
import entity.PaymentMethod;

import java.util.Set;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;
    private PaymentMethod paymentMethod;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public PaymentContext() {
    }

    public void usePaymentMethod(Invoice invoice) {
        this.paymentStrategy.pay(invoice);
    }

//    public void getPaymentMethod(Invoice invoice) {
//        if (invoice.getInvoice_method().contains(Set.of(paymentMethod.getPaymentMethodName()))) {
//
//        }
//    }
}
