// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ColorizeImageAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static ColorizeImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ColorizeImageAdvanceRequest self = new ColorizeImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ColorizeImageAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
