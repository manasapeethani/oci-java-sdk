/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.requests;

import com.oracle.bmc.recovery.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/recovery/GetRecoveryServiceSubnetExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetRecoveryServiceSubnetRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
public class GetRecoveryServiceSubnetRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The recovery service subnet OCID. */
    private String recoveryServiceSubnetId;

    /** The recovery service subnet OCID. */
    public String getRecoveryServiceSubnetId() {
        return recoveryServiceSubnetId;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetRecoveryServiceSubnetRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The recovery service subnet OCID. */
        private String recoveryServiceSubnetId = null;

        /**
         * The recovery service subnet OCID.
         *
         * @param recoveryServiceSubnetId the value to set
         * @return this builder instance
         */
        public Builder recoveryServiceSubnetId(String recoveryServiceSubnetId) {
            this.recoveryServiceSubnetId = recoveryServiceSubnetId;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(GetRecoveryServiceSubnetRequest o) {
            recoveryServiceSubnetId(o.getRecoveryServiceSubnetId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetRecoveryServiceSubnetRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetRecoveryServiceSubnetRequest
         */
        public GetRecoveryServiceSubnetRequest build() {
            GetRecoveryServiceSubnetRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetRecoveryServiceSubnetRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetRecoveryServiceSubnetRequest
         */
        public GetRecoveryServiceSubnetRequest buildWithoutInvocationCallback() {
            GetRecoveryServiceSubnetRequest request = new GetRecoveryServiceSubnetRequest();
            request.recoveryServiceSubnetId = recoveryServiceSubnetId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetRecoveryServiceSubnetRequest(recoveryServiceSubnetId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .recoveryServiceSubnetId(recoveryServiceSubnetId)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",recoveryServiceSubnetId=").append(String.valueOf(this.recoveryServiceSubnetId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetRecoveryServiceSubnetRequest)) {
            return false;
        }

        GetRecoveryServiceSubnetRequest other = (GetRecoveryServiceSubnetRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.recoveryServiceSubnetId, other.recoveryServiceSubnetId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.recoveryServiceSubnetId == null
                                ? 43
                                : this.recoveryServiceSubnetId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}