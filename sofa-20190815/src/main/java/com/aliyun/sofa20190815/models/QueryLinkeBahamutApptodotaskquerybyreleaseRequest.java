// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutApptodotaskquerybyreleaseRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ReleaseExternalId")
    public String releaseExternalId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutApptodotaskquerybyreleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutApptodotaskquerybyreleaseRequest self = new QueryLinkeBahamutApptodotaskquerybyreleaseRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutApptodotaskquerybyreleaseRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkeBahamutApptodotaskquerybyreleaseRequest setReleaseExternalId(String releaseExternalId) {
        this.releaseExternalId = releaseExternalId;
        return this;
    }
    public String getReleaseExternalId() {
        return this.releaseExternalId;
    }

    public QueryLinkeBahamutApptodotaskquerybyreleaseRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
