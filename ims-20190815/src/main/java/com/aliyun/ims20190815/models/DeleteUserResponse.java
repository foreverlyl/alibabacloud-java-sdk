// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteUserResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserResponse self = new DeleteUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
