// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class InitApplyRefundResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("SubLmOrderId")
    @Validation(required = true)
    public String subLmOrderId;

    @NameInMap("InitApplyRefundData")
    @Validation(required = true)
    public InitApplyRefundResponseInitApplyRefundData initApplyRefundData;

    public static InitApplyRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        InitApplyRefundResponse self = new InitApplyRefundResponse();
        return TeaModel.build(map, self);
    }

    public InitApplyRefundResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitApplyRefundResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitApplyRefundResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitApplyRefundResponse setSubLmOrderId(String subLmOrderId) {
        this.subLmOrderId = subLmOrderId;
        return this;
    }
    public String getSubLmOrderId() {
        return this.subLmOrderId;
    }

    public InitApplyRefundResponse setInitApplyRefundData(InitApplyRefundResponseInitApplyRefundData initApplyRefundData) {
        this.initApplyRefundData = initApplyRefundData;
        return this;
    }
    public InitApplyRefundResponseInitApplyRefundData getInitApplyRefundData() {
        return this.initApplyRefundData;
    }

    public static class InitApplyRefundResponseInitApplyRefundDataRefundReasonListRefundReasonList extends TeaModel {
        @NameInMap("ReasonTextId")
        @Validation(required = true)
        public Long reasonTextId;

        @NameInMap("ReasonTips")
        @Validation(required = true)
        public String reasonTips;

        @NameInMap("ProofRequired")
        @Validation(required = true)
        public Boolean proofRequired;

        @NameInMap("RefundDescRequired")
        @Validation(required = true)
        public Boolean refundDescRequired;

        public static InitApplyRefundResponseInitApplyRefundDataRefundReasonListRefundReasonList build(java.util.Map<String, ?> map) throws Exception {
            InitApplyRefundResponseInitApplyRefundDataRefundReasonListRefundReasonList self = new InitApplyRefundResponseInitApplyRefundDataRefundReasonListRefundReasonList();
            return TeaModel.build(map, self);
        }

        public InitApplyRefundResponseInitApplyRefundDataRefundReasonListRefundReasonList setReasonTextId(Long reasonTextId) {
            this.reasonTextId = reasonTextId;
            return this;
        }
        public Long getReasonTextId() {
            return this.reasonTextId;
        }

        public InitApplyRefundResponseInitApplyRefundDataRefundReasonListRefundReasonList setReasonTips(String reasonTips) {
            this.reasonTips = reasonTips;
            return this;
        }
        public String getReasonTips() {
            return this.reasonTips;
        }

        public InitApplyRefundResponseInitApplyRefundDataRefundReasonListRefundReasonList setProofRequired(Boolean proofRequired) {
            this.proofRequired = proofRequired;
            return this;
        }
        public Boolean getProofRequired() {
            return this.proofRequired;
        }

        public InitApplyRefundResponseInitApplyRefundDataRefundReasonListRefundReasonList setRefundDescRequired(Boolean refundDescRequired) {
            this.refundDescRequired = refundDescRequired;
            return this;
        }
        public Boolean getRefundDescRequired() {
            return this.refundDescRequired;
        }

    }

    public static class InitApplyRefundResponseInitApplyRefundDataRefundReasonList extends TeaModel {
        @NameInMap("RefundReasonList")
        @Validation(required = true)
        public java.util.List<InitApplyRefundResponseInitApplyRefundDataRefundReasonListRefundReasonList> refundReasonList;

        public static InitApplyRefundResponseInitApplyRefundDataRefundReasonList build(java.util.Map<String, ?> map) throws Exception {
            InitApplyRefundResponseInitApplyRefundDataRefundReasonList self = new InitApplyRefundResponseInitApplyRefundDataRefundReasonList();
            return TeaModel.build(map, self);
        }

        public InitApplyRefundResponseInitApplyRefundDataRefundReasonList setRefundReasonList(java.util.List<InitApplyRefundResponseInitApplyRefundDataRefundReasonListRefundReasonList> refundReasonList) {
            this.refundReasonList = refundReasonList;
            return this;
        }
        public java.util.List<InitApplyRefundResponseInitApplyRefundDataRefundReasonListRefundReasonList> getRefundReasonList() {
            return this.refundReasonList;
        }

    }

    public static class InitApplyRefundResponseInitApplyRefundDataMaxRefundFeeData extends TeaModel {
        @NameInMap("MaxRefundFee")
        @Validation(required = true)
        public Integer maxRefundFee;

        @NameInMap("MinRefundFee")
        @Validation(required = true)
        public Integer minRefundFee;

        public static InitApplyRefundResponseInitApplyRefundDataMaxRefundFeeData build(java.util.Map<String, ?> map) throws Exception {
            InitApplyRefundResponseInitApplyRefundDataMaxRefundFeeData self = new InitApplyRefundResponseInitApplyRefundDataMaxRefundFeeData();
            return TeaModel.build(map, self);
        }

        public InitApplyRefundResponseInitApplyRefundDataMaxRefundFeeData setMaxRefundFee(Integer maxRefundFee) {
            this.maxRefundFee = maxRefundFee;
            return this;
        }
        public Integer getMaxRefundFee() {
            return this.maxRefundFee;
        }

        public InitApplyRefundResponseInitApplyRefundDataMaxRefundFeeData setMinRefundFee(Integer minRefundFee) {
            this.minRefundFee = minRefundFee;
            return this;
        }
        public Integer getMinRefundFee() {
            return this.minRefundFee;
        }

    }

    public static class InitApplyRefundResponseInitApplyRefundData extends TeaModel {
        @NameInMap("BizClaimType")
        @Validation(required = true)
        public Integer bizClaimType;

        @NameInMap("MainOrderRefund")
        @Validation(required = true)
        public Boolean mainOrderRefund;

        @NameInMap("RefundReasonList")
        @Validation(required = true)
        public InitApplyRefundResponseInitApplyRefundDataRefundReasonList refundReasonList;

        @NameInMap("MaxRefundFeeData")
        @Validation(required = true)
        public InitApplyRefundResponseInitApplyRefundDataMaxRefundFeeData maxRefundFeeData;

        public static InitApplyRefundResponseInitApplyRefundData build(java.util.Map<String, ?> map) throws Exception {
            InitApplyRefundResponseInitApplyRefundData self = new InitApplyRefundResponseInitApplyRefundData();
            return TeaModel.build(map, self);
        }

        public InitApplyRefundResponseInitApplyRefundData setBizClaimType(Integer bizClaimType) {
            this.bizClaimType = bizClaimType;
            return this;
        }
        public Integer getBizClaimType() {
            return this.bizClaimType;
        }

        public InitApplyRefundResponseInitApplyRefundData setMainOrderRefund(Boolean mainOrderRefund) {
            this.mainOrderRefund = mainOrderRefund;
            return this;
        }
        public Boolean getMainOrderRefund() {
            return this.mainOrderRefund;
        }

        public InitApplyRefundResponseInitApplyRefundData setRefundReasonList(InitApplyRefundResponseInitApplyRefundDataRefundReasonList refundReasonList) {
            this.refundReasonList = refundReasonList;
            return this;
        }
        public InitApplyRefundResponseInitApplyRefundDataRefundReasonList getRefundReasonList() {
            return this.refundReasonList;
        }

        public InitApplyRefundResponseInitApplyRefundData setMaxRefundFeeData(InitApplyRefundResponseInitApplyRefundDataMaxRefundFeeData maxRefundFeeData) {
            this.maxRefundFeeData = maxRefundFeeData;
            return this;
        }
        public InitApplyRefundResponseInitApplyRefundDataMaxRefundFeeData getMaxRefundFeeData() {
            return this.maxRefundFeeData;
        }

    }

}
