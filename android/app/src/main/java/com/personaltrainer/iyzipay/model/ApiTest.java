package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.HttpClient;

public class ApiTest extends IyzipayResource {

    public static IyzipayResource retrieve(Options options) {
        return HttpClient.create().get(options.getBaseUrl() + "/payment/test", getHttpProxy(options), IyzipayResource.class) ;
    }
}
