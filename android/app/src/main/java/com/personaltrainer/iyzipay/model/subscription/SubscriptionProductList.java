package com.personaltrainer.iyzipay.model.subscription;

import com.google.gson.annotations.SerializedName;
import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.PagingRequest;
import com.personaltrainer.iyzipay.model.subscription.builder.PageRequestQueryParamBuilder;
import com.personaltrainer.iyzipay.model.subscription.resource.SubscriptionProductListData;

public class SubscriptionProductList extends IyzipayResource {

    @SerializedName("data")
    private com.personaltrainer.iyzipay.model.subscription.resource.SubscriptionProductListData subscriptionProductListData;

    public static SubscriptionProductList retrieve(PagingRequest request, Options options) {
        String uri = options.getBaseUrl() + "/v2/subscription/products/" + new PageRequestQueryParamBuilder()
                .page(request.getPage())
                .count(request.getCount())
                .build();
        return HttpClient.create().get(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, null, options),
                null,
                SubscriptionProductList.class);
    }

    public com.personaltrainer.iyzipay.model.subscription.resource.SubscriptionProductListData getSubscriptionProductListData() {
        return subscriptionProductListData;
    }

    public void setSubscriptionProductListData(SubscriptionProductListData subscriptionProductListData) {
        this.subscriptionProductListData = subscriptionProductListData;
    }
}
