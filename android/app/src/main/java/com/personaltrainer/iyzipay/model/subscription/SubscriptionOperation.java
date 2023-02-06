package com.personaltrainer.iyzipay.model.subscription;

import com.google.gson.annotations.SerializedName;
import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.model.subscription.resource.SubscriptionUpgradeData;
import com.personaltrainer.iyzipay.request.subscription.SubscriptionOrderOperationRequest;
import com.personaltrainer.iyzipay.request.subscription.UpgradeSubscriptionRequest;

public class SubscriptionOperation extends IyzipayResource {

    @SerializedName("data")
    private SubscriptionUpgradeData subscriptionUpgradeData;

    public static SubscriptionOperation cancel(String subscriptionReferenceCode, Options options) {
        String uri = options.getBaseUrl() + "/v2/subscription/subscriptions/" + subscriptionReferenceCode + "/cancel";
        return HttpClient.create().post(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, null, options),
                null,
                SubscriptionOperation.class);
    }

    public static SubscriptionOperation activate(String subscriptionReferenceCode, Options options) {
        String uri = options.getBaseUrl() + "/v2/subscription/subscriptions/" + subscriptionReferenceCode + "/activate";
        return HttpClient.create().post(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, null, options),
                null,
                SubscriptionOperation.class);
    }

    public static SubscriptionOperation upgrade(String subscriptionReferenceCode, UpgradeSubscriptionRequest request, Options options) {
        String uri = options.getBaseUrl() + "/v2/subscription/subscriptions/" + subscriptionReferenceCode + "/upgrade";
        return HttpClient.create().post(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, request, options),
                request,
                SubscriptionOperation.class);
    }

    public static SubscriptionOperation retryPayment(SubscriptionOrderOperationRequest request, Options options) {
        String uri = options.getBaseUrl() + "/v2/subscription/operation/retry";
        return HttpClient.create().post(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, request, options),
                request,
                SubscriptionOperation.class);
    }
}
