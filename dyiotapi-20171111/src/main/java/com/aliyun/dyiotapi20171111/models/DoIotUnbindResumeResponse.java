// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class DoIotUnbindResumeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DoIotUnbindResumeResponseBody body;

    public static DoIotUnbindResumeResponse build(java.util.Map<String, ?> map) throws Exception {
        DoIotUnbindResumeResponse self = new DoIotUnbindResumeResponse();
        return TeaModel.build(map, self);
    }

    public DoIotUnbindResumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DoIotUnbindResumeResponse setBody(DoIotUnbindResumeResponseBody body) {
        this.body = body;
        return this;
    }
    public DoIotUnbindResumeResponseBody getBody() {
        return this.body;
    }

}
