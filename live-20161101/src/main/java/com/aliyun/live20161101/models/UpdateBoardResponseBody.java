// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateBoardResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateBoardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBoardResponseBody self = new UpdateBoardResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBoardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
