package com.personaltrainer.iyzipay.model;

import java.util.List;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.RetrieveTransactionsRequest;

public class PayoutCompletedTransactionList extends IyzipayResource {

    private List<com.personaltrainer.iyzipay.model.PayoutCompletedTransaction> payoutCompletedTransactions;

    public static PayoutCompletedTransactionList retrieve(RetrieveTransactionsRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/reporting/settlement/payoutcompleted",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                PayoutCompletedTransactionList.class);
    }

    public List<com.personaltrainer.iyzipay.model.PayoutCompletedTransaction> getPayoutCompletedTransactions() {
        return payoutCompletedTransactions;
    }

    public void setPayoutCompletedTransactions(List<PayoutCompletedTransaction> payoutCompletedTransactions) {
        this.payoutCompletedTransactions = payoutCompletedTransactions;
    }
}
