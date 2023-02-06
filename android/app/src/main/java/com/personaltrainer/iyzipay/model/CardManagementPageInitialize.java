package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.request.CreateCardManagementPageInitializeRequest;

public class CardManagementPageInitialize extends IyzipayResource {

    private String externalId;
    private String token;
    private String cardPageUrl;

    public static CardManagementPageInitialize create(CreateCardManagementPageInitializeRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/v1/card-management/pages",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                CardManagementPageInitialize.class);
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCardPageUrl() {
        return cardPageUrl;
    }

    public void setCardPageUrl(String cardPageUrl) {
        this.cardPageUrl = cardPageUrl;
    }

}
