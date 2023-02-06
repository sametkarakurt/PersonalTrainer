package com.personaltrainer.iyzipay.request;


import com.personaltrainer.iyzipay.Request;
import com.personaltrainer.iyzipay.ToStringRequestBuilder;

public class RetrieveCardManagementPageCardRequest extends Request {

    private String pageToken;

    public String getPageToken() {
        return pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    @Override
    public String toString() {
        return new ToStringRequestBuilder(this)
                .appendSuper(super.toString())
                .append("token", pageToken).toString();
    }
}
