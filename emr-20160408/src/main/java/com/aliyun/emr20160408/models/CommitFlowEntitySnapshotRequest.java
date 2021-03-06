// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CommitFlowEntitySnapshotRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("Message")
    public String message;

    public static CommitFlowEntitySnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CommitFlowEntitySnapshotRequest self = new CommitFlowEntitySnapshotRequest();
        return TeaModel.build(map, self);
    }

    public CommitFlowEntitySnapshotRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CommitFlowEntitySnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CommitFlowEntitySnapshotRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public CommitFlowEntitySnapshotRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public CommitFlowEntitySnapshotRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
