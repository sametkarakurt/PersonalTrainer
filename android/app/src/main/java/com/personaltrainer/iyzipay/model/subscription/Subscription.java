package com.personaltrainer.iyzipay.model.subscription;

import com.google.gson.annotations.SerializedName;
import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.model.subscription.resource.SubscriptionData;

public class Subscription extends IyzipayResource {

    @SerializedName("data")
    private com.personaltrainer.iyzipay.model.subscription.resource.SubscriptionData subscriptionData;

    public static Subscription retrieve(String subscriptionReferenceCode, Options options) {
        String uri = options.getBaseUrl() + "/v2/subscription/subscriptions/" + subscriptionReferenceCode;
        return HttpClient.create().get(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, null, options),
                null,
                Subscription.class);
    }

    public com.personaltrainer.iyzipay.model.subscription.resource.SubscriptionData getSubscriptionData() {
        return subscriptionData;
    }

    public void setSubscriptionData(SubscriptionData subscriptionData) {
        this.subscriptionData = subscriptionData;
    }
}
