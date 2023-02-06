package com.personaltrainer.iyzipay.model.marketplace.onboarding.settlementtobalance;

import com.personaltrainer.iyzipay.IyzipayResource;

public class SubMerchantOnboardingVerifyResource extends IyzipayResource {
    private String subMerchantKey;

    public String getSubMerchantKey() {
        return subMerchantKey;
    }

    public void setSubMerchantKey(String subMerchantKey) {
        this.subMerchantKey = subMerchantKey;
    }
}
