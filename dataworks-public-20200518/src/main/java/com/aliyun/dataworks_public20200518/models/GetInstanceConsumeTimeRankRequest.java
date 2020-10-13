// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceConsumeTimeRankRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("Bizdate")
    @Validation(required = true)
    public String bizdate;

    public static GetInstanceConsumeTimeRankRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceConsumeTimeRankRequest self = new GetInstanceConsumeTimeRankRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceConsumeTimeRankRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetInstanceConsumeTimeRankRequest setBizdate(String bizdate) {
        this.bizdate = bizdate;
        return this;
    }
    public String getBizdate() {
        return this.bizdate;
    }

}