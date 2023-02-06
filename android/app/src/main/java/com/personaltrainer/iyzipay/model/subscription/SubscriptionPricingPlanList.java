package com.personaltrainer.iyzipay.model.subscription;

import com.google.gson.annotations.SerializedName;
import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.PagingRequest;
import com.personaltrainer.iyzipay.model.subscription.builder.PageRequestQueryParamBuilder;
import com.personaltrainer.iyzipay.model.subscription.resource.SubscriptionPricingPlanListData;

public class SubscriptionPricingPlanList extends IyzipayResource {

    @SerializedName("data")
    private com.personaltrainer.iyzipay.model.subscription.resource.SubscriptionPricingPlanListData subscriptionPricingPlanListData;

    public static SubscriptionPricingPlanList retrieve(String subscriptionPricingPlanReferenceCode, PagingRequest request, Options options) {
        String uri = options.getBaseUrl() + "/v2/subscription/products/" + subscriptionPricingPlanReferenceCode + "/pricing-plans/" + new PageRequestQueryParamBuilder()
                .page(request.getPage())
                .count(request.getCount())
                .build();
        return HttpClient.create().get(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, null, options),
                null,
                SubscriptionPricingPlanList.class);
    }

    public com.personaltrainer.iyzipay.model.subscription.resource.SubscriptionPricingPlanListData getSubscriptionPricingPlanListData() {
        return subscriptionPricingPlanListData;
    }

    public void setSubscriptionPricingPlanListData(SubscriptionPricingPlanListData subscriptionPricingPlanListData) {
        this.subscriptionPricingPlanListData = subscriptionPricingPlanListData;
    }
}
