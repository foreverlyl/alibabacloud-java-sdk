// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetScriptFileNamesResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<GetScriptFileNamesResponseBodyResult> result;

    @NameInMap("requestId")
    public String requestId;

    public static GetScriptFileNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScriptFileNamesResponseBody self = new GetScriptFileNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScriptFileNamesResponseBody setResult(java.util.List<GetScriptFileNamesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetScriptFileNamesResponseBodyResult> getResult() {
        return this.result;
    }

    public GetScriptFileNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetScriptFileNamesResponseBodyResult extends TeaModel {
        @NameInMap("fileName")
        public String fileName;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("modifyTime")
        public String modifyTime;

        public static GetScriptFileNamesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetScriptFileNamesResponseBodyResult self = new GetScriptFileNamesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetScriptFileNamesResponseBodyResult setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetScriptFileNamesResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetScriptFileNamesResponseBodyResult setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
