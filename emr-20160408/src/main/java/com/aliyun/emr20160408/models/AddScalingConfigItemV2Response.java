// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class AddScalingConfigItemV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddScalingConfigItemV2ResponseBody body;

    public static AddScalingConfigItemV2Response build(java.util.Map<String, ?> map) throws Exception {
        AddScalingConfigItemV2Response self = new AddScalingConfigItemV2Response();
        return TeaModel.build(map, self);
    }

    public AddScalingConfigItemV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddScalingConfigItemV2Response setBody(AddScalingConfigItemV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public AddScalingConfigItemV2ResponseBody getBody() {
        return this.body;
    }

}
