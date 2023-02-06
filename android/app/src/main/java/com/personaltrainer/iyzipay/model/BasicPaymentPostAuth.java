package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CreatePaymentPostAuthRequest;

public class BasicPaymentPostAuth extends BasicPaymentResource {

    public static BasicPaymentPostAuth create(CreatePaymentPostAuthRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/postauth/basic",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                BasicPaymentPostAuth.class);
    }
}
