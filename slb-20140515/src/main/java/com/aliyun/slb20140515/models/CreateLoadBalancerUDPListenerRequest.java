// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerUDPListenerRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("ListenerPort")
    public Integer listenerPort;

    @NameInMap("BackendServerPort")
    public Integer backendServerPort;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("Scheduler")
    public String scheduler;

    @NameInMap("PersistenceTimeout")
    public Integer persistenceTimeout;

    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    @NameInMap("HealthCheckConnectTimeout")
    public Integer healthCheckConnectTimeout;

    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    @NameInMap("healthCheckInterval")
    public Integer healthCheckInterval;

    @NameInMap("healthCheckReq")
    public String healthCheckReq;

    @NameInMap("healthCheckExp")
    public String healthCheckExp;

    @NameInMap("MaxConnection")
    public Integer maxConnection;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("access_key_id")
    public String accessKeyId;

    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    @NameInMap("MasterSlaveServerGroupId")
    public String masterSlaveServerGroupId;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("AclId")
    public String aclId;

    @NameInMap("AclType")
    public String aclType;

    @NameInMap("AclStatus")
    public String aclStatus;

    @NameInMap("VpcIds")
    public String vpcIds;

    @NameInMap("Description")
    public String description;

    @NameInMap("ConnectionDrain")
    public String connectionDrain;

    @NameInMap("ConnectionDrainTimeout")
    public Integer connectionDrainTimeout;

    @NameInMap("PortRange")
    public java.util.List<CreateLoadBalancerUDPListenerRequestPortRange> portRange;

    public static CreateLoadBalancerUDPListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerUDPListenerRequest self = new CreateLoadBalancerUDPListenerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerUDPListenerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLoadBalancerUDPListenerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLoadBalancerUDPListenerRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateLoadBalancerUDPListenerRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateLoadBalancerUDPListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateLoadBalancerUDPListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public CreateLoadBalancerUDPListenerRequest setBackendServerPort(Integer backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Integer getBackendServerPort() {
        return this.backendServerPort;
    }

    public CreateLoadBalancerUDPListenerRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateLoadBalancerUDPListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public CreateLoadBalancerUDPListenerRequest setPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
        return this;
    }
    public Integer getPersistenceTimeout() {
        return this.persistenceTimeout;
    }

    public CreateLoadBalancerUDPListenerRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public CreateLoadBalancerUDPListenerRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public CreateLoadBalancerUDPListenerRequest setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
        this.healthCheckConnectTimeout = healthCheckConnectTimeout;
        return this;
    }
    public Integer getHealthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
    }

    public CreateLoadBalancerUDPListenerRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public CreateLoadBalancerUDPListenerRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public CreateLoadBalancerUDPListenerRequest setHealthCheckReq(String healthCheckReq) {
        this.healthCheckReq = healthCheckReq;
        return this;
    }
    public String getHealthCheckReq() {
        return this.healthCheckReq;
    }

    public CreateLoadBalancerUDPListenerRequest setHealthCheckExp(String healthCheckExp) {
        this.healthCheckExp = healthCheckExp;
        return this;
    }
    public String getHealthCheckExp() {
        return this.healthCheckExp;
    }

    public CreateLoadBalancerUDPListenerRequest setMaxConnection(Integer maxConnection) {
        this.maxConnection = maxConnection;
        return this;
    }
    public Integer getMaxConnection() {
        return this.maxConnection;
    }

    public CreateLoadBalancerUDPListenerRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateLoadBalancerUDPListenerRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public CreateLoadBalancerUDPListenerRequest setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public CreateLoadBalancerUDPListenerRequest setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
        this.masterSlaveServerGroupId = masterSlaveServerGroupId;
        return this;
    }
    public String getMasterSlaveServerGroupId() {
        return this.masterSlaveServerGroupId;
    }

    public CreateLoadBalancerUDPListenerRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateLoadBalancerUDPListenerRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public CreateLoadBalancerUDPListenerRequest setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public CreateLoadBalancerUDPListenerRequest setAclStatus(String aclStatus) {
        this.aclStatus = aclStatus;
        return this;
    }
    public String getAclStatus() {
        return this.aclStatus;
    }

    public CreateLoadBalancerUDPListenerRequest setVpcIds(String vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }
    public String getVpcIds() {
        return this.vpcIds;
    }

    public CreateLoadBalancerUDPListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLoadBalancerUDPListenerRequest setConnectionDrain(String connectionDrain) {
        this.connectionDrain = connectionDrain;
        return this;
    }
    public String getConnectionDrain() {
        return this.connectionDrain;
    }

    public CreateLoadBalancerUDPListenerRequest setConnectionDrainTimeout(Integer connectionDrainTimeout) {
        this.connectionDrainTimeout = connectionDrainTimeout;
        return this;
    }
    public Integer getConnectionDrainTimeout() {
        return this.connectionDrainTimeout;
    }

    public CreateLoadBalancerUDPListenerRequest setPortRange(java.util.List<CreateLoadBalancerUDPListenerRequestPortRange> portRange) {
        this.portRange = portRange;
        return this;
    }
    public java.util.List<CreateLoadBalancerUDPListenerRequestPortRange> getPortRange() {
        return this.portRange;
    }

    public static class CreateLoadBalancerUDPListenerRequestPortRange extends TeaModel {
        public static CreateLoadBalancerUDPListenerRequestPortRange build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerUDPListenerRequestPortRange self = new CreateLoadBalancerUDPListenerRequestPortRange();
            return TeaModel.build(map, self);
        }

    }

}
