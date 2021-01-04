// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class RebootClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RebootClusterResponseBody body;

    public static RebootClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootClusterResponse self = new RebootClusterResponse();
        return TeaModel.build(map, self);
    }

    public RebootClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootClusterResponse setBody(RebootClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootClusterResponseBody getBody() {
        return this.body;
    }

}
