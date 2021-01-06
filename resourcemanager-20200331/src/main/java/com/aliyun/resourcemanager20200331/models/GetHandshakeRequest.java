// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetHandshakeRequest extends TeaModel {
    @NameInMap("HandshakeId")
    @Validation(required = true)
    public String handshakeId;

    public static GetHandshakeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHandshakeRequest self = new GetHandshakeRequest();
        return TeaModel.build(map, self);
    }

    public GetHandshakeRequest setHandshakeId(String handshakeId) {
        this.handshakeId = handshakeId;
        return this;
    }
    public String getHandshakeId() {
        return this.handshakeId;
    }

}
