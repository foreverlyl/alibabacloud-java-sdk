// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateBoardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBoardResponseBody body;

    public static CreateBoardResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBoardResponse self = new CreateBoardResponse();
        return TeaModel.build(map, self);
    }

    public CreateBoardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBoardResponse setBody(CreateBoardResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBoardResponseBody getBody() {
        return this.body;
    }

}
