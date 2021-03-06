// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateAsrPipelineRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("Name")
    public String name;

    @NameInMap("State")
    public String state;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("NotifyConfig")
    public String notifyConfig;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static UpdateAsrPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAsrPipelineRequest self = new UpdateAsrPipelineRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAsrPipelineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateAsrPipelineRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateAsrPipelineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateAsrPipelineRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public UpdateAsrPipelineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAsrPipelineRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public UpdateAsrPipelineRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateAsrPipelineRequest setNotifyConfig(String notifyConfig) {
        this.notifyConfig = notifyConfig;
        return this;
    }
    public String getNotifyConfig() {
        return this.notifyConfig;
    }

    public UpdateAsrPipelineRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
