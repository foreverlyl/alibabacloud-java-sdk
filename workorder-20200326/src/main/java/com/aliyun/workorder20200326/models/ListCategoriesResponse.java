// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200326.models;

import com.aliyun.tea.*;

public class ListCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCategoriesResponseBody body;

    public static ListCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCategoriesResponse self = new ListCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCategoriesResponse setBody(ListCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCategoriesResponseBody getBody() {
        return this.body;
    }

}
