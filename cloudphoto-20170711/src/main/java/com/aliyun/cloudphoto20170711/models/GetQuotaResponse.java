// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetQuotaResponseBody body;

    public static GetQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaResponse self = new GetQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQuotaResponse setBody(GetQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQuotaResponseBody getBody() {
        return this.body;
    }

}
