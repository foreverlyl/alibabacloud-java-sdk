// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateFaceUserResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    public static UpdateFaceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceUserResponse self = new UpdateFaceUserResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFaceUserResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateFaceUserResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateFaceUserResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateFaceUserResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
