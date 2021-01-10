// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DeleteABTestGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteABTestGroupResponseBody body;

    public static DeleteABTestGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteABTestGroupResponse self = new DeleteABTestGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteABTestGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteABTestGroupResponse setBody(DeleteABTestGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteABTestGroupResponseBody getBody() {
        return this.body;
    }

}
