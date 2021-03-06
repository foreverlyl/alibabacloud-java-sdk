// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200326.models;

import com.aliyun.tea.*;

public class CloseTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloseTicketResponseBody body;

    public static CloseTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseTicketResponse self = new CloseTicketResponse();
        return TeaModel.build(map, self);
    }

    public CloseTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseTicketResponse setBody(CloseTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseTicketResponseBody getBody() {
        return this.body;
    }

}
