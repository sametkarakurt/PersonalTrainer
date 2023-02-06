package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CreateThreedsPaymentRequest;

public class BasicThreedsPayment extends BasicPaymentResource {

    public static BasicThreedsPayment create(CreateThreedsPaymentRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/3dsecure/auth/basic",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                BasicThreedsPayment.class);
    }
}
