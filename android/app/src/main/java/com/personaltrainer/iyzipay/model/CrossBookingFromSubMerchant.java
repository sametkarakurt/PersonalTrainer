package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CreateCrossBookingRequest;

public class CrossBookingFromSubMerchant extends IyzipayResource {

    public static CrossBookingFromSubMerchant create(CreateCrossBookingRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/crossbooking/receive",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                CrossBookingFromSubMerchant.class);
    }
}
