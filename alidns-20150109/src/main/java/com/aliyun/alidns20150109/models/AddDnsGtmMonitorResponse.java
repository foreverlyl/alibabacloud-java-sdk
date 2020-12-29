// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddDnsGtmMonitorResponseBody body;

    public static AddDnsGtmMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDnsGtmMonitorResponse self = new AddDnsGtmMonitorResponse();
        return TeaModel.build(map, self);
    }

    public AddDnsGtmMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDnsGtmMonitorResponse setBody(AddDnsGtmMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDnsGtmMonitorResponseBody getBody() {
        return this.body;
    }

}
