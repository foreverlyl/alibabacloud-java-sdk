// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    public static CreateLaunchTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLaunchTemplateResponseBody self = new CreateLaunchTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLaunchTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLaunchTemplateResponseBody setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

}
