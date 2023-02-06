package com.personaltrainer.iyzipay.model;

import com.google.gson.annotations.SerializedName;
import com.personaltrainer.iyzipay.DigestHelper;
import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CreatePaymentRequest;

public class ThreedsInitializePreAuth extends IyzipayResource {

    @SerializedName("threeDSHtmlContent")
    private String htmlContent;

    public static ThreedsInitializePreAuth create(CreatePaymentRequest request, Options options) {
        ThreedsInitializePreAuth response = HttpClient.create().post(options.getBaseUrl() + "/payment/3dsecure/initialize/preauth",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                ThreedsInitializePreAuth.class);
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
