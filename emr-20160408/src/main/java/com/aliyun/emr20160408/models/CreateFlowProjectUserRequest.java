// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateFlowProjectUserRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("User")
    public java.util.List<CreateFlowProjectUserRequestUser> user;

    public static CreateFlowProjectUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowProjectUserRequest self = new CreateFlowProjectUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowProjectUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateFlowProjectUserRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateFlowProjectUserRequest setUser(java.util.List<CreateFlowProjectUserRequestUser> user) {
        this.user = user;
        return this;
    }
    public java.util.List<CreateFlowProjectUserRequestUser> getUser() {
        return this.user;
    }

    public static class CreateFlowProjectUserRequestUser extends TeaModel {
        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        public static CreateFlowProjectUserRequestUser build(java.util.Map<String, ?> map) throws Exception {
            CreateFlowProjectUserRequestUser self = new CreateFlowProjectUserRequestUser();
            return TeaModel.build(map, self);
        }

        public CreateFlowProjectUserRequestUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CreateFlowProjectUserRequestUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
