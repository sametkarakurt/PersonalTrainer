package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CreateBasicPaymentRequest;

public class BasicPaymentPreAuth extends BasicPaymentResource {

    public static BasicPaymentPreAuth create(CreateBasicPaymentRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/preauth/basic",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                BasicPaymentPreAuth.class);
    }
}
