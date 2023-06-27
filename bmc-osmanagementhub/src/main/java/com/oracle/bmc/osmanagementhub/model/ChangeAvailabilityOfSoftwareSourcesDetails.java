/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Request body that contains a list of software sources whose availability needs to be updated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ChangeAvailabilityOfSoftwareSourcesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ChangeAvailabilityOfSoftwareSourcesDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"softwareSourceAvailabilities"})
    public ChangeAvailabilityOfSoftwareSourcesDetails(
            java.util.List<SoftwareSourceAvailability> softwareSourceAvailabilities) {
        super();
        this.softwareSourceAvailabilities = softwareSourceAvailabilities;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of objects containing software source ids and its availability.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceAvailabilities")
        private java.util.List<SoftwareSourceAvailability> softwareSourceAvailabilities;

        /**
         * List of objects containing software source ids and its availability.
         * @param softwareSourceAvailabilities the value to set
         * @return this builder
         **/
        public Builder softwareSourceAvailabilities(
                java.util.List<SoftwareSourceAvailability> softwareSourceAvailabilities) {
            this.softwareSourceAvailabilities = softwareSourceAvailabilities;
            this.__explicitlySet__.add("softwareSourceAvailabilities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangeAvailabilityOfSoftwareSourcesDetails build() {
            ChangeAvailabilityOfSoftwareSourcesDetails model =
                    new ChangeAvailabilityOfSoftwareSourcesDetails(
                            this.softwareSourceAvailabilities);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangeAvailabilityOfSoftwareSourcesDetails model) {
            if (model.wasPropertyExplicitlySet("softwareSourceAvailabilities")) {
                this.softwareSourceAvailabilities(model.getSoftwareSourceAvailabilities());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * List of objects containing software source ids and its availability.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceAvailabilities")
    private final java.util.List<SoftwareSourceAvailability> softwareSourceAvailabilities;

    /**
     * List of objects containing software source ids and its availability.
     * @return the value
     **/
    public java.util.List<SoftwareSourceAvailability> getSoftwareSourceAvailabilities() {
        return softwareSourceAvailabilities;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ChangeAvailabilityOfSoftwareSourcesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("softwareSourceAvailabilities=")
                .append(String.valueOf(this.softwareSourceAvailabilities));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeAvailabilityOfSoftwareSourcesDetails)) {
            return false;
        }

        ChangeAvailabilityOfSoftwareSourcesDetails other =
                (ChangeAvailabilityOfSoftwareSourcesDetails) o;
        return java.util.Objects.equals(
                        this.softwareSourceAvailabilities, other.softwareSourceAvailabilities)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.softwareSourceAvailabilities == null
                                ? 43
                                : this.softwareSourceAvailabilities.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}