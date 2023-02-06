package com.personaltrainer.iyzipay.request;

import com.personaltrainer.iyzipay.Request;

public class InitUcsRequest extends Request {

    private String email;
    private String gsmNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGsmNumber() {
        return gsmNumber;
    }

    public void setGsmNumber(String gsmNumber) {
        this.gsmNumber = gsmNumber;
    }
}
