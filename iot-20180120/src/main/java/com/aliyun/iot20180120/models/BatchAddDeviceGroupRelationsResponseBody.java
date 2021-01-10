// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchAddDeviceGroupRelationsResponseBody extends TeaModel {
    @NameInMap("ValidDeviceCount")
    public Integer validDeviceCount;

    @NameInMap("SuccessAddedDeviceCount")
    public Integer successAddedDeviceCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExceedTenGroupDeviceCount")
    public Integer exceedTenGroupDeviceCount;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("AlreadyRelatedGroupDeviceCount")
    public Integer alreadyRelatedGroupDeviceCount;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static BatchAddDeviceGroupRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchAddDeviceGroupRelationsResponseBody self = new BatchAddDeviceGroupRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchAddDeviceGroupRelationsResponseBody setValidDeviceCount(Integer validDeviceCount) {
        this.validDeviceCount = validDeviceCount;
        return this;
    }
    public Integer getValidDeviceCount() {
        return this.validDeviceCount;
    }

    public BatchAddDeviceGroupRelationsResponseBody setSuccessAddedDeviceCount(Integer successAddedDeviceCount) {
        this.successAddedDeviceCount = successAddedDeviceCount;
        return this;
    }
    public Integer getSuccessAddedDeviceCount() {
        return this.successAddedDeviceCount;
    }

    public BatchAddDeviceGroupRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchAddDeviceGroupRelationsResponseBody setExceedTenGroupDeviceCount(Integer exceedTenGroupDeviceCount) {
        this.exceedTenGroupDeviceCount = exceedTenGroupDeviceCount;
        return this;
    }
    public Integer getExceedTenGroupDeviceCount() {
        return this.exceedTenGroupDeviceCount;
    }

    public BatchAddDeviceGroupRelationsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchAddDeviceGroupRelationsResponseBody setAlreadyRelatedGroupDeviceCount(Integer alreadyRelatedGroupDeviceCount) {
        this.alreadyRelatedGroupDeviceCount = alreadyRelatedGroupDeviceCount;
        return this;
    }
    public Integer getAlreadyRelatedGroupDeviceCount() {
        return this.alreadyRelatedGroupDeviceCount;
    }

    public BatchAddDeviceGroupRelationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchAddDeviceGroupRelationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
