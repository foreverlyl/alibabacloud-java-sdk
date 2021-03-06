// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAvailableAccelerateAreasRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    public static ListAvailableAccelerateAreasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableAccelerateAreasRequest self = new ListAvailableAccelerateAreasRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableAccelerateAreasRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAvailableAccelerateAreasRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

}
