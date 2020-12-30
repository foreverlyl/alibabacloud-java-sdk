// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class SetAlbumCoverResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetAlbumCoverResponseBody body;

    public static SetAlbumCoverResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAlbumCoverResponse self = new SetAlbumCoverResponse();
        return TeaModel.build(map, self);
    }

    public SetAlbumCoverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAlbumCoverResponse setBody(SetAlbumCoverResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAlbumCoverResponseBody getBody() {
        return this.body;
    }

}
