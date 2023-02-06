package com.personaltrainer.iyzipay.model;

import java.util.List;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.RetrieveInstallmentInfoRequest;

public class InstallmentInfo extends IyzipayResource {

    private List<com.personaltrainer.iyzipay.model.InstallmentDetail> installmentDetails;

    public static InstallmentInfo retrieve(RetrieveInstallmentInfoRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/payment/iyzipos/installment",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                InstallmentInfo.class);
    }

    public List<com.personaltrainer.iyzipay.model.InstallmentDetail> getInstallmentDetails() {
        return installmentDetails;
    }

    public void setInstallmentDetails(List<InstallmentDetail> installmentDetails) {
        this.installmentDetails = installmentDetails;
    }
}
