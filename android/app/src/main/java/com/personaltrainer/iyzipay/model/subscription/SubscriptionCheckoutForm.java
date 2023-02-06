package com.personaltrainer.iyzipay.model.subscription;

import com.google.gson.annotations.SerializedName;
import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.model.subscription.resource.CreatedSubscriptionData;

public class SubscriptionCheckoutForm extends IyzipayResource {

    @SerializedName("data")
    private com.personaltrainer.iyzipay.model.subscription.resource.CreatedSubscriptionData createdSubscriptionData;

    public static SubscriptionCheckoutForm retrieve(String subscriptionCheckoutFormToken, Options options) {
        String uri = options.getBaseUrl() + "/v2/subscription/checkoutform/" + subscriptionCheckoutFormToken;
        return HttpClient.create().get(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, null, options),
                null,
                SubscriptionCheckoutForm.class);
    }

    public com.personaltrainer.iyzipay.model.subscription.resource.CreatedSubscriptionData getCreatedSubscriptionData() {
        return createdSubscriptionData;
    }

    public void setCreatedSubscriptionData(CreatedSubscriptionData createdSubscriptionData) {
        this.createdSubscriptionData = createdSubscriptionData;
    }
}
