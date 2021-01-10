// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateDataCollectionResponseBody extends TeaModel {
    @NameInMap("result")
    public CreateDataCollectionResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static CreateDataCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataCollectionResponseBody self = new CreateDataCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataCollectionResponseBody setResult(CreateDataCollectionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateDataCollectionResponseBodyResult getResult() {
        return this.result;
    }

    public CreateDataCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDataCollectionResponseBodyResult extends TeaModel {
        @NameInMap("created")
        public Integer created;

        @NameInMap("dataCollectionType")
        public String dataCollectionType;

        @NameInMap("type")
        public String type;

        @NameInMap("industryName")
        public String industryName;

        @NameInMap("status")
        public Integer status;

        @NameInMap("updated")
        public Integer updated;

        @NameInMap("name")
        public String name;

        @NameInMap("sundialId")
        public String sundialId;

        @NameInMap("id")
        public String id;

        public static CreateDataCollectionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateDataCollectionResponseBodyResult self = new CreateDataCollectionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateDataCollectionResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public CreateDataCollectionResponseBodyResult setDataCollectionType(String dataCollectionType) {
            this.dataCollectionType = dataCollectionType;
            return this;
        }
        public String getDataCollectionType() {
            return this.dataCollectionType;
        }

        public CreateDataCollectionResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateDataCollectionResponseBodyResult setIndustryName(String industryName) {
            this.industryName = industryName;
            return this;
        }
        public String getIndustryName() {
            return this.industryName;
        }

        public CreateDataCollectionResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateDataCollectionResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

        public CreateDataCollectionResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataCollectionResponseBodyResult setSundialId(String sundialId) {
            this.sundialId = sundialId;
            return this;
        }
        public String getSundialId() {
            return this.sundialId;
        }

        public CreateDataCollectionResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
