package com.personaltrainer.iyzipay.request;

import com.personaltrainer.iyzipay.Request;
import com.personaltrainer.iyzipay.ToStringRequestBuilder;

public class DeleteCardRequest extends Request {

    private String cardUserKey;
    private String cardToken;

    public String getCardUserKey() {
        return cardUserKey;
    }

    public void setCardUserKey(String cardUserKey) {
        this.cardUserKey = cardUserKey;
    }

    public String getCardToken() {
        return cardToken;
    }

    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }

    @Override
    public String toString() {
        return new ToStringRequestBuilder(this)
                .appendSuper(super.toString())
                .append("cardUserKey", cardUserKey)
                .append("cardToken", cardToken)
                .toString();
    }
}
