package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CreateIyziupFormInitializeRequest;

public class IyziupFormInitialize extends IyziupFormInitializeResource {

    public static IyziupFormInitialize create(CreateIyziupFormInitializeRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/v1/iyziup/form/initialize",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                IyziupFormInitialize.class);
    }
}
