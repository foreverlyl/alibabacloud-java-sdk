// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamsNotifyUrlConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("NotifyUrl")
    @Validation(required = true)
    public String notifyUrl;

    public static SetLiveStreamsNotifyUrlConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamsNotifyUrlConfigRequest self = new SetLiveStreamsNotifyUrlConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamsNotifyUrlConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetLiveStreamsNotifyUrlConfigRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

}
