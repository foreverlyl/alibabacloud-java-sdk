// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ConnectAssistDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConnectAssistDeviceResponseBody body;

    public static ConnectAssistDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ConnectAssistDeviceResponse self = new ConnectAssistDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ConnectAssistDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConnectAssistDeviceResponse setBody(ConnectAssistDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ConnectAssistDeviceResponseBody getBody() {
        return this.body;
    }

}
