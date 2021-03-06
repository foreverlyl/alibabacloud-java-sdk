// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetLoraNodesTaskResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("SuccessDevEuis")
    public GetLoraNodesTaskResponseBodySuccessDevEuis successDevEuis;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("SuccessCount")
    public Long successCount;

    @NameInMap("TaskState")
    public String taskState;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetLoraNodesTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoraNodesTaskResponseBody self = new GetLoraNodesTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoraNodesTaskResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetLoraNodesTaskResponseBody setSuccessDevEuis(GetLoraNodesTaskResponseBodySuccessDevEuis successDevEuis) {
        this.successDevEuis = successDevEuis;
        return this;
    }
    public GetLoraNodesTaskResponseBodySuccessDevEuis getSuccessDevEuis() {
        return this.successDevEuis;
    }

    public GetLoraNodesTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetLoraNodesTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLoraNodesTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLoraNodesTaskResponseBody setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public GetLoraNodesTaskResponseBody setTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }
    public String getTaskState() {
        return this.taskState;
    }

    public GetLoraNodesTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLoraNodesTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLoraNodesTaskResponseBodySuccessDevEuis extends TeaModel {
        @NameInMap("SuccessDevEui")
        public java.util.List<String> successDevEui;

        public static GetLoraNodesTaskResponseBodySuccessDevEuis build(java.util.Map<String, ?> map) throws Exception {
            GetLoraNodesTaskResponseBodySuccessDevEuis self = new GetLoraNodesTaskResponseBodySuccessDevEuis();
            return TeaModel.build(map, self);
        }

        public GetLoraNodesTaskResponseBodySuccessDevEuis setSuccessDevEui(java.util.List<String> successDevEui) {
            this.successDevEui = successDevEui;
            return this;
        }
        public java.util.List<String> getSuccessDevEui() {
            return this.successDevEui;
        }

    }

}
