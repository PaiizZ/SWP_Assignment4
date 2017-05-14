package com.wanchanapon.invoices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.wanchanapon.banking.BankingService;
import com.wanchanapon.banking.Payment;
import com.wanchanapon.banking.PaymentException;

/**
 * Endpoint that picks Payments from the system and dispatches them to the
 * service provided by bank.
 */
@Component
public class PaymentProcessor {

    @Autowired
    BankingService bankingService;

    @ServiceActivator
    public void processPayment(Payment payment) throws PaymentException {
        bankingService.pay(payment);
    }

}
