// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricReleasemsgconfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryLinkefabricFabricReleasemsgconfigsResponseBodyData data;

    public static QueryLinkefabricFabricReleasemsgconfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricReleasemsgconfigsResponseBody self = new QueryLinkefabricFabricReleasemsgconfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricReleasemsgconfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricReleasemsgconfigsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricReleasemsgconfigsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricReleasemsgconfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricReleasemsgconfigsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricReleasemsgconfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricReleasemsgconfigsResponseBody setData(QueryLinkefabricFabricReleasemsgconfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkefabricFabricReleasemsgconfigsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricReleasemsgconfigsResponseBodyData extends TeaModel {
        @NameInMap("AppConfigMap")
        public String appConfigMap;

        @NameInMap("ReleaseId")
        public String releaseId;

        @NameInMap("AppList")
        public java.util.List<String> appList;

        public static QueryLinkefabricFabricReleasemsgconfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricReleasemsgconfigsResponseBodyData self = new QueryLinkefabricFabricReleasemsgconfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricReleasemsgconfigsResponseBodyData setAppConfigMap(String appConfigMap) {
            this.appConfigMap = appConfigMap;
            return this;
        }
        public String getAppConfigMap() {
            return this.appConfigMap;
        }

        public QueryLinkefabricFabricReleasemsgconfigsResponseBodyData setReleaseId(String releaseId) {
            this.releaseId = releaseId;
            return this;
        }
        public String getReleaseId() {
            return this.releaseId;
        }

        public QueryLinkefabricFabricReleasemsgconfigsResponseBodyData setAppList(java.util.List<String> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<String> getAppList() {
            return this.appList;
        }

    }

}
