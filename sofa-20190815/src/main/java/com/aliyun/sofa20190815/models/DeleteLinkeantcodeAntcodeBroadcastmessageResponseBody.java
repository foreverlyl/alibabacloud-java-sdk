// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeBroadcastmessageResponseBody extends TeaModel {
    @NameInMap("Status")
    public Boolean status;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DeleteLinkeantcodeAntcodeBroadcastmessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeBroadcastmessageResponseBody self = new DeleteLinkeantcodeAntcodeBroadcastmessageResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeBroadcastmessageResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public DeleteLinkeantcodeAntcodeBroadcastmessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLinkeantcodeAntcodeBroadcastmessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteLinkeantcodeAntcodeBroadcastmessageResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public DeleteLinkeantcodeAntcodeBroadcastmessageResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteLinkeantcodeAntcodeBroadcastmessageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteLinkeantcodeAntcodeBroadcastmessageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
