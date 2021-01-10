// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DeleteUisNetworkInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUisNetworkInterfaceResponseBody body;

    public static DeleteUisNetworkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUisNetworkInterfaceResponse self = new DeleteUisNetworkInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUisNetworkInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUisNetworkInterfaceResponse setBody(DeleteUisNetworkInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUisNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

}
