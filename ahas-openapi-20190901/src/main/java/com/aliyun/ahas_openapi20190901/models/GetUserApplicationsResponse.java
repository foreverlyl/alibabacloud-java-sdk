// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetUserApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserApplicationsResponseBody body;

    public static GetUserApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserApplicationsResponse self = new GetUserApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public GetUserApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserApplicationsResponse setBody(GetUserApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserApplicationsResponseBody getBody() {
        return this.body;
    }

}
