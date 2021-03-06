// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214;

import com.aliyun.tea.*;
import com.aliyun.rtc_white_board20201214.models.*;
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
        this._endpoint = this.getEndpoint("rtc-white-board", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public SetAppNameResponse setAppNameWithOptions(SetAppNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAppName", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetAppNameResponse());
    }

    public SetAppNameResponse setAppName(SetAppNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAppNameWithOptions(request, runtime);
    }

    public CheckWhiteBoardHostResponse checkWhiteBoardHostWithOptions(CheckWhiteBoardHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckWhiteBoardHost", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new CheckWhiteBoardHostResponse());
    }

    public CheckWhiteBoardHostResponse checkWhiteBoardHost(CheckWhiteBoardHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkWhiteBoardHostWithOptions(request, runtime);
    }

    public GetWhiteBoardProfileCallbackResponse getWhiteBoardProfileCallbackWithOptions(GetWhiteBoardProfileCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetWhiteBoardProfileCallback", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetWhiteBoardProfileCallbackResponse());
    }

    public GetWhiteBoardProfileCallbackResponse getWhiteBoardProfileCallback(GetWhiteBoardProfileCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWhiteBoardProfileCallbackWithOptions(request, runtime);
    }

    public SetAppDomainNamesResponse setAppDomainNamesWithOptions(SetAppDomainNamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAppDomainNames", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetAppDomainNamesResponse());
    }

    public SetAppDomainNamesResponse setAppDomainNames(SetAppDomainNamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAppDomainNamesWithOptions(request, runtime);
    }

    public GetUserPermissionCallbackResponse getUserPermissionCallbackWithOptions(GetUserPermissionCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserPermissionCallback", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserPermissionCallbackResponse());
    }

    public GetUserPermissionCallbackResponse getUserPermissionCallback(GetUserPermissionCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserPermissionCallbackWithOptions(request, runtime);
    }

    public OpenWhiteBoardResponse openWhiteBoardWithOptions(OpenWhiteBoardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenWhiteBoard", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new OpenWhiteBoardResponse());
    }

    public OpenWhiteBoardResponse openWhiteBoard(OpenWhiteBoardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openWhiteBoardWithOptions(request, runtime);
    }

    public RefreshUsersPermissionsResponse refreshUsersPermissionsWithOptions(RefreshUsersPermissionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshUsersPermissions", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshUsersPermissionsResponse());
    }

    public RefreshUsersPermissionsResponse refreshUsersPermissions(RefreshUsersPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshUsersPermissionsWithOptions(request, runtime);
    }

    public GetUserProfileCallbackResponse getUserProfileCallbackWithOptions(GetUserProfileCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserProfileCallback", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserProfileCallbackResponse());
    }

    public GetUserProfileCallbackResponse getUserProfileCallback(GetUserProfileCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserProfileCallbackWithOptions(request, runtime);
    }

    public CreateAppResponse createAppWithOptions(CreateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateApp", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAppResponse());
    }

    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    public SetAppCallbackUrlResponse setAppCallbackUrlWithOptions(SetAppCallbackUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAppCallbackUrl", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetAppCallbackUrlResponse());
    }

    public SetAppCallbackUrlResponse setAppCallbackUrl(SetAppCallbackUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAppCallbackUrlWithOptions(request, runtime);
    }

    public CreateWhiteBoardResponse createWhiteBoardWithOptions(CreateWhiteBoardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateWhiteBoard", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new CreateWhiteBoardResponse());
    }

    public CreateWhiteBoardResponse createWhiteBoard(CreateWhiteBoardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createWhiteBoardWithOptions(request, runtime);
    }

    public SetAppStatusResponse setAppStatusWithOptions(SetAppStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAppStatus", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetAppStatusResponse());
    }

    public SetAppStatusResponse setAppStatus(SetAppStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAppStatusWithOptions(request, runtime);
    }
}
