// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Disks")
    public DescribeDisksResponseBodyDisks disks;

    public static DescribeDisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksResponseBody self = new DescribeDisksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDisksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDisksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDisksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDisksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDisksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDisksResponseBody setDisks(DescribeDisksResponseBodyDisks disks) {
        this.disks = disks;
        return this;
    }
    public DescribeDisksResponseBodyDisks getDisks() {
        return this.disks;
    }

    public static class DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock extends TeaModel {
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock self = new DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskOperationLocks extends TeaModel {
        @NameInMap("OperationLock")
        public java.util.List<DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock> operationLock;

        public static DescribeDisksResponseBodyDisksDiskOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskOperationLocks self = new DescribeDisksResponseBodyDisksDiskOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskOperationLocks setOperationLock(java.util.List<DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock> operationLock) {
            this.operationLock = operationLock;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock> getOperationLock() {
            return this.operationLock;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskTagsTag extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeDisksResponseBodyDisksDiskTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskTagsTag self = new DescribeDisksResponseBodyDisksDiskTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeDisksResponseBodyDisksDiskTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDisksResponseBodyDisksDiskTagsTag> tag;

        public static DescribeDisksResponseBodyDisksDiskTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskTags self = new DescribeDisksResponseBodyDisksDiskTags();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskTags setTag(java.util.List<DescribeDisksResponseBodyDisksDiskTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDisksDiskTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance extends TeaModel {
        @NameInMap("Device")
        public String device;

        @NameInMap("AttachedTime")
        public String attachedTime;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance self = new DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskMountInstances extends TeaModel {
        @NameInMap("MountInstance")
        public java.util.List<DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance> mountInstance;

        public static DescribeDisksResponseBodyDisksDiskMountInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskMountInstances self = new DescribeDisksResponseBodyDisksDiskMountInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskMountInstances setMountInstance(java.util.List<DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance> mountInstance) {
            this.mountInstance = mountInstance;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance> getMountInstance() {
            return this.mountInstance;
        }

    }

    public static class DescribeDisksResponseBodyDisksDisk extends TeaModel {
        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("OperationLocks")
        public DescribeDisksResponseBodyDisksDiskOperationLocks operationLocks;

        @NameInMap("BdfId")
        public String bdfId;

        @NameInMap("EnableAutoSnapshot")
        public Boolean enableAutoSnapshot;

        @NameInMap("StorageSetId")
        public String storageSetId;

        @NameInMap("Tags")
        public DescribeDisksResponseBodyDisksDiskTags tags;

        @NameInMap("StorageSetPartitionNumber")
        public Integer storageSetPartitionNumber;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("MountInstances")
        public DescribeDisksResponseBodyDisksDiskMountInstances mountInstances;

        @NameInMap("DeleteAutoSnapshot")
        public Boolean deleteAutoSnapshot;

        @NameInMap("Encrypted")
        public Boolean encrypted;

        @NameInMap("IOPSRead")
        public Integer IOPSRead;

        @NameInMap("MountInstanceNum")
        public Integer mountInstanceNum;

        @NameInMap("Description")
        public String description;

        @NameInMap("Device")
        public String device;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Portable")
        public Boolean portable;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        @NameInMap("DetachedTime")
        public String detachedTime;

        @NameInMap("SourceSnapshotId")
        public String sourceSnapshotId;

        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        @NameInMap("EnableAutomatedSnapshotPolicy")
        public Boolean enableAutomatedSnapshotPolicy;

        @NameInMap("IOPSWrite")
        public Integer IOPSWrite;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IOPS")
        public Integer IOPS;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("DiskChargeType")
        public String diskChargeType;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("AttachedTime")
        public String attachedTime;

        @NameInMap("Category")
        public String category;

        @NameInMap("ProductCode")
        public String productCode;

        public static DescribeDisksResponseBodyDisksDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDisk self = new DescribeDisksResponseBodyDisksDisk();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDisk setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeDisksResponseBodyDisksDisk setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDisksResponseBodyDisksDisk setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDisksResponseBodyDisksDisk setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDisksResponseBodyDisksDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeDisksResponseBodyDisksDisk setOperationLocks(DescribeDisksResponseBodyDisksDiskOperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public DescribeDisksResponseBodyDisksDiskOperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeDisksResponseBodyDisksDisk setBdfId(String bdfId) {
            this.bdfId = bdfId;
            return this;
        }
        public String getBdfId() {
            return this.bdfId;
        }

        public DescribeDisksResponseBodyDisksDisk setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
            this.enableAutoSnapshot = enableAutoSnapshot;
            return this;
        }
        public Boolean getEnableAutoSnapshot() {
            return this.enableAutoSnapshot;
        }

        public DescribeDisksResponseBodyDisksDisk setStorageSetId(String storageSetId) {
            this.storageSetId = storageSetId;
            return this;
        }
        public String getStorageSetId() {
            return this.storageSetId;
        }

        public DescribeDisksResponseBodyDisksDisk setTags(DescribeDisksResponseBodyDisksDiskTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDisksResponseBodyDisksDiskTags getTags() {
            return this.tags;
        }

        public DescribeDisksResponseBodyDisksDisk setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        public DescribeDisksResponseBodyDisksDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDisksResponseBodyDisksDisk setMountInstances(DescribeDisksResponseBodyDisksDiskMountInstances mountInstances) {
            this.mountInstances = mountInstances;
            return this;
        }
        public DescribeDisksResponseBodyDisksDiskMountInstances getMountInstances() {
            return this.mountInstances;
        }

        public DescribeDisksResponseBodyDisksDisk setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
            this.deleteAutoSnapshot = deleteAutoSnapshot;
            return this;
        }
        public Boolean getDeleteAutoSnapshot() {
            return this.deleteAutoSnapshot;
        }

        public DescribeDisksResponseBodyDisksDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public DescribeDisksResponseBodyDisksDisk setIOPSRead(Integer IOPSRead) {
            this.IOPSRead = IOPSRead;
            return this;
        }
        public Integer getIOPSRead() {
            return this.IOPSRead;
        }

        public DescribeDisksResponseBodyDisksDisk setMountInstanceNum(Integer mountInstanceNum) {
            this.mountInstanceNum = mountInstanceNum;
            return this;
        }
        public Integer getMountInstanceNum() {
            return this.mountInstanceNum;
        }

        public DescribeDisksResponseBodyDisksDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDisksResponseBodyDisksDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeDisksResponseBodyDisksDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeDisksResponseBodyDisksDisk setPortable(Boolean portable) {
            this.portable = portable;
            return this;
        }
        public Boolean getPortable() {
            return this.portable;
        }

        public DescribeDisksResponseBodyDisksDisk setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeDisksResponseBodyDisksDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeDisksResponseBodyDisksDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public DescribeDisksResponseBodyDisksDisk setDetachedTime(String detachedTime) {
            this.detachedTime = detachedTime;
            return this;
        }
        public String getDetachedTime() {
            return this.detachedTime;
        }

        public DescribeDisksResponseBodyDisksDisk setSourceSnapshotId(String sourceSnapshotId) {
            this.sourceSnapshotId = sourceSnapshotId;
            return this;
        }
        public String getSourceSnapshotId() {
            return this.sourceSnapshotId;
        }

        public DescribeDisksResponseBodyDisksDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeDisksResponseBodyDisksDisk setEnableAutomatedSnapshotPolicy(Boolean enableAutomatedSnapshotPolicy) {
            this.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
            return this;
        }
        public Boolean getEnableAutomatedSnapshotPolicy() {
            return this.enableAutomatedSnapshotPolicy;
        }

        public DescribeDisksResponseBodyDisksDisk setIOPSWrite(Integer IOPSWrite) {
            this.IOPSWrite = IOPSWrite;
            return this;
        }
        public Integer getIOPSWrite() {
            return this.IOPSWrite;
        }

        public DescribeDisksResponseBodyDisksDisk setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDisksResponseBodyDisksDisk setIOPS(Integer IOPS) {
            this.IOPS = IOPS;
            return this;
        }
        public Integer getIOPS() {
            return this.IOPS;
        }

        public DescribeDisksResponseBodyDisksDisk setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDisksResponseBodyDisksDisk setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDisksResponseBodyDisksDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeDisksResponseBodyDisksDisk setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDisksResponseBodyDisksDisk setDiskChargeType(String diskChargeType) {
            this.diskChargeType = diskChargeType;
            return this;
        }
        public String getDiskChargeType() {
            return this.diskChargeType;
        }

        public DescribeDisksResponseBodyDisksDisk setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDisksResponseBodyDisksDisk setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public DescribeDisksResponseBodyDisksDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDisksResponseBodyDisksDisk setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class DescribeDisksResponseBodyDisks extends TeaModel {
        @NameInMap("Disk")
        public java.util.List<DescribeDisksResponseBodyDisksDisk> disk;

        public static DescribeDisksResponseBodyDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisks self = new DescribeDisksResponseBodyDisks();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisks setDisk(java.util.List<DescribeDisksResponseBodyDisksDisk> disk) {
            this.disk = disk;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDisksDisk> getDisk() {
            return this.disk;
        }

    }

}
