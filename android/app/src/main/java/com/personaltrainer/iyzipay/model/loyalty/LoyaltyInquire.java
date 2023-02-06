package com.personaltrainer.iyzipay.model.loyalty;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.model.LoyaltyResource;

public class LoyaltyInquire extends LoyaltyResource {

    public static LoyaltyInquire create(LoyaltyInquireRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/loyalty/inquire",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                LoyaltyInquire.class);
    }

}

