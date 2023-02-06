package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CreateThreedsPaymentRequest;
import com.personaltrainer.iyzipay.request.RetrievePaymentRequest;

public class ThreedsPayment extends PaymentResource {

    public static ThreedsPayment create(CreateThreedsPaymentRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/3dsecure/auth",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                ThreedsPayment.class);
    }

    public static ThreedsPayment retrieve(RetrievePaymentRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/detail",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                ThreedsPayment.class);
    }
}
