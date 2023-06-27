/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/EnableAutomaticInitialPlanCaptureExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use EnableAutomaticInitialPlanCaptureRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class EnableAutomaticInitialPlanCaptureRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model.EnableAutomaticInitialPlanCaptureDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }
    /**
     * The details required to enable automatic initial plan capture.
     */
    private com.oracle.bmc.databasemanagement.model.EnableAutomaticInitialPlanCaptureDetails
            enableAutomaticInitialPlanCaptureDetails;

    /**
     * The details required to enable automatic initial plan capture.
     */
    public com.oracle.bmc.databasemanagement.model.EnableAutomaticInitialPlanCaptureDetails
            getEnableAutomaticInitialPlanCaptureDetails() {
        return enableAutomaticInitialPlanCaptureDetails;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.databasemanagement.model.EnableAutomaticInitialPlanCaptureDetails
            getBody$() {
        return enableAutomaticInitialPlanCaptureDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    EnableAutomaticInitialPlanCaptureRequest,
                    com.oracle.bmc.databasemanagement.model
                            .EnableAutomaticInitialPlanCaptureDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
         */
        private String managedDatabaseId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
         * @param managedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /**
         * The details required to enable automatic initial plan capture.
         */
        private com.oracle.bmc.databasemanagement.model.EnableAutomaticInitialPlanCaptureDetails
                enableAutomaticInitialPlanCaptureDetails = null;

        /**
         * The details required to enable automatic initial plan capture.
         * @param enableAutomaticInitialPlanCaptureDetails the value to set
         * @return this builder instance
         */
        public Builder enableAutomaticInitialPlanCaptureDetails(
                com.oracle.bmc.databasemanagement.model.EnableAutomaticInitialPlanCaptureDetails
                        enableAutomaticInitialPlanCaptureDetails) {
            this.enableAutomaticInitialPlanCaptureDetails =
                    enableAutomaticInitialPlanCaptureDetails;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * @return this builder instance
         */
        public Builder copy(EnableAutomaticInitialPlanCaptureRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            enableAutomaticInitialPlanCaptureDetails(
                    o.getEnableAutomaticInitialPlanCaptureDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of EnableAutomaticInitialPlanCaptureRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of EnableAutomaticInitialPlanCaptureRequest
         */
        public EnableAutomaticInitialPlanCaptureRequest build() {
            EnableAutomaticInitialPlanCaptureRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.databasemanagement.model.EnableAutomaticInitialPlanCaptureDetails
                        body) {
            enableAutomaticInitialPlanCaptureDetails(body);
            return this;
        }

        /**
         * Build the instance of EnableAutomaticInitialPlanCaptureRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of EnableAutomaticInitialPlanCaptureRequest
         */
        public EnableAutomaticInitialPlanCaptureRequest buildWithoutInvocationCallback() {
            EnableAutomaticInitialPlanCaptureRequest request =
                    new EnableAutomaticInitialPlanCaptureRequest();
            request.managedDatabaseId = managedDatabaseId;
            request.enableAutomaticInitialPlanCaptureDetails =
                    enableAutomaticInitialPlanCaptureDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new EnableAutomaticInitialPlanCaptureRequest(managedDatabaseId, enableAutomaticInitialPlanCaptureDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedDatabaseId(managedDatabaseId)
                .enableAutomaticInitialPlanCaptureDetails(enableAutomaticInitialPlanCaptureDetails)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(",enableAutomaticInitialPlanCaptureDetails=")
                .append(String.valueOf(this.enableAutomaticInitialPlanCaptureDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnableAutomaticInitialPlanCaptureRequest)) {
            return false;
        }

        EnableAutomaticInitialPlanCaptureRequest other =
                (EnableAutomaticInitialPlanCaptureRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(
                        this.enableAutomaticInitialPlanCaptureDetails,
                        other.enableAutomaticInitialPlanCaptureDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedDatabaseId == null ? 43 : this.managedDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.enableAutomaticInitialPlanCaptureDetails == null
                                ? 43
                                : this.enableAutomaticInitialPlanCaptureDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}