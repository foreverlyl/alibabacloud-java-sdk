// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventAttributeResponseBody extends TeaModel {
    @NameInMap("SystemEvents")
    public DescribeSystemEventAttributeResponseBodySystemEvents systemEvents;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public String success;

    public static DescribeSystemEventAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventAttributeResponseBody self = new DescribeSystemEventAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSystemEventAttributeResponseBody setSystemEvents(DescribeSystemEventAttributeResponseBodySystemEvents systemEvents) {
        this.systemEvents = systemEvents;
        return this;
    }
    public DescribeSystemEventAttributeResponseBodySystemEvents getSystemEvents() {
        return this.systemEvents;
    }

    public DescribeSystemEventAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSystemEventAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSystemEventAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSystemEventAttributeResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent extends TeaModel {
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

        public static DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent self = new DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent();
            return TeaModel.build(map, self);
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeSystemEventAttributeResponseBodySystemEvents extends TeaModel {
        @NameInMap("SystemEvent")
        public java.util.List<DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent> systemEvent;

        public static DescribeSystemEventAttributeResponseBodySystemEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventAttributeResponseBodySystemEvents self = new DescribeSystemEventAttributeResponseBodySystemEvents();
            return TeaModel.build(map, self);
        }

        public DescribeSystemEventAttributeResponseBodySystemEvents setSystemEvent(java.util.List<DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent> systemEvent) {
            this.systemEvent = systemEvent;
            return this;
        }
        public java.util.List<DescribeSystemEventAttributeResponseBodySystemEventsSystemEvent> getSystemEvent() {
            return this.systemEvent;
        }

    }

}
