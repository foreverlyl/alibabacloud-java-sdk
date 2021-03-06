// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListNotesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNotesResponseBody body;

    public static ListNotesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNotesResponse self = new ListNotesResponse();
        return TeaModel.build(map, self);
    }

    public ListNotesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNotesResponse setBody(ListNotesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNotesResponseBody getBody() {
        return this.body;
    }

}
