// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListColumnsRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("TableId")
    public String tableId;

    @NameInMap("Logic")
    public Boolean logic;

    public static ListColumnsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListColumnsRequest self = new ListColumnsRequest();
        return TeaModel.build(map, self);
    }

    public ListColumnsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListColumnsRequest setTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }
    public String getTableId() {
        return this.tableId;
    }

    public ListColumnsRequest setLogic(Boolean logic) {
        this.logic = logic;
        return this;
    }
    public Boolean getLogic() {
        return this.logic;
    }

}
