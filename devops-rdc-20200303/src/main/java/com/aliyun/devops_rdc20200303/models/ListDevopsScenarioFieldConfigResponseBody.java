// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListDevopsScenarioFieldConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Object")
    public java.util.List<ListDevopsScenarioFieldConfigResponseBodyObject> object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Successful")
    public Boolean successful;

    public static ListDevopsScenarioFieldConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDevopsScenarioFieldConfigResponseBody self = new ListDevopsScenarioFieldConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDevopsScenarioFieldConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevopsScenarioFieldConfigResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListDevopsScenarioFieldConfigResponseBody setObject(java.util.List<ListDevopsScenarioFieldConfigResponseBodyObject> object) {
        this.object = object;
        return this;
    }
    public java.util.List<ListDevopsScenarioFieldConfigResponseBodyObject> getObject() {
        return this.object;
    }

    public ListDevopsScenarioFieldConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDevopsScenarioFieldConfigResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static class ListDevopsScenarioFieldConfigResponseBodyObject extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Id")
        public String id;

        public static ListDevopsScenarioFieldConfigResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            ListDevopsScenarioFieldConfigResponseBodyObject self = new ListDevopsScenarioFieldConfigResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public ListDevopsScenarioFieldConfigResponseBodyObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDevopsScenarioFieldConfigResponseBodyObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
