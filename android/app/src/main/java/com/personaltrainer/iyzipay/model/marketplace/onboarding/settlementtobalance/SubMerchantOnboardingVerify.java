package com.personaltrainer.iyzipay.model.marketplace.onboarding.settlementtobalance;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.SubMerchantOnboardingVerifyRequest;

public class SubMerchantOnboardingVerify extends SubMerchantOnboardingVerifyResource {
    public static SubMerchantOnboardingVerify verify(SubMerchantOnboardingVerifyRequest request, Options options) {
        return HttpClient.create().post(
                options.getBaseUrl() + "/onboarding/settlement-to-balance/submerchant/verify",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                SubMerchantOnboardingVerify.class
        );
    }
}
