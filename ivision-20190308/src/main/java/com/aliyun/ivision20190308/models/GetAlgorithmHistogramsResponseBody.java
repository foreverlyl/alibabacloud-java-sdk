// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class GetAlgorithmHistogramsResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetAlgorithmHistogramsResponseBodyData data;

    public static GetAlgorithmHistogramsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmHistogramsResponseBody self = new GetAlgorithmHistogramsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmHistogramsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAlgorithmHistogramsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAlgorithmHistogramsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAlgorithmHistogramsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAlgorithmHistogramsResponseBody setData(GetAlgorithmHistogramsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAlgorithmHistogramsResponseBodyData getData() {
        return this.data;
    }

    public static class GetAlgorithmHistogramsResponseBodyDataHistograms extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("SuccessCount")
        public Integer successCount;

        @NameInMap("FailureCount")
        public Integer failureCount;

        public static GetAlgorithmHistogramsResponseBodyDataHistograms build(java.util.Map<String, ?> map) throws Exception {
            GetAlgorithmHistogramsResponseBodyDataHistograms self = new GetAlgorithmHistogramsResponseBodyDataHistograms();
            return TeaModel.build(map, self);
        }

        public GetAlgorithmHistogramsResponseBodyDataHistograms setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public GetAlgorithmHistogramsResponseBodyDataHistograms setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public GetAlgorithmHistogramsResponseBodyDataHistograms setFailureCount(Integer failureCount) {
            this.failureCount = failureCount;
            return this;
        }
        public Integer getFailureCount() {
            return this.failureCount;
        }

    }

    public static class GetAlgorithmHistogramsResponseBodyData extends TeaModel {
        @NameInMap("SuccessCount")
        public Integer successCount;

        @NameInMap("FailureCount")
        public Integer failureCount;

        @NameInMap("Histograms")
        public java.util.List<GetAlgorithmHistogramsResponseBodyDataHistograms> histograms;

        public static GetAlgorithmHistogramsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAlgorithmHistogramsResponseBodyData self = new GetAlgorithmHistogramsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAlgorithmHistogramsResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public GetAlgorithmHistogramsResponseBodyData setFailureCount(Integer failureCount) {
            this.failureCount = failureCount;
            return this;
        }
        public Integer getFailureCount() {
            return this.failureCount;
        }

        public GetAlgorithmHistogramsResponseBodyData setHistograms(java.util.List<GetAlgorithmHistogramsResponseBodyDataHistograms> histograms) {
            this.histograms = histograms;
            return this;
        }
        public java.util.List<GetAlgorithmHistogramsResponseBodyDataHistograms> getHistograms() {
            return this.histograms;
        }

    }

}
