// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsGuardianAppsRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Start")
    public Long start;

    public static QueryMsGuardianAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsGuardianAppsRequest self = new QueryMsGuardianAppsRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsGuardianAppsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryMsGuardianAppsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMsGuardianAppsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryMsGuardianAppsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsGuardianAppsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
