// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableModelInfoRequest extends TeaModel {
    @NameInMap("FirstLevelThemeId")
    public Long firstLevelThemeId;

    @NameInMap("SecondLevelThemeId")
    public Long secondLevelThemeId;

    @NameInMap("LevelId")
    public Long levelId;

    @NameInMap("TableGuid")
    @Validation(required = true)
    public String tableGuid;

    @NameInMap("LevelType")
    public Integer levelType;

    public static UpdateTableModelInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableModelInfoRequest self = new UpdateTableModelInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTableModelInfoRequest setFirstLevelThemeId(Long firstLevelThemeId) {
        this.firstLevelThemeId = firstLevelThemeId;
        return this;
    }
    public Long getFirstLevelThemeId() {
        return this.firstLevelThemeId;
    }

    public UpdateTableModelInfoRequest setSecondLevelThemeId(Long secondLevelThemeId) {
        this.secondLevelThemeId = secondLevelThemeId;
        return this;
    }
    public Long getSecondLevelThemeId() {
        return this.secondLevelThemeId;
    }

    public UpdateTableModelInfoRequest setLevelId(Long levelId) {
        this.levelId = levelId;
        return this;
    }
    public Long getLevelId() {
        return this.levelId;
    }

    public UpdateTableModelInfoRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public UpdateTableModelInfoRequest setLevelType(Integer levelType) {
        this.levelType = levelType;
        return this;
    }
    public Integer getLevelType() {
        return this.levelType;
    }

}
