// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartLiveDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static StartLiveDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StartLiveDomainResponse self = new StartLiveDomainResponse();
        return TeaModel.build(map, self);
    }

    public StartLiveDomainResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
