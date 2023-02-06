package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CreatePaymentRequest;
import com.personaltrainer.iyzipay.request.RetrievePaymentRequest;

public class PaymentPreAuth extends PaymentResource {

    public static PaymentPreAuth create(CreatePaymentRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/preauth",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                PaymentPreAuth.class);
    }

    public static PaymentPreAuth retrieve(RetrievePaymentRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/detail",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                PaymentPreAuth.class);
    }
}
