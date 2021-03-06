// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SubscribeDeviceEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubscribeDeviceEventResponseBody body;

    public static SubscribeDeviceEventResponse build(java.util.Map<String, ?> map) throws Exception {
        SubscribeDeviceEventResponse self = new SubscribeDeviceEventResponse();
        return TeaModel.build(map, self);
    }

    public SubscribeDeviceEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubscribeDeviceEventResponse setBody(SubscribeDeviceEventResponseBody body) {
        this.body = body;
        return this;
    }
    public SubscribeDeviceEventResponseBody getBody() {
        return this.body;
    }

}
