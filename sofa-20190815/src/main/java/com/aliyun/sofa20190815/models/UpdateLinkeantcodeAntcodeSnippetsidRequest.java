// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeSnippetsidRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ParamJsonStr")
    public String paramJsonStr;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static UpdateLinkeantcodeAntcodeSnippetsidRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeSnippetsidRequest self = new UpdateLinkeantcodeAntcodeSnippetsidRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeSnippetsidRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidRequest setParamJsonStr(String paramJsonStr) {
        this.paramJsonStr = paramJsonStr;
        return this;
    }
    public String getParamJsonStr() {
        return this.paramJsonStr;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
