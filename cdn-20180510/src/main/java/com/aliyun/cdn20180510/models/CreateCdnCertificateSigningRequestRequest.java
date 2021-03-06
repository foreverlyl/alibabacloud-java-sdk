// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnCertificateSigningRequestRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CommonName")
    public String commonName;

    @NameInMap("SANs")
    public String SANs;

    @NameInMap("Organization")
    public String organization;

    @NameInMap("OrganizationUnit")
    public String organizationUnit;

    @NameInMap("Country")
    public String country;

    @NameInMap("State")
    public String state;

    @NameInMap("City")
    public String city;

    @NameInMap("Email")
    public String email;

    public static CreateCdnCertificateSigningRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCdnCertificateSigningRequestRequest self = new CreateCdnCertificateSigningRequestRequest();
        return TeaModel.build(map, self);
    }

    public CreateCdnCertificateSigningRequestRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCdnCertificateSigningRequestRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateCdnCertificateSigningRequestRequest setSANs(String SANs) {
        this.SANs = SANs;
        return this;
    }
    public String getSANs() {
        return this.SANs;
    }

    public CreateCdnCertificateSigningRequestRequest setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public CreateCdnCertificateSigningRequestRequest setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
        return this;
    }
    public String getOrganizationUnit() {
        return this.organizationUnit;
    }

    public CreateCdnCertificateSigningRequestRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreateCdnCertificateSigningRequestRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateCdnCertificateSigningRequestRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public CreateCdnCertificateSigningRequestRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

}
