package com.personaltrainer.iyzipay.model;

import java.util.List;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.RetrieveCardManagementPageCardRequest;

public class CardManagementPageCard extends IyzipayResource {

    private String externalId;
    private String cardUserKey;
    private List<com.personaltrainer.iyzipay.model.Card> cardDetails;

    public static CardManagementPageCard retrieve(com.personaltrainer.iyzipay.request.RetrieveCardManagementPageCardRequest request, Options options) {
        return HttpClient.create().get(prepareRetrieveCardManagementPageCardRequest(request, options),
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                CardManagementPageCard.class);
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getCardUserKey() {
        return cardUserKey;
    }

    public void setCardUserKey(String cardUserKey) {
        this.cardUserKey = cardUserKey;
    }

    public List<com.personaltrainer.iyzipay.model.Card> getCardDetails() {
        return cardDetails;
    }

    public void setCardDetails(List<Card> cardDetails) {
        this.cardDetails = cardDetails;
    }

    private static String prepareRetrieveCardManagementPageCardRequest(RetrieveCardManagementPageCardRequest request, Options options){
        StringBuilder sb = new StringBuilder();
        sb.append(options.getBaseUrl());
        sb.append("/v1/card-management/pages/").append(request.getPageToken());
        sb.append("/cards?locale=").append(request.getLocale());
        sb.append("&conversationId=").append(request.getConversationId());

        return sb.toString();
    }
}
