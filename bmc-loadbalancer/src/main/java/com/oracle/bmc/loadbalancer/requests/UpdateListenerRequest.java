/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.requests;

import com.oracle.bmc.loadbalancer.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/UpdateListenerExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateListenerRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
public class UpdateListenerRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.loadbalancer.model.UpdateListenerDetails> {

    /** Details to update a listener. */
    private com.oracle.bmc.loadbalancer.model.UpdateListenerDetails updateListenerDetails;

    /** Details to update a listener. */
    public com.oracle.bmc.loadbalancer.model.UpdateListenerDetails getUpdateListenerDetails() {
        return updateListenerDetails;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * load balancer associated with the listener to update.
     */
    private String loadBalancerId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * load balancer associated with the listener to update.
     */
    public String getLoadBalancerId() {
        return loadBalancerId;
    }
    /**
     * The name of the listener to update.
     *
     * <p>Example: {@code example_listener}
     */
    private String listenerName;

    /**
     * The name of the listener to update.
     *
     * <p>Example: {@code example_listener}
     */
    public String getListenerName() {
        return listenerName;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * if-match parameter to the value of the ETag for the load balancer. This value can be obtained
     * from a GET or POST response for any resource of that load balancer.
     *
     * <p>For example, the eTag returned by getListener can be specified as the ifMatch for
     * updateRuleSets.
     *
     * <p>The resource is updated or deleted only if the ETag you provide matches the resource's
     * current ETag value.
     *
     * <p>Example: {@code example-etag}
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * if-match parameter to the value of the ETag for the load balancer. This value can be obtained
     * from a GET or POST response for any resource of that load balancer.
     *
     * <p>For example, the eTag returned by getListener can be specified as the ifMatch for
     * updateRuleSets.
     *
     * <p>The resource is updated or deleted only if the ETag you provide matches the resource's
     * current ETag value.
     *
     * <p>Example: {@code example-etag}
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.loadbalancer.model.UpdateListenerDetails getBody$() {
        return updateListenerDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateListenerRequest,
                    com.oracle.bmc.loadbalancer.model.UpdateListenerDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details to update a listener. */
        private com.oracle.bmc.loadbalancer.model.UpdateListenerDetails updateListenerDetails =
                null;

        /**
         * Details to update a listener.
         *
         * @param updateListenerDetails the value to set
         * @return this builder instance
         */
        public Builder updateListenerDetails(
                com.oracle.bmc.loadbalancer.model.UpdateListenerDetails updateListenerDetails) {
            this.updateListenerDetails = updateListenerDetails;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * load balancer associated with the listener to update.
         */
        private String loadBalancerId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * load balancer associated with the listener to update.
         *
         * @param loadBalancerId the value to set
         * @return this builder instance
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * The name of the listener to update.
         *
         * <p>Example: {@code example_listener}
         */
        private String listenerName = null;

        /**
         * The name of the listener to update.
         *
         * <p>Example: {@code example_listener}
         *
         * @param listenerName the value to set
         * @return this builder instance
         */
        public Builder listenerName(String listenerName) {
            this.listenerName = listenerName;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
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
         * 24 hours, but can be invalidated before then due to conflicting operations (e.g., if a
         * resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (e.g., if a
         * resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * if-match parameter to the value of the ETag for the load balancer. This value can be
         * obtained from a GET or POST response for any resource of that load balancer.
         *
         * <p>For example, the eTag returned by getListener can be specified as the ifMatch for
         * updateRuleSets.
         *
         * <p>The resource is updated or deleted only if the ETag you provide matches the resource's
         * current ETag value.
         *
         * <p>Example: {@code example-etag}
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * if-match parameter to the value of the ETag for the load balancer. This value can be
         * obtained from a GET or POST response for any resource of that load balancer.
         *
         * <p>For example, the eTag returned by getListener can be specified as the ifMatch for
         * updateRuleSets.
         *
         * <p>The resource is updated or deleted only if the ETag you provide matches the resource's
         * current ETag value.
         *
         * <p>Example: {@code example-etag}
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateListenerRequest o) {
            updateListenerDetails(o.getUpdateListenerDetails());
            loadBalancerId(o.getLoadBalancerId());
            listenerName(o.getListenerName());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateListenerRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateListenerRequest
         */
        public UpdateListenerRequest build() {
            UpdateListenerRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.loadbalancer.model.UpdateListenerDetails body) {
            updateListenerDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateListenerRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateListenerRequest
         */
        public UpdateListenerRequest buildWithoutInvocationCallback() {
            UpdateListenerRequest request = new UpdateListenerRequest();
            request.updateListenerDetails = updateListenerDetails;
            request.loadBalancerId = loadBalancerId;
            request.listenerName = listenerName;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateListenerRequest(updateListenerDetails, loadBalancerId, listenerName,
            // opcRequestId, opcRetryToken, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .updateListenerDetails(updateListenerDetails)
                .loadBalancerId(loadBalancerId)
                .listenerName(listenerName)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .ifMatch(ifMatch);
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
        sb.append(",updateListenerDetails=").append(String.valueOf(this.updateListenerDetails));
        sb.append(",loadBalancerId=").append(String.valueOf(this.loadBalancerId));
        sb.append(",listenerName=").append(String.valueOf(this.listenerName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateListenerRequest)) {
            return false;
        }

        UpdateListenerRequest other = (UpdateListenerRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.updateListenerDetails, other.updateListenerDetails)
                && java.util.Objects.equals(this.loadBalancerId, other.loadBalancerId)
                && java.util.Objects.equals(this.listenerName, other.listenerName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updateListenerDetails == null
                                ? 43
                                : this.updateListenerDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.loadBalancerId == null ? 43 : this.loadBalancerId.hashCode());
        result = (result * PRIME) + (this.listenerName == null ? 43 : this.listenerName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
