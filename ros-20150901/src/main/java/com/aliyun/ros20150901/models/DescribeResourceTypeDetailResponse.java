// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class DescribeResourceTypeDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DescribeResourceTypeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceTypeDetailResponse self = new DescribeResourceTypeDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceTypeDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
