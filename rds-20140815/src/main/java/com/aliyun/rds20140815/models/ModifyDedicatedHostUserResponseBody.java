// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDedicatedHostUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostUserResponseBody self = new ModifyDedicatedHostUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
