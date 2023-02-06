package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CreateCrossBookingRequest;

public class CrossBookingToSubMerchant extends IyzipayResource {

    public static CrossBookingToSubMerchant create(CreateCrossBookingRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/crossbooking/send",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                CrossBookingToSubMerchant.class);
    }
}
