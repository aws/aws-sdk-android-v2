/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UnindexedFace
 */
class UnindexedFaceJsonMarshaller {

    public void marshall(UnindexedFace unindexedFace, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (unindexedFace.getReasons() != null) {
            java.util.List<String> reasons = unindexedFace.getReasons();
            jsonWriter.name("Reasons");
            jsonWriter.beginArray();
            for (String reasonsItem : reasons) {
                if (reasonsItem != null) {
                    jsonWriter.value(reasonsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (unindexedFace.getFaceDetail() != null) {
            FaceDetail faceDetail = unindexedFace.getFaceDetail();
            jsonWriter.name("FaceDetail");
            FaceDetailJsonMarshaller.getInstance().marshall(faceDetail, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static UnindexedFaceJsonMarshaller instance;

    public static UnindexedFaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UnindexedFaceJsonMarshaller();
        return instance;
    }
}
