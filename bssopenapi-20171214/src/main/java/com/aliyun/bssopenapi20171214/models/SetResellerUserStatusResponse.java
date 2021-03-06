// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetResellerUserStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetResellerUserStatusResponseBody body;

    public static SetResellerUserStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetResellerUserStatusResponse self = new SetResellerUserStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetResellerUserStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetResellerUserStatusResponse setBody(SetResellerUserStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetResellerUserStatusResponseBody getBody() {
        return this.body;
    }

}
