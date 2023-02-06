package com.personaltrainer.iyzipay.model.subscription;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.subscription.InitializeSubscriptionCheckoutFormRequest;

public class SubscriptionCheckoutFormInitialize extends IyzipayResource {

    private String token;
    private String checkoutFormContent;
    private Long tokenExpireTime;

    public static SubscriptionCheckoutFormInitialize create(InitializeSubscriptionCheckoutFormRequest request, Options options) {
        String uri = options.getBaseUrl() + "/v2/subscription/checkoutform/initialize";
        return HttpClient.create().post(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, request, options),
                request,
                SubscriptionCheckoutFormInitialize.class);
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
