// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518;

import com.aliyun.tea.*;
import com.aliyun.antiddos_public20170518.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("antiddos-public", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public DescribeBgpPackByIpResponse describeBgpPackByIpWithOptions(DescribeBgpPackByIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBgpPackByIp", "2017-05-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBgpPackByIpResponse());
    }

    public DescribeBgpPackByIpResponse describeBgpPackByIp(DescribeBgpPackByIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBgpPackByIpWithOptions(request, runtime);
    }

    public DescribeBgpPackElasticThresholdResponse describeBgpPackElasticThresholdWithOptions(DescribeBgpPackElasticThresholdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBgpPackElasticThreshold", "2017-05-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBgpPackElasticThresholdResponse());
    }

    public DescribeBgpPackElasticThresholdResponse describeBgpPackElasticThreshold(DescribeBgpPackElasticThresholdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBgpPackElasticThresholdWithOptions(request, runtime);
    }

    public DescribeCapResponse describeCapWithOptions(DescribeCapRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCap", "2017-05-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCapResponse());
    }

    public DescribeCapResponse describeCap(DescribeCapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCapWithOptions(request, runtime);
    }

    public DescribeCreditInfoResponse describeCreditInfoWithOptions(DescribeCreditInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCreditInfo", "2017-05-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCreditInfoResponse());
    }

    public DescribeCreditInfoResponse describeCreditInfo(DescribeCreditInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCreditInfoWithOptions(request, runtime);
    }

    public DescribeDdosCountResponse describeDdosCountWithOptions(DescribeDdosCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDdosCount", "2017-05-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDdosCountResponse());
    }

    public DescribeDdosCountResponse describeDdosCount(DescribeDdosCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDdosCountWithOptions(request, runtime);
    }

    public DescribeDdosCreditResponse describeDdosCreditWithOptions(DescribeDdosCreditRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDdosCredit", "2017-05-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDdosCreditResponse());
    }

    public DescribeDdosCreditResponse describeDdosCredit(DescribeDdosCreditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDdosCreditWithOptions(request, runtime);
    }

    public DescribeDdosEventListResponse describeDdosEventListWithOptions(DescribeDdosEventListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDdosEventList", "2017-05-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDdosEventListResponse());
    }

    public DescribeDdosEventListResponse describeDdosEventList(DescribeDdosEventListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDdosEventListWithOptions(request, runtime);
    }

    public DescribeDdosThresholdResponse describeDdosThresholdWithOptions(DescribeDdosThresholdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDdosThreshold", "2017-05-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDdosThresholdResponse());
    }

    public DescribeDdosThresholdResponse describeDdosThreshold(DescribeDdosThresholdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDdosThresholdWithOptions(request, runtime);
    }

    public DescribeFlexibleProtectionFlowResponse describeFlexibleProtectionFlowWithOptions(DescribeFlexibleProtectionFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlexibleProtectionFlow", "2017-05-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlexibleProtectionFlowResponse());
    }

    public DescribeFlexibleProtectionFlowResponse describeFlexibleProtectionFlow(DescribeFlexibleProtectionFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlexibleProtectionFlowWithOptions(request, runtime);
    }

    public DescribeFlowgraphResponse describeFlowgraphWithOptions(DescribeFlowgraphRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowgraph", "2017-05-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowgraphResponse());
    }

    public DescribeFlowgraphResponse describeFlowgraph(DescribeFlowgraphRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowgraphWithOptions(request, runtime);
    }

    public DescribeRegionDdosThresholdResponse describeRegionDdosThresholdWithOptions(DescribeRegionDdosThresholdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegionDdosThreshold", "2017-05-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionDdosThresholdResponse());
    }

    public DescribeRegionDdosThresholdResponse describeRegionDdosThreshold(DescribeRegionDdosThresholdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionDdosThresholdWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2017-05-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeTrafficInfoResponse describeTrafficInfoWithOptions(DescribeTrafficInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTrafficInfo", "2017-05-18", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTrafficInfoResponse());
    }

    public DescribeTrafficInfoResponse describeTrafficInfo(DescribeTrafficInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTrafficInfoWithOptions(request, runtime);
    }

    public ModifyDdosStatusResponse modifyDdosStatusWithOptions(ModifyDdosStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDdosStatus", "2017-05-18", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDdosStatusResponse());
    }

    public ModifyDdosStatusResponse modifyDdosStatus(ModifyDdosStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDdosStatusWithOptions(request, runtime);
    }

    public ModifyDefenseThresholdResponse modifyDefenseThresholdWithOptions(ModifyDefenseThresholdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDefenseThreshold", "2017-05-18", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDefenseThresholdResponse());
    }

    public ModifyDefenseThresholdResponse modifyDefenseThreshold(ModifyDefenseThresholdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDefenseThresholdWithOptions(request, runtime);
    }
}
