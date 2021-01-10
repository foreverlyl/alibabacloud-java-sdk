// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetGatewayBySubDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetGatewayBySubDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetGatewayBySubDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayBySubDeviceResponseBody self = new GetGatewayBySubDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayBySubDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGatewayBySubDeviceResponseBody setData(GetGatewayBySubDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayBySubDeviceResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayBySubDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetGatewayBySubDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGatewayBySubDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGatewayBySubDeviceResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("UtcActive")
        public String utcActive;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        @NameInMap("GmtOnline")
        public String gmtOnline;

        @NameInMap("region")
        public String region;

        @NameInMap("iotId")
        public String iotId;

        @NameInMap("UtcOnline")
        public String utcOnline;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("DeviceSecret")
        public String deviceSecret;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtActive")
        public String gmtActive;

        public static GetGatewayBySubDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayBySubDeviceResponseBodyData self = new GetGatewayBySubDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayBySubDeviceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetGatewayBySubDeviceResponseBodyData setUtcActive(String utcActive) {
            this.utcActive = utcActive;
            return this;
        }
        public String getUtcActive() {
            return this.utcActive;
        }

        public GetGatewayBySubDeviceResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetGatewayBySubDeviceResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetGatewayBySubDeviceResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public GetGatewayBySubDeviceResponseBodyData setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public GetGatewayBySubDeviceResponseBodyData setGmtOnline(String gmtOnline) {
            this.gmtOnline = gmtOnline;
            return this;
        }
        public String getGmtOnline() {
            return this.gmtOnline;
        }

        public GetGatewayBySubDeviceResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetGatewayBySubDeviceResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public GetGatewayBySubDeviceResponseBodyData setUtcOnline(String utcOnline) {
            this.utcOnline = utcOnline;
            return this;
        }
        public String getUtcOnline() {
            return this.utcOnline;
        }

        public GetGatewayBySubDeviceResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public GetGatewayBySubDeviceResponseBodyData setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public GetGatewayBySubDeviceResponseBodyData setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetGatewayBySubDeviceResponseBodyData setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public GetGatewayBySubDeviceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGatewayBySubDeviceResponseBodyData setGmtActive(String gmtActive) {
            this.gmtActive = gmtActive;
            return this;
        }
        public String getGmtActive() {
            return this.gmtActive;
        }

    }

}
