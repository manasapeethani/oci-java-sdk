/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The list of one or more BYOIPv6 CIDR blocks for the VCN that meets the following criteria:
 * - The CIDR must from a BYOIPv6 range.
 * - The IPv6 CIDR blocks must be valid.
 * - Multiple CIDR blocks must not overlap each other or the on-premises network CIDR block.
 * - The number of CIDR blocks must not exceed the limit of IPv6 CIDR blocks allowed to a VCN.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = Byoipv6CidrDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Byoipv6CidrDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("byoipv6RangeId")
        private String byoipv6RangeId;

        public Builder byoipv6RangeId(String byoipv6RangeId) {
            this.byoipv6RangeId = byoipv6RangeId;
            this.__explicitlySet__.add("byoipv6RangeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
        private String ipv6CidrBlock;

        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            this.__explicitlySet__.add("ipv6CidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Byoipv6CidrDetails build() {
            Byoipv6CidrDetails __instance__ = new Byoipv6CidrDetails(byoipv6RangeId, ipv6CidrBlock);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Byoipv6CidrDetails o) {
            Builder copiedBuilder =
                    byoipv6RangeId(o.getByoipv6RangeId()).ipv6CidrBlock(o.getIpv6CidrBlock());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code ByoipRange} resource to which the CIDR block belongs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("byoipv6RangeId")
    String byoipv6RangeId;

    /**
     * An IPv6 CIDR block required to create a VCN with a BYOIP prefix. It could be the whole CIDR block identified in {@code byoipv6RangeId}, or a subrange.
     * Example: {@code 2001:0db8:0123::/48}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
    String ipv6CidrBlock;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}