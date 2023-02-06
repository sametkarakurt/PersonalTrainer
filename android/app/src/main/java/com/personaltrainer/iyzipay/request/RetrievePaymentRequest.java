package com.personaltrainer.iyzipay.request;

import com.personaltrainer.iyzipay.Request;
import com.personaltrainer.iyzipay.ToStringRequestBuilder;

public class RetrievePaymentRequest extends Request {

    private String paymentId;
    private String paymentConversationId;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentConversationId() {
        return paymentConversationId;
    }

    public void setPaymentConversationId(String paymentConversationId) {
        this.paymentConversationId = paymentConversationId;
    }

    @Override
    public String toString() {
        return new ToStringRequestBuilder(this)
                .appendSuper(super.toString())
                .append("paymentId", paymentId)
                .append("paymentConversationId", paymentConversationId)
                .toString();
    }
}
