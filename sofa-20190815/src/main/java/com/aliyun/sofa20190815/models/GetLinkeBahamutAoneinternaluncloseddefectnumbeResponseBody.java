// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternaluncloseddefectnumbeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Result")
    public Long result;

    @NameInMap("Success")
    public Boolean success;

    public static GetLinkeBahamutAoneinternaluncloseddefectnumbeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternaluncloseddefectnumbeResponseBody self = new GetLinkeBahamutAoneinternaluncloseddefectnumbeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternaluncloseddefectnumbeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectnumbeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectnumbeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectnumbeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectnumbeResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectnumbeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectnumbeResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectnumbeResponseBody setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectnumbeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
