// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120;

import com.aliyun.tea.*;
import com.aliyun.ga20191120.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ga", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AttachDdosToAcceleratorResponse attachDdosToAcceleratorWithOptions(AttachDdosToAcceleratorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachDdosToAccelerator", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new AttachDdosToAcceleratorResponse());
    }

    public AttachDdosToAcceleratorResponse attachDdosToAccelerator(AttachDdosToAcceleratorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachDdosToAcceleratorWithOptions(request, runtime);
    }

    public BandwidthPackageAddAcceleratorResponse bandwidthPackageAddAcceleratorWithOptions(BandwidthPackageAddAcceleratorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BandwidthPackageAddAccelerator", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new BandwidthPackageAddAcceleratorResponse());
    }

    public BandwidthPackageAddAcceleratorResponse bandwidthPackageAddAccelerator(BandwidthPackageAddAcceleratorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bandwidthPackageAddAcceleratorWithOptions(request, runtime);
    }

    public BandwidthPackageRemoveAcceleratorResponse bandwidthPackageRemoveAcceleratorWithOptions(BandwidthPackageRemoveAcceleratorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BandwidthPackageRemoveAccelerator", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new BandwidthPackageRemoveAcceleratorResponse());
    }

    public BandwidthPackageRemoveAcceleratorResponse bandwidthPackageRemoveAccelerator(BandwidthPackageRemoveAcceleratorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bandwidthPackageRemoveAcceleratorWithOptions(request, runtime);
    }

    public ConfigEndpointProbeResponse configEndpointProbeWithOptions(ConfigEndpointProbeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigEndpointProbe", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigEndpointProbeResponse());
    }

    public ConfigEndpointProbeResponse configEndpointProbe(ConfigEndpointProbeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configEndpointProbeWithOptions(request, runtime);
    }

    public CreateAcceleratorResponse createAcceleratorWithOptions(CreateAcceleratorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAccelerator", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAcceleratorResponse());
    }

    public CreateAcceleratorResponse createAccelerator(CreateAcceleratorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAcceleratorWithOptions(request, runtime);
    }

    public CreateBandwidthPackageResponse createBandwidthPackageWithOptions(CreateBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBandwidthPackage", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBandwidthPackageResponse());
    }

    public CreateBandwidthPackageResponse createBandwidthPackage(CreateBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBandwidthPackageWithOptions(request, runtime);
    }

    public CreateEndpointGroupResponse createEndpointGroupWithOptions(CreateEndpointGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEndpointGroup", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEndpointGroupResponse());
    }

    public CreateEndpointGroupResponse createEndpointGroup(CreateEndpointGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEndpointGroupWithOptions(request, runtime);
    }

    public CreateForwardingRulesResponse createForwardingRulesWithOptions(CreateForwardingRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateForwardingRules", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateForwardingRulesResponse());
    }

    public CreateForwardingRulesResponse createForwardingRules(CreateForwardingRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createForwardingRulesWithOptions(request, runtime);
    }

    public CreateIpSetsResponse createIpSetsWithOptions(CreateIpSetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIpSets", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIpSetsResponse());
    }

    public CreateIpSetsResponse createIpSets(CreateIpSetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIpSetsWithOptions(request, runtime);
    }

    public CreateListenerResponse createListenerWithOptions(CreateListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateListener", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateListenerResponse());
    }

    public CreateListenerResponse createListener(CreateListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createListenerWithOptions(request, runtime);
    }

    public DeleteAcceleratorResponse deleteAcceleratorWithOptions(DeleteAcceleratorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAccelerator", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAcceleratorResponse());
    }

    public DeleteAcceleratorResponse deleteAccelerator(DeleteAcceleratorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAcceleratorWithOptions(request, runtime);
    }

    public DeleteBandwidthPackageResponse deleteBandwidthPackageWithOptions(DeleteBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBandwidthPackage", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBandwidthPackageResponse());
    }

    public DeleteBandwidthPackageResponse deleteBandwidthPackage(DeleteBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBandwidthPackageWithOptions(request, runtime);
    }

    public DeleteEndpointGroupResponse deleteEndpointGroupWithOptions(DeleteEndpointGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEndpointGroup", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEndpointGroupResponse());
    }

    public DeleteEndpointGroupResponse deleteEndpointGroup(DeleteEndpointGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEndpointGroupWithOptions(request, runtime);
    }

    public DeleteForwardingRulesResponse deleteForwardingRulesWithOptions(DeleteForwardingRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteForwardingRules", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteForwardingRulesResponse());
    }

    public DeleteForwardingRulesResponse deleteForwardingRules(DeleteForwardingRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteForwardingRulesWithOptions(request, runtime);
    }

    public DeleteIpSetResponse deleteIpSetWithOptions(DeleteIpSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIpSet", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIpSetResponse());
    }

    public DeleteIpSetResponse deleteIpSet(DeleteIpSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIpSetWithOptions(request, runtime);
    }

    public DeleteIpSetsResponse deleteIpSetsWithOptions(DeleteIpSetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIpSets", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIpSetsResponse());
    }

    public DeleteIpSetsResponse deleteIpSets(DeleteIpSetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIpSetsWithOptions(request, runtime);
    }

    public DeleteListenerResponse deleteListenerWithOptions(DeleteListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteListener", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteListenerResponse());
    }

    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteListenerWithOptions(request, runtime);
    }

    public DescribeAcceleratorResponse describeAcceleratorWithOptions(DescribeAcceleratorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccelerator", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAcceleratorResponse());
    }

    public DescribeAcceleratorResponse describeAccelerator(DescribeAcceleratorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAcceleratorWithOptions(request, runtime);
    }

    public DescribeBandwidthPackageResponse describeBandwidthPackageWithOptions(DescribeBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBandwidthPackage", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBandwidthPackageResponse());
    }

    public DescribeBandwidthPackageResponse describeBandwidthPackage(DescribeBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBandwidthPackageWithOptions(request, runtime);
    }

    public DescribeEndpointGroupResponse describeEndpointGroupWithOptions(DescribeEndpointGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEndpointGroup", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEndpointGroupResponse());
    }

    public DescribeEndpointGroupResponse describeEndpointGroup(DescribeEndpointGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEndpointGroupWithOptions(request, runtime);
    }

    public DescribeIpSetResponse describeIpSetWithOptions(DescribeIpSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIpSet", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIpSetResponse());
    }

    public DescribeIpSetResponse describeIpSet(DescribeIpSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpSetWithOptions(request, runtime);
    }

    public DescribeListenerResponse describeListenerWithOptions(DescribeListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeListener", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeListenerResponse());
    }

    public DescribeListenerResponse describeListener(DescribeListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeListenerWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DetachDdosFromAcceleratorResponse detachDdosFromAcceleratorWithOptions(DetachDdosFromAcceleratorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachDdosFromAccelerator", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new DetachDdosFromAcceleratorResponse());
    }

    public DetachDdosFromAcceleratorResponse detachDdosFromAccelerator(DetachDdosFromAcceleratorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachDdosFromAcceleratorWithOptions(request, runtime);
    }

    public ListAccelerateAreasResponse listAccelerateAreasWithOptions(ListAccelerateAreasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAccelerateAreas", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListAccelerateAreasResponse());
    }

    public ListAccelerateAreasResponse listAccelerateAreas(ListAccelerateAreasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAccelerateAreasWithOptions(request, runtime);
    }

    public ListAcceleratorsResponse listAcceleratorsWithOptions(ListAcceleratorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAccelerators", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListAcceleratorsResponse());
    }

    public ListAcceleratorsResponse listAccelerators(ListAcceleratorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAcceleratorsWithOptions(request, runtime);
    }

    public ListAvailableAccelerateAreasResponse listAvailableAccelerateAreasWithOptions(ListAvailableAccelerateAreasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAvailableAccelerateAreas", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListAvailableAccelerateAreasResponse());
    }

    public ListAvailableAccelerateAreasResponse listAvailableAccelerateAreas(ListAvailableAccelerateAreasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAvailableAccelerateAreasWithOptions(request, runtime);
    }

    public ListAvailableBusiRegionsResponse listAvailableBusiRegionsWithOptions(ListAvailableBusiRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAvailableBusiRegions", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListAvailableBusiRegionsResponse());
    }

    public ListAvailableBusiRegionsResponse listAvailableBusiRegions(ListAvailableBusiRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAvailableBusiRegionsWithOptions(request, runtime);
    }

    public ListBandwidthackagesResponse listBandwidthackagesWithOptions(ListBandwidthackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBandwidthackages", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListBandwidthackagesResponse());
    }

    public ListBandwidthackagesResponse listBandwidthackages(ListBandwidthackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBandwidthackagesWithOptions(request, runtime);
    }

    public ListBandwidthPackagesResponse listBandwidthPackagesWithOptions(ListBandwidthPackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBandwidthPackages", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListBandwidthPackagesResponse());
    }

    public ListBandwidthPackagesResponse listBandwidthPackages(ListBandwidthPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBandwidthPackagesWithOptions(request, runtime);
    }

    public ListBusiRegionsResponse listBusiRegionsWithOptions(ListBusiRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBusiRegions", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListBusiRegionsResponse());
    }

    public ListBusiRegionsResponse listBusiRegions(ListBusiRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBusiRegionsWithOptions(request, runtime);
    }

    public ListEndpointGroupsResponse listEndpointGroupsWithOptions(ListEndpointGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEndpointGroups", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListEndpointGroupsResponse());
    }

    public ListEndpointGroupsResponse listEndpointGroups(ListEndpointGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEndpointGroupsWithOptions(request, runtime);
    }

    public ListForwardingRulesResponse listForwardingRulesWithOptions(ListForwardingRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListForwardingRules", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListForwardingRulesResponse());
    }

    public ListForwardingRulesResponse listForwardingRules(ListForwardingRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listForwardingRulesWithOptions(request, runtime);
    }

    public ListIpSetsResponse listIpSetsWithOptions(ListIpSetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIpSets", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListIpSetsResponse());
    }

    public ListIpSetsResponse listIpSets(ListIpSetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIpSetsWithOptions(request, runtime);
    }

    public ListListenersResponse listListenersWithOptions(ListListenersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListListeners", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListListenersResponse());
    }

    public ListListenersResponse listListeners(ListListenersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listListenersWithOptions(request, runtime);
    }

    public ReplaceBandwidthPackageResponse replaceBandwidthPackageWithOptions(ReplaceBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReplaceBandwidthPackage", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new ReplaceBandwidthPackageResponse());
    }

    public ReplaceBandwidthPackageResponse replaceBandwidthPackage(ReplaceBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.replaceBandwidthPackageWithOptions(request, runtime);
    }

    public UpdateAcceleratorResponse updateAcceleratorWithOptions(UpdateAcceleratorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAccelerator", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAcceleratorResponse());
    }

    public UpdateAcceleratorResponse updateAccelerator(UpdateAcceleratorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAcceleratorWithOptions(request, runtime);
    }

    public UpdateBandwidthPackageResponse updateBandwidthPackageWithOptions(UpdateBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateBandwidthPackage", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateBandwidthPackageResponse());
    }

    public UpdateBandwidthPackageResponse updateBandwidthPackage(UpdateBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateBandwidthPackageWithOptions(request, runtime);
    }

    public UpdateEndpointGroupResponse updateEndpointGroupWithOptions(UpdateEndpointGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateEndpointGroup", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateEndpointGroupResponse());
    }

    public UpdateEndpointGroupResponse updateEndpointGroup(UpdateEndpointGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEndpointGroupWithOptions(request, runtime);
    }

    public UpdateEndpointGroupAttributeResponse updateEndpointGroupAttributeWithOptions(UpdateEndpointGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateEndpointGroupAttribute", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateEndpointGroupAttributeResponse());
    }

    public UpdateEndpointGroupAttributeResponse updateEndpointGroupAttribute(UpdateEndpointGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEndpointGroupAttributeWithOptions(request, runtime);
    }

    public UpdateForwardingRulesResponse updateForwardingRulesWithOptions(UpdateForwardingRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateForwardingRules", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateForwardingRulesResponse());
    }

    public UpdateForwardingRulesResponse updateForwardingRules(UpdateForwardingRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateForwardingRulesWithOptions(request, runtime);
    }

    public UpdateIpSetResponse updateIpSetWithOptions(UpdateIpSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateIpSet", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateIpSetResponse());
    }

    public UpdateIpSetResponse updateIpSet(UpdateIpSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIpSetWithOptions(request, runtime);
    }

    public UpdateIpSetsResponse updateIpSetsWithOptions(UpdateIpSetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateIpSets", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateIpSetsResponse());
    }

    public UpdateIpSetsResponse updateIpSets(UpdateIpSetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIpSetsWithOptions(request, runtime);
    }

    public UpdateListenerResponse updateListenerWithOptions(UpdateListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateListener", "2019-11-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateListenerResponse());
    }

    public UpdateListenerResponse updateListener(UpdateListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateListenerWithOptions(request, runtime);
    }
}
