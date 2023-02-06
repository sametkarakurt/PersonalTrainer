package com.personaltrainer.iyzipay.model;

import java.math.BigDecimal;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CreateRefundRequest;

public class RefundChargedFromMerchant extends IyzipayResource {

    private String paymentId;
    private String paymentTransactionId;
    private BigDecimal price;
    private String hostReference;

    public static RefundChargedFromMerchant create(CreateRefundRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/iyzipos/refund/merchant/charge",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                RefundChargedFromMerchant.class);
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentTransactionId() {
        return paymentTransactionId;
    }

    public void setPaymentTransactionId(String paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getHostReference() {
        return hostReference;
    }

    public void setHostReference(String hostReference) {
        this.hostReference = hostReference;
    }
}
