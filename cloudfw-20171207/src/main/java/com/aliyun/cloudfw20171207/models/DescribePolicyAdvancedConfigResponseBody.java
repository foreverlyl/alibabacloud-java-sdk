// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePolicyAdvancedConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InternetSwitch")
    public String internetSwitch;

    public static DescribePolicyAdvancedConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyAdvancedConfigResponseBody self = new DescribePolicyAdvancedConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolicyAdvancedConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolicyAdvancedConfigResponseBody setInternetSwitch(String internetSwitch) {
        this.internetSwitch = internetSwitch;
        return this;
    }
    public String getInternetSwitch() {
        return this.internetSwitch;
    }

}
