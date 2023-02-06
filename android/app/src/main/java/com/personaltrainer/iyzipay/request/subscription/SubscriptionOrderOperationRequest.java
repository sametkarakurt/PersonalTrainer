package com.personaltrainer.iyzipay.request.subscription;

import com.personaltrainer.iyzipay.Request;

public class SubscriptionOrderOperationRequest extends Request {

    private String referenceCode;

    public String getReferenceCode() {
        return referenceCode;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }
}
