// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class AttachWebHostingCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachWebHostingCertificateResponseBody body;

    public static AttachWebHostingCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachWebHostingCertificateResponse self = new AttachWebHostingCertificateResponse();
        return TeaModel.build(map, self);
    }

    public AttachWebHostingCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachWebHostingCertificateResponse setBody(AttachWebHostingCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachWebHostingCertificateResponseBody getBody() {
        return this.body;
    }

}
