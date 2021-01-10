// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveAppGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveAppGroupResponseBody body;

    public static RemoveAppGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAppGroupResponse self = new RemoveAppGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAppGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAppGroupResponse setBody(RemoveAppGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAppGroupResponseBody getBody() {
        return this.body;
    }

}
