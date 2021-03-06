// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ModifyClriskDataNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyClriskDataNodeResponseBody body;

    public static ModifyClriskDataNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClriskDataNodeResponse self = new ModifyClriskDataNodeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClriskDataNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClriskDataNodeResponse setBody(ModifyClriskDataNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClriskDataNodeResponseBody getBody() {
        return this.body;
    }

}
