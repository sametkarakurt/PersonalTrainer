package com.personaltrainer.iyzipay.model.marketplace.onboarding.settlementtobalance;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.SubMerchantOnboardingInitializeRequest;

public class SubMerchantOnboardingInitialize extends SubmerchantOnboardingInitializeResource {
    public static SubMerchantOnboardingInitialize initialize(SubMerchantOnboardingInitializeRequest request, Options options) {
        return HttpClient.create().post(
                options.getBaseUrl() + "/onboarding/settlement-to-balance/submerchant",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                SubMerchantOnboardingInitialize.class
        );
    }
}
