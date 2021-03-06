// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotLinksResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("SnapshotLinks")
    public DescribeSnapshotLinksResponseBodySnapshotLinks snapshotLinks;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeSnapshotLinksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotLinksResponseBody self = new DescribeSnapshotLinksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotLinksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSnapshotLinksResponseBody setSnapshotLinks(DescribeSnapshotLinksResponseBodySnapshotLinks snapshotLinks) {
        this.snapshotLinks = snapshotLinks;
        return this;
    }
    public DescribeSnapshotLinksResponseBodySnapshotLinks getSnapshotLinks() {
        return this.snapshotLinks;
    }

    public DescribeSnapshotLinksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnapshotLinksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnapshotLinksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink extends TeaModel {
        @NameInMap("InstantAccess")
        public Boolean instantAccess;

        @NameInMap("TotalSize")
        public Long totalSize;

        @NameInMap("SourceDiskName")
        public String sourceDiskName;

        @NameInMap("SourceDiskSize")
        public Integer sourceDiskSize;

        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("SnapshotLinkId")
        public String snapshotLinkId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Category")
        public String category;

        public static DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink self = new DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setInstantAccess(Boolean instantAccess) {
            this.instantAccess = instantAccess;
            return this;
        }
        public Boolean getInstantAccess() {
            return this.instantAccess;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setSourceDiskName(String sourceDiskName) {
            this.sourceDiskName = sourceDiskName;
            return this;
        }
        public String getSourceDiskName() {
            return this.sourceDiskName;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setSourceDiskSize(Integer sourceDiskSize) {
            this.sourceDiskSize = sourceDiskSize;
            return this;
        }
        public Integer getSourceDiskSize() {
            return this.sourceDiskSize;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setSourceDiskType(String sourceDiskType) {
            this.sourceDiskType = sourceDiskType;
            return this;
        }
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setSnapshotLinkId(String snapshotLinkId) {
            this.snapshotLinkId = snapshotLinkId;
            return this;
        }
        public String getSnapshotLinkId() {
            return this.snapshotLinkId;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

    public static class DescribeSnapshotLinksResponseBodySnapshotLinks extends TeaModel {
        @NameInMap("SnapshotLink")
        public java.util.List<DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink> snapshotLink;

        public static DescribeSnapshotLinksResponseBodySnapshotLinks build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotLinksResponseBodySnapshotLinks self = new DescribeSnapshotLinksResponseBodySnapshotLinks();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinks setSnapshotLink(java.util.List<DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink> snapshotLink) {
            this.snapshotLink = snapshotLink;
            return this;
        }
        public java.util.List<DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink> getSnapshotLink() {
            return this.snapshotLink;
        }

    }

}
