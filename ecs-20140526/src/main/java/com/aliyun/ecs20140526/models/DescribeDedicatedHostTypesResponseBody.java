// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DedicatedHostTypes")
    public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes dedicatedHostTypes;

    public static DescribeDedicatedHostTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostTypesResponseBody self = new DescribeDedicatedHostTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostTypesResponseBody setDedicatedHostTypes(DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes dedicatedHostTypes) {
        this.dedicatedHostTypes = dedicatedHostTypes;
        return this;
    }
    public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes getDedicatedHostTypes() {
        return this.dedicatedHostTypes;
    }

    public static class DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList extends TeaModel {
        @NameInMap("SupportedInstanceTypesList")
        public java.util.List<String> supportedInstanceTypesList;

        public static DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList self = new DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList setSupportedInstanceTypesList(java.util.List<String> supportedInstanceTypesList) {
            this.supportedInstanceTypesList = supportedInstanceTypesList;
            return this;
        }
        public java.util.List<String> getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

    }

    public static class DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies extends TeaModel {
        @NameInMap("SupportedInstanceTypeFamily")
        public java.util.List<String> supportedInstanceTypeFamily;

        public static DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies self = new DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies setSupportedInstanceTypeFamily(java.util.List<String> supportedInstanceTypeFamily) {
            this.supportedInstanceTypeFamily = supportedInstanceTypeFamily;
            return this;
        }
        public java.util.List<String> getSupportedInstanceTypeFamily() {
            return this.supportedInstanceTypeFamily;
        }

    }

    public static class DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType extends TeaModel {
        @NameInMap("Cores")
        public Integer cores;

        @NameInMap("GPUSpec")
        public String GPUSpec;

        @NameInMap("LocalStorageCategory")
        public String localStorageCategory;

        @NameInMap("TotalVcpus")
        public Integer totalVcpus;

        @NameInMap("CpuOverCommitRatioRange")
        public String cpuOverCommitRatioRange;

        @NameInMap("SupportedInstanceTypesList")
        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList supportedInstanceTypesList;

        @NameInMap("PhysicalGpus")
        public Integer physicalGpus;

        @NameInMap("MemorySize")
        public Float memorySize;

        @NameInMap("SupportCpuOverCommitRatio")
        public Boolean supportCpuOverCommitRatio;

        @NameInMap("LocalStorageCapacity")
        public Long localStorageCapacity;

        @NameInMap("LocalStorageAmount")
        public Integer localStorageAmount;

        @NameInMap("DedicatedHostType")
        public String dedicatedHostType;

        @NameInMap("TotalVgpus")
        public Integer totalVgpus;

        @NameInMap("Sockets")
        public Integer sockets;

        @NameInMap("SupportedInstanceTypeFamilies")
        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies supportedInstanceTypeFamilies;

        public static DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType self = new DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setGPUSpec(String GPUSpec) {
            this.GPUSpec = GPUSpec;
            return this;
        }
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setLocalStorageCategory(String localStorageCategory) {
            this.localStorageCategory = localStorageCategory;
            return this;
        }
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setTotalVcpus(Integer totalVcpus) {
            this.totalVcpus = totalVcpus;
            return this;
        }
        public Integer getTotalVcpus() {
            return this.totalVcpus;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setCpuOverCommitRatioRange(String cpuOverCommitRatioRange) {
            this.cpuOverCommitRatioRange = cpuOverCommitRatioRange;
            return this;
        }
        public String getCpuOverCommitRatioRange() {
            return this.cpuOverCommitRatioRange;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setSupportedInstanceTypesList(DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList supportedInstanceTypesList) {
            this.supportedInstanceTypesList = supportedInstanceTypesList;
            return this;
        }
        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setPhysicalGpus(Integer physicalGpus) {
            this.physicalGpus = physicalGpus;
            return this;
        }
        public Integer getPhysicalGpus() {
            return this.physicalGpus;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setMemorySize(Float memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Float getMemorySize() {
            return this.memorySize;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setSupportCpuOverCommitRatio(Boolean supportCpuOverCommitRatio) {
            this.supportCpuOverCommitRatio = supportCpuOverCommitRatio;
            return this;
        }
        public Boolean getSupportCpuOverCommitRatio() {
            return this.supportCpuOverCommitRatio;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setLocalStorageCapacity(Long localStorageCapacity) {
            this.localStorageCapacity = localStorageCapacity;
            return this;
        }
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setLocalStorageAmount(Integer localStorageAmount) {
            this.localStorageAmount = localStorageAmount;
            return this;
        }
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setDedicatedHostType(String dedicatedHostType) {
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }
        public String getDedicatedHostType() {
            return this.dedicatedHostType;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setTotalVgpus(Integer totalVgpus) {
            this.totalVgpus = totalVgpus;
            return this;
        }
        public Integer getTotalVgpus() {
            return this.totalVgpus;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setSockets(Integer sockets) {
            this.sockets = sockets;
            return this;
        }
        public Integer getSockets() {
            return this.sockets;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setSupportedInstanceTypeFamilies(DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies supportedInstanceTypeFamilies) {
            this.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
            return this;
        }
        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies getSupportedInstanceTypeFamilies() {
            return this.supportedInstanceTypeFamilies;
        }

    }

    public static class DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes extends TeaModel {
        @NameInMap("DedicatedHostType")
        public java.util.List<DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType> dedicatedHostType;

        public static DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes self = new DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes setDedicatedHostType(java.util.List<DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType> dedicatedHostType) {
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }
        public java.util.List<DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType> getDedicatedHostType() {
            return this.dedicatedHostType;
        }

    }

}
