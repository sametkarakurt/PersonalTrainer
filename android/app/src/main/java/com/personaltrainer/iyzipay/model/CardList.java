package com.personaltrainer.iyzipay.model;

import java.util.List;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.RetrieveCardListRequest;

public class CardList extends IyzipayResource {

    private String cardUserKey;
    private List<com.personaltrainer.iyzipay.model.Card> cardDetails;

    public static CardList retrieve(RetrieveCardListRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/cardstorage/cards",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                CardList.class);
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
}
