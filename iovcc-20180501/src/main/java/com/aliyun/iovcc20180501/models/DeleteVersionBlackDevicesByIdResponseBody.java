// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionBlackDevicesByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVersionBlackDevicesByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionBlackDevicesByIdResponseBody self = new DeleteVersionBlackDevicesByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVersionBlackDevicesByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
