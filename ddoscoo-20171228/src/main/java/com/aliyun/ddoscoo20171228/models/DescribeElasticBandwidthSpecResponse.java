// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeElasticBandwidthSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeElasticBandwidthSpecResponseBody body;

    public static DescribeElasticBandwidthSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticBandwidthSpecResponse self = new DescribeElasticBandwidthSpecResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElasticBandwidthSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeElasticBandwidthSpecResponse setBody(DescribeElasticBandwidthSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeElasticBandwidthSpecResponseBody getBody() {
        return this.body;
    }

}
