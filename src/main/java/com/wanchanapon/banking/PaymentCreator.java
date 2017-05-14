package com.wanchanapon.banking;

import com.wanchanapon.invoices.Invoice;

/**
 * Creates payment for bank from the invoice.
 * Real world implementation might do some I/O expensive stuff.
 */
public interface PaymentCreator {

    Payment createPayment(Invoice invoice) throws PaymentException;

}
