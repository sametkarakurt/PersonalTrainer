package com.personaltrainer.iyzipay.model.iyzilink;

import com.personaltrainer.iyzipay.IyzipayResource;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class IyziLinkResource extends IyzipayResource {

    private com.personaltrainer.iyzipay.model.iyzilink.IyziLinkItem data;

    public com.personaltrainer.iyzipay.model.iyzilink.IyziLinkItem getData() {
        return data;
    }

    public void setData(IyziLinkItem data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}