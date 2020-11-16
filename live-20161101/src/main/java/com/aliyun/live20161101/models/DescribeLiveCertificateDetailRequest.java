// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCertificateDetailRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("CertName")
    @Validation(required = true)
    public String certName;

    public static DescribeLiveCertificateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCertificateDetailRequest self = new DescribeLiveCertificateDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCertificateDetailRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeLiveCertificateDetailRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

}
