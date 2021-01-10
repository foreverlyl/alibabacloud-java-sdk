// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRecordResponseBody body;

    public static DescribeRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordResponse self = new DescribeRecordResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecordResponse setBody(DescribeRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecordResponseBody getBody() {
        return this.body;
    }

}
