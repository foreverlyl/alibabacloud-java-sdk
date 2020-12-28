// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetExperimentTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetExperimentTaskResponseBody body;

    public static GetExperimentTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentTaskResponse self = new GetExperimentTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetExperimentTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExperimentTaskResponse setBody(GetExperimentTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentTaskResponseBody getBody() {
        return this.body;
    }

}