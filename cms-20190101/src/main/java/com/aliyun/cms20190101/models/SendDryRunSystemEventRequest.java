// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class SendDryRunSystemEventRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("EventName")
    public String eventName;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("EventContent")
    public String eventContent;

    public static SendDryRunSystemEventRequest build(java.util.Map<String, ?> map) throws Exception {
        SendDryRunSystemEventRequest self = new SendDryRunSystemEventRequest();
        return TeaModel.build(map, self);
    }

    public SendDryRunSystemEventRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public SendDryRunSystemEventRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public SendDryRunSystemEventRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SendDryRunSystemEventRequest setEventContent(String eventContent) {
        this.eventContent = eventContent;
        return this;
    }
    public String getEventContent() {
        return this.eventContent;
    }

}
