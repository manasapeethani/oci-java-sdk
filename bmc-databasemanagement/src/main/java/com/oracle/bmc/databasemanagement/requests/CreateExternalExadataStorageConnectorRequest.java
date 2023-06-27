/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CreateExternalExadataStorageConnectorExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateExternalExadataStorageConnectorRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class CreateExternalExadataStorageConnectorRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model
                        .CreateExternalExadataStorageConnectorDetails> {

    /** The details required to add connections to the Exadata storage servers. */
    private com.oracle.bmc.databasemanagement.model.CreateExternalExadataStorageConnectorDetails
            createExternalExadataStorageConnectorDetails;

    /** The details required to add connections to the Exadata storage servers. */
    public com.oracle.bmc.databasemanagement.model.CreateExternalExadataStorageConnectorDetails
            getCreateExternalExadataStorageConnectorDetails() {
        return createExternalExadataStorageConnectorDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.databasemanagement.model.CreateExternalExadataStorageConnectorDetails
            getBody$() {
        return createExternalExadataStorageConnectorDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateExternalExadataStorageConnectorRequest,
                    com.oracle.bmc.databasemanagement.model
                            .CreateExternalExadataStorageConnectorDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The details required to add connections to the Exadata storage servers. */
        private com.oracle.bmc.databasemanagement.model.CreateExternalExadataStorageConnectorDetails
                createExternalExadataStorageConnectorDetails = null;

        /**
         * The details required to add connections to the Exadata storage servers.
         *
         * @param createExternalExadataStorageConnectorDetails the value to set
         * @return this builder instance
         */
        public Builder createExternalExadataStorageConnectorDetails(
                com.oracle.bmc.databasemanagement.model.CreateExternalExadataStorageConnectorDetails
                        createExternalExadataStorageConnectorDetails) {
            this.createExternalExadataStorageConnectorDetails =
                    createExternalExadataStorageConnectorDetails;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(CreateExternalExadataStorageConnectorRequest o) {
            createExternalExadataStorageConnectorDetails(
                    o.getCreateExternalExadataStorageConnectorDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateExternalExadataStorageConnectorRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateExternalExadataStorageConnectorRequest
         */
        public CreateExternalExadataStorageConnectorRequest build() {
            CreateExternalExadataStorageConnectorRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.databasemanagement.model.CreateExternalExadataStorageConnectorDetails
                        body) {
            createExternalExadataStorageConnectorDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateExternalExadataStorageConnectorRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateExternalExadataStorageConnectorRequest
         */
        public CreateExternalExadataStorageConnectorRequest buildWithoutInvocationCallback() {
            CreateExternalExadataStorageConnectorRequest request =
                    new CreateExternalExadataStorageConnectorRequest();
            request.createExternalExadataStorageConnectorDetails =
                    createExternalExadataStorageConnectorDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new
            // CreateExternalExadataStorageConnectorRequest(createExternalExadataStorageConnectorDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createExternalExadataStorageConnectorDetails(
                        createExternalExadataStorageConnectorDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",createExternalExadataStorageConnectorDetails=")
                .append(String.valueOf(this.createExternalExadataStorageConnectorDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateExternalExadataStorageConnectorRequest)) {
            return false;
        }

        CreateExternalExadataStorageConnectorRequest other =
                (CreateExternalExadataStorageConnectorRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createExternalExadataStorageConnectorDetails,
                        other.createExternalExadataStorageConnectorDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createExternalExadataStorageConnectorDetails == null
                                ? 43
                                : this.createExternalExadataStorageConnectorDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
