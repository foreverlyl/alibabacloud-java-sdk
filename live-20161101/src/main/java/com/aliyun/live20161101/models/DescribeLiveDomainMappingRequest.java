// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainMappingRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static DescribeLiveDomainMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainMappingRequest self = new DescribeLiveDomainMappingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainMappingRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
