// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSGFormConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryMsSGFormConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSGFormConfigRequest self = new QueryMsSGFormConfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsSGFormConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
