package com.personaltrainer.iyzipay.model.iyzilink;

import org.apache.commons.lang3.StringUtils;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.PagingRequest;
import com.personaltrainer.iyzipay.Request;
import com.personaltrainer.iyzipay.request.IyziLinkSaveRequest;

public class IyziLink extends IyzipayResource {

    private static final String V2_IYZILINK_PRODUCTS = "/v2/iyzilink/products";

    public static com.personaltrainer.iyzipay.model.iyzilink.IyziLinkSaveResource create(com.personaltrainer.iyzipay.request.IyziLinkSaveRequest request, Options options) {
        String uri = options.getBaseUrl() + V2_IYZILINK_PRODUCTS + getQueryParams(request);
        return HttpClient.create().post(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, request, options),
                request,
                com.personaltrainer.iyzipay.model.iyzilink.IyziLinkSaveResource.class);
    }

    public static com.personaltrainer.iyzipay.model.iyzilink.IyziLinkSaveResource update(String token, IyziLinkSaveRequest request, Options options) {
        String uri = options.getBaseUrl() + V2_IYZILINK_PRODUCTS + "/" + token + getQueryParams(request);
        return HttpClient.create().put(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, request, options),
                request,
                IyziLinkSaveResource.class);
    }

    public static IyziLinkPagingResource retrieveAll(PagingRequest pagingRequest, Options options) {
        String queryParams = getQueryParams(pagingRequest);
        String iyziLinkQueryParam = "productType=IYZILINK";
        queryParams = StringUtils.isEmpty(queryParams) ? "?" + iyziLinkQueryParam : queryParams + "&" + iyziLinkQueryParam;
        String uri = options.getBaseUrl() + V2_IYZILINK_PRODUCTS + queryParams;
        return HttpClient.create().get(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, null, options),
                null,
                IyziLinkPagingResource.class);
    }

    public static IyziLinkResource retrieve(String token, Request request, Options options) {
        String uri = options.getBaseUrl() + V2_IYZILINK_PRODUCTS + "/" + token + getQueryParams(request);
        return HttpClient.create().get(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, null, options),
                null,
                IyziLinkResource.class);
    }

    public static IyzipayResource delete(String token, Request request, Options options) {
        String uri = options.getBaseUrl() + V2_IYZILINK_PRODUCTS + "/" + token + getQueryParams(request);
        return HttpClient.create().delete(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, null, options),
                null,
                IyzipayResource.class);
    }

    private static String getQueryParams(Request request) {
        if (request == null) {
            return "";
        }

        String queryParams = "?conversationId=" + request.getConversationId();

        if (StringUtils.isNotBlank(request.getLocale())) {
            queryParams += "&locale=" + request.getLocale();
        }

        if (request instanceof PagingRequest) {
            PagingRequest pagingRequest = (PagingRequest) request;
            if (pagingRequest.getPage() != null) {
                queryParams += "&page=" + pagingRequest.getPage();
            }

            if (pagingRequest.getCount() != null) {
                queryParams += "&count=" + pagingRequest.getCount();
            }
        }
        return queryParams;
    }
}