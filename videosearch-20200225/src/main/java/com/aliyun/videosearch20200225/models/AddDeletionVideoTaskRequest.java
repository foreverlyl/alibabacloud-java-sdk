// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class AddDeletionVideoTaskRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("VideoId")
    public String videoId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static AddDeletionVideoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDeletionVideoTaskRequest self = new AddDeletionVideoTaskRequest();
        return TeaModel.build(map, self);
    }

    public AddDeletionVideoTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddDeletionVideoTaskRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public AddDeletionVideoTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
