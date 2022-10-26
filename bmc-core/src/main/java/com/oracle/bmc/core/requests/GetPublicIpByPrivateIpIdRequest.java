/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetPublicIpByPrivateIpIdExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetPublicIpByPrivateIpIdRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetPublicIpByPrivateIpIdRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.GetPublicIpByPrivateIpIdDetails> {

    /** Private IP details for fetching the public IP. */
    private com.oracle.bmc.core.model.GetPublicIpByPrivateIpIdDetails
            getPublicIpByPrivateIpIdDetails;

    /** Private IP details for fetching the public IP. */
    public com.oracle.bmc.core.model.GetPublicIpByPrivateIpIdDetails
            getGetPublicIpByPrivateIpIdDetails() {
        return getPublicIpByPrivateIpIdDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.GetPublicIpByPrivateIpIdDetails getBody$() {
        return getPublicIpByPrivateIpIdDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetPublicIpByPrivateIpIdRequest,
                    com.oracle.bmc.core.model.GetPublicIpByPrivateIpIdDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Private IP details for fetching the public IP. */
        private com.oracle.bmc.core.model.GetPublicIpByPrivateIpIdDetails
                getPublicIpByPrivateIpIdDetails = null;

        /**
         * Private IP details for fetching the public IP.
         *
         * @param getPublicIpByPrivateIpIdDetails the value to set
         * @return this builder instance
         */
        public Builder getPublicIpByPrivateIpIdDetails(
                com.oracle.bmc.core.model.GetPublicIpByPrivateIpIdDetails
                        getPublicIpByPrivateIpIdDetails) {
            this.getPublicIpByPrivateIpIdDetails = getPublicIpByPrivateIpIdDetails;
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
        public Builder copy(GetPublicIpByPrivateIpIdRequest o) {
            getPublicIpByPrivateIpIdDetails(o.getGetPublicIpByPrivateIpIdDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetPublicIpByPrivateIpIdRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetPublicIpByPrivateIpIdRequest
         */
        public GetPublicIpByPrivateIpIdRequest build() {
            GetPublicIpByPrivateIpIdRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.core.model.GetPublicIpByPrivateIpIdDetails body) {
            getPublicIpByPrivateIpIdDetails(body);
            return this;
        }

        /**
         * Build the instance of GetPublicIpByPrivateIpIdRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetPublicIpByPrivateIpIdRequest
         */
        public GetPublicIpByPrivateIpIdRequest buildWithoutInvocationCallback() {
            GetPublicIpByPrivateIpIdRequest request = new GetPublicIpByPrivateIpIdRequest();
            request.getPublicIpByPrivateIpIdDetails = getPublicIpByPrivateIpIdDetails;
            return request;
            // new GetPublicIpByPrivateIpIdRequest(getPublicIpByPrivateIpIdDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().getPublicIpByPrivateIpIdDetails(getPublicIpByPrivateIpIdDetails);
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
        sb.append(",getPublicIpByPrivateIpIdDetails=")
                .append(String.valueOf(this.getPublicIpByPrivateIpIdDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetPublicIpByPrivateIpIdRequest)) {
            return false;
        }

        GetPublicIpByPrivateIpIdRequest other = (GetPublicIpByPrivateIpIdRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.getPublicIpByPrivateIpIdDetails,
                        other.getPublicIpByPrivateIpIdDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.getPublicIpByPrivateIpIdDetails == null
                                ? 43
                                : this.getPublicIpByPrivateIpIdDetails.hashCode());
        return result;
    }
}
