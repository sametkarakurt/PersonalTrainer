package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CreateCheckoutFormInitializeRequest;

public class CheckoutFormInitialize extends CheckoutFormInitializeResource {

    public static CheckoutFormInitialize create(CreateCheckoutFormInitializeRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/iyzipos/checkoutform/initialize/auth/ecom",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                CheckoutFormInitialize.class);
    }
}
