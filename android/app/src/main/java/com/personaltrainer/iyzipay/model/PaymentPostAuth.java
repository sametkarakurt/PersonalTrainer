package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CreatePaymentPostAuthRequest;

public class PaymentPostAuth extends PaymentResource {

    public static PaymentPostAuth create(CreatePaymentPostAuthRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/postauth",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                PaymentPostAuth.class);
    }
}
