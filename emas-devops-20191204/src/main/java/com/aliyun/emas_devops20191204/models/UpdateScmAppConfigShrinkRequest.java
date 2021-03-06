// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class UpdateScmAppConfigShrinkRequest extends TeaModel {
    @NameInMap("Bid")
    @Validation(required = true)
    public String bid;

    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("ScmAddr")
    @Validation(required = true)
    public String scmAddr;

    @NameInMap("ScmAccessBid")
    @Validation(required = true)
    public String scmAccessBid;

    @NameInMap("Branch")
    @Validation(required = true)
    public String branch;

    @NameInMap("AppPlatform")
    @Validation(required = true)
    public Integer appPlatform;

    @NameInMap("ContextUserUpdateRequest")
    public String contextUserUpdateRequestShrink;

    public static UpdateScmAppConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScmAppConfigShrinkRequest self = new UpdateScmAppConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScmAppConfigShrinkRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public UpdateScmAppConfigShrinkRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public UpdateScmAppConfigShrinkRequest setScmAddr(String scmAddr) {
        this.scmAddr = scmAddr;
        return this;
    }
    public String getScmAddr() {
        return this.scmAddr;
    }

    public UpdateScmAppConfigShrinkRequest setScmAccessBid(String scmAccessBid) {
        this.scmAccessBid = scmAccessBid;
        return this;
    }
    public String getScmAccessBid() {
        return this.scmAccessBid;
    }

    public UpdateScmAppConfigShrinkRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public UpdateScmAppConfigShrinkRequest setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

    public UpdateScmAppConfigShrinkRequest setContextUserUpdateRequestShrink(String contextUserUpdateRequestShrink) {
        this.contextUserUpdateRequestShrink = contextUserUpdateRequestShrink;
        return this;
    }
    public String getContextUserUpdateRequestShrink() {
        return this.contextUserUpdateRequestShrink;
    }

}
