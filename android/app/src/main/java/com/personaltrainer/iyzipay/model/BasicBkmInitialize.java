package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.DigestHelper;
import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CreateBasicBkmInitializeRequest;

public class BasicBkmInitialize extends IyzipayResource {

    private String htmlContent;
    private String token;

    public static BasicBkmInitialize create(CreateBasicBkmInitializeRequest request, Options options) {
        BasicBkmInitialize response = HttpClient.create().post(options.getBaseUrl() + "/payment/bkm/initialize/basic",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                BasicBkmInitialize.class);
        if (response != null) {
            response.setHtmlContent(DigestHelper.decodeString(response.getHtmlContent()));
        }
        return response;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
