// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAStaticUpgradeJobRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("FirmwareId")
    public String firmwareId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("TargetSelection")
    public String targetSelection;

    @NameInMap("ScheduleTime")
    public Long scheduleTime;

    @NameInMap("RetryInterval")
    public Integer retryInterval;

    @NameInMap("RetryCount")
    public Integer retryCount;

    @NameInMap("TimeoutInMinutes")
    public Integer timeoutInMinutes;

    @NameInMap("MaximumPerMinute")
    public Integer maximumPerMinute;

    @NameInMap("GrayPercent")
    public String grayPercent;

    @NameInMap("ScheduleFinishTime")
    public Long scheduleFinishTime;

    @NameInMap("OverwriteMode")
    public Integer overwriteMode;

    @NameInMap("DnListFileUrl")
    public String dnListFileUrl;

    @NameInMap("SrcVersion")
    public java.util.List<String> srcVersion;

    @NameInMap("TargetDeviceName")
    public java.util.List<String> targetDeviceName;

    @NameInMap("Tag")
    public java.util.List<CreateOTAStaticUpgradeJobRequestTag> tag;

    public static CreateOTAStaticUpgradeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAStaticUpgradeJobRequest self = new CreateOTAStaticUpgradeJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateOTAStaticUpgradeJobRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public CreateOTAStaticUpgradeJobRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public CreateOTAStaticUpgradeJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateOTAStaticUpgradeJobRequest setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public CreateOTAStaticUpgradeJobRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateOTAStaticUpgradeJobRequest setTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
        return this;
    }
    public String getTargetSelection() {
        return this.targetSelection;
    }

    public CreateOTAStaticUpgradeJobRequest setScheduleTime(Long scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public Long getScheduleTime() {
        return this.scheduleTime;
    }

    public CreateOTAStaticUpgradeJobRequest setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public CreateOTAStaticUpgradeJobRequest setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public Integer getRetryCount() {
        return this.retryCount;
    }

    public CreateOTAStaticUpgradeJobRequest setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public CreateOTAStaticUpgradeJobRequest setMaximumPerMinute(Integer maximumPerMinute) {
        this.maximumPerMinute = maximumPerMinute;
        return this;
    }
    public Integer getMaximumPerMinute() {
        return this.maximumPerMinute;
    }

    public CreateOTAStaticUpgradeJobRequest setGrayPercent(String grayPercent) {
        this.grayPercent = grayPercent;
        return this;
    }
    public String getGrayPercent() {
        return this.grayPercent;
    }

    public CreateOTAStaticUpgradeJobRequest setScheduleFinishTime(Long scheduleFinishTime) {
        this.scheduleFinishTime = scheduleFinishTime;
        return this;
    }
    public Long getScheduleFinishTime() {
        return this.scheduleFinishTime;
    }

    public CreateOTAStaticUpgradeJobRequest setOverwriteMode(Integer overwriteMode) {
        this.overwriteMode = overwriteMode;
        return this;
    }
    public Integer getOverwriteMode() {
        return this.overwriteMode;
    }

    public CreateOTAStaticUpgradeJobRequest setDnListFileUrl(String dnListFileUrl) {
        this.dnListFileUrl = dnListFileUrl;
        return this;
    }
    public String getDnListFileUrl() {
        return this.dnListFileUrl;
    }

    public CreateOTAStaticUpgradeJobRequest setSrcVersion(java.util.List<String> srcVersion) {
        this.srcVersion = srcVersion;
        return this;
    }
    public java.util.List<String> getSrcVersion() {
        return this.srcVersion;
    }

    public CreateOTAStaticUpgradeJobRequest setTargetDeviceName(java.util.List<String> targetDeviceName) {
        this.targetDeviceName = targetDeviceName;
        return this;
    }
    public java.util.List<String> getTargetDeviceName() {
        return this.targetDeviceName;
    }

    public CreateOTAStaticUpgradeJobRequest setTag(java.util.List<CreateOTAStaticUpgradeJobRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateOTAStaticUpgradeJobRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateOTAStaticUpgradeJobRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateOTAStaticUpgradeJobRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateOTAStaticUpgradeJobRequestTag self = new CreateOTAStaticUpgradeJobRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateOTAStaticUpgradeJobRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateOTAStaticUpgradeJobRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
