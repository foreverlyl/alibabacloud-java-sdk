// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceAutoRenewalAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("Items")
    public DescribeInstanceAutoRenewalAttributeResponseBodyItems items;

    public static DescribeInstanceAutoRenewalAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAutoRenewalAttributeResponseBody self = new DescribeInstanceAutoRenewalAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAutoRenewalAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAutoRenewalAttributeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceAutoRenewalAttributeResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeInstanceAutoRenewalAttributeResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeInstanceAutoRenewalAttributeResponseBody setItems(DescribeInstanceAutoRenewalAttributeResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeInstanceAutoRenewalAttributeResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem extends TeaModel {
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("Status")
        public String status;

        @NameInMap("AutoRenew")
        public String autoRenew;

        public static DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem self = new DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem setAutoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public String getAutoRenew() {
            return this.autoRenew;
        }

    }

    public static class DescribeInstanceAutoRenewalAttributeResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem> item;

        public static DescribeInstanceAutoRenewalAttributeResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAutoRenewalAttributeResponseBodyItems self = new DescribeInstanceAutoRenewalAttributeResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAutoRenewalAttributeResponseBodyItems setItem(java.util.List<DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeInstanceAutoRenewalAttributeResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
