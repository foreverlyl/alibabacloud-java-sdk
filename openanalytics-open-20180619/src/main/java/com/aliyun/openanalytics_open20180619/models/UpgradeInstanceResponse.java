// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class UpgradeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeInstanceResponseBody body;

    public static UpgradeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInstanceResponse self = new UpgradeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeInstanceResponse setBody(UpgradeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeInstanceResponseBody getBody() {
        return this.body;
    }

}
