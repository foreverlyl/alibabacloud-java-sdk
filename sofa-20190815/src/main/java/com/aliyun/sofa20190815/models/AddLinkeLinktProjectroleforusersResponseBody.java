// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinktProjectroleforusersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    public static AddLinkeLinktProjectroleforusersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinktProjectroleforusersResponseBody self = new AddLinkeLinktProjectroleforusersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinktProjectroleforusersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeLinktProjectroleforusersResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeLinktProjectroleforusersResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public AddLinkeLinktProjectroleforusersResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public AddLinkeLinktProjectroleforusersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddLinkeLinktProjectroleforusersResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeLinktProjectroleforusersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddLinkeLinktProjectroleforusersResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
