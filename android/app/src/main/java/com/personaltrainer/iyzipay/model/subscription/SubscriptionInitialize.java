package com.personaltrainer.iyzipay.model.subscription;

import com.google.gson.annotations.SerializedName;
import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.model.subscription.resource.CreatedSubscriptionData;
import com.personaltrainer.iyzipay.request.subscription.InitializeSubscriptionRequest;
import com.personaltrainer.iyzipay.request.subscription.InitializeSubscriptionWithExistingCustomerRequest;

public class SubscriptionInitialize extends IyzipayResource {

    @SerializedName("data")
    private com.personaltrainer.iyzipay.model.subscription.resource.CreatedSubscriptionData createdSubscriptionData;

    public static SubscriptionInitialize create(InitializeSubscriptionRequest request, Options options) {
        String uri = options.getBaseUrl() + "/v2/subscription/initialize";
        return HttpClient.create().post(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, request, options),
                request,
                SubscriptionInitialize.class);
    }

    public static SubscriptionInitialize createWithExistingCustomer(InitializeSubscriptionWithExistingCustomerRequest request, Options options) {
        String uri = options.getBaseUrl() + "/v2/subscription/initialize/with-customer";
        return HttpClient.create().post(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, request, options),
                request,
                SubscriptionInitialize.class);
    }

    public com.personaltrainer.iyzipay.model.subscription.resource.CreatedSubscriptionData getCreatedSubscriptionData() {
        return createdSubscriptionData;
    }

    public void setCreatedSubscriptionData(CreatedSubscriptionData createdSubscriptionData) {
        this.createdSubscriptionData = createdSubscriptionData;
    }
}
