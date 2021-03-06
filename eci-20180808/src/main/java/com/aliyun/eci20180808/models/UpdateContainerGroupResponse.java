// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class UpdateContainerGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateContainerGroupResponseBody body;

    public static UpdateContainerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerGroupResponse self = new UpdateContainerGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContainerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContainerGroupResponse setBody(UpdateContainerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateContainerGroupResponseBody getBody() {
        return this.body;
    }

}
