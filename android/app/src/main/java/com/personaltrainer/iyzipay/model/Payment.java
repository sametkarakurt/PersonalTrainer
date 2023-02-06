package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CreatePaymentRequest;
import com.personaltrainer.iyzipay.request.RetrievePaymentRequest;

public class Payment extends PaymentResource {

    public static Payment create(CreatePaymentRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/auth",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                Payment.class);
    }

    public static Payment retrieve(RetrievePaymentRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/detail",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                Payment.class);
    }
}
