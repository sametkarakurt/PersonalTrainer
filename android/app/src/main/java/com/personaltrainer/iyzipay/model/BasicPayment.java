package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CreateBasicPaymentRequest;

public class BasicPayment extends BasicPaymentResource {

    public static BasicPayment create(CreateBasicPaymentRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/auth/basic",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                BasicPayment.class);
    }
}
