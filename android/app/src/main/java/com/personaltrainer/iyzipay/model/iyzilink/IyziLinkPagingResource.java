package com.personaltrainer.iyzipay.model.iyzilink;

import com.personaltrainer.iyzipay.IyzipayResource;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class IyziLinkPagingResource extends IyzipayResource {

    private com.personaltrainer.iyzipay.model.iyzilink.IyziLinkPaging data;

    public com.personaltrainer.iyzipay.model.iyzilink.IyziLinkPaging getData() {
        return data;
    }

    public void setData(IyziLinkPaging data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}