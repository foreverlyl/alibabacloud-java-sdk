// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForUpdatingContactInfoByNewContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveBatchTaskForUpdatingContactInfoByNewContactResponseBody body;

    public static SaveBatchTaskForUpdatingContactInfoByNewContactResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForUpdatingContactInfoByNewContactResponse self = new SaveBatchTaskForUpdatingContactInfoByNewContactResponse();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBatchTaskForUpdatingContactInfoByNewContactResponse setBody(SaveBatchTaskForUpdatingContactInfoByNewContactResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForUpdatingContactInfoByNewContactResponseBody getBody() {
        return this.body;
    }

}
