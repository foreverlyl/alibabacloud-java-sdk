// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAITemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TemplateId")
    @Validation(required = true)
    public String templateId;

    public static GetAITemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAITemplateRequest self = new GetAITemplateRequest();
        return TeaModel.build(map, self);
    }

}
