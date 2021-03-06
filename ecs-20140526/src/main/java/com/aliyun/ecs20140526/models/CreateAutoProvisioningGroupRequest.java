// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoProvisioningGroupRequest extends TeaModel {
    @NameInMap("LaunchConfiguration")
    public CreateAutoProvisioningGroupRequestLaunchConfiguration launchConfiguration;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("AutoProvisioningGroupName")
    public String autoProvisioningGroupName;

    @NameInMap("AutoProvisioningGroupType")
    public String autoProvisioningGroupType;

    @NameInMap("SpotAllocationStrategy")
    public String spotAllocationStrategy;

    @NameInMap("SpotInstanceInterruptionBehavior")
    public String spotInstanceInterruptionBehavior;

    @NameInMap("SpotInstancePoolsToUseCount")
    public Integer spotInstancePoolsToUseCount;

    @NameInMap("PayAsYouGoAllocationStrategy")
    public String payAsYouGoAllocationStrategy;

    @NameInMap("ExcessCapacityTerminationPolicy")
    public String excessCapacityTerminationPolicy;

    @NameInMap("ValidFrom")
    public String validFrom;

    @NameInMap("ValidUntil")
    public String validUntil;

    @NameInMap("TerminateInstancesWithExpiration")
    public Boolean terminateInstancesWithExpiration;

    @NameInMap("TerminateInstances")
    public Boolean terminateInstances;

    @NameInMap("MaxSpotPrice")
    public Float maxSpotPrice;

    @NameInMap("TotalTargetCapacity")
    public String totalTargetCapacity;

    @NameInMap("PayAsYouGoTargetCapacity")
    public String payAsYouGoTargetCapacity;

    @NameInMap("SpotTargetCapacity")
    public String spotTargetCapacity;

    @NameInMap("DefaultTargetCapacityType")
    public String defaultTargetCapacityType;

    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    @NameInMap("Description")
    public String description;

    @NameInMap("LaunchTemplateConfig")
    public java.util.List<CreateAutoProvisioningGroupRequestLaunchTemplateConfig> launchTemplateConfig;

    @NameInMap("SystemDiskConfig")
    public java.util.List<CreateAutoProvisioningGroupRequestSystemDiskConfig> systemDiskConfig;

    @NameInMap("DataDiskConfig")
    public java.util.List<CreateAutoProvisioningGroupRequestDataDiskConfig> dataDiskConfig;

    public static CreateAutoProvisioningGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoProvisioningGroupRequest self = new CreateAutoProvisioningGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoProvisioningGroupRequest setLaunchConfiguration(CreateAutoProvisioningGroupRequestLaunchConfiguration launchConfiguration) {
        this.launchConfiguration = launchConfiguration;
        return this;
    }
    public CreateAutoProvisioningGroupRequestLaunchConfiguration getLaunchConfiguration() {
        return this.launchConfiguration;
    }

    public CreateAutoProvisioningGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAutoProvisioningGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAutoProvisioningGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAutoProvisioningGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateAutoProvisioningGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAutoProvisioningGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateAutoProvisioningGroupRequest setAutoProvisioningGroupName(String autoProvisioningGroupName) {
        this.autoProvisioningGroupName = autoProvisioningGroupName;
        return this;
    }
    public String getAutoProvisioningGroupName() {
        return this.autoProvisioningGroupName;
    }

    public CreateAutoProvisioningGroupRequest setAutoProvisioningGroupType(String autoProvisioningGroupType) {
        this.autoProvisioningGroupType = autoProvisioningGroupType;
        return this;
    }
    public String getAutoProvisioningGroupType() {
        return this.autoProvisioningGroupType;
    }

    public CreateAutoProvisioningGroupRequest setSpotAllocationStrategy(String spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
        return this;
    }
    public String getSpotAllocationStrategy() {
        return this.spotAllocationStrategy;
    }

    public CreateAutoProvisioningGroupRequest setSpotInstanceInterruptionBehavior(String spotInstanceInterruptionBehavior) {
        this.spotInstanceInterruptionBehavior = spotInstanceInterruptionBehavior;
        return this;
    }
    public String getSpotInstanceInterruptionBehavior() {
        return this.spotInstanceInterruptionBehavior;
    }

    public CreateAutoProvisioningGroupRequest setSpotInstancePoolsToUseCount(Integer spotInstancePoolsToUseCount) {
        this.spotInstancePoolsToUseCount = spotInstancePoolsToUseCount;
        return this;
    }
    public Integer getSpotInstancePoolsToUseCount() {
        return this.spotInstancePoolsToUseCount;
    }

    public CreateAutoProvisioningGroupRequest setPayAsYouGoAllocationStrategy(String payAsYouGoAllocationStrategy) {
        this.payAsYouGoAllocationStrategy = payAsYouGoAllocationStrategy;
        return this;
    }
    public String getPayAsYouGoAllocationStrategy() {
        return this.payAsYouGoAllocationStrategy;
    }

    public CreateAutoProvisioningGroupRequest setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        return this;
    }
    public String getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }

    public CreateAutoProvisioningGroupRequest setValidFrom(String validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    public String getValidFrom() {
        return this.validFrom;
    }

    public CreateAutoProvisioningGroupRequest setValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    public String getValidUntil() {
        return this.validUntil;
    }

    public CreateAutoProvisioningGroupRequest setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
        return this;
    }
    public Boolean getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }

    public CreateAutoProvisioningGroupRequest setTerminateInstances(Boolean terminateInstances) {
        this.terminateInstances = terminateInstances;
        return this;
    }
    public Boolean getTerminateInstances() {
        return this.terminateInstances;
    }

    public CreateAutoProvisioningGroupRequest setMaxSpotPrice(Float maxSpotPrice) {
        this.maxSpotPrice = maxSpotPrice;
        return this;
    }
    public Float getMaxSpotPrice() {
        return this.maxSpotPrice;
    }

    public CreateAutoProvisioningGroupRequest setTotalTargetCapacity(String totalTargetCapacity) {
        this.totalTargetCapacity = totalTargetCapacity;
        return this;
    }
    public String getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    public CreateAutoProvisioningGroupRequest setPayAsYouGoTargetCapacity(String payAsYouGoTargetCapacity) {
        this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
        return this;
    }
    public String getPayAsYouGoTargetCapacity() {
        return this.payAsYouGoTargetCapacity;
    }

    public CreateAutoProvisioningGroupRequest setSpotTargetCapacity(String spotTargetCapacity) {
        this.spotTargetCapacity = spotTargetCapacity;
        return this;
    }
    public String getSpotTargetCapacity() {
        return this.spotTargetCapacity;
    }

    public CreateAutoProvisioningGroupRequest setDefaultTargetCapacityType(String defaultTargetCapacityType) {
        this.defaultTargetCapacityType = defaultTargetCapacityType;
        return this;
    }
    public String getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType;
    }

    public CreateAutoProvisioningGroupRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public CreateAutoProvisioningGroupRequest setLaunchTemplateVersion(String launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public CreateAutoProvisioningGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAutoProvisioningGroupRequest setLaunchTemplateConfig(java.util.List<CreateAutoProvisioningGroupRequestLaunchTemplateConfig> launchTemplateConfig) {
        this.launchTemplateConfig = launchTemplateConfig;
        return this;
    }
    public java.util.List<CreateAutoProvisioningGroupRequestLaunchTemplateConfig> getLaunchTemplateConfig() {
        return this.launchTemplateConfig;
    }

    public CreateAutoProvisioningGroupRequest setSystemDiskConfig(java.util.List<CreateAutoProvisioningGroupRequestSystemDiskConfig> systemDiskConfig) {
        this.systemDiskConfig = systemDiskConfig;
        return this;
    }
    public java.util.List<CreateAutoProvisioningGroupRequestSystemDiskConfig> getSystemDiskConfig() {
        return this.systemDiskConfig;
    }

    public CreateAutoProvisioningGroupRequest setDataDiskConfig(java.util.List<CreateAutoProvisioningGroupRequestDataDiskConfig> dataDiskConfig) {
        this.dataDiskConfig = dataDiskConfig;
        return this;
    }
    public java.util.List<CreateAutoProvisioningGroupRequestDataDiskConfig> getDataDiskConfig() {
        return this.dataDiskConfig;
    }

    public static class CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk extends TeaModel {
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("Description")
        public String description;

        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Device")
        public String device;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Category")
        public String category;

        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        @NameInMap("Encrypted")
        public Boolean encrypted;

        public static CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk self = new CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

    }

    public static class CreateAutoProvisioningGroupRequestLaunchConfigurationTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAutoProvisioningGroupRequestLaunchConfigurationTag build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfigurationTag self = new CreateAutoProvisioningGroupRequestLaunchConfigurationTag();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAutoProvisioningGroupRequestLaunchConfiguration extends TeaModel {
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("IoOptimized")
        public String ioOptimized;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("InstanceDescription")
        public String instanceDescription;

        @NameInMap("KeyPairName")
        public String keyPairName;

        @NameInMap("RamRoleName")
        public String ramRoleName;

        @NameInMap("SecurityEnhancementStrategy")
        public String securityEnhancementStrategy;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        @NameInMap("SystemDiskName")
        public String systemDiskName;

        @NameInMap("SystemDiskDescription")
        public String systemDiskDescription;

        @NameInMap("SystemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

        @NameInMap("PasswordInherit")
        public Boolean passwordInherit;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("CreditSpecification")
        public String creditSpecification;

        @NameInMap("DataDisk")
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk> dataDisk;

        @NameInMap("Tag")
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationTag> tag;

        public static CreateAutoProvisioningGroupRequestLaunchConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfiguration self = new CreateAutoProvisioningGroupRequestLaunchConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSystemDiskName(String systemDiskName) {
            this.systemDiskName = systemDiskName;
            return this;
        }
        public String getSystemDiskName() {
            return this.systemDiskName;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSystemDiskDescription(String systemDiskDescription) {
            this.systemDiskDescription = systemDiskDescription;
            return this;
        }
        public String getSystemDiskDescription() {
            return this.systemDiskDescription;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setPasswordInherit(Boolean passwordInherit) {
            this.passwordInherit = passwordInherit;
            return this;
        }
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setCreditSpecification(String creditSpecification) {
            this.creditSpecification = creditSpecification;
            return this;
        }
        public String getCreditSpecification() {
            return this.creditSpecification;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setDataDisk(java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk> getDataDisk() {
            return this.dataDisk;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setTag(java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationTag> getTag() {
            return this.tag;
        }

    }

    public static class CreateAutoProvisioningGroupRequestLaunchTemplateConfig extends TeaModel {
        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("MaxPrice")
        public Double maxPrice;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("WeightedCapacity")
        public Double weightedCapacity;

        @NameInMap("InstanceType")
        public String instanceType;

        public static CreateAutoProvisioningGroupRequestLaunchTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchTemplateConfig self = new CreateAutoProvisioningGroupRequestLaunchTemplateConfig();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setMaxPrice(Double maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Double getMaxPrice() {
            return this.maxPrice;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setWeightedCapacity(Double weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Double getWeightedCapacity() {
            return this.weightedCapacity;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class CreateAutoProvisioningGroupRequestSystemDiskConfig extends TeaModel {
        @NameInMap("DiskCategory")
        public String diskCategory;

        public static CreateAutoProvisioningGroupRequestSystemDiskConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestSystemDiskConfig self = new CreateAutoProvisioningGroupRequestSystemDiskConfig();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestSystemDiskConfig setDiskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }
        public String getDiskCategory() {
            return this.diskCategory;
        }

    }

    public static class CreateAutoProvisioningGroupRequestDataDiskConfig extends TeaModel {
        @NameInMap("DiskCategory")
        public String diskCategory;

        public static CreateAutoProvisioningGroupRequestDataDiskConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestDataDiskConfig self = new CreateAutoProvisioningGroupRequestDataDiskConfig();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestDataDiskConfig setDiskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }
        public String getDiskCategory() {
            return this.diskCategory;
        }

    }

}
