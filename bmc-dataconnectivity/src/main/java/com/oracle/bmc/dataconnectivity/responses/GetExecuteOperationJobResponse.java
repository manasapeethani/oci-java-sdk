/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.responses;

import com.oracle.bmc.dataconnectivity.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetExecuteOperationJobResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned ExecuteOperationJob instance.
     */
    private com.oracle.bmc.dataconnectivity.model.ExecuteOperationJob executeOperationJob;

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "executeOperationJob"})
    private GetExecuteOperationJobResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.dataconnectivity.model.ExecuteOperationJob executeOperationJob) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.executeOperationJob = executeOperationJob;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetExecuteOperationJobResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            executeOperationJob(o.getExecuteOperationJob());

            return this;
        }

        public GetExecuteOperationJobResponse build() {
            return new GetExecuteOperationJobResponse(
                    __httpStatusCode__, opcRequestId, executeOperationJob);
        }
    }
}
