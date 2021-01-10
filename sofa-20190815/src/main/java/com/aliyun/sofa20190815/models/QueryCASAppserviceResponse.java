// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCASAppserviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCASAppserviceResponseBody body;

    public static QueryCASAppserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCASAppserviceResponse self = new QueryCASAppserviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryCASAppserviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCASAppserviceResponse setBody(QueryCASAppserviceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCASAppserviceResponseBody getBody() {
        return this.body;
    }

}