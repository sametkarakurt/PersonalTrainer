package com.personaltrainer.iyzipay.model.subscription;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.subscription.InitializeCardUpdateWithSubscriptionCheckoutFormRequest;
import com.personaltrainer.iyzipay.request.subscription.InitializeSubscriptionCardUpdateCheckoutFormRequest;

public class SubscriptionCardUpdateCheckoutFormInitialize extends IyzipayResource {

    private String token;
    private String checkoutFormContent;
    private Long tokenExpireTime;

    public static SubscriptionCardUpdateCheckoutFormInitialize create(InitializeSubscriptionCardUpdateCheckoutFormRequest request, Options options) {
        String uri = options.getBaseUrl() + "/v2/subscription/card-update/checkoutform/initialize";
        return HttpClient.create().post(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, request, options),
                request,
                SubscriptionCardUpdateCheckoutFormInitialize.class);
    }

    public static SubscriptionCardUpdateCheckoutFormInitialize createWithSubscription(InitializeCardUpdateWithSubscriptionCheckoutFormRequest request, Options options) {
        String uri = options.getBaseUrl() + "/v2/subscription/card-update/checkoutform/initialize/with-subscription";
        return HttpClient.create().post(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, request, options),
                request,
                SubscriptionCardUpdateCheckoutFormInitialize.class);
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCheckoutFormContent() {
        return checkoutFormContent;
    }

    public void setCheckoutFormContent(String checkoutFormContent) {
        this.checkoutFormContent = checkoutFormContent;
    }

    public Long getTokenExpireTime() {
        return tokenExpireTime;
    }

    public void setTokenExpireTime(Long tokenExpireTime) {
        this.tokenExpireTime = tokenExpireTime;
    }
}
