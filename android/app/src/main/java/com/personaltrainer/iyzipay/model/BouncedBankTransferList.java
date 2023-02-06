package com.personaltrainer.iyzipay.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.request.RetrieveTransactionsRequest;

public class BouncedBankTransferList extends IyzipayResource {

    @SerializedName("bouncedRows")
    private List<com.personaltrainer.iyzipay.model.BankTransfer> bankTransfers;

    public static BouncedBankTransferList retrieve(RetrieveTransactionsRequest request, Options options) {
        return HttpClient.create().post(options.getBaseUrl() + "/reporting/settlement/bounced",
                getHttpProxy(options),
                getHttpHeaders(request, options),
                request,
                BouncedBankTransferList.class);
    }

    public List<com.personaltrainer.iyzipay.model.BankTransfer> getBankTransfers() {
        return bankTransfers;
    }

    public void setBankTransfers(List<BankTransfer> bankTransfers) {
        this.bankTransfers = bankTransfers;
    }
}
