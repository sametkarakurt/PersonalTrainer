package com.personaltrainer.iyzipay.model;

import com.personaltrainer.iyzipay.HttpClient;
import com.personaltrainer.iyzipay.IyzipayResource;
import com.personaltrainer.iyzipay.Options;
import com.personaltrainer.iyzipay.Request;
import com.personaltrainer.iyzipay.request.ReportingPaymentTransactionRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

public class ReportingPaymentTransaction extends IyzipayResource {

    private List<TransactionDetail> transactions;
    private Integer currentPage;
    private Integer totalPageCount;

    public static ReportingPaymentTransaction create(com.personaltrainer.iyzipay.request.ReportingPaymentTransactionRequest request, Options options) {
        String uri = options.getBaseUrl() + "/v2/reporting/payment/transactions" + getQueryParams(request);
        return HttpClient.create().get(uri,
                getHttpProxy(options),
                getHttpHeadersV2(uri, null, options),
                null,
                ReportingPaymentTransaction.class);
    }

    private static String getQueryParams(Request request) {
        if (request == null) {
            return "";
        }

        String queryParams = "?conversationId=" + request.getConversationId();

        if (StringUtils.isNotBlank(request.getLocale())) {
            queryParams += "&locale=" + request.getLocale();
        }

        if (request instanceof com.personaltrainer.iyzipay.request.ReportingPaymentTransactionRequest) {
            com.personaltrainer.iyzipay.request.ReportingPaymentTransactionRequest reportingPaymentTransactionRequest = (ReportingPaymentTransactionRequest) request;
            if (StringUtils.isNoneEmpty(reportingPaymentTransactionRequest.getTransactionDate())) {
                queryParams += "&transactionDate=" + reportingPaymentTransactionRequest.getTransactionDate();
            }

            if (reportingPaymentTransactionRequest.getPage() != null) {
                queryParams += "&page=" + reportingPaymentTransactionRequest.getPage();
            }
        }
        return queryParams;
    }

    public List<TransactionDetail> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionDetail> transactions) {
        this.transactions = transactions;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(Integer totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
