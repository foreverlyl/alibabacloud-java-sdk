// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTopicsRequest extends TeaModel {
    @NameInMap("BeginTime")
    @Validation(required = true)
    public String beginTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("TopicTypes")
    public String topicTypes;

    @NameInMap("TopicStatuses")
    public String topicStatuses;

    @NameInMap("NodeId")
    public Long nodeId;

    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    public static ListTopicsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTopicsRequest self = new ListTopicsRequest();
        return TeaModel.build(map, self);
    }

    public ListTopicsRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public ListTopicsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListTopicsRequest setTopicTypes(String topicTypes) {
        this.topicTypes = topicTypes;
        return this;
    }
    public String getTopicTypes() {
        return this.topicTypes;
    }

    public ListTopicsRequest setTopicStatuses(String topicStatuses) {
        this.topicStatuses = topicStatuses;
        return this;
    }
    public String getTopicStatuses() {
        return this.topicStatuses;
    }

    public ListTopicsRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public ListTopicsRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public ListTopicsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListTopicsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTopicsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
