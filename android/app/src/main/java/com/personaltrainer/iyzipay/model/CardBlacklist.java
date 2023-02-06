package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.CardBlacklistRequest;
import com.personaltrainer.iyzipay.request.RetrieveCardBlacklistRequest;

public class CardBlacklist extends IyzipayResource {
    private String cardNumber;
    private boolean blacklisted;

    public static IyzipayResource create(com.personaltrainer.iyzipay.request.CardBlacklistRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/cardstorage/blacklist/card",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                IyzipayResource.class);
    }

    public static IyzipayResource update(CardBlacklistRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/cardstorage/blacklist/card/inactive",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                IyzipayResource.class);
    }

    public static CardBlacklist retrieve(RetrieveCardBlacklistRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/cardstorage/blacklist/card/retrieve",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                CardBlacklist.class);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean isBlacklisted() {
        return blacklisted;
    }

    public void setBlacklisted(boolean blacklisted) {
        this.blacklisted = blacklisted;
    }
}
