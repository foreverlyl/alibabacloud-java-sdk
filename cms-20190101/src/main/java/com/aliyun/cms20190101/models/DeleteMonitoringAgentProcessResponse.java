// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitoringAgentProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMonitoringAgentProcessResponseBody body;

    public static DeleteMonitoringAgentProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitoringAgentProcessResponse self = new DeleteMonitoringAgentProcessResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMonitoringAgentProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMonitoringAgentProcessResponse setBody(DeleteMonitoringAgentProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMonitoringAgentProcessResponseBody getBody() {
        return this.body;
    }

}
