// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableMetricRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableMetricRulesResponseBody body;

    public static DisableMetricRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableMetricRulesResponse self = new DisableMetricRulesResponse();
        return TeaModel.build(map, self);
    }

    public DisableMetricRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableMetricRulesResponse setBody(DisableMetricRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableMetricRulesResponseBody getBody() {
        return this.body;
    }

}
