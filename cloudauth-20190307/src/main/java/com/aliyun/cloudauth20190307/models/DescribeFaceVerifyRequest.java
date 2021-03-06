// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceVerifyRequest extends TeaModel {
    @NameInMap("SceneId")
    public Long sceneId;

    @NameInMap("CertifyId")
    public String certifyId;

    public static DescribeFaceVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceVerifyRequest self = new DescribeFaceVerifyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFaceVerifyRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public DescribeFaceVerifyRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

}
