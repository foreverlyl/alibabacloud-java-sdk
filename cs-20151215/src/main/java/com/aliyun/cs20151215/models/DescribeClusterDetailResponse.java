// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterDetailResponseBody body;

    public static DescribeClusterDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterDetailResponse self = new DescribeClusterDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterDetailResponse setBody(DescribeClusterDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterDetailResponseBody getBody() {
        return this.body;
    }

}
