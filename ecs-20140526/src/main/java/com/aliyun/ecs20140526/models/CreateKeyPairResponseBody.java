// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateKeyPairResponseBody extends TeaModel {
    @NameInMap("KeyPairFingerPrint")
    public String keyPairFingerPrint;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("KeyPairId")
    public String keyPairId;

    @NameInMap("PrivateKeyBody")
    public String privateKeyBody;

    public static CreateKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyPairResponseBody self = new CreateKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKeyPairResponseBody setKeyPairFingerPrint(String keyPairFingerPrint) {
        this.keyPairFingerPrint = keyPairFingerPrint;
        return this;
    }
    public String getKeyPairFingerPrint() {
        return this.keyPairFingerPrint;
    }

    public CreateKeyPairResponseBody setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateKeyPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateKeyPairResponseBody setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
        return this;
    }
    public String getKeyPairId() {
        return this.keyPairId;
    }

    public CreateKeyPairResponseBody setPrivateKeyBody(String privateKeyBody) {
        this.privateKeyBody = privateKeyBody;
        return this;
    }
    public String getPrivateKeyBody() {
        return this.privateKeyBody;
    }

}
