package com.personaltrainer.iyzipay.model.subscription;

import com.google.gson.annotations.SerializedName;
import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.model.subscription.resource.SubscriptionOrderData;

public class SubscriptionOrder extends IyzipayResource {

    @SerializedName("data")
    private com.personaltrainer.iyzipay.model.subscription.resource.SubscriptionOrderData subscriptionOrderData;

    public static SubscriptionOrder retrieve(String subscriptionOrderReferenceCode, Options options) {
        String uri = options.getBaseUrl() + "/v2/subscription/orders/" + subscriptionOrderReferenceCode;
        return HttpClient.create().get(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, null, options),
                null,
                SubscriptionOrder.class);
    }

    public com.personaltrainer.iyzipay.model.subscription.resource.SubscriptionOrderData getSubscriptionOrderData() {
        return subscriptionOrderData;
    }

    public void setSubscriptionOrderData(SubscriptionOrderData subscriptionOrderData) {
        this.subscriptionOrderData = subscriptionOrderData;
    }
}
