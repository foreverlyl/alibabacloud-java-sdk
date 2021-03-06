// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricDetailbytypeRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("CommonState")
    public String commonState;

    @NameInMap("Count")
    public Long count;

    @NameInMap("DevStage")
    public String devStage;

    @NameInMap("OriginAppName")
    public String originAppName;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Public")
    public Boolean _public;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("Start")
    public Long start;

    @NameInMap("SubTaskType")
    public String subTaskType;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("UtcCreate")
    public String utcCreate;

    @NameInMap("UtcModified")
    public String utcModified;

    public static QueryLinkefabricFabricDetailbytypeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricDetailbytypeRequest self = new QueryLinkefabricFabricDetailbytypeRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricDetailbytypeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkefabricFabricDetailbytypeRequest setCommonState(String commonState) {
        this.commonState = commonState;
        return this;
    }
    public String getCommonState() {
        return this.commonState;
    }

    public QueryLinkefabricFabricDetailbytypeRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public QueryLinkefabricFabricDetailbytypeRequest setDevStage(String devStage) {
        this.devStage = devStage;
        return this;
    }
    public String getDevStage() {
        return this.devStage;
    }

    public QueryLinkefabricFabricDetailbytypeRequest setOriginAppName(String originAppName) {
        this.originAppName = originAppName;
        return this;
    }
    public String getOriginAppName() {
        return this.originAppName;
    }

    public QueryLinkefabricFabricDetailbytypeRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryLinkefabricFabricDetailbytypeRequest set_public(Boolean _public) {
        this._public = _public;
        return this;
    }
    public Boolean get_public() {
        return this._public;
    }

    public QueryLinkefabricFabricDetailbytypeRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public QueryLinkefabricFabricDetailbytypeRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public QueryLinkefabricFabricDetailbytypeRequest setSubTaskType(String subTaskType) {
        this.subTaskType = subTaskType;
        return this;
    }
    public String getSubTaskType() {
        return this.subTaskType;
    }

    public QueryLinkefabricFabricDetailbytypeRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public QueryLinkefabricFabricDetailbytypeRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public QueryLinkefabricFabricDetailbytypeRequest setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public QueryLinkefabricFabricDetailbytypeRequest setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

}
