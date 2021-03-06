// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CompleteBoardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CompleteBoardResponseBody body;

    public static CompleteBoardResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteBoardResponse self = new CompleteBoardResponse();
        return TeaModel.build(map, self);
    }

    public CompleteBoardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompleteBoardResponse setBody(CompleteBoardResponseBody body) {
        this.body = body;
        return this;
    }
    public CompleteBoardResponseBody getBody() {
        return this.body;
    }

}
