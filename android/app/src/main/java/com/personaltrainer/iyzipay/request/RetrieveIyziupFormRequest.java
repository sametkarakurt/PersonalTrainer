package com.personaltrainer.iyzipay.request;

import com.personaltrainer.iyzipay.Request;
import com.personaltrainer.iyzipay.ToStringRequestBuilder;

public class RetrieveIyziupFormRequest extends Request {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return new ToStringRequestBuilder(this)
                .appendSuper(super.toString())
                .append("token", token)
                .toString();
    }
}
