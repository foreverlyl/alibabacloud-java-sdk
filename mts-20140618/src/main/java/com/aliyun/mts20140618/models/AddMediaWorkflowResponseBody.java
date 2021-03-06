// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddMediaWorkflowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MediaWorkflow")
    public AddMediaWorkflowResponseBodyMediaWorkflow mediaWorkflow;

    public static AddMediaWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMediaWorkflowResponseBody self = new AddMediaWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMediaWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMediaWorkflowResponseBody setMediaWorkflow(AddMediaWorkflowResponseBodyMediaWorkflow mediaWorkflow) {
        this.mediaWorkflow = mediaWorkflow;
        return this;
    }
    public AddMediaWorkflowResponseBodyMediaWorkflow getMediaWorkflow() {
        return this.mediaWorkflow;
    }

    public static class AddMediaWorkflowResponseBodyMediaWorkflow extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        @NameInMap("State")
        public String state;

        @NameInMap("TriggerMode")
        public String triggerMode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Topology")
        public String topology;

        public static AddMediaWorkflowResponseBodyMediaWorkflow build(java.util.Map<String, ?> map) throws Exception {
            AddMediaWorkflowResponseBodyMediaWorkflow self = new AddMediaWorkflowResponseBodyMediaWorkflow();
            return TeaModel.build(map, self);
        }

        public AddMediaWorkflowResponseBodyMediaWorkflow setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public AddMediaWorkflowResponseBodyMediaWorkflow setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public AddMediaWorkflowResponseBodyMediaWorkflow setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public AddMediaWorkflowResponseBodyMediaWorkflow setTriggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public String getTriggerMode() {
            return this.triggerMode;
        }

        public AddMediaWorkflowResponseBodyMediaWorkflow setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddMediaWorkflowResponseBodyMediaWorkflow setTopology(String topology) {
            this.topology = topology;
            return this;
        }
        public String getTopology() {
            return this.topology;
        }

    }

}
