// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionDeviceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVersionDeviceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionDeviceGroupResponseBody self = new DeleteVersionDeviceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVersionDeviceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
