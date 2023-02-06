package com.personaltrainer.iyzipay.model;

import com.google.gson.annotations.SerializedName;
import com.personaltrainer.iyzipay.DigestHelper;
import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CreateBasicPaymentRequest;

public class BasicThreedsInitializePreAuth extends IyzipayResource {

    @SerializedName("threeDSHtmlContent")
    private String htmlContent;

    public static BasicThreedsInitializePreAuth create(CreateBasicPaymentRequest request, Options options) {
        BasicThreedsInitializePreAuth response = HttpClient.create().post(options.getBaseUrl() + "/payment/3dsecure/initialize/preauth/basic",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                BasicThreedsInitializePreAuth.class);
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
}
