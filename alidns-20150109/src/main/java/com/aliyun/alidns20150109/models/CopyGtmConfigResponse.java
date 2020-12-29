// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CopyGtmConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CopyGtmConfigResponseBody body;

    public static CopyGtmConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyGtmConfigResponse self = new CopyGtmConfigResponse();
        return TeaModel.build(map, self);
    }

    public CopyGtmConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyGtmConfigResponse setBody(CopyGtmConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyGtmConfigResponseBody getBody() {
        return this.body;
    }

}
