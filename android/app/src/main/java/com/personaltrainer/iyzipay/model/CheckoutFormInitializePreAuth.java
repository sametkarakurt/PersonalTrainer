package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CreateCheckoutFormInitializeRequest;

public class CheckoutFormInitializePreAuth extends CheckoutFormInitializeResource {

    public static CheckoutFormInitializePreAuth create(CreateCheckoutFormInitializeRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/iyzipos/checkoutform/initialize/preauth/ecom",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                CheckoutFormInitializePreAuth.class);
    }
}
