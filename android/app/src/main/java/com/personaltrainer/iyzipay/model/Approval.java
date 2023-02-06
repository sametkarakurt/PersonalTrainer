package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CreateApprovalRequest;

public class Approval extends IyzipayResource {

    private String paymentTransactionId;

    public static Approval create(CreateApprovalRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/iyzipos/item/approve",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                Approval.class);
    }

    public String getPaymentTransactionId() {
        return paymentTransactionId;
    }

    public void setPaymentTransactionId(String paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
    }
}
