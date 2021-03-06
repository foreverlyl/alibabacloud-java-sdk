// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeHttpCodeDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("RealTimeHttpCodeData")
    public DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData realTimeHttpCodeData;

    public static DescribeDcdnDomainRealTimeHttpCodeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeHttpCodeDataResponseBody self = new DescribeDcdnDomainRealTimeHttpCodeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeHttpCodeDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainRealTimeHttpCodeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainRealTimeHttpCodeDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainRealTimeHttpCodeDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainRealTimeHttpCodeDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainRealTimeHttpCodeDataResponseBody setRealTimeHttpCodeData(DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData realTimeHttpCodeData) {
        this.realTimeHttpCodeData = realTimeHttpCodeData;
        return this;
    }
    public DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData getRealTimeHttpCodeData() {
        return this.realTimeHttpCodeData;
    }

    public static class DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Proportion")
        public String proportion;

        @NameInMap("Count")
        public String count;

        public static DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData self = new DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

        public DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

    }

    public static class DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue extends TeaModel {
        @NameInMap("RealTimeCodeProportionData")
        public java.util.List<DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData> realTimeCodeProportionData;

        public static DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue self = new DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue setRealTimeCodeProportionData(java.util.List<DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData> realTimeCodeProportionData) {
            this.realTimeCodeProportionData = realTimeCodeProportionData;
            return this;
        }
        public java.util.List<DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValueRealTimeCodeProportionData> getRealTimeCodeProportionData() {
            return this.realTimeCodeProportionData;
        }

    }

    public static class DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData extends TeaModel {
        @NameInMap("Value")
        public DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue value;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData self = new DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData setValue(DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue value) {
            this.value = value;
            return this;
        }
        public DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageDataValue getValue() {
            return this.value;
        }

        public DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData> usageData;

        public static DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData self = new DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeData setUsageData(java.util.List<DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<DescribeDcdnDomainRealTimeHttpCodeDataResponseBodyRealTimeHttpCodeDataUsageData> getUsageData() {
            return this.usageData;
        }

    }

}
