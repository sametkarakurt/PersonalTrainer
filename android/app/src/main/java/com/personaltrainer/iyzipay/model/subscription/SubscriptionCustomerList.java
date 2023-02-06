package com.personaltrainer.iyzipay.model.subscription;

import com.google.gson.annotations.SerializedName;
import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.PagingRequest;
import com.personaltrainer.iyzipay.model.subscription.builder.PageRequestQueryParamBuilder;
import com.personaltrainer.iyzipay.model.subscription.resource.SubscriptionCustomerListData;

public class SubscriptionCustomerList extends IyzipayResource {

    @SerializedName("data")
    private com.personaltrainer.iyzipay.model.subscription.resource.SubscriptionCustomerListData subscriptionCustomerListData;

    public static SubscriptionCustomerList retrieve(PagingRequest request, Options options) {
        String uri = options.getBaseUrl() + "/v2/subscription/customers/" + new PageRequestQueryParamBuilder()
                .page(request.getPage())
                .count(request.getCount())
                .build();
        return HttpClient.create().get(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, null, options),
                null,
                SubscriptionCustomerList.class);
    }

    public com.personaltrainer.iyzipay.model.subscription.resource.SubscriptionCustomerListData getSubscriptionCustomerListData() {
        return subscriptionCustomerListData;
    }

    public void setSubscriptionCustomerListData(SubscriptionCustomerListData subscriptionCustomerListData) {
        this.subscriptionCustomerListData = subscriptionCustomerListData;
    }
}
