// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableSiteMonitorsRequest extends TeaModel {
    @NameInMap("TaskIds")
    public String taskIds;

    public static EnableSiteMonitorsRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSiteMonitorsRequest self = new EnableSiteMonitorsRequest();
        return TeaModel.build(map, self);
    }

    public EnableSiteMonitorsRequest setTaskIds(String taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public String getTaskIds() {
        return this.taskIds;
    }

}
