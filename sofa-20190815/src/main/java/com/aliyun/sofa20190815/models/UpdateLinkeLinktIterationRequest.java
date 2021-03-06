// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktIterationRequest extends TeaModel {
    @NameInMap("BeginDate")
    public Long beginDate;

    @NameInMap("CreatedAt")
    public Long createdAt;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("Deleted")
    public Boolean deleted;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("Id")
    public Long id;

    @NameInMap("IterationSign")
    public String iterationSign;

    @NameInMap("Locked")
    public Boolean locked;

    @NameInMap("Name")
    public String name;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("Region")
    public String region;

    @NameInMap("UpdatedAt")
    public Long updatedAt;

    public static UpdateLinkeLinktIterationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktIterationRequest self = new UpdateLinkeLinktIterationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktIterationRequest setBeginDate(Long beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public Long getBeginDate() {
        return this.beginDate;
    }

    public UpdateLinkeLinktIterationRequest setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public UpdateLinkeLinktIterationRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public UpdateLinkeLinktIterationRequest setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public UpdateLinkeLinktIterationRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public UpdateLinkeLinktIterationRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeLinktIterationRequest setIterationSign(String iterationSign) {
        this.iterationSign = iterationSign;
        return this;
    }
    public String getIterationSign() {
        return this.iterationSign;
    }

    public UpdateLinkeLinktIterationRequest setLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }
    public Boolean getLocked() {
        return this.locked;
    }

    public UpdateLinkeLinktIterationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLinkeLinktIterationRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateLinkeLinktIterationRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public UpdateLinkeLinktIterationRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateLinkeLinktIterationRequest setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
