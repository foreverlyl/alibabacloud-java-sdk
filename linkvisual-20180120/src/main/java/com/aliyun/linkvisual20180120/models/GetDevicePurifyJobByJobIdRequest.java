// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetDevicePurifyJobByJobIdRequest extends TeaModel {
    @NameInMap("JobId")
    @Validation(required = true)
    public String jobId;

    public static GetDevicePurifyJobByJobIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDevicePurifyJobByJobIdRequest self = new GetDevicePurifyJobByJobIdRequest();
        return TeaModel.build(map, self);
    }

    public GetDevicePurifyJobByJobIdRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
