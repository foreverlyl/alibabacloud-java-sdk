// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapitcdataRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetLinkeBahamutWebapitcdataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapitcdataRequest self = new GetLinkeBahamutWebapitcdataRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapitcdataRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
