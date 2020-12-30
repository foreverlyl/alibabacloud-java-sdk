// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainSrcBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainSrcBpsDataResponseBody body;

    public static DescribeDomainSrcBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSrcBpsDataResponse self = new DescribeDomainSrcBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSrcBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainSrcBpsDataResponse setBody(DescribeDomainSrcBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainSrcBpsDataResponseBody getBody() {
        return this.body;
    }

}