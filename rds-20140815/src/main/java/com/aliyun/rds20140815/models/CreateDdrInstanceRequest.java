// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDdrInstanceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    @NameInMap("SystemDBCharset")
    public String systemDBCharset;

    @NameInMap("DBInstanceNetType")
    public String DBInstanceNetType;

    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    @NameInMap("SecurityIPList")
    public String securityIPList;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("ConnectionMode")
    public String connectionMode;

    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("UsedTime")
    public String usedTime;

    @NameInMap("Period")
    public String period;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("TunnelId")
    public String tunnelId;

    @NameInMap("RestoreType")
    public String restoreType;

    @NameInMap("BackupSetId")
    public String backupSetId;

    @NameInMap("BackupSetType")
    public String backupSetType;

    @NameInMap("BackupSetRegion")
    public String backupSetRegion;

    @NameInMap("RestoreTime")
    public String restoreTime;

    @NameInMap("SourceRegion")
    public String sourceRegion;

    @NameInMap("SourceDBInstanceName")
    public String sourceDBInstanceName;

    @NameInMap("UserBakSetURL")
    public String userBakSetURL;

    @NameInMap("BakSetName")
    public String bakSetName;

    @NameInMap("HostType")
    public String hostType;

    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    @NameInMap("BinlogName")
    public String binlogName;

    @NameInMap("BinlogPosition")
    public String binlogPosition;

    @NameInMap("BinlogRole")
    public String binlogRole;

    public static CreateDdrInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDdrInstanceRequest self = new CreateDdrInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDdrInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDdrInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDdrInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDdrInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDdrInstanceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDdrInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateDdrInstanceRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public CreateDdrInstanceRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public CreateDdrInstanceRequest setSystemDBCharset(String systemDBCharset) {
        this.systemDBCharset = systemDBCharset;
        return this;
    }
    public String getSystemDBCharset() {
        return this.systemDBCharset;
    }

    public CreateDdrInstanceRequest setDBInstanceNetType(String DBInstanceNetType) {
        this.DBInstanceNetType = DBInstanceNetType;
        return this;
    }
    public String getDBInstanceNetType() {
        return this.DBInstanceNetType;
    }

    public CreateDdrInstanceRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateDdrInstanceRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateDdrInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDdrInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDdrInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateDdrInstanceRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public CreateDdrInstanceRequest setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
        return this;
    }
    public String getConnectionMode() {
        return this.connectionMode;
    }

    public CreateDdrInstanceRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateDdrInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDdrInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateDdrInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDdrInstanceRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateDdrInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDdrInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDdrInstanceRequest setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }
    public String getTunnelId() {
        return this.tunnelId;
    }

    public CreateDdrInstanceRequest setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

    public CreateDdrInstanceRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public CreateDdrInstanceRequest setBackupSetType(String backupSetType) {
        this.backupSetType = backupSetType;
        return this;
    }
    public String getBackupSetType() {
        return this.backupSetType;
    }

    public CreateDdrInstanceRequest setBackupSetRegion(String backupSetRegion) {
        this.backupSetRegion = backupSetRegion;
        return this;
    }
    public String getBackupSetRegion() {
        return this.backupSetRegion;
    }

    public CreateDdrInstanceRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public CreateDdrInstanceRequest setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    public CreateDdrInstanceRequest setSourceDBInstanceName(String sourceDBInstanceName) {
        this.sourceDBInstanceName = sourceDBInstanceName;
        return this;
    }
    public String getSourceDBInstanceName() {
        return this.sourceDBInstanceName;
    }

    public CreateDdrInstanceRequest setUserBakSetURL(String userBakSetURL) {
        this.userBakSetURL = userBakSetURL;
        return this;
    }
    public String getUserBakSetURL() {
        return this.userBakSetURL;
    }

    public CreateDdrInstanceRequest setBakSetName(String bakSetName) {
        this.bakSetName = bakSetName;
        return this;
    }
    public String getBakSetName() {
        return this.bakSetName;
    }

    public CreateDdrInstanceRequest setHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }
    public String getHostType() {
        return this.hostType;
    }

    public CreateDdrInstanceRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public CreateDdrInstanceRequest setBinlogName(String binlogName) {
        this.binlogName = binlogName;
        return this;
    }
    public String getBinlogName() {
        return this.binlogName;
    }

    public CreateDdrInstanceRequest setBinlogPosition(String binlogPosition) {
        this.binlogPosition = binlogPosition;
        return this;
    }
    public String getBinlogPosition() {
        return this.binlogPosition;
    }

    public CreateDdrInstanceRequest setBinlogRole(String binlogRole) {
        this.binlogRole = binlogRole;
        return this;
    }
    public String getBinlogRole() {
        return this.binlogRole;
    }

}
