// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifyInstanceTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTypeResponseBody self = new ModifyInstanceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
