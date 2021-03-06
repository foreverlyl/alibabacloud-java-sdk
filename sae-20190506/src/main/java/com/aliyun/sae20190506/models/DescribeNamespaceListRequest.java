// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceListRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public DescribeNamespaceListQuery query;

    public static DescribeNamespaceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceListRequest self = new DescribeNamespaceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceListRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNamespaceListRequest setQuery(DescribeNamespaceListQuery query) {
        this.query = query;
        return this;
    }
    public DescribeNamespaceListQuery getQuery() {
        return this.query;
    }

}
