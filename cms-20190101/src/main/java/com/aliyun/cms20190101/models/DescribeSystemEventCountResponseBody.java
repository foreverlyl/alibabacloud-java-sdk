// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventCountResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SystemEventCounts")
    public DescribeSystemEventCountResponseBodySystemEventCounts systemEventCounts;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public String success;

    public static DescribeSystemEventCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventCountResponseBody self = new DescribeSystemEventCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSystemEventCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSystemEventCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSystemEventCountResponseBody setSystemEventCounts(DescribeSystemEventCountResponseBodySystemEventCounts systemEventCounts) {
        this.systemEventCounts = systemEventCounts;
        return this;
    }
    public DescribeSystemEventCountResponseBodySystemEventCounts getSystemEventCounts() {
        return this.systemEventCounts;
    }

    public DescribeSystemEventCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSystemEventCountResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSystemEventCountResponseBodySystemEventCountsSystemEventCount extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Time")
        public Long time;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Product")
        public String product;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Num")
        public Long num;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Content")
        public String content;

        @NameInMap("Level")
        public String level;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeSystemEventCountResponseBodySystemEventCountsSystemEventCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventCountResponseBodySystemEventCountsSystemEventCount self = new DescribeSystemEventCountResponseBodySystemEventCountsSystemEventCount();
            return TeaModel.build(map, self);
        }

        public DescribeSystemEventCountResponseBodySystemEventCountsSystemEventCount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSystemEventCountResponseBodySystemEventCountsSystemEventCount setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeSystemEventCountResponseBodySystemEventCountsSystemEventCount setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeSystemEventCountResponseBodySystemEventCountsSystemEventCount setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeSystemEventCountResponseBodySystemEventCountsSystemEventCount setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeSystemEventCountResponseBodySystemEventCountsSystemEventCount setNum(Long num) {
            this.num = num;
            return this;
        }
        public Long getNum() {
            return this.num;
        }

        public DescribeSystemEventCountResponseBodySystemEventCountsSystemEventCount setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeSystemEventCountResponseBodySystemEventCountsSystemEventCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSystemEventCountResponseBodySystemEventCountsSystemEventCount setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeSystemEventCountResponseBodySystemEventCountsSystemEventCount setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeSystemEventCountResponseBodySystemEventCountsSystemEventCount setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeSystemEventCountResponseBodySystemEventCounts extends TeaModel {
        @NameInMap("SystemEventCount")
        public java.util.List<DescribeSystemEventCountResponseBodySystemEventCountsSystemEventCount> systemEventCount;

        public static DescribeSystemEventCountResponseBodySystemEventCounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventCountResponseBodySystemEventCounts self = new DescribeSystemEventCountResponseBodySystemEventCounts();
            return TeaModel.build(map, self);
        }

        public DescribeSystemEventCountResponseBodySystemEventCounts setSystemEventCount(java.util.List<DescribeSystemEventCountResponseBodySystemEventCountsSystemEventCount> systemEventCount) {
            this.systemEventCount = systemEventCount;
            return this;
        }
        public java.util.List<DescribeSystemEventCountResponseBodySystemEventCountsSystemEventCount> getSystemEventCount() {
            return this.systemEventCount;
        }

    }

}
