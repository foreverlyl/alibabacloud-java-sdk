// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RealTimeSnapshotCommandRequest extends TeaModel {
    @NameInMap("Command")
    @Validation(required = true)
    public String command;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("StreamName")
    @Validation(required = true)
    public String streamName;

    @NameInMap("Mode")
    public Integer mode;

    @NameInMap("Interval")
    public Integer interval;

    public static RealTimeSnapshotCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        RealTimeSnapshotCommandRequest self = new RealTimeSnapshotCommandRequest();
        return TeaModel.build(map, self);
    }

    public RealTimeSnapshotCommandRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public RealTimeSnapshotCommandRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public RealTimeSnapshotCommandRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public RealTimeSnapshotCommandRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public RealTimeSnapshotCommandRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public RealTimeSnapshotCommandRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

}
