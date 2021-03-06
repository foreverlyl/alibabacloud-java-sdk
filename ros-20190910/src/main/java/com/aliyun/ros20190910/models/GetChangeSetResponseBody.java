// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetChangeSetResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Changes")
    public java.util.List<java.util.Map<String, ?>> changes;

    @NameInMap("Description")
    public String description;

    @NameInMap("Parameters")
    public java.util.List<GetChangeSetResponseBodyParameters> parameters;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StatusReason")
    public String statusReason;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("ChangeSetName")
    public String changeSetName;

    @NameInMap("ChangeSetId")
    public String changeSetId;

    @NameInMap("ExecutionStatus")
    public String executionStatus;

    @NameInMap("ChangeSetType")
    public String changeSetType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    @NameInMap("StackName")
    public String stackName;

    @NameInMap("TimeoutInMinutes")
    public Integer timeoutInMinutes;

    @NameInMap("StackId")
    public String stackId;

    public static GetChangeSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChangeSetResponseBody self = new GetChangeSetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChangeSetResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetChangeSetResponseBody setChanges(java.util.List<java.util.Map<String, ?>> changes) {
        this.changes = changes;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getChanges() {
        return this.changes;
    }

    public GetChangeSetResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetChangeSetResponseBody setParameters(java.util.List<GetChangeSetResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetChangeSetResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public GetChangeSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetChangeSetResponseBody setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public GetChangeSetResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetChangeSetResponseBody setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public GetChangeSetResponseBody setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
        return this;
    }
    public String getChangeSetName() {
        return this.changeSetName;
    }

    public GetChangeSetResponseBody setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }
    public String getChangeSetId() {
        return this.changeSetId;
    }

    public GetChangeSetResponseBody setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }
    public String getExecutionStatus() {
        return this.executionStatus;
    }

    public GetChangeSetResponseBody setChangeSetType(String changeSetType) {
        this.changeSetType = changeSetType;
        return this;
    }
    public String getChangeSetType() {
        return this.changeSetType;
    }

    public GetChangeSetResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetChangeSetResponseBody setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public GetChangeSetResponseBody setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public GetChangeSetResponseBody setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public GetChangeSetResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public static class GetChangeSetResponseBodyParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static GetChangeSetResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            GetChangeSetResponseBodyParameters self = new GetChangeSetResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public GetChangeSetResponseBodyParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetChangeSetResponseBodyParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
