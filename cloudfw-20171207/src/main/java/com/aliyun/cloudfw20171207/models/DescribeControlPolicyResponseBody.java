// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeControlPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("PageNo")
    public String pageNo;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Policys")
    public java.util.List<DescribeControlPolicyResponseBodyPolicys> policys;

    public static DescribeControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeControlPolicyResponseBody self = new DescribeControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeControlPolicyResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public DescribeControlPolicyResponseBody setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public DescribeControlPolicyResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeControlPolicyResponseBody setPolicys(java.util.List<DescribeControlPolicyResponseBodyPolicys> policys) {
        this.policys = policys;
        return this;
    }
    public java.util.List<DescribeControlPolicyResponseBodyPolicys> getPolicys() {
        return this.policys;
    }

    public static class DescribeControlPolicyResponseBodyPolicys extends TeaModel {
        @NameInMap("AclUuid")
        public String aclUuid;

        @NameInMap("Destination")
        public String destination;

        @NameInMap("Description")
        public String description;

        @NameInMap("Source")
        public String source;

        @NameInMap("DestPort")
        public String destPort;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Proto")
        public String proto;

        @NameInMap("DestinationType")
        public String destinationType;

        @NameInMap("AclAction")
        public String aclAction;

        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("Direction")
        public String direction;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("HitTimes")
        public Long hitTimes;

        @NameInMap("DestPortType")
        public String destPortType;

        @NameInMap("DestPortGroup")
        public String destPortGroup;

        @NameInMap("SourceGroupType")
        public String sourceGroupType;

        @NameInMap("DestinationGroupType")
        public String destinationGroupType;

        @NameInMap("DnsResult")
        public String dnsResult;

        @NameInMap("DnsResultTime")
        public Long dnsResultTime;

        @NameInMap("Release")
        public String release;

        @NameInMap("HitLastTime")
        public Long hitLastTime;

        @NameInMap("SourceGroupCidrs")
        public java.util.List<String> sourceGroupCidrs;

        @NameInMap("DestinationGroupCidrs")
        public java.util.List<String> destinationGroupCidrs;

        @NameInMap("DestPortGroupPorts")
        public java.util.List<String> destPortGroupPorts;

        public static DescribeControlPolicyResponseBodyPolicys build(java.util.Map<String, ?> map) throws Exception {
            DescribeControlPolicyResponseBodyPolicys self = new DescribeControlPolicyResponseBodyPolicys();
            return TeaModel.build(map, self);
        }

        public DescribeControlPolicyResponseBodyPolicys setAclUuid(String aclUuid) {
            this.aclUuid = aclUuid;
            return this;
        }
        public String getAclUuid() {
            return this.aclUuid;
        }

        public DescribeControlPolicyResponseBodyPolicys setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public DescribeControlPolicyResponseBodyPolicys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeControlPolicyResponseBodyPolicys setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeControlPolicyResponseBodyPolicys setDestPort(String destPort) {
            this.destPort = destPort;
            return this;
        }
        public String getDestPort() {
            return this.destPort;
        }

        public DescribeControlPolicyResponseBodyPolicys setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeControlPolicyResponseBodyPolicys setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public DescribeControlPolicyResponseBodyPolicys setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public DescribeControlPolicyResponseBodyPolicys setAclAction(String aclAction) {
            this.aclAction = aclAction;
            return this;
        }
        public String getAclAction() {
            return this.aclAction;
        }

        public DescribeControlPolicyResponseBodyPolicys setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public DescribeControlPolicyResponseBodyPolicys setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public DescribeControlPolicyResponseBodyPolicys setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeControlPolicyResponseBodyPolicys setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public DescribeControlPolicyResponseBodyPolicys setHitTimes(Long hitTimes) {
            this.hitTimes = hitTimes;
            return this;
        }
        public Long getHitTimes() {
            return this.hitTimes;
        }

        public DescribeControlPolicyResponseBodyPolicys setDestPortType(String destPortType) {
            this.destPortType = destPortType;
            return this;
        }
        public String getDestPortType() {
            return this.destPortType;
        }

        public DescribeControlPolicyResponseBodyPolicys setDestPortGroup(String destPortGroup) {
            this.destPortGroup = destPortGroup;
            return this;
        }
        public String getDestPortGroup() {
            return this.destPortGroup;
        }

        public DescribeControlPolicyResponseBodyPolicys setSourceGroupType(String sourceGroupType) {
            this.sourceGroupType = sourceGroupType;
            return this;
        }
        public String getSourceGroupType() {
            return this.sourceGroupType;
        }

        public DescribeControlPolicyResponseBodyPolicys setDestinationGroupType(String destinationGroupType) {
            this.destinationGroupType = destinationGroupType;
            return this;
        }
        public String getDestinationGroupType() {
            return this.destinationGroupType;
        }

        public DescribeControlPolicyResponseBodyPolicys setDnsResult(String dnsResult) {
            this.dnsResult = dnsResult;
            return this;
        }
        public String getDnsResult() {
            return this.dnsResult;
        }

        public DescribeControlPolicyResponseBodyPolicys setDnsResultTime(Long dnsResultTime) {
            this.dnsResultTime = dnsResultTime;
            return this;
        }
        public Long getDnsResultTime() {
            return this.dnsResultTime;
        }

        public DescribeControlPolicyResponseBodyPolicys setRelease(String release) {
            this.release = release;
            return this;
        }
        public String getRelease() {
            return this.release;
        }

        public DescribeControlPolicyResponseBodyPolicys setHitLastTime(Long hitLastTime) {
            this.hitLastTime = hitLastTime;
            return this;
        }
        public Long getHitLastTime() {
            return this.hitLastTime;
        }

        public DescribeControlPolicyResponseBodyPolicys setSourceGroupCidrs(java.util.List<String> sourceGroupCidrs) {
            this.sourceGroupCidrs = sourceGroupCidrs;
            return this;
        }
        public java.util.List<String> getSourceGroupCidrs() {
            return this.sourceGroupCidrs;
        }

        public DescribeControlPolicyResponseBodyPolicys setDestinationGroupCidrs(java.util.List<String> destinationGroupCidrs) {
            this.destinationGroupCidrs = destinationGroupCidrs;
            return this;
        }
        public java.util.List<String> getDestinationGroupCidrs() {
            return this.destinationGroupCidrs;
        }

        public DescribeControlPolicyResponseBodyPolicys setDestPortGroupPorts(java.util.List<String> destPortGroupPorts) {
            this.destPortGroupPorts = destPortGroupPorts;
            return this;
        }
        public java.util.List<String> getDestPortGroupPorts() {
            return this.destPortGroupPorts;
        }

    }

}
