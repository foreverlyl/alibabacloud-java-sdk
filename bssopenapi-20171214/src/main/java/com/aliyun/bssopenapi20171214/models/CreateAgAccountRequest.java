// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateAgAccountRequest extends TeaModel {
    @NameInMap("LoginEmail")
    public String loginEmail;

    @NameInMap("AccountAttr")
    public String accountAttr;

    @NameInMap("EnterpriseName")
    public String enterpriseName;

    @NameInMap("FirstName")
    public String firstName;

    @NameInMap("LastName")
    public String lastName;

    @NameInMap("NationCode")
    public String nationCode;

    @NameInMap("ProvinceName")
    public String provinceName;

    @NameInMap("CityName")
    public String cityName;

    @NameInMap("Postcode")
    public String postcode;

    public static CreateAgAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgAccountRequest self = new CreateAgAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgAccountRequest setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
        return this;
    }
    public String getLoginEmail() {
        return this.loginEmail;
    }

    public CreateAgAccountRequest setAccountAttr(String accountAttr) {
        this.accountAttr = accountAttr;
        return this;
    }
    public String getAccountAttr() {
        return this.accountAttr;
    }

    public CreateAgAccountRequest setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public CreateAgAccountRequest setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public CreateAgAccountRequest setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public String getLastName() {
        return this.lastName;
    }

    public CreateAgAccountRequest setNationCode(String nationCode) {
        this.nationCode = nationCode;
        return this;
    }
    public String getNationCode() {
        return this.nationCode;
    }

    public CreateAgAccountRequest setProvinceName(String provinceName) {
        this.provinceName = provinceName;
        return this;
    }
    public String getProvinceName() {
        return this.provinceName;
    }

    public CreateAgAccountRequest setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }
    public String getCityName() {
        return this.cityName;
    }

    public CreateAgAccountRequest setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }
    public String getPostcode() {
        return this.postcode;
    }

}
