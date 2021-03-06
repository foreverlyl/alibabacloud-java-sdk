// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListUpstreamAppServersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppServers")
    public ListUpstreamAppServersResponseBodyAppServers appServers;

    public static ListUpstreamAppServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUpstreamAppServersResponseBody self = new ListUpstreamAppServersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUpstreamAppServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUpstreamAppServersResponseBody setAppServers(ListUpstreamAppServersResponseBodyAppServers appServers) {
        this.appServers = appServers;
        return this;
    }
    public ListUpstreamAppServersResponseBodyAppServers getAppServers() {
        return this.appServers;
    }

    public static class ListUpstreamAppServersResponseBodyAppServersPagination extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("TotalPageCount")
        public Integer totalPageCount;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListUpstreamAppServersResponseBodyAppServersPagination build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamAppServersResponseBodyAppServersPagination self = new ListUpstreamAppServersResponseBodyAppServersPagination();
            return TeaModel.build(map, self);
        }

        public ListUpstreamAppServersResponseBodyAppServersPagination setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListUpstreamAppServersResponseBodyAppServersPagination setTotalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

        public ListUpstreamAppServersResponseBodyAppServersPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUpstreamAppServersResponseBodyAppServersPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListUpstreamAppServersResponseBodyAppServersList extends TeaModel {
        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("QueueNameList")
        public String queueNameList;

        @NameInMap("PAppKey")
        public String PAppKey;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static ListUpstreamAppServersResponseBodyAppServersList build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamAppServersResponseBodyAppServersList self = new ListUpstreamAppServersResponseBodyAppServersList();
            return TeaModel.build(map, self);
        }

        public ListUpstreamAppServersResponseBodyAppServersList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListUpstreamAppServersResponseBodyAppServersList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListUpstreamAppServersResponseBodyAppServersList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public ListUpstreamAppServersResponseBodyAppServersList setQueueNameList(String queueNameList) {
            this.queueNameList = queueNameList;
            return this;
        }
        public String getQueueNameList() {
            return this.queueNameList;
        }

        public ListUpstreamAppServersResponseBodyAppServersList setPAppKey(String PAppKey) {
            this.PAppKey = PAppKey;
            return this;
        }
        public String getPAppKey() {
            return this.PAppKey;
        }

        public ListUpstreamAppServersResponseBodyAppServersList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListUpstreamAppServersResponseBodyAppServersList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUpstreamAppServersResponseBodyAppServersList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListUpstreamAppServersResponseBodyAppServers extends TeaModel {
        @NameInMap("Pagination")
        public ListUpstreamAppServersResponseBodyAppServersPagination pagination;

        @NameInMap("List")
        public java.util.List<ListUpstreamAppServersResponseBodyAppServersList> list;

        public static ListUpstreamAppServersResponseBodyAppServers build(java.util.Map<String, ?> map) throws Exception {
            ListUpstreamAppServersResponseBodyAppServers self = new ListUpstreamAppServersResponseBodyAppServers();
            return TeaModel.build(map, self);
        }

        public ListUpstreamAppServersResponseBodyAppServers setPagination(ListUpstreamAppServersResponseBodyAppServersPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListUpstreamAppServersResponseBodyAppServersPagination getPagination() {
            return this.pagination;
        }

        public ListUpstreamAppServersResponseBodyAppServers setList(java.util.List<ListUpstreamAppServersResponseBodyAppServersList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListUpstreamAppServersResponseBodyAppServersList> getList() {
            return this.list;
        }

    }

}
