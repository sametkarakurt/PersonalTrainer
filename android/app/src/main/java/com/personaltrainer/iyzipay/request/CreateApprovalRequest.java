package com.personaltrainer.iyzipay.request;

import com.personaltrainer.iyzipay.Request;
import com.personaltrainer.iyzipay.ToStringRequestBuilder;

public class CreateApprovalRequest extends Request {

    private String paymentTransactionId;

    public String getPaymentTransactionId() {
        return paymentTransactionId;
    }

    public void setPaymentTransactionId(String paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
    }

    @Override
    public String toString() {
        return new ToStringRequestBuilder(this)
                .appendSuper(super.toString())
                .append("paymentTransactionId", paymentTransactionId)
                .toString();
    }
}
