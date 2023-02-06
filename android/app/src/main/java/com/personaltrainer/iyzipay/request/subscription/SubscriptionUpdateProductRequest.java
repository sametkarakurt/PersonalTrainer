package com.personaltrainer.iyzipay.request.subscription;

import com.personaltrainer.iyzipay.Request;

public class SubscriptionUpdateProductRequest extends Request {

    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
