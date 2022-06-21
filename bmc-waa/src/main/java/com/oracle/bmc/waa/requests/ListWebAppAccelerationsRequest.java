/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waa.requests;

import com.oracle.bmc.waa.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waa/ListWebAppAccelerationsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListWebAppAccelerationsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211230")
public class ListWebAppAccelerationsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return only the WebAppAcceleration with the given [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String id;

    /**
     * A filter to return only the WebAppAcceleration with the given [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getId() {
        return id;
    }
    /**
     * A filter to return only the WebAppAcceleration with the given
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of related WebAppAccelerationPolicy.
     *
     */
    private String webAppAccelerationPolicyId;

    /**
     * A filter to return only the WebAppAcceleration with the given
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of related WebAppAccelerationPolicy.
     *
     */
    public String getWebAppAccelerationPolicyId() {
        return webAppAccelerationPolicyId;
    }
    /**
     * A filter to return only resources that match the given lifecycleState.
     */
    private java.util.List<WebAppAcceleration.LifecycleState> lifecycleState;

    /**
     * A filter to return only resources that match the given lifecycleState.
     */
    public java.util.List<WebAppAcceleration.LifecycleState> getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return only resources that match the entire display name given.
     */
    private String displayName;

    /**
     * A filter to return only resources that match the entire display name given.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The maximum number of items to return.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results.
     * This must come from the {@code opc-next-page} header field of a previous response.
     *
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results.
     * This must come from the {@code opc-next-page} header field of a previous response.
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private com.oracle.bmc.waa.model.SortOrder sortOrder;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    public com.oracle.bmc.waa.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided.
     * Default order for timeCreated is descending.
     * Default order for displayName is ascending.
     * If no value is specified timeCreated is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided.
     * Default order for timeCreated is descending.
     * Default order for displayName is ascending.
     * If no value is specified timeCreated is default.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /**
     * The field to sort by. Only one sort order may be provided.
     * Default order for timeCreated is descending.
     * Default order for displayName is ascending.
     * If no value is specified timeCreated is default.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListWebAppAccelerationsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return only the WebAppAcceleration with the given [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String id = null;

        /**
         * A filter to return only the WebAppAcceleration with the given [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * A filter to return only the WebAppAcceleration with the given
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of related WebAppAccelerationPolicy.
         *
         */
        private String webAppAccelerationPolicyId = null;

        /**
         * A filter to return only the WebAppAcceleration with the given
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of related WebAppAccelerationPolicy.
         *
         * @param webAppAccelerationPolicyId the value to set
         * @return this builder instance
         */
        public Builder webAppAccelerationPolicyId(String webAppAccelerationPolicyId) {
            this.webAppAccelerationPolicyId = webAppAccelerationPolicyId;
            return this;
        }

        /**
         * A filter to return only resources that match the given lifecycleState.
         */
        private java.util.List<WebAppAcceleration.LifecycleState> lifecycleState = null;

        /**
         * A filter to return only resources that match the given lifecycleState.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                java.util.List<WebAppAcceleration.LifecycleState> lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that match the given lifecycleState.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder lifecycleState(WebAppAcceleration.LifecycleState singularValue) {
            return this.lifecycleState(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only resources that match the entire display name given.
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The maximum number of items to return.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * A token representing the position at which to start retrieving results.
         * This must come from the {@code opc-next-page} header field of a previous response.
         *
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results.
         * This must come from the {@code opc-next-page} header field of a previous response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         */
        private com.oracle.bmc.waa.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.waa.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided.
         * Default order for timeCreated is descending.
         * Default order for displayName is ascending.
         * If no value is specified timeCreated is default.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided.
         * Default order for timeCreated is descending.
         * Default order for displayName is ascending.
         * If no value is specified timeCreated is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListWebAppAccelerationsRequest o) {
            compartmentId(o.getCompartmentId());
            id(o.getId());
            webAppAccelerationPolicyId(o.getWebAppAccelerationPolicyId());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListWebAppAccelerationsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListWebAppAccelerationsRequest
         */
        public ListWebAppAccelerationsRequest build() {
            ListWebAppAccelerationsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListWebAppAccelerationsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListWebAppAccelerationsRequest
         */
        public ListWebAppAccelerationsRequest buildWithoutInvocationCallback() {
            ListWebAppAccelerationsRequest request = new ListWebAppAccelerationsRequest();
            request.compartmentId = compartmentId;
            request.id = id;
            request.webAppAccelerationPolicyId = webAppAccelerationPolicyId;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListWebAppAccelerationsRequest(compartmentId, id, webAppAccelerationPolicyId, lifecycleState, displayName, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .id(id)
                .webAppAccelerationPolicyId(webAppAccelerationPolicyId)
                .lifecycleState(lifecycleState)
                .displayName(displayName)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",webAppAccelerationPolicyId=")
                .append(String.valueOf(this.webAppAccelerationPolicyId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListWebAppAccelerationsRequest)) {
            return false;
        }

        ListWebAppAccelerationsRequest other = (ListWebAppAccelerationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.webAppAccelerationPolicyId, other.webAppAccelerationPolicyId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.webAppAccelerationPolicyId == null
                                ? 43
                                : this.webAppAccelerationPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}