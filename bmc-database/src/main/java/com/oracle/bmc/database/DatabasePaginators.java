/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database;

import com.oracle.bmc.database.requests.*;
import com.oracle.bmc.database.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Database where multiple pages of data may be fetched. Two styles of
 * iteration are supported:
 *
 * <ul>
 *   <li>Iterating over the Response objects returned by the list operation. These are referred to
 *       as ResponseIterators, and the methods are suffixed with ResponseIterator. For example:
 *       <i>listUsersResponseIterator</i>
 *   <li>Iterating over the resources/records being listed. These are referred to as
 *       RecordIterators, and the methods are suffixed with RecordIterator. For example:
 *       <i>listUsersRecordIterator</i>
 * </ul>
 *
 * These iterables abstract away the need to write code to manually handle pagination via looping
 * and using the page tokens. They will automatically fetch more data from the service when
 * required.
 *
 * <p>As an example, if we were using the ListUsers operation in IdentityService, then the {@link
 * java.lang.Iterable} returned by calling a ResponseIterator method would iterate over the
 * ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have
 * to deal with ListUsersResponse objects at all. In either case, pagination will be automatically
 * handled so we can iterate until there are no more responses or no more resources/records
 * available.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class DatabasePaginators {
    private final Database client;

    public DatabasePaginators(Database client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAutonomousContainerDatabaseDataguardAssociations operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAutonomousContainerDatabaseDataguardAssociationsResponse>
            listAutonomousContainerDatabaseDataguardAssociationsResponseIterator(
                    final ListAutonomousContainerDatabaseDataguardAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousContainerDatabaseDataguardAssociationsRequest.Builder,
                ListAutonomousContainerDatabaseDataguardAssociationsRequest,
                ListAutonomousContainerDatabaseDataguardAssociationsResponse>(
                new java.util.function.Supplier<
                        ListAutonomousContainerDatabaseDataguardAssociationsRequest.Builder>() {
                    @Override
                    public ListAutonomousContainerDatabaseDataguardAssociationsRequest.Builder
                            get() {
                        return ListAutonomousContainerDatabaseDataguardAssociationsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousContainerDatabaseDataguardAssociationsResponse, String>() {
                    @Override
                    public String apply(
                            ListAutonomousContainerDatabaseDataguardAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousContainerDatabaseDataguardAssociationsRequest
                                        .Builder>,
                        ListAutonomousContainerDatabaseDataguardAssociationsRequest>() {
                    @Override
                    public ListAutonomousContainerDatabaseDataguardAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousContainerDatabaseDataguardAssociationsRequest
                                                    .Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousContainerDatabaseDataguardAssociationsRequest,
                        ListAutonomousContainerDatabaseDataguardAssociationsResponse>() {
                    @Override
                    public ListAutonomousContainerDatabaseDataguardAssociationsResponse apply(
                            ListAutonomousContainerDatabaseDataguardAssociationsRequest request) {
                        return client.listAutonomousContainerDatabaseDataguardAssociations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.AutonomousContainerDatabaseDataguardAssociation} objects
     * contained in responses from the listAutonomousContainerDatabaseDataguardAssociations
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.AutonomousContainerDatabaseDataguardAssociation} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousContainerDatabaseDataguardAssociation>
            listAutonomousContainerDatabaseDataguardAssociationsRecordIterator(
                    final ListAutonomousContainerDatabaseDataguardAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousContainerDatabaseDataguardAssociationsRequest.Builder,
                ListAutonomousContainerDatabaseDataguardAssociationsRequest,
                ListAutonomousContainerDatabaseDataguardAssociationsResponse,
                com.oracle.bmc.database.model.AutonomousContainerDatabaseDataguardAssociation>(
                new java.util.function.Supplier<
                        ListAutonomousContainerDatabaseDataguardAssociationsRequest.Builder>() {
                    @Override
                    public ListAutonomousContainerDatabaseDataguardAssociationsRequest.Builder
                            get() {
                        return ListAutonomousContainerDatabaseDataguardAssociationsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousContainerDatabaseDataguardAssociationsResponse, String>() {
                    @Override
                    public String apply(
                            ListAutonomousContainerDatabaseDataguardAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousContainerDatabaseDataguardAssociationsRequest
                                        .Builder>,
                        ListAutonomousContainerDatabaseDataguardAssociationsRequest>() {
                    @Override
                    public ListAutonomousContainerDatabaseDataguardAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousContainerDatabaseDataguardAssociationsRequest
                                                    .Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousContainerDatabaseDataguardAssociationsRequest,
                        ListAutonomousContainerDatabaseDataguardAssociationsResponse>() {
                    @Override
                    public ListAutonomousContainerDatabaseDataguardAssociationsResponse apply(
                            ListAutonomousContainerDatabaseDataguardAssociationsRequest request) {
                        return client.listAutonomousContainerDatabaseDataguardAssociations(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousContainerDatabaseDataguardAssociationsResponse,
                        java.util.List<
                                com.oracle.bmc.database.model
                                        .AutonomousContainerDatabaseDataguardAssociation>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model
                                            .AutonomousContainerDatabaseDataguardAssociation>
                            apply(
                                    ListAutonomousContainerDatabaseDataguardAssociationsResponse
                                            response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAutonomousContainerDatabases operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAutonomousContainerDatabasesResponse>
            listAutonomousContainerDatabasesResponseIterator(
                    final ListAutonomousContainerDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousContainerDatabasesRequest.Builder,
                ListAutonomousContainerDatabasesRequest,
                ListAutonomousContainerDatabasesResponse>(
                new java.util.function.Supplier<ListAutonomousContainerDatabasesRequest.Builder>() {
                    @Override
                    public ListAutonomousContainerDatabasesRequest.Builder get() {
                        return ListAutonomousContainerDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousContainerDatabasesResponse, String>() {
                    @Override
                    public String apply(ListAutonomousContainerDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousContainerDatabasesRequest.Builder>,
                        ListAutonomousContainerDatabasesRequest>() {
                    @Override
                    public ListAutonomousContainerDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousContainerDatabasesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousContainerDatabasesRequest,
                        ListAutonomousContainerDatabasesResponse>() {
                    @Override
                    public ListAutonomousContainerDatabasesResponse apply(
                            ListAutonomousContainerDatabasesRequest request) {
                        return client.listAutonomousContainerDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.AutonomousContainerDatabaseSummary} objects contained in
     * responses from the listAutonomousContainerDatabases operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.AutonomousContainerDatabaseSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousContainerDatabaseSummary>
            listAutonomousContainerDatabasesRecordIterator(
                    final ListAutonomousContainerDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousContainerDatabasesRequest.Builder,
                ListAutonomousContainerDatabasesRequest,
                ListAutonomousContainerDatabasesResponse,
                com.oracle.bmc.database.model.AutonomousContainerDatabaseSummary>(
                new java.util.function.Supplier<ListAutonomousContainerDatabasesRequest.Builder>() {
                    @Override
                    public ListAutonomousContainerDatabasesRequest.Builder get() {
                        return ListAutonomousContainerDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousContainerDatabasesResponse, String>() {
                    @Override
                    public String apply(ListAutonomousContainerDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousContainerDatabasesRequest.Builder>,
                        ListAutonomousContainerDatabasesRequest>() {
                    @Override
                    public ListAutonomousContainerDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousContainerDatabasesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousContainerDatabasesRequest,
                        ListAutonomousContainerDatabasesResponse>() {
                    @Override
                    public ListAutonomousContainerDatabasesResponse apply(
                            ListAutonomousContainerDatabasesRequest request) {
                        return client.listAutonomousContainerDatabases(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousContainerDatabasesResponse,
                        java.util.List<
                                com.oracle.bmc.database.model
                                        .AutonomousContainerDatabaseSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model
                                            .AutonomousContainerDatabaseSummary>
                            apply(ListAutonomousContainerDatabasesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAutonomousDatabaseBackups operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAutonomousDatabaseBackupsResponse>
            listAutonomousDatabaseBackupsResponseIterator(
                    final ListAutonomousDatabaseBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousDatabaseBackupsRequest.Builder,
                ListAutonomousDatabaseBackupsRequest,
                ListAutonomousDatabaseBackupsResponse>(
                new java.util.function.Supplier<ListAutonomousDatabaseBackupsRequest.Builder>() {
                    @Override
                    public ListAutonomousDatabaseBackupsRequest.Builder get() {
                        return ListAutonomousDatabaseBackupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutonomousDatabaseBackupsResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDatabaseBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDatabaseBackupsRequest.Builder>,
                        ListAutonomousDatabaseBackupsRequest>() {
                    @Override
                    public ListAutonomousDatabaseBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDatabaseBackupsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDatabaseBackupsRequest,
                        ListAutonomousDatabaseBackupsResponse>() {
                    @Override
                    public ListAutonomousDatabaseBackupsResponse apply(
                            ListAutonomousDatabaseBackupsRequest request) {
                        return client.listAutonomousDatabaseBackups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.AutonomousDatabaseBackupSummary} objects contained in responses
     * from the listAutonomousDatabaseBackups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.AutonomousDatabaseBackupSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousDatabaseBackupSummary>
            listAutonomousDatabaseBackupsRecordIterator(
                    final ListAutonomousDatabaseBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousDatabaseBackupsRequest.Builder,
                ListAutonomousDatabaseBackupsRequest,
                ListAutonomousDatabaseBackupsResponse,
                com.oracle.bmc.database.model.AutonomousDatabaseBackupSummary>(
                new java.util.function.Supplier<ListAutonomousDatabaseBackupsRequest.Builder>() {
                    @Override
                    public ListAutonomousDatabaseBackupsRequest.Builder get() {
                        return ListAutonomousDatabaseBackupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutonomousDatabaseBackupsResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDatabaseBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDatabaseBackupsRequest.Builder>,
                        ListAutonomousDatabaseBackupsRequest>() {
                    @Override
                    public ListAutonomousDatabaseBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDatabaseBackupsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDatabaseBackupsRequest,
                        ListAutonomousDatabaseBackupsResponse>() {
                    @Override
                    public ListAutonomousDatabaseBackupsResponse apply(
                            ListAutonomousDatabaseBackupsRequest request) {
                        return client.listAutonomousDatabaseBackups(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDatabaseBackupsResponse,
                        java.util.List<
                                com.oracle.bmc.database.model.AutonomousDatabaseBackupSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model.AutonomousDatabaseBackupSummary>
                            apply(ListAutonomousDatabaseBackupsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAutonomousDatabaseClones operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAutonomousDatabaseClonesResponse>
            listAutonomousDatabaseClonesResponseIterator(
                    final ListAutonomousDatabaseClonesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousDatabaseClonesRequest.Builder,
                ListAutonomousDatabaseClonesRequest,
                ListAutonomousDatabaseClonesResponse>(
                new java.util.function.Supplier<ListAutonomousDatabaseClonesRequest.Builder>() {
                    @Override
                    public ListAutonomousDatabaseClonesRequest.Builder get() {
                        return ListAutonomousDatabaseClonesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutonomousDatabaseClonesResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDatabaseClonesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDatabaseClonesRequest.Builder>,
                        ListAutonomousDatabaseClonesRequest>() {
                    @Override
                    public ListAutonomousDatabaseClonesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDatabaseClonesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDatabaseClonesRequest,
                        ListAutonomousDatabaseClonesResponse>() {
                    @Override
                    public ListAutonomousDatabaseClonesResponse apply(
                            ListAutonomousDatabaseClonesRequest request) {
                        return client.listAutonomousDatabaseClones(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.AutonomousDatabaseSummary} objects contained in responses from
     * the listAutonomousDatabaseClones operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.AutonomousDatabaseSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousDatabaseSummary>
            listAutonomousDatabaseClonesRecordIterator(
                    final ListAutonomousDatabaseClonesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousDatabaseClonesRequest.Builder,
                ListAutonomousDatabaseClonesRequest,
                ListAutonomousDatabaseClonesResponse,
                com.oracle.bmc.database.model.AutonomousDatabaseSummary>(
                new java.util.function.Supplier<ListAutonomousDatabaseClonesRequest.Builder>() {
                    @Override
                    public ListAutonomousDatabaseClonesRequest.Builder get() {
                        return ListAutonomousDatabaseClonesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutonomousDatabaseClonesResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDatabaseClonesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDatabaseClonesRequest.Builder>,
                        ListAutonomousDatabaseClonesRequest>() {
                    @Override
                    public ListAutonomousDatabaseClonesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDatabaseClonesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDatabaseClonesRequest,
                        ListAutonomousDatabaseClonesResponse>() {
                    @Override
                    public ListAutonomousDatabaseClonesResponse apply(
                            ListAutonomousDatabaseClonesRequest request) {
                        return client.listAutonomousDatabaseClones(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDatabaseClonesResponse,
                        java.util.List<com.oracle.bmc.database.model.AutonomousDatabaseSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.AutonomousDatabaseSummary>
                            apply(ListAutonomousDatabaseClonesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAutonomousDatabaseDataguardAssociations operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAutonomousDatabaseDataguardAssociationsResponse>
            listAutonomousDatabaseDataguardAssociationsResponseIterator(
                    final ListAutonomousDatabaseDataguardAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousDatabaseDataguardAssociationsRequest.Builder,
                ListAutonomousDatabaseDataguardAssociationsRequest,
                ListAutonomousDatabaseDataguardAssociationsResponse>(
                new java.util.function.Supplier<
                        ListAutonomousDatabaseDataguardAssociationsRequest.Builder>() {
                    @Override
                    public ListAutonomousDatabaseDataguardAssociationsRequest.Builder get() {
                        return ListAutonomousDatabaseDataguardAssociationsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDatabaseDataguardAssociationsResponse, String>() {
                    @Override
                    public String apply(
                            ListAutonomousDatabaseDataguardAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDatabaseDataguardAssociationsRequest.Builder>,
                        ListAutonomousDatabaseDataguardAssociationsRequest>() {
                    @Override
                    public ListAutonomousDatabaseDataguardAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDatabaseDataguardAssociationsRequest
                                                    .Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDatabaseDataguardAssociationsRequest,
                        ListAutonomousDatabaseDataguardAssociationsResponse>() {
                    @Override
                    public ListAutonomousDatabaseDataguardAssociationsResponse apply(
                            ListAutonomousDatabaseDataguardAssociationsRequest request) {
                        return client.listAutonomousDatabaseDataguardAssociations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.AutonomousDatabaseDataguardAssociation} objects contained in
     * responses from the listAutonomousDatabaseDataguardAssociations operation. This iterable will
     * fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.AutonomousDatabaseDataguardAssociation} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousDatabaseDataguardAssociation>
            listAutonomousDatabaseDataguardAssociationsRecordIterator(
                    final ListAutonomousDatabaseDataguardAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousDatabaseDataguardAssociationsRequest.Builder,
                ListAutonomousDatabaseDataguardAssociationsRequest,
                ListAutonomousDatabaseDataguardAssociationsResponse,
                com.oracle.bmc.database.model.AutonomousDatabaseDataguardAssociation>(
                new java.util.function.Supplier<
                        ListAutonomousDatabaseDataguardAssociationsRequest.Builder>() {
                    @Override
                    public ListAutonomousDatabaseDataguardAssociationsRequest.Builder get() {
                        return ListAutonomousDatabaseDataguardAssociationsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDatabaseDataguardAssociationsResponse, String>() {
                    @Override
                    public String apply(
                            ListAutonomousDatabaseDataguardAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDatabaseDataguardAssociationsRequest.Builder>,
                        ListAutonomousDatabaseDataguardAssociationsRequest>() {
                    @Override
                    public ListAutonomousDatabaseDataguardAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDatabaseDataguardAssociationsRequest
                                                    .Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDatabaseDataguardAssociationsRequest,
                        ListAutonomousDatabaseDataguardAssociationsResponse>() {
                    @Override
                    public ListAutonomousDatabaseDataguardAssociationsResponse apply(
                            ListAutonomousDatabaseDataguardAssociationsRequest request) {
                        return client.listAutonomousDatabaseDataguardAssociations(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDatabaseDataguardAssociationsResponse,
                        java.util.List<
                                com.oracle.bmc.database.model
                                        .AutonomousDatabaseDataguardAssociation>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model
                                            .AutonomousDatabaseDataguardAssociation>
                            apply(ListAutonomousDatabaseDataguardAssociationsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAutonomousDatabases operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAutonomousDatabasesResponse> listAutonomousDatabasesResponseIterator(
            final ListAutonomousDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousDatabasesRequest.Builder,
                ListAutonomousDatabasesRequest,
                ListAutonomousDatabasesResponse>(
                new java.util.function.Supplier<ListAutonomousDatabasesRequest.Builder>() {
                    @Override
                    public ListAutonomousDatabasesRequest.Builder get() {
                        return ListAutonomousDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutonomousDatabasesResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDatabasesRequest.Builder>,
                        ListAutonomousDatabasesRequest>() {
                    @Override
                    public ListAutonomousDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDatabasesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDatabasesRequest, ListAutonomousDatabasesResponse>() {
                    @Override
                    public ListAutonomousDatabasesResponse apply(
                            ListAutonomousDatabasesRequest request) {
                        return client.listAutonomousDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.AutonomousDatabaseSummary} objects contained in responses from
     * the listAutonomousDatabases operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.AutonomousDatabaseSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousDatabaseSummary>
            listAutonomousDatabasesRecordIterator(final ListAutonomousDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousDatabasesRequest.Builder,
                ListAutonomousDatabasesRequest,
                ListAutonomousDatabasesResponse,
                com.oracle.bmc.database.model.AutonomousDatabaseSummary>(
                new java.util.function.Supplier<ListAutonomousDatabasesRequest.Builder>() {
                    @Override
                    public ListAutonomousDatabasesRequest.Builder get() {
                        return ListAutonomousDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutonomousDatabasesResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDatabasesRequest.Builder>,
                        ListAutonomousDatabasesRequest>() {
                    @Override
                    public ListAutonomousDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDatabasesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDatabasesRequest, ListAutonomousDatabasesResponse>() {
                    @Override
                    public ListAutonomousDatabasesResponse apply(
                            ListAutonomousDatabasesRequest request) {
                        return client.listAutonomousDatabases(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDatabasesResponse,
                        java.util.List<com.oracle.bmc.database.model.AutonomousDatabaseSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.AutonomousDatabaseSummary>
                            apply(ListAutonomousDatabasesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAutonomousDbPreviewVersions operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAutonomousDbPreviewVersionsResponse>
            listAutonomousDbPreviewVersionsResponseIterator(
                    final ListAutonomousDbPreviewVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousDbPreviewVersionsRequest.Builder,
                ListAutonomousDbPreviewVersionsRequest,
                ListAutonomousDbPreviewVersionsResponse>(
                new java.util.function.Supplier<ListAutonomousDbPreviewVersionsRequest.Builder>() {
                    @Override
                    public ListAutonomousDbPreviewVersionsRequest.Builder get() {
                        return ListAutonomousDbPreviewVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutonomousDbPreviewVersionsResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDbPreviewVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDbPreviewVersionsRequest.Builder>,
                        ListAutonomousDbPreviewVersionsRequest>() {
                    @Override
                    public ListAutonomousDbPreviewVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDbPreviewVersionsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDbPreviewVersionsRequest,
                        ListAutonomousDbPreviewVersionsResponse>() {
                    @Override
                    public ListAutonomousDbPreviewVersionsResponse apply(
                            ListAutonomousDbPreviewVersionsRequest request) {
                        return client.listAutonomousDbPreviewVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.AutonomousDbPreviewVersionSummary} objects contained in
     * responses from the listAutonomousDbPreviewVersions operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.AutonomousDbPreviewVersionSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousDbPreviewVersionSummary>
            listAutonomousDbPreviewVersionsRecordIterator(
                    final ListAutonomousDbPreviewVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousDbPreviewVersionsRequest.Builder,
                ListAutonomousDbPreviewVersionsRequest,
                ListAutonomousDbPreviewVersionsResponse,
                com.oracle.bmc.database.model.AutonomousDbPreviewVersionSummary>(
                new java.util.function.Supplier<ListAutonomousDbPreviewVersionsRequest.Builder>() {
                    @Override
                    public ListAutonomousDbPreviewVersionsRequest.Builder get() {
                        return ListAutonomousDbPreviewVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutonomousDbPreviewVersionsResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDbPreviewVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDbPreviewVersionsRequest.Builder>,
                        ListAutonomousDbPreviewVersionsRequest>() {
                    @Override
                    public ListAutonomousDbPreviewVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDbPreviewVersionsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDbPreviewVersionsRequest,
                        ListAutonomousDbPreviewVersionsResponse>() {
                    @Override
                    public ListAutonomousDbPreviewVersionsResponse apply(
                            ListAutonomousDbPreviewVersionsRequest request) {
                        return client.listAutonomousDbPreviewVersions(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDbPreviewVersionsResponse,
                        java.util.List<
                                com.oracle.bmc.database.model
                                        .AutonomousDbPreviewVersionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model.AutonomousDbPreviewVersionSummary>
                            apply(ListAutonomousDbPreviewVersionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAutonomousDbVersions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAutonomousDbVersionsResponse> listAutonomousDbVersionsResponseIterator(
            final ListAutonomousDbVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousDbVersionsRequest.Builder,
                ListAutonomousDbVersionsRequest,
                ListAutonomousDbVersionsResponse>(
                new java.util.function.Supplier<ListAutonomousDbVersionsRequest.Builder>() {
                    @Override
                    public ListAutonomousDbVersionsRequest.Builder get() {
                        return ListAutonomousDbVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutonomousDbVersionsResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDbVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDbVersionsRequest.Builder>,
                        ListAutonomousDbVersionsRequest>() {
                    @Override
                    public ListAutonomousDbVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDbVersionsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDbVersionsRequest, ListAutonomousDbVersionsResponse>() {
                    @Override
                    public ListAutonomousDbVersionsResponse apply(
                            ListAutonomousDbVersionsRequest request) {
                        return client.listAutonomousDbVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.AutonomousDbVersionSummary} objects contained in responses from
     * the listAutonomousDbVersions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.AutonomousDbVersionSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousDbVersionSummary>
            listAutonomousDbVersionsRecordIterator(final ListAutonomousDbVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousDbVersionsRequest.Builder,
                ListAutonomousDbVersionsRequest,
                ListAutonomousDbVersionsResponse,
                com.oracle.bmc.database.model.AutonomousDbVersionSummary>(
                new java.util.function.Supplier<ListAutonomousDbVersionsRequest.Builder>() {
                    @Override
                    public ListAutonomousDbVersionsRequest.Builder get() {
                        return ListAutonomousDbVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutonomousDbVersionsResponse, String>() {
                    @Override
                    public String apply(ListAutonomousDbVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousDbVersionsRequest.Builder>,
                        ListAutonomousDbVersionsRequest>() {
                    @Override
                    public ListAutonomousDbVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousDbVersionsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDbVersionsRequest, ListAutonomousDbVersionsResponse>() {
                    @Override
                    public ListAutonomousDbVersionsResponse apply(
                            ListAutonomousDbVersionsRequest request) {
                        return client.listAutonomousDbVersions(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousDbVersionsResponse,
                        java.util.List<
                                com.oracle.bmc.database.model.AutonomousDbVersionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.AutonomousDbVersionSummary>
                            apply(ListAutonomousDbVersionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAutonomousExadataInfrastructureShapes operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAutonomousExadataInfrastructureShapesResponse>
            listAutonomousExadataInfrastructureShapesResponseIterator(
                    final ListAutonomousExadataInfrastructureShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousExadataInfrastructureShapesRequest.Builder,
                ListAutonomousExadataInfrastructureShapesRequest,
                ListAutonomousExadataInfrastructureShapesResponse>(
                new java.util.function.Supplier<
                        ListAutonomousExadataInfrastructureShapesRequest.Builder>() {
                    @Override
                    public ListAutonomousExadataInfrastructureShapesRequest.Builder get() {
                        return ListAutonomousExadataInfrastructureShapesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousExadataInfrastructureShapesResponse, String>() {
                    @Override
                    public String apply(
                            ListAutonomousExadataInfrastructureShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousExadataInfrastructureShapesRequest.Builder>,
                        ListAutonomousExadataInfrastructureShapesRequest>() {
                    @Override
                    public ListAutonomousExadataInfrastructureShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousExadataInfrastructureShapesRequest
                                                    .Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousExadataInfrastructureShapesRequest,
                        ListAutonomousExadataInfrastructureShapesResponse>() {
                    @Override
                    public ListAutonomousExadataInfrastructureShapesResponse apply(
                            ListAutonomousExadataInfrastructureShapesRequest request) {
                        return client.listAutonomousExadataInfrastructureShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.AutonomousExadataInfrastructureShapeSummary} objects contained
     * in responses from the listAutonomousExadataInfrastructureShapes operation. This iterable will
     * fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.AutonomousExadataInfrastructureShapeSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousExadataInfrastructureShapeSummary>
            listAutonomousExadataInfrastructureShapesRecordIterator(
                    final ListAutonomousExadataInfrastructureShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousExadataInfrastructureShapesRequest.Builder,
                ListAutonomousExadataInfrastructureShapesRequest,
                ListAutonomousExadataInfrastructureShapesResponse,
                com.oracle.bmc.database.model.AutonomousExadataInfrastructureShapeSummary>(
                new java.util.function.Supplier<
                        ListAutonomousExadataInfrastructureShapesRequest.Builder>() {
                    @Override
                    public ListAutonomousExadataInfrastructureShapesRequest.Builder get() {
                        return ListAutonomousExadataInfrastructureShapesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousExadataInfrastructureShapesResponse, String>() {
                    @Override
                    public String apply(
                            ListAutonomousExadataInfrastructureShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousExadataInfrastructureShapesRequest.Builder>,
                        ListAutonomousExadataInfrastructureShapesRequest>() {
                    @Override
                    public ListAutonomousExadataInfrastructureShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousExadataInfrastructureShapesRequest
                                                    .Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousExadataInfrastructureShapesRequest,
                        ListAutonomousExadataInfrastructureShapesResponse>() {
                    @Override
                    public ListAutonomousExadataInfrastructureShapesResponse apply(
                            ListAutonomousExadataInfrastructureShapesRequest request) {
                        return client.listAutonomousExadataInfrastructureShapes(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousExadataInfrastructureShapesResponse,
                        java.util.List<
                                com.oracle.bmc.database.model
                                        .AutonomousExadataInfrastructureShapeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model
                                            .AutonomousExadataInfrastructureShapeSummary>
                            apply(ListAutonomousExadataInfrastructureShapesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAutonomousExadataInfrastructures operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAutonomousExadataInfrastructuresResponse>
            listAutonomousExadataInfrastructuresResponseIterator(
                    final ListAutonomousExadataInfrastructuresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousExadataInfrastructuresRequest.Builder,
                ListAutonomousExadataInfrastructuresRequest,
                ListAutonomousExadataInfrastructuresResponse>(
                new java.util.function.Supplier<
                        ListAutonomousExadataInfrastructuresRequest.Builder>() {
                    @Override
                    public ListAutonomousExadataInfrastructuresRequest.Builder get() {
                        return ListAutonomousExadataInfrastructuresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousExadataInfrastructuresResponse, String>() {
                    @Override
                    public String apply(ListAutonomousExadataInfrastructuresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousExadataInfrastructuresRequest.Builder>,
                        ListAutonomousExadataInfrastructuresRequest>() {
                    @Override
                    public ListAutonomousExadataInfrastructuresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousExadataInfrastructuresRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousExadataInfrastructuresRequest,
                        ListAutonomousExadataInfrastructuresResponse>() {
                    @Override
                    public ListAutonomousExadataInfrastructuresResponse apply(
                            ListAutonomousExadataInfrastructuresRequest request) {
                        return client.listAutonomousExadataInfrastructures(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.AutonomousExadataInfrastructureSummary} objects contained in
     * responses from the listAutonomousExadataInfrastructures operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.AutonomousExadataInfrastructureSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousExadataInfrastructureSummary>
            listAutonomousExadataInfrastructuresRecordIterator(
                    final ListAutonomousExadataInfrastructuresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousExadataInfrastructuresRequest.Builder,
                ListAutonomousExadataInfrastructuresRequest,
                ListAutonomousExadataInfrastructuresResponse,
                com.oracle.bmc.database.model.AutonomousExadataInfrastructureSummary>(
                new java.util.function.Supplier<
                        ListAutonomousExadataInfrastructuresRequest.Builder>() {
                    @Override
                    public ListAutonomousExadataInfrastructuresRequest.Builder get() {
                        return ListAutonomousExadataInfrastructuresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousExadataInfrastructuresResponse, String>() {
                    @Override
                    public String apply(ListAutonomousExadataInfrastructuresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousExadataInfrastructuresRequest.Builder>,
                        ListAutonomousExadataInfrastructuresRequest>() {
                    @Override
                    public ListAutonomousExadataInfrastructuresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousExadataInfrastructuresRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousExadataInfrastructuresRequest,
                        ListAutonomousExadataInfrastructuresResponse>() {
                    @Override
                    public ListAutonomousExadataInfrastructuresResponse apply(
                            ListAutonomousExadataInfrastructuresRequest request) {
                        return client.listAutonomousExadataInfrastructures(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousExadataInfrastructuresResponse,
                        java.util.List<
                                com.oracle.bmc.database.model
                                        .AutonomousExadataInfrastructureSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model
                                            .AutonomousExadataInfrastructureSummary>
                            apply(ListAutonomousExadataInfrastructuresResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAutonomousVmClusters operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAutonomousVmClustersResponse> listAutonomousVmClustersResponseIterator(
            final ListAutonomousVmClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutonomousVmClustersRequest.Builder,
                ListAutonomousVmClustersRequest,
                ListAutonomousVmClustersResponse>(
                new java.util.function.Supplier<ListAutonomousVmClustersRequest.Builder>() {
                    @Override
                    public ListAutonomousVmClustersRequest.Builder get() {
                        return ListAutonomousVmClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutonomousVmClustersResponse, String>() {
                    @Override
                    public String apply(ListAutonomousVmClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousVmClustersRequest.Builder>,
                        ListAutonomousVmClustersRequest>() {
                    @Override
                    public ListAutonomousVmClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousVmClustersRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousVmClustersRequest, ListAutonomousVmClustersResponse>() {
                    @Override
                    public ListAutonomousVmClustersResponse apply(
                            ListAutonomousVmClustersRequest request) {
                        return client.listAutonomousVmClusters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.AutonomousVmClusterSummary} objects contained in responses from
     * the listAutonomousVmClusters operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.AutonomousVmClusterSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousVmClusterSummary>
            listAutonomousVmClustersRecordIterator(final ListAutonomousVmClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutonomousVmClustersRequest.Builder,
                ListAutonomousVmClustersRequest,
                ListAutonomousVmClustersResponse,
                com.oracle.bmc.database.model.AutonomousVmClusterSummary>(
                new java.util.function.Supplier<ListAutonomousVmClustersRequest.Builder>() {
                    @Override
                    public ListAutonomousVmClustersRequest.Builder get() {
                        return ListAutonomousVmClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutonomousVmClustersResponse, String>() {
                    @Override
                    public String apply(ListAutonomousVmClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutonomousVmClustersRequest.Builder>,
                        ListAutonomousVmClustersRequest>() {
                    @Override
                    public ListAutonomousVmClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutonomousVmClustersRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListAutonomousVmClustersRequest, ListAutonomousVmClustersResponse>() {
                    @Override
                    public ListAutonomousVmClustersResponse apply(
                            ListAutonomousVmClustersRequest request) {
                        return client.listAutonomousVmClusters(request);
                    }
                },
                new java.util.function.Function<
                        ListAutonomousVmClustersResponse,
                        java.util.List<
                                com.oracle.bmc.database.model.AutonomousVmClusterSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.AutonomousVmClusterSummary>
                            apply(ListAutonomousVmClustersResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listBackupDestination operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListBackupDestinationResponse> listBackupDestinationResponseIterator(
            final ListBackupDestinationRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBackupDestinationRequest.Builder,
                ListBackupDestinationRequest,
                ListBackupDestinationResponse>(
                new java.util.function.Supplier<ListBackupDestinationRequest.Builder>() {
                    @Override
                    public ListBackupDestinationRequest.Builder get() {
                        return ListBackupDestinationRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBackupDestinationResponse, String>() {
                    @Override
                    public String apply(ListBackupDestinationResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBackupDestinationRequest.Builder>,
                        ListBackupDestinationRequest>() {
                    @Override
                    public ListBackupDestinationRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBackupDestinationRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListBackupDestinationRequest, ListBackupDestinationResponse>() {
                    @Override
                    public ListBackupDestinationResponse apply(
                            ListBackupDestinationRequest request) {
                        return client.listBackupDestination(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.BackupDestinationSummary} objects contained in responses from
     * the listBackupDestination operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.BackupDestinationSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.BackupDestinationSummary>
            listBackupDestinationRecordIterator(final ListBackupDestinationRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBackupDestinationRequest.Builder,
                ListBackupDestinationRequest,
                ListBackupDestinationResponse,
                com.oracle.bmc.database.model.BackupDestinationSummary>(
                new java.util.function.Supplier<ListBackupDestinationRequest.Builder>() {
                    @Override
                    public ListBackupDestinationRequest.Builder get() {
                        return ListBackupDestinationRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBackupDestinationResponse, String>() {
                    @Override
                    public String apply(ListBackupDestinationResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBackupDestinationRequest.Builder>,
                        ListBackupDestinationRequest>() {
                    @Override
                    public ListBackupDestinationRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBackupDestinationRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListBackupDestinationRequest, ListBackupDestinationResponse>() {
                    @Override
                    public ListBackupDestinationResponse apply(
                            ListBackupDestinationRequest request) {
                        return client.listBackupDestination(request);
                    }
                },
                new java.util.function.Function<
                        ListBackupDestinationResponse,
                        java.util.List<com.oracle.bmc.database.model.BackupDestinationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.BackupDestinationSummary>
                            apply(ListBackupDestinationResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBackups
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListBackupsResponse> listBackupsResponseIterator(
            final ListBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBackupsRequest.Builder, ListBackupsRequest, ListBackupsResponse>(
                new java.util.function.Supplier<ListBackupsRequest.Builder>() {
                    @Override
                    public ListBackupsRequest.Builder get() {
                        return ListBackupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBackupsResponse, String>() {
                    @Override
                    public String apply(ListBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBackupsRequest.Builder>,
                        ListBackupsRequest>() {
                    @Override
                    public ListBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBackupsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListBackupsRequest, ListBackupsResponse>() {
                    @Override
                    public ListBackupsResponse apply(ListBackupsRequest request) {
                        return client.listBackups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.BackupSummary} objects contained in responses from the
     * listBackups operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.BackupSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.database.model.BackupSummary> listBackupsRecordIterator(
            final ListBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBackupsRequest.Builder,
                ListBackupsRequest,
                ListBackupsResponse,
                com.oracle.bmc.database.model.BackupSummary>(
                new java.util.function.Supplier<ListBackupsRequest.Builder>() {
                    @Override
                    public ListBackupsRequest.Builder get() {
                        return ListBackupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBackupsResponse, String>() {
                    @Override
                    public String apply(ListBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBackupsRequest.Builder>,
                        ListBackupsRequest>() {
                    @Override
                    public ListBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBackupsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListBackupsRequest, ListBackupsResponse>() {
                    @Override
                    public ListBackupsResponse apply(ListBackupsRequest request) {
                        return client.listBackups(request);
                    }
                },
                new java.util.function.Function<
                        ListBackupsResponse,
                        java.util.List<com.oracle.bmc.database.model.BackupSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.BackupSummary> apply(
                            ListBackupsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCloudAutonomousVmClusters operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudAutonomousVmClustersResponse>
            listCloudAutonomousVmClustersResponseIterator(
                    final ListCloudAutonomousVmClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudAutonomousVmClustersRequest.Builder,
                ListCloudAutonomousVmClustersRequest,
                ListCloudAutonomousVmClustersResponse>(
                new java.util.function.Supplier<ListCloudAutonomousVmClustersRequest.Builder>() {
                    @Override
                    public ListCloudAutonomousVmClustersRequest.Builder get() {
                        return ListCloudAutonomousVmClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudAutonomousVmClustersResponse, String>() {
                    @Override
                    public String apply(ListCloudAutonomousVmClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudAutonomousVmClustersRequest.Builder>,
                        ListCloudAutonomousVmClustersRequest>() {
                    @Override
                    public ListCloudAutonomousVmClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudAutonomousVmClustersRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListCloudAutonomousVmClustersRequest,
                        ListCloudAutonomousVmClustersResponse>() {
                    @Override
                    public ListCloudAutonomousVmClustersResponse apply(
                            ListCloudAutonomousVmClustersRequest request) {
                        return client.listCloudAutonomousVmClusters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.CloudAutonomousVmClusterSummary} objects contained in responses
     * from the listCloudAutonomousVmClusters operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.CloudAutonomousVmClusterSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.CloudAutonomousVmClusterSummary>
            listCloudAutonomousVmClustersRecordIterator(
                    final ListCloudAutonomousVmClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudAutonomousVmClustersRequest.Builder,
                ListCloudAutonomousVmClustersRequest,
                ListCloudAutonomousVmClustersResponse,
                com.oracle.bmc.database.model.CloudAutonomousVmClusterSummary>(
                new java.util.function.Supplier<ListCloudAutonomousVmClustersRequest.Builder>() {
                    @Override
                    public ListCloudAutonomousVmClustersRequest.Builder get() {
                        return ListCloudAutonomousVmClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudAutonomousVmClustersResponse, String>() {
                    @Override
                    public String apply(ListCloudAutonomousVmClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudAutonomousVmClustersRequest.Builder>,
                        ListCloudAutonomousVmClustersRequest>() {
                    @Override
                    public ListCloudAutonomousVmClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudAutonomousVmClustersRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListCloudAutonomousVmClustersRequest,
                        ListCloudAutonomousVmClustersResponse>() {
                    @Override
                    public ListCloudAutonomousVmClustersResponse apply(
                            ListCloudAutonomousVmClustersRequest request) {
                        return client.listCloudAutonomousVmClusters(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudAutonomousVmClustersResponse,
                        java.util.List<
                                com.oracle.bmc.database.model.CloudAutonomousVmClusterSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model.CloudAutonomousVmClusterSummary>
                            apply(ListCloudAutonomousVmClustersResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCloudExadataInfrastructures operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudExadataInfrastructuresResponse>
            listCloudExadataInfrastructuresResponseIterator(
                    final ListCloudExadataInfrastructuresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudExadataInfrastructuresRequest.Builder,
                ListCloudExadataInfrastructuresRequest,
                ListCloudExadataInfrastructuresResponse>(
                new java.util.function.Supplier<ListCloudExadataInfrastructuresRequest.Builder>() {
                    @Override
                    public ListCloudExadataInfrastructuresRequest.Builder get() {
                        return ListCloudExadataInfrastructuresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudExadataInfrastructuresResponse, String>() {
                    @Override
                    public String apply(ListCloudExadataInfrastructuresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudExadataInfrastructuresRequest.Builder>,
                        ListCloudExadataInfrastructuresRequest>() {
                    @Override
                    public ListCloudExadataInfrastructuresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudExadataInfrastructuresRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListCloudExadataInfrastructuresRequest,
                        ListCloudExadataInfrastructuresResponse>() {
                    @Override
                    public ListCloudExadataInfrastructuresResponse apply(
                            ListCloudExadataInfrastructuresRequest request) {
                        return client.listCloudExadataInfrastructures(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.CloudExadataInfrastructureSummary} objects contained in
     * responses from the listCloudExadataInfrastructures operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.CloudExadataInfrastructureSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.CloudExadataInfrastructureSummary>
            listCloudExadataInfrastructuresRecordIterator(
                    final ListCloudExadataInfrastructuresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudExadataInfrastructuresRequest.Builder,
                ListCloudExadataInfrastructuresRequest,
                ListCloudExadataInfrastructuresResponse,
                com.oracle.bmc.database.model.CloudExadataInfrastructureSummary>(
                new java.util.function.Supplier<ListCloudExadataInfrastructuresRequest.Builder>() {
                    @Override
                    public ListCloudExadataInfrastructuresRequest.Builder get() {
                        return ListCloudExadataInfrastructuresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudExadataInfrastructuresResponse, String>() {
                    @Override
                    public String apply(ListCloudExadataInfrastructuresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudExadataInfrastructuresRequest.Builder>,
                        ListCloudExadataInfrastructuresRequest>() {
                    @Override
                    public ListCloudExadataInfrastructuresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudExadataInfrastructuresRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListCloudExadataInfrastructuresRequest,
                        ListCloudExadataInfrastructuresResponse>() {
                    @Override
                    public ListCloudExadataInfrastructuresResponse apply(
                            ListCloudExadataInfrastructuresRequest request) {
                        return client.listCloudExadataInfrastructures(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudExadataInfrastructuresResponse,
                        java.util.List<
                                com.oracle.bmc.database.model
                                        .CloudExadataInfrastructureSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model.CloudExadataInfrastructureSummary>
                            apply(ListCloudExadataInfrastructuresResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCloudVmClusterUpdateHistoryEntries operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudVmClusterUpdateHistoryEntriesResponse>
            listCloudVmClusterUpdateHistoryEntriesResponseIterator(
                    final ListCloudVmClusterUpdateHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudVmClusterUpdateHistoryEntriesRequest.Builder,
                ListCloudVmClusterUpdateHistoryEntriesRequest,
                ListCloudVmClusterUpdateHistoryEntriesResponse>(
                new java.util.function.Supplier<
                        ListCloudVmClusterUpdateHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListCloudVmClusterUpdateHistoryEntriesRequest.Builder get() {
                        return ListCloudVmClusterUpdateHistoryEntriesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudVmClusterUpdateHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListCloudVmClusterUpdateHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudVmClusterUpdateHistoryEntriesRequest.Builder>,
                        ListCloudVmClusterUpdateHistoryEntriesRequest>() {
                    @Override
                    public ListCloudVmClusterUpdateHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudVmClusterUpdateHistoryEntriesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListCloudVmClusterUpdateHistoryEntriesRequest,
                        ListCloudVmClusterUpdateHistoryEntriesResponse>() {
                    @Override
                    public ListCloudVmClusterUpdateHistoryEntriesResponse apply(
                            ListCloudVmClusterUpdateHistoryEntriesRequest request) {
                        return client.listCloudVmClusterUpdateHistoryEntries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.UpdateHistoryEntrySummary} objects contained in responses from
     * the listCloudVmClusterUpdateHistoryEntries operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.UpdateHistoryEntrySummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.UpdateHistoryEntrySummary>
            listCloudVmClusterUpdateHistoryEntriesRecordIterator(
                    final ListCloudVmClusterUpdateHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudVmClusterUpdateHistoryEntriesRequest.Builder,
                ListCloudVmClusterUpdateHistoryEntriesRequest,
                ListCloudVmClusterUpdateHistoryEntriesResponse,
                com.oracle.bmc.database.model.UpdateHistoryEntrySummary>(
                new java.util.function.Supplier<
                        ListCloudVmClusterUpdateHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListCloudVmClusterUpdateHistoryEntriesRequest.Builder get() {
                        return ListCloudVmClusterUpdateHistoryEntriesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudVmClusterUpdateHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListCloudVmClusterUpdateHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudVmClusterUpdateHistoryEntriesRequest.Builder>,
                        ListCloudVmClusterUpdateHistoryEntriesRequest>() {
                    @Override
                    public ListCloudVmClusterUpdateHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudVmClusterUpdateHistoryEntriesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListCloudVmClusterUpdateHistoryEntriesRequest,
                        ListCloudVmClusterUpdateHistoryEntriesResponse>() {
                    @Override
                    public ListCloudVmClusterUpdateHistoryEntriesResponse apply(
                            ListCloudVmClusterUpdateHistoryEntriesRequest request) {
                        return client.listCloudVmClusterUpdateHistoryEntries(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudVmClusterUpdateHistoryEntriesResponse,
                        java.util.List<com.oracle.bmc.database.model.UpdateHistoryEntrySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.UpdateHistoryEntrySummary>
                            apply(ListCloudVmClusterUpdateHistoryEntriesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCloudVmClusterUpdates operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudVmClusterUpdatesResponse> listCloudVmClusterUpdatesResponseIterator(
            final ListCloudVmClusterUpdatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudVmClusterUpdatesRequest.Builder,
                ListCloudVmClusterUpdatesRequest,
                ListCloudVmClusterUpdatesResponse>(
                new java.util.function.Supplier<ListCloudVmClusterUpdatesRequest.Builder>() {
                    @Override
                    public ListCloudVmClusterUpdatesRequest.Builder get() {
                        return ListCloudVmClusterUpdatesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudVmClusterUpdatesResponse, String>() {
                    @Override
                    public String apply(ListCloudVmClusterUpdatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudVmClusterUpdatesRequest.Builder>,
                        ListCloudVmClusterUpdatesRequest>() {
                    @Override
                    public ListCloudVmClusterUpdatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudVmClusterUpdatesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListCloudVmClusterUpdatesRequest, ListCloudVmClusterUpdatesResponse>() {
                    @Override
                    public ListCloudVmClusterUpdatesResponse apply(
                            ListCloudVmClusterUpdatesRequest request) {
                        return client.listCloudVmClusterUpdates(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.UpdateSummary} objects contained in responses from the
     * listCloudVmClusterUpdates operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.UpdateSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.database.model.UpdateSummary>
            listCloudVmClusterUpdatesRecordIterator(
                    final ListCloudVmClusterUpdatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudVmClusterUpdatesRequest.Builder,
                ListCloudVmClusterUpdatesRequest,
                ListCloudVmClusterUpdatesResponse,
                com.oracle.bmc.database.model.UpdateSummary>(
                new java.util.function.Supplier<ListCloudVmClusterUpdatesRequest.Builder>() {
                    @Override
                    public ListCloudVmClusterUpdatesRequest.Builder get() {
                        return ListCloudVmClusterUpdatesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudVmClusterUpdatesResponse, String>() {
                    @Override
                    public String apply(ListCloudVmClusterUpdatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudVmClusterUpdatesRequest.Builder>,
                        ListCloudVmClusterUpdatesRequest>() {
                    @Override
                    public ListCloudVmClusterUpdatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudVmClusterUpdatesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListCloudVmClusterUpdatesRequest, ListCloudVmClusterUpdatesResponse>() {
                    @Override
                    public ListCloudVmClusterUpdatesResponse apply(
                            ListCloudVmClusterUpdatesRequest request) {
                        return client.listCloudVmClusterUpdates(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudVmClusterUpdatesResponse,
                        java.util.List<com.oracle.bmc.database.model.UpdateSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.UpdateSummary> apply(
                            ListCloudVmClusterUpdatesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCloudVmClusters operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCloudVmClustersResponse> listCloudVmClustersResponseIterator(
            final ListCloudVmClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCloudVmClustersRequest.Builder,
                ListCloudVmClustersRequest,
                ListCloudVmClustersResponse>(
                new java.util.function.Supplier<ListCloudVmClustersRequest.Builder>() {
                    @Override
                    public ListCloudVmClustersRequest.Builder get() {
                        return ListCloudVmClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudVmClustersResponse, String>() {
                    @Override
                    public String apply(ListCloudVmClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudVmClustersRequest.Builder>,
                        ListCloudVmClustersRequest>() {
                    @Override
                    public ListCloudVmClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudVmClustersRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListCloudVmClustersRequest, ListCloudVmClustersResponse>() {
                    @Override
                    public ListCloudVmClustersResponse apply(ListCloudVmClustersRequest request) {
                        return client.listCloudVmClusters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.CloudVmClusterSummary} objects contained in responses from the
     * listCloudVmClusters operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.CloudVmClusterSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.CloudVmClusterSummary>
            listCloudVmClustersRecordIterator(final ListCloudVmClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCloudVmClustersRequest.Builder,
                ListCloudVmClustersRequest,
                ListCloudVmClustersResponse,
                com.oracle.bmc.database.model.CloudVmClusterSummary>(
                new java.util.function.Supplier<ListCloudVmClustersRequest.Builder>() {
                    @Override
                    public ListCloudVmClustersRequest.Builder get() {
                        return ListCloudVmClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCloudVmClustersResponse, String>() {
                    @Override
                    public String apply(ListCloudVmClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCloudVmClustersRequest.Builder>,
                        ListCloudVmClustersRequest>() {
                    @Override
                    public ListCloudVmClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCloudVmClustersRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListCloudVmClustersRequest, ListCloudVmClustersResponse>() {
                    @Override
                    public ListCloudVmClustersResponse apply(ListCloudVmClustersRequest request) {
                        return client.listCloudVmClusters(request);
                    }
                },
                new java.util.function.Function<
                        ListCloudVmClustersResponse,
                        java.util.List<com.oracle.bmc.database.model.CloudVmClusterSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.CloudVmClusterSummary>
                            apply(ListCloudVmClustersResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listContainerDatabasePatches operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListContainerDatabasePatchesResponse>
            listContainerDatabasePatchesResponseIterator(
                    final ListContainerDatabasePatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListContainerDatabasePatchesRequest.Builder,
                ListContainerDatabasePatchesRequest,
                ListContainerDatabasePatchesResponse>(
                new java.util.function.Supplier<ListContainerDatabasePatchesRequest.Builder>() {
                    @Override
                    public ListContainerDatabasePatchesRequest.Builder get() {
                        return ListContainerDatabasePatchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListContainerDatabasePatchesResponse, String>() {
                    @Override
                    public String apply(ListContainerDatabasePatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListContainerDatabasePatchesRequest.Builder>,
                        ListContainerDatabasePatchesRequest>() {
                    @Override
                    public ListContainerDatabasePatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListContainerDatabasePatchesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListContainerDatabasePatchesRequest,
                        ListContainerDatabasePatchesResponse>() {
                    @Override
                    public ListContainerDatabasePatchesResponse apply(
                            ListContainerDatabasePatchesRequest request) {
                        return client.listContainerDatabasePatches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.AutonomousPatchSummary} objects contained in responses from the
     * listContainerDatabasePatches operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.AutonomousPatchSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.AutonomousPatchSummary>
            listContainerDatabasePatchesRecordIterator(
                    final ListContainerDatabasePatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListContainerDatabasePatchesRequest.Builder,
                ListContainerDatabasePatchesRequest,
                ListContainerDatabasePatchesResponse,
                com.oracle.bmc.database.model.AutonomousPatchSummary>(
                new java.util.function.Supplier<ListContainerDatabasePatchesRequest.Builder>() {
                    @Override
                    public ListContainerDatabasePatchesRequest.Builder get() {
                        return ListContainerDatabasePatchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListContainerDatabasePatchesResponse, String>() {
                    @Override
                    public String apply(ListContainerDatabasePatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListContainerDatabasePatchesRequest.Builder>,
                        ListContainerDatabasePatchesRequest>() {
                    @Override
                    public ListContainerDatabasePatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListContainerDatabasePatchesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListContainerDatabasePatchesRequest,
                        ListContainerDatabasePatchesResponse>() {
                    @Override
                    public ListContainerDatabasePatchesResponse apply(
                            ListContainerDatabasePatchesRequest request) {
                        return client.listContainerDatabasePatches(request);
                    }
                },
                new java.util.function.Function<
                        ListContainerDatabasePatchesResponse,
                        java.util.List<com.oracle.bmc.database.model.AutonomousPatchSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.AutonomousPatchSummary>
                            apply(ListContainerDatabasePatchesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDataGuardAssociations operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDataGuardAssociationsResponse> listDataGuardAssociationsResponseIterator(
            final ListDataGuardAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataGuardAssociationsRequest.Builder,
                ListDataGuardAssociationsRequest,
                ListDataGuardAssociationsResponse>(
                new java.util.function.Supplier<ListDataGuardAssociationsRequest.Builder>() {
                    @Override
                    public ListDataGuardAssociationsRequest.Builder get() {
                        return ListDataGuardAssociationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataGuardAssociationsResponse, String>() {
                    @Override
                    public String apply(ListDataGuardAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataGuardAssociationsRequest.Builder>,
                        ListDataGuardAssociationsRequest>() {
                    @Override
                    public ListDataGuardAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataGuardAssociationsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListDataGuardAssociationsRequest, ListDataGuardAssociationsResponse>() {
                    @Override
                    public ListDataGuardAssociationsResponse apply(
                            ListDataGuardAssociationsRequest request) {
                        return client.listDataGuardAssociations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.DataGuardAssociationSummary} objects contained in responses
     * from the listDataGuardAssociations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.DataGuardAssociationSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.DataGuardAssociationSummary>
            listDataGuardAssociationsRecordIterator(
                    final ListDataGuardAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataGuardAssociationsRequest.Builder,
                ListDataGuardAssociationsRequest,
                ListDataGuardAssociationsResponse,
                com.oracle.bmc.database.model.DataGuardAssociationSummary>(
                new java.util.function.Supplier<ListDataGuardAssociationsRequest.Builder>() {
                    @Override
                    public ListDataGuardAssociationsRequest.Builder get() {
                        return ListDataGuardAssociationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDataGuardAssociationsResponse, String>() {
                    @Override
                    public String apply(ListDataGuardAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataGuardAssociationsRequest.Builder>,
                        ListDataGuardAssociationsRequest>() {
                    @Override
                    public ListDataGuardAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataGuardAssociationsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListDataGuardAssociationsRequest, ListDataGuardAssociationsResponse>() {
                    @Override
                    public ListDataGuardAssociationsResponse apply(
                            ListDataGuardAssociationsRequest request) {
                        return client.listDataGuardAssociations(request);
                    }
                },
                new java.util.function.Function<
                        ListDataGuardAssociationsResponse,
                        java.util.List<
                                com.oracle.bmc.database.model.DataGuardAssociationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.DataGuardAssociationSummary>
                            apply(ListDataGuardAssociationsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDatabaseSoftwareImages operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDatabaseSoftwareImagesResponse> listDatabaseSoftwareImagesResponseIterator(
            final ListDatabaseSoftwareImagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDatabaseSoftwareImagesRequest.Builder,
                ListDatabaseSoftwareImagesRequest,
                ListDatabaseSoftwareImagesResponse>(
                new java.util.function.Supplier<ListDatabaseSoftwareImagesRequest.Builder>() {
                    @Override
                    public ListDatabaseSoftwareImagesRequest.Builder get() {
                        return ListDatabaseSoftwareImagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDatabaseSoftwareImagesResponse, String>() {
                    @Override
                    public String apply(ListDatabaseSoftwareImagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseSoftwareImagesRequest.Builder>,
                        ListDatabaseSoftwareImagesRequest>() {
                    @Override
                    public ListDatabaseSoftwareImagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseSoftwareImagesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListDatabaseSoftwareImagesRequest, ListDatabaseSoftwareImagesResponse>() {
                    @Override
                    public ListDatabaseSoftwareImagesResponse apply(
                            ListDatabaseSoftwareImagesRequest request) {
                        return client.listDatabaseSoftwareImages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.DatabaseSoftwareImageSummary} objects contained in responses
     * from the listDatabaseSoftwareImages operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.DatabaseSoftwareImageSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.DatabaseSoftwareImageSummary>
            listDatabaseSoftwareImagesRecordIterator(
                    final ListDatabaseSoftwareImagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDatabaseSoftwareImagesRequest.Builder,
                ListDatabaseSoftwareImagesRequest,
                ListDatabaseSoftwareImagesResponse,
                com.oracle.bmc.database.model.DatabaseSoftwareImageSummary>(
                new java.util.function.Supplier<ListDatabaseSoftwareImagesRequest.Builder>() {
                    @Override
                    public ListDatabaseSoftwareImagesRequest.Builder get() {
                        return ListDatabaseSoftwareImagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDatabaseSoftwareImagesResponse, String>() {
                    @Override
                    public String apply(ListDatabaseSoftwareImagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseSoftwareImagesRequest.Builder>,
                        ListDatabaseSoftwareImagesRequest>() {
                    @Override
                    public ListDatabaseSoftwareImagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseSoftwareImagesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListDatabaseSoftwareImagesRequest, ListDatabaseSoftwareImagesResponse>() {
                    @Override
                    public ListDatabaseSoftwareImagesResponse apply(
                            ListDatabaseSoftwareImagesRequest request) {
                        return client.listDatabaseSoftwareImages(request);
                    }
                },
                new java.util.function.Function<
                        ListDatabaseSoftwareImagesResponse,
                        java.util.List<
                                com.oracle.bmc.database.model.DatabaseSoftwareImageSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model.DatabaseSoftwareImageSummary>
                            apply(ListDatabaseSoftwareImagesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDatabaseUpgradeHistoryEntries operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDatabaseUpgradeHistoryEntriesResponse>
            listDatabaseUpgradeHistoryEntriesResponseIterator(
                    final ListDatabaseUpgradeHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDatabaseUpgradeHistoryEntriesRequest.Builder,
                ListDatabaseUpgradeHistoryEntriesRequest,
                ListDatabaseUpgradeHistoryEntriesResponse>(
                new java.util.function.Supplier<
                        ListDatabaseUpgradeHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListDatabaseUpgradeHistoryEntriesRequest.Builder get() {
                        return ListDatabaseUpgradeHistoryEntriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDatabaseUpgradeHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListDatabaseUpgradeHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseUpgradeHistoryEntriesRequest.Builder>,
                        ListDatabaseUpgradeHistoryEntriesRequest>() {
                    @Override
                    public ListDatabaseUpgradeHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseUpgradeHistoryEntriesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListDatabaseUpgradeHistoryEntriesRequest,
                        ListDatabaseUpgradeHistoryEntriesResponse>() {
                    @Override
                    public ListDatabaseUpgradeHistoryEntriesResponse apply(
                            ListDatabaseUpgradeHistoryEntriesRequest request) {
                        return client.listDatabaseUpgradeHistoryEntries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.DatabaseUpgradeHistoryEntrySummary} objects contained in
     * responses from the listDatabaseUpgradeHistoryEntries operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.DatabaseUpgradeHistoryEntrySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.DatabaseUpgradeHistoryEntrySummary>
            listDatabaseUpgradeHistoryEntriesRecordIterator(
                    final ListDatabaseUpgradeHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDatabaseUpgradeHistoryEntriesRequest.Builder,
                ListDatabaseUpgradeHistoryEntriesRequest,
                ListDatabaseUpgradeHistoryEntriesResponse,
                com.oracle.bmc.database.model.DatabaseUpgradeHistoryEntrySummary>(
                new java.util.function.Supplier<
                        ListDatabaseUpgradeHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListDatabaseUpgradeHistoryEntriesRequest.Builder get() {
                        return ListDatabaseUpgradeHistoryEntriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDatabaseUpgradeHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListDatabaseUpgradeHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseUpgradeHistoryEntriesRequest.Builder>,
                        ListDatabaseUpgradeHistoryEntriesRequest>() {
                    @Override
                    public ListDatabaseUpgradeHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseUpgradeHistoryEntriesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListDatabaseUpgradeHistoryEntriesRequest,
                        ListDatabaseUpgradeHistoryEntriesResponse>() {
                    @Override
                    public ListDatabaseUpgradeHistoryEntriesResponse apply(
                            ListDatabaseUpgradeHistoryEntriesRequest request) {
                        return client.listDatabaseUpgradeHistoryEntries(request);
                    }
                },
                new java.util.function.Function<
                        ListDatabaseUpgradeHistoryEntriesResponse,
                        java.util.List<
                                com.oracle.bmc.database.model
                                        .DatabaseUpgradeHistoryEntrySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model
                                            .DatabaseUpgradeHistoryEntrySummary>
                            apply(ListDatabaseUpgradeHistoryEntriesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDatabases
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDatabasesResponse> listDatabasesResponseIterator(
            final ListDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDatabasesRequest.Builder, ListDatabasesRequest, ListDatabasesResponse>(
                new java.util.function.Supplier<ListDatabasesRequest.Builder>() {
                    @Override
                    public ListDatabasesRequest.Builder get() {
                        return ListDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDatabasesResponse, String>() {
                    @Override
                    public String apply(ListDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabasesRequest.Builder>,
                        ListDatabasesRequest>() {
                    @Override
                    public ListDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabasesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListDatabasesRequest, ListDatabasesResponse>() {
                    @Override
                    public ListDatabasesResponse apply(ListDatabasesRequest request) {
                        return client.listDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.DatabaseSummary} objects contained in responses from the
     * listDatabases operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.DatabaseSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.database.model.DatabaseSummary> listDatabasesRecordIterator(
            final ListDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDatabasesRequest.Builder,
                ListDatabasesRequest,
                ListDatabasesResponse,
                com.oracle.bmc.database.model.DatabaseSummary>(
                new java.util.function.Supplier<ListDatabasesRequest.Builder>() {
                    @Override
                    public ListDatabasesRequest.Builder get() {
                        return ListDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDatabasesResponse, String>() {
                    @Override
                    public String apply(ListDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabasesRequest.Builder>,
                        ListDatabasesRequest>() {
                    @Override
                    public ListDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabasesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListDatabasesRequest, ListDatabasesResponse>() {
                    @Override
                    public ListDatabasesResponse apply(ListDatabasesRequest request) {
                        return client.listDatabases(request);
                    }
                },
                new java.util.function.Function<
                        ListDatabasesResponse,
                        java.util.List<com.oracle.bmc.database.model.DatabaseSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.DatabaseSummary> apply(
                            ListDatabasesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDbHomePatchHistoryEntries operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDbHomePatchHistoryEntriesResponse>
            listDbHomePatchHistoryEntriesResponseIterator(
                    final ListDbHomePatchHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbHomePatchHistoryEntriesRequest.Builder,
                ListDbHomePatchHistoryEntriesRequest,
                ListDbHomePatchHistoryEntriesResponse>(
                new java.util.function.Supplier<ListDbHomePatchHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListDbHomePatchHistoryEntriesRequest.Builder get() {
                        return ListDbHomePatchHistoryEntriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbHomePatchHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListDbHomePatchHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbHomePatchHistoryEntriesRequest.Builder>,
                        ListDbHomePatchHistoryEntriesRequest>() {
                    @Override
                    public ListDbHomePatchHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbHomePatchHistoryEntriesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListDbHomePatchHistoryEntriesRequest,
                        ListDbHomePatchHistoryEntriesResponse>() {
                    @Override
                    public ListDbHomePatchHistoryEntriesResponse apply(
                            ListDbHomePatchHistoryEntriesRequest request) {
                        return client.listDbHomePatchHistoryEntries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.PatchHistoryEntrySummary} objects contained in responses from
     * the listDbHomePatchHistoryEntries operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.PatchHistoryEntrySummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.PatchHistoryEntrySummary>
            listDbHomePatchHistoryEntriesRecordIterator(
                    final ListDbHomePatchHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbHomePatchHistoryEntriesRequest.Builder,
                ListDbHomePatchHistoryEntriesRequest,
                ListDbHomePatchHistoryEntriesResponse,
                com.oracle.bmc.database.model.PatchHistoryEntrySummary>(
                new java.util.function.Supplier<ListDbHomePatchHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListDbHomePatchHistoryEntriesRequest.Builder get() {
                        return ListDbHomePatchHistoryEntriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbHomePatchHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListDbHomePatchHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbHomePatchHistoryEntriesRequest.Builder>,
                        ListDbHomePatchHistoryEntriesRequest>() {
                    @Override
                    public ListDbHomePatchHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbHomePatchHistoryEntriesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListDbHomePatchHistoryEntriesRequest,
                        ListDbHomePatchHistoryEntriesResponse>() {
                    @Override
                    public ListDbHomePatchHistoryEntriesResponse apply(
                            ListDbHomePatchHistoryEntriesRequest request) {
                        return client.listDbHomePatchHistoryEntries(request);
                    }
                },
                new java.util.function.Function<
                        ListDbHomePatchHistoryEntriesResponse,
                        java.util.List<com.oracle.bmc.database.model.PatchHistoryEntrySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.PatchHistoryEntrySummary>
                            apply(ListDbHomePatchHistoryEntriesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDbHomePatches operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDbHomePatchesResponse> listDbHomePatchesResponseIterator(
            final ListDbHomePatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbHomePatchesRequest.Builder,
                ListDbHomePatchesRequest,
                ListDbHomePatchesResponse>(
                new java.util.function.Supplier<ListDbHomePatchesRequest.Builder>() {
                    @Override
                    public ListDbHomePatchesRequest.Builder get() {
                        return ListDbHomePatchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbHomePatchesResponse, String>() {
                    @Override
                    public String apply(ListDbHomePatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbHomePatchesRequest.Builder>,
                        ListDbHomePatchesRequest>() {
                    @Override
                    public ListDbHomePatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbHomePatchesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListDbHomePatchesRequest, ListDbHomePatchesResponse>() {
                    @Override
                    public ListDbHomePatchesResponse apply(ListDbHomePatchesRequest request) {
                        return client.listDbHomePatches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.PatchSummary} objects contained in responses from the
     * listDbHomePatches operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.PatchSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.database.model.PatchSummary> listDbHomePatchesRecordIterator(
            final ListDbHomePatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbHomePatchesRequest.Builder,
                ListDbHomePatchesRequest,
                ListDbHomePatchesResponse,
                com.oracle.bmc.database.model.PatchSummary>(
                new java.util.function.Supplier<ListDbHomePatchesRequest.Builder>() {
                    @Override
                    public ListDbHomePatchesRequest.Builder get() {
                        return ListDbHomePatchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbHomePatchesResponse, String>() {
                    @Override
                    public String apply(ListDbHomePatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbHomePatchesRequest.Builder>,
                        ListDbHomePatchesRequest>() {
                    @Override
                    public ListDbHomePatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbHomePatchesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListDbHomePatchesRequest, ListDbHomePatchesResponse>() {
                    @Override
                    public ListDbHomePatchesResponse apply(ListDbHomePatchesRequest request) {
                        return client.listDbHomePatches(request);
                    }
                },
                new java.util.function.Function<
                        ListDbHomePatchesResponse,
                        java.util.List<com.oracle.bmc.database.model.PatchSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.PatchSummary> apply(
                            ListDbHomePatchesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDbHomes
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDbHomesResponse> listDbHomesResponseIterator(
            final ListDbHomesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbHomesRequest.Builder, ListDbHomesRequest, ListDbHomesResponse>(
                new java.util.function.Supplier<ListDbHomesRequest.Builder>() {
                    @Override
                    public ListDbHomesRequest.Builder get() {
                        return ListDbHomesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbHomesResponse, String>() {
                    @Override
                    public String apply(ListDbHomesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbHomesRequest.Builder>,
                        ListDbHomesRequest>() {
                    @Override
                    public ListDbHomesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbHomesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListDbHomesRequest, ListDbHomesResponse>() {
                    @Override
                    public ListDbHomesResponse apply(ListDbHomesRequest request) {
                        return client.listDbHomes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.DbHomeSummary} objects contained in responses from the
     * listDbHomes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.DbHomeSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.database.model.DbHomeSummary> listDbHomesRecordIterator(
            final ListDbHomesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbHomesRequest.Builder,
                ListDbHomesRequest,
                ListDbHomesResponse,
                com.oracle.bmc.database.model.DbHomeSummary>(
                new java.util.function.Supplier<ListDbHomesRequest.Builder>() {
                    @Override
                    public ListDbHomesRequest.Builder get() {
                        return ListDbHomesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbHomesResponse, String>() {
                    @Override
                    public String apply(ListDbHomesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbHomesRequest.Builder>,
                        ListDbHomesRequest>() {
                    @Override
                    public ListDbHomesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbHomesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListDbHomesRequest, ListDbHomesResponse>() {
                    @Override
                    public ListDbHomesResponse apply(ListDbHomesRequest request) {
                        return client.listDbHomes(request);
                    }
                },
                new java.util.function.Function<
                        ListDbHomesResponse,
                        java.util.List<com.oracle.bmc.database.model.DbHomeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.DbHomeSummary> apply(
                            ListDbHomesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDbNodes
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDbNodesResponse> listDbNodesResponseIterator(
            final ListDbNodesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbNodesRequest.Builder, ListDbNodesRequest, ListDbNodesResponse>(
                new java.util.function.Supplier<ListDbNodesRequest.Builder>() {
                    @Override
                    public ListDbNodesRequest.Builder get() {
                        return ListDbNodesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbNodesResponse, String>() {
                    @Override
                    public String apply(ListDbNodesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbNodesRequest.Builder>,
                        ListDbNodesRequest>() {
                    @Override
                    public ListDbNodesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbNodesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListDbNodesRequest, ListDbNodesResponse>() {
                    @Override
                    public ListDbNodesResponse apply(ListDbNodesRequest request) {
                        return client.listDbNodes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.DbNodeSummary} objects contained in responses from the
     * listDbNodes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.DbNodeSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.database.model.DbNodeSummary> listDbNodesRecordIterator(
            final ListDbNodesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbNodesRequest.Builder,
                ListDbNodesRequest,
                ListDbNodesResponse,
                com.oracle.bmc.database.model.DbNodeSummary>(
                new java.util.function.Supplier<ListDbNodesRequest.Builder>() {
                    @Override
                    public ListDbNodesRequest.Builder get() {
                        return ListDbNodesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbNodesResponse, String>() {
                    @Override
                    public String apply(ListDbNodesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbNodesRequest.Builder>,
                        ListDbNodesRequest>() {
                    @Override
                    public ListDbNodesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbNodesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListDbNodesRequest, ListDbNodesResponse>() {
                    @Override
                    public ListDbNodesResponse apply(ListDbNodesRequest request) {
                        return client.listDbNodes(request);
                    }
                },
                new java.util.function.Function<
                        ListDbNodesResponse,
                        java.util.List<com.oracle.bmc.database.model.DbNodeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.DbNodeSummary> apply(
                            ListDbNodesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDbServers
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDbServersResponse> listDbServersResponseIterator(
            final ListDbServersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbServersRequest.Builder, ListDbServersRequest, ListDbServersResponse>(
                new java.util.function.Supplier<ListDbServersRequest.Builder>() {
                    @Override
                    public ListDbServersRequest.Builder get() {
                        return ListDbServersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbServersResponse, String>() {
                    @Override
                    public String apply(ListDbServersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbServersRequest.Builder>,
                        ListDbServersRequest>() {
                    @Override
                    public ListDbServersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbServersRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListDbServersRequest, ListDbServersResponse>() {
                    @Override
                    public ListDbServersResponse apply(ListDbServersRequest request) {
                        return client.listDbServers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.DbServerSummary} objects contained in responses from the
     * listDbServers operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.DbServerSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.database.model.DbServerSummary> listDbServersRecordIterator(
            final ListDbServersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbServersRequest.Builder,
                ListDbServersRequest,
                ListDbServersResponse,
                com.oracle.bmc.database.model.DbServerSummary>(
                new java.util.function.Supplier<ListDbServersRequest.Builder>() {
                    @Override
                    public ListDbServersRequest.Builder get() {
                        return ListDbServersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbServersResponse, String>() {
                    @Override
                    public String apply(ListDbServersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbServersRequest.Builder>,
                        ListDbServersRequest>() {
                    @Override
                    public ListDbServersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbServersRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListDbServersRequest, ListDbServersResponse>() {
                    @Override
                    public ListDbServersResponse apply(ListDbServersRequest request) {
                        return client.listDbServers(request);
                    }
                },
                new java.util.function.Function<
                        ListDbServersResponse,
                        java.util.List<com.oracle.bmc.database.model.DbServerSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.DbServerSummary> apply(
                            ListDbServersResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDbSystemPatchHistoryEntries operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDbSystemPatchHistoryEntriesResponse>
            listDbSystemPatchHistoryEntriesResponseIterator(
                    final ListDbSystemPatchHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbSystemPatchHistoryEntriesRequest.Builder,
                ListDbSystemPatchHistoryEntriesRequest,
                ListDbSystemPatchHistoryEntriesResponse>(
                new java.util.function.Supplier<ListDbSystemPatchHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListDbSystemPatchHistoryEntriesRequest.Builder get() {
                        return ListDbSystemPatchHistoryEntriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbSystemPatchHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListDbSystemPatchHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemPatchHistoryEntriesRequest.Builder>,
                        ListDbSystemPatchHistoryEntriesRequest>() {
                    @Override
                    public ListDbSystemPatchHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemPatchHistoryEntriesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListDbSystemPatchHistoryEntriesRequest,
                        ListDbSystemPatchHistoryEntriesResponse>() {
                    @Override
                    public ListDbSystemPatchHistoryEntriesResponse apply(
                            ListDbSystemPatchHistoryEntriesRequest request) {
                        return client.listDbSystemPatchHistoryEntries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.PatchHistoryEntrySummary} objects contained in responses from
     * the listDbSystemPatchHistoryEntries operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.PatchHistoryEntrySummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.PatchHistoryEntrySummary>
            listDbSystemPatchHistoryEntriesRecordIterator(
                    final ListDbSystemPatchHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbSystemPatchHistoryEntriesRequest.Builder,
                ListDbSystemPatchHistoryEntriesRequest,
                ListDbSystemPatchHistoryEntriesResponse,
                com.oracle.bmc.database.model.PatchHistoryEntrySummary>(
                new java.util.function.Supplier<ListDbSystemPatchHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListDbSystemPatchHistoryEntriesRequest.Builder get() {
                        return ListDbSystemPatchHistoryEntriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbSystemPatchHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListDbSystemPatchHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemPatchHistoryEntriesRequest.Builder>,
                        ListDbSystemPatchHistoryEntriesRequest>() {
                    @Override
                    public ListDbSystemPatchHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemPatchHistoryEntriesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListDbSystemPatchHistoryEntriesRequest,
                        ListDbSystemPatchHistoryEntriesResponse>() {
                    @Override
                    public ListDbSystemPatchHistoryEntriesResponse apply(
                            ListDbSystemPatchHistoryEntriesRequest request) {
                        return client.listDbSystemPatchHistoryEntries(request);
                    }
                },
                new java.util.function.Function<
                        ListDbSystemPatchHistoryEntriesResponse,
                        java.util.List<com.oracle.bmc.database.model.PatchHistoryEntrySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.PatchHistoryEntrySummary>
                            apply(ListDbSystemPatchHistoryEntriesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDbSystemPatches operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDbSystemPatchesResponse> listDbSystemPatchesResponseIterator(
            final ListDbSystemPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbSystemPatchesRequest.Builder,
                ListDbSystemPatchesRequest,
                ListDbSystemPatchesResponse>(
                new java.util.function.Supplier<ListDbSystemPatchesRequest.Builder>() {
                    @Override
                    public ListDbSystemPatchesRequest.Builder get() {
                        return ListDbSystemPatchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbSystemPatchesResponse, String>() {
                    @Override
                    public String apply(ListDbSystemPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemPatchesRequest.Builder>,
                        ListDbSystemPatchesRequest>() {
                    @Override
                    public ListDbSystemPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemPatchesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListDbSystemPatchesRequest, ListDbSystemPatchesResponse>() {
                    @Override
                    public ListDbSystemPatchesResponse apply(ListDbSystemPatchesRequest request) {
                        return client.listDbSystemPatches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.PatchSummary} objects contained in responses from the
     * listDbSystemPatches operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.PatchSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.database.model.PatchSummary> listDbSystemPatchesRecordIterator(
            final ListDbSystemPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbSystemPatchesRequest.Builder,
                ListDbSystemPatchesRequest,
                ListDbSystemPatchesResponse,
                com.oracle.bmc.database.model.PatchSummary>(
                new java.util.function.Supplier<ListDbSystemPatchesRequest.Builder>() {
                    @Override
                    public ListDbSystemPatchesRequest.Builder get() {
                        return ListDbSystemPatchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbSystemPatchesResponse, String>() {
                    @Override
                    public String apply(ListDbSystemPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemPatchesRequest.Builder>,
                        ListDbSystemPatchesRequest>() {
                    @Override
                    public ListDbSystemPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemPatchesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListDbSystemPatchesRequest, ListDbSystemPatchesResponse>() {
                    @Override
                    public ListDbSystemPatchesResponse apply(ListDbSystemPatchesRequest request) {
                        return client.listDbSystemPatches(request);
                    }
                },
                new java.util.function.Function<
                        ListDbSystemPatchesResponse,
                        java.util.List<com.oracle.bmc.database.model.PatchSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.PatchSummary> apply(
                            ListDbSystemPatchesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDbSystemShapes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDbSystemShapesResponse> listDbSystemShapesResponseIterator(
            final ListDbSystemShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbSystemShapesRequest.Builder,
                ListDbSystemShapesRequest,
                ListDbSystemShapesResponse>(
                new java.util.function.Supplier<ListDbSystemShapesRequest.Builder>() {
                    @Override
                    public ListDbSystemShapesRequest.Builder get() {
                        return ListDbSystemShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbSystemShapesResponse, String>() {
                    @Override
                    public String apply(ListDbSystemShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemShapesRequest.Builder>,
                        ListDbSystemShapesRequest>() {
                    @Override
                    public ListDbSystemShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemShapesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListDbSystemShapesRequest, ListDbSystemShapesResponse>() {
                    @Override
                    public ListDbSystemShapesResponse apply(ListDbSystemShapesRequest request) {
                        return client.listDbSystemShapes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.DbSystemShapeSummary} objects contained in responses from the
     * listDbSystemShapes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.DbSystemShapeSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.DbSystemShapeSummary>
            listDbSystemShapesRecordIterator(final ListDbSystemShapesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbSystemShapesRequest.Builder,
                ListDbSystemShapesRequest,
                ListDbSystemShapesResponse,
                com.oracle.bmc.database.model.DbSystemShapeSummary>(
                new java.util.function.Supplier<ListDbSystemShapesRequest.Builder>() {
                    @Override
                    public ListDbSystemShapesRequest.Builder get() {
                        return ListDbSystemShapesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbSystemShapesResponse, String>() {
                    @Override
                    public String apply(ListDbSystemShapesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemShapesRequest.Builder>,
                        ListDbSystemShapesRequest>() {
                    @Override
                    public ListDbSystemShapesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemShapesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListDbSystemShapesRequest, ListDbSystemShapesResponse>() {
                    @Override
                    public ListDbSystemShapesResponse apply(ListDbSystemShapesRequest request) {
                        return client.listDbSystemShapes(request);
                    }
                },
                new java.util.function.Function<
                        ListDbSystemShapesResponse,
                        java.util.List<com.oracle.bmc.database.model.DbSystemShapeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.DbSystemShapeSummary> apply(
                            ListDbSystemShapesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDbSystemUpgradeHistoryEntries operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDbSystemUpgradeHistoryEntriesResponse>
            listDbSystemUpgradeHistoryEntriesResponseIterator(
                    final ListDbSystemUpgradeHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbSystemUpgradeHistoryEntriesRequest.Builder,
                ListDbSystemUpgradeHistoryEntriesRequest,
                ListDbSystemUpgradeHistoryEntriesResponse>(
                new java.util.function.Supplier<
                        ListDbSystemUpgradeHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListDbSystemUpgradeHistoryEntriesRequest.Builder get() {
                        return ListDbSystemUpgradeHistoryEntriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDbSystemUpgradeHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListDbSystemUpgradeHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemUpgradeHistoryEntriesRequest.Builder>,
                        ListDbSystemUpgradeHistoryEntriesRequest>() {
                    @Override
                    public ListDbSystemUpgradeHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemUpgradeHistoryEntriesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListDbSystemUpgradeHistoryEntriesRequest,
                        ListDbSystemUpgradeHistoryEntriesResponse>() {
                    @Override
                    public ListDbSystemUpgradeHistoryEntriesResponse apply(
                            ListDbSystemUpgradeHistoryEntriesRequest request) {
                        return client.listDbSystemUpgradeHistoryEntries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntrySummary} objects contained in
     * responses from the listDbSystemUpgradeHistoryEntries operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntrySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntrySummary>
            listDbSystemUpgradeHistoryEntriesRecordIterator(
                    final ListDbSystemUpgradeHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbSystemUpgradeHistoryEntriesRequest.Builder,
                ListDbSystemUpgradeHistoryEntriesRequest,
                ListDbSystemUpgradeHistoryEntriesResponse,
                com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntrySummary>(
                new java.util.function.Supplier<
                        ListDbSystemUpgradeHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListDbSystemUpgradeHistoryEntriesRequest.Builder get() {
                        return ListDbSystemUpgradeHistoryEntriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDbSystemUpgradeHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListDbSystemUpgradeHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemUpgradeHistoryEntriesRequest.Builder>,
                        ListDbSystemUpgradeHistoryEntriesRequest>() {
                    @Override
                    public ListDbSystemUpgradeHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemUpgradeHistoryEntriesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListDbSystemUpgradeHistoryEntriesRequest,
                        ListDbSystemUpgradeHistoryEntriesResponse>() {
                    @Override
                    public ListDbSystemUpgradeHistoryEntriesResponse apply(
                            ListDbSystemUpgradeHistoryEntriesRequest request) {
                        return client.listDbSystemUpgradeHistoryEntries(request);
                    }
                },
                new java.util.function.Function<
                        ListDbSystemUpgradeHistoryEntriesResponse,
                        java.util.List<
                                com.oracle.bmc.database.model
                                        .DbSystemUpgradeHistoryEntrySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model
                                            .DbSystemUpgradeHistoryEntrySummary>
                            apply(ListDbSystemUpgradeHistoryEntriesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDbSystems
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDbSystemsResponse> listDbSystemsResponseIterator(
            final ListDbSystemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbSystemsRequest.Builder, ListDbSystemsRequest, ListDbSystemsResponse>(
                new java.util.function.Supplier<ListDbSystemsRequest.Builder>() {
                    @Override
                    public ListDbSystemsRequest.Builder get() {
                        return ListDbSystemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbSystemsResponse, String>() {
                    @Override
                    public String apply(ListDbSystemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemsRequest.Builder>,
                        ListDbSystemsRequest>() {
                    @Override
                    public ListDbSystemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListDbSystemsRequest, ListDbSystemsResponse>() {
                    @Override
                    public ListDbSystemsResponse apply(ListDbSystemsRequest request) {
                        return client.listDbSystems(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.DbSystemSummary} objects contained in responses from the
     * listDbSystems operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.DbSystemSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.database.model.DbSystemSummary> listDbSystemsRecordIterator(
            final ListDbSystemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbSystemsRequest.Builder,
                ListDbSystemsRequest,
                ListDbSystemsResponse,
                com.oracle.bmc.database.model.DbSystemSummary>(
                new java.util.function.Supplier<ListDbSystemsRequest.Builder>() {
                    @Override
                    public ListDbSystemsRequest.Builder get() {
                        return ListDbSystemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbSystemsResponse, String>() {
                    @Override
                    public String apply(ListDbSystemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbSystemsRequest.Builder>,
                        ListDbSystemsRequest>() {
                    @Override
                    public ListDbSystemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbSystemsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListDbSystemsRequest, ListDbSystemsResponse>() {
                    @Override
                    public ListDbSystemsResponse apply(ListDbSystemsRequest request) {
                        return client.listDbSystems(request);
                    }
                },
                new java.util.function.Function<
                        ListDbSystemsResponse,
                        java.util.List<com.oracle.bmc.database.model.DbSystemSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.DbSystemSummary> apply(
                            ListDbSystemsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDbVersions
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDbVersionsResponse> listDbVersionsResponseIterator(
            final ListDbVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDbVersionsRequest.Builder, ListDbVersionsRequest, ListDbVersionsResponse>(
                new java.util.function.Supplier<ListDbVersionsRequest.Builder>() {
                    @Override
                    public ListDbVersionsRequest.Builder get() {
                        return ListDbVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbVersionsResponse, String>() {
                    @Override
                    public String apply(ListDbVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbVersionsRequest.Builder>,
                        ListDbVersionsRequest>() {
                    @Override
                    public ListDbVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbVersionsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListDbVersionsRequest, ListDbVersionsResponse>() {
                    @Override
                    public ListDbVersionsResponse apply(ListDbVersionsRequest request) {
                        return client.listDbVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.DbVersionSummary} objects contained in responses from the
     * listDbVersions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.DbVersionSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.database.model.DbVersionSummary> listDbVersionsRecordIterator(
            final ListDbVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDbVersionsRequest.Builder,
                ListDbVersionsRequest,
                ListDbVersionsResponse,
                com.oracle.bmc.database.model.DbVersionSummary>(
                new java.util.function.Supplier<ListDbVersionsRequest.Builder>() {
                    @Override
                    public ListDbVersionsRequest.Builder get() {
                        return ListDbVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDbVersionsResponse, String>() {
                    @Override
                    public String apply(ListDbVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDbVersionsRequest.Builder>,
                        ListDbVersionsRequest>() {
                    @Override
                    public ListDbVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDbVersionsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListDbVersionsRequest, ListDbVersionsResponse>() {
                    @Override
                    public ListDbVersionsResponse apply(ListDbVersionsRequest request) {
                        return client.listDbVersions(request);
                    }
                },
                new java.util.function.Function<
                        ListDbVersionsResponse,
                        java.util.List<com.oracle.bmc.database.model.DbVersionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.DbVersionSummary> apply(
                            ListDbVersionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExadataInfrastructures operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExadataInfrastructuresResponse> listExadataInfrastructuresResponseIterator(
            final ListExadataInfrastructuresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExadataInfrastructuresRequest.Builder,
                ListExadataInfrastructuresRequest,
                ListExadataInfrastructuresResponse>(
                new java.util.function.Supplier<ListExadataInfrastructuresRequest.Builder>() {
                    @Override
                    public ListExadataInfrastructuresRequest.Builder get() {
                        return ListExadataInfrastructuresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExadataInfrastructuresResponse, String>() {
                    @Override
                    public String apply(ListExadataInfrastructuresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExadataInfrastructuresRequest.Builder>,
                        ListExadataInfrastructuresRequest>() {
                    @Override
                    public ListExadataInfrastructuresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExadataInfrastructuresRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListExadataInfrastructuresRequest, ListExadataInfrastructuresResponse>() {
                    @Override
                    public ListExadataInfrastructuresResponse apply(
                            ListExadataInfrastructuresRequest request) {
                        return client.listExadataInfrastructures(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.ExadataInfrastructureSummary} objects contained in responses
     * from the listExadataInfrastructures operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.ExadataInfrastructureSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.ExadataInfrastructureSummary>
            listExadataInfrastructuresRecordIterator(
                    final ListExadataInfrastructuresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExadataInfrastructuresRequest.Builder,
                ListExadataInfrastructuresRequest,
                ListExadataInfrastructuresResponse,
                com.oracle.bmc.database.model.ExadataInfrastructureSummary>(
                new java.util.function.Supplier<ListExadataInfrastructuresRequest.Builder>() {
                    @Override
                    public ListExadataInfrastructuresRequest.Builder get() {
                        return ListExadataInfrastructuresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExadataInfrastructuresResponse, String>() {
                    @Override
                    public String apply(ListExadataInfrastructuresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExadataInfrastructuresRequest.Builder>,
                        ListExadataInfrastructuresRequest>() {
                    @Override
                    public ListExadataInfrastructuresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExadataInfrastructuresRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListExadataInfrastructuresRequest, ListExadataInfrastructuresResponse>() {
                    @Override
                    public ListExadataInfrastructuresResponse apply(
                            ListExadataInfrastructuresRequest request) {
                        return client.listExadataInfrastructures(request);
                    }
                },
                new java.util.function.Function<
                        ListExadataInfrastructuresResponse,
                        java.util.List<
                                com.oracle.bmc.database.model.ExadataInfrastructureSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model.ExadataInfrastructureSummary>
                            apply(ListExadataInfrastructuresResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalContainerDatabases operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalContainerDatabasesResponse>
            listExternalContainerDatabasesResponseIterator(
                    final ListExternalContainerDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalContainerDatabasesRequest.Builder,
                ListExternalContainerDatabasesRequest,
                ListExternalContainerDatabasesResponse>(
                new java.util.function.Supplier<ListExternalContainerDatabasesRequest.Builder>() {
                    @Override
                    public ListExternalContainerDatabasesRequest.Builder get() {
                        return ListExternalContainerDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalContainerDatabasesResponse, String>() {
                    @Override
                    public String apply(ListExternalContainerDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalContainerDatabasesRequest.Builder>,
                        ListExternalContainerDatabasesRequest>() {
                    @Override
                    public ListExternalContainerDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalContainerDatabasesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListExternalContainerDatabasesRequest,
                        ListExternalContainerDatabasesResponse>() {
                    @Override
                    public ListExternalContainerDatabasesResponse apply(
                            ListExternalContainerDatabasesRequest request) {
                        return client.listExternalContainerDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.ExternalContainerDatabaseSummary} objects contained in
     * responses from the listExternalContainerDatabases operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.ExternalContainerDatabaseSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.ExternalContainerDatabaseSummary>
            listExternalContainerDatabasesRecordIterator(
                    final ListExternalContainerDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalContainerDatabasesRequest.Builder,
                ListExternalContainerDatabasesRequest,
                ListExternalContainerDatabasesResponse,
                com.oracle.bmc.database.model.ExternalContainerDatabaseSummary>(
                new java.util.function.Supplier<ListExternalContainerDatabasesRequest.Builder>() {
                    @Override
                    public ListExternalContainerDatabasesRequest.Builder get() {
                        return ListExternalContainerDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalContainerDatabasesResponse, String>() {
                    @Override
                    public String apply(ListExternalContainerDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalContainerDatabasesRequest.Builder>,
                        ListExternalContainerDatabasesRequest>() {
                    @Override
                    public ListExternalContainerDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalContainerDatabasesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListExternalContainerDatabasesRequest,
                        ListExternalContainerDatabasesResponse>() {
                    @Override
                    public ListExternalContainerDatabasesResponse apply(
                            ListExternalContainerDatabasesRequest request) {
                        return client.listExternalContainerDatabases(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalContainerDatabasesResponse,
                        java.util.List<
                                com.oracle.bmc.database.model.ExternalContainerDatabaseSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model.ExternalContainerDatabaseSummary>
                            apply(ListExternalContainerDatabasesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalDatabaseConnectors operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalDatabaseConnectorsResponse>
            listExternalDatabaseConnectorsResponseIterator(
                    final ListExternalDatabaseConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalDatabaseConnectorsRequest.Builder,
                ListExternalDatabaseConnectorsRequest,
                ListExternalDatabaseConnectorsResponse>(
                new java.util.function.Supplier<ListExternalDatabaseConnectorsRequest.Builder>() {
                    @Override
                    public ListExternalDatabaseConnectorsRequest.Builder get() {
                        return ListExternalDatabaseConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalDatabaseConnectorsResponse, String>() {
                    @Override
                    public String apply(ListExternalDatabaseConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalDatabaseConnectorsRequest.Builder>,
                        ListExternalDatabaseConnectorsRequest>() {
                    @Override
                    public ListExternalDatabaseConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalDatabaseConnectorsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListExternalDatabaseConnectorsRequest,
                        ListExternalDatabaseConnectorsResponse>() {
                    @Override
                    public ListExternalDatabaseConnectorsResponse apply(
                            ListExternalDatabaseConnectorsRequest request) {
                        return client.listExternalDatabaseConnectors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.ExternalDatabaseConnectorSummary} objects contained in
     * responses from the listExternalDatabaseConnectors operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.ExternalDatabaseConnectorSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.ExternalDatabaseConnectorSummary>
            listExternalDatabaseConnectorsRecordIterator(
                    final ListExternalDatabaseConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalDatabaseConnectorsRequest.Builder,
                ListExternalDatabaseConnectorsRequest,
                ListExternalDatabaseConnectorsResponse,
                com.oracle.bmc.database.model.ExternalDatabaseConnectorSummary>(
                new java.util.function.Supplier<ListExternalDatabaseConnectorsRequest.Builder>() {
                    @Override
                    public ListExternalDatabaseConnectorsRequest.Builder get() {
                        return ListExternalDatabaseConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalDatabaseConnectorsResponse, String>() {
                    @Override
                    public String apply(ListExternalDatabaseConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalDatabaseConnectorsRequest.Builder>,
                        ListExternalDatabaseConnectorsRequest>() {
                    @Override
                    public ListExternalDatabaseConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalDatabaseConnectorsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListExternalDatabaseConnectorsRequest,
                        ListExternalDatabaseConnectorsResponse>() {
                    @Override
                    public ListExternalDatabaseConnectorsResponse apply(
                            ListExternalDatabaseConnectorsRequest request) {
                        return client.listExternalDatabaseConnectors(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalDatabaseConnectorsResponse,
                        java.util.List<
                                com.oracle.bmc.database.model.ExternalDatabaseConnectorSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model.ExternalDatabaseConnectorSummary>
                            apply(ListExternalDatabaseConnectorsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalNonContainerDatabases operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalNonContainerDatabasesResponse>
            listExternalNonContainerDatabasesResponseIterator(
                    final ListExternalNonContainerDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalNonContainerDatabasesRequest.Builder,
                ListExternalNonContainerDatabasesRequest,
                ListExternalNonContainerDatabasesResponse>(
                new java.util.function.Supplier<
                        ListExternalNonContainerDatabasesRequest.Builder>() {
                    @Override
                    public ListExternalNonContainerDatabasesRequest.Builder get() {
                        return ListExternalNonContainerDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalNonContainerDatabasesResponse, String>() {
                    @Override
                    public String apply(ListExternalNonContainerDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalNonContainerDatabasesRequest.Builder>,
                        ListExternalNonContainerDatabasesRequest>() {
                    @Override
                    public ListExternalNonContainerDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalNonContainerDatabasesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListExternalNonContainerDatabasesRequest,
                        ListExternalNonContainerDatabasesResponse>() {
                    @Override
                    public ListExternalNonContainerDatabasesResponse apply(
                            ListExternalNonContainerDatabasesRequest request) {
                        return client.listExternalNonContainerDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.ExternalNonContainerDatabaseSummary} objects contained in
     * responses from the listExternalNonContainerDatabases operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.ExternalNonContainerDatabaseSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.ExternalNonContainerDatabaseSummary>
            listExternalNonContainerDatabasesRecordIterator(
                    final ListExternalNonContainerDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalNonContainerDatabasesRequest.Builder,
                ListExternalNonContainerDatabasesRequest,
                ListExternalNonContainerDatabasesResponse,
                com.oracle.bmc.database.model.ExternalNonContainerDatabaseSummary>(
                new java.util.function.Supplier<
                        ListExternalNonContainerDatabasesRequest.Builder>() {
                    @Override
                    public ListExternalNonContainerDatabasesRequest.Builder get() {
                        return ListExternalNonContainerDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalNonContainerDatabasesResponse, String>() {
                    @Override
                    public String apply(ListExternalNonContainerDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalNonContainerDatabasesRequest.Builder>,
                        ListExternalNonContainerDatabasesRequest>() {
                    @Override
                    public ListExternalNonContainerDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalNonContainerDatabasesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListExternalNonContainerDatabasesRequest,
                        ListExternalNonContainerDatabasesResponse>() {
                    @Override
                    public ListExternalNonContainerDatabasesResponse apply(
                            ListExternalNonContainerDatabasesRequest request) {
                        return client.listExternalNonContainerDatabases(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalNonContainerDatabasesResponse,
                        java.util.List<
                                com.oracle.bmc.database.model
                                        .ExternalNonContainerDatabaseSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model
                                            .ExternalNonContainerDatabaseSummary>
                            apply(ListExternalNonContainerDatabasesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listExternalPluggableDatabases operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListExternalPluggableDatabasesResponse>
            listExternalPluggableDatabasesResponseIterator(
                    final ListExternalPluggableDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalPluggableDatabasesRequest.Builder,
                ListExternalPluggableDatabasesRequest,
                ListExternalPluggableDatabasesResponse>(
                new java.util.function.Supplier<ListExternalPluggableDatabasesRequest.Builder>() {
                    @Override
                    public ListExternalPluggableDatabasesRequest.Builder get() {
                        return ListExternalPluggableDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalPluggableDatabasesResponse, String>() {
                    @Override
                    public String apply(ListExternalPluggableDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalPluggableDatabasesRequest.Builder>,
                        ListExternalPluggableDatabasesRequest>() {
                    @Override
                    public ListExternalPluggableDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalPluggableDatabasesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListExternalPluggableDatabasesRequest,
                        ListExternalPluggableDatabasesResponse>() {
                    @Override
                    public ListExternalPluggableDatabasesResponse apply(
                            ListExternalPluggableDatabasesRequest request) {
                        return client.listExternalPluggableDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.ExternalPluggableDatabaseSummary} objects contained in
     * responses from the listExternalPluggableDatabases operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.ExternalPluggableDatabaseSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.ExternalPluggableDatabaseSummary>
            listExternalPluggableDatabasesRecordIterator(
                    final ListExternalPluggableDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalPluggableDatabasesRequest.Builder,
                ListExternalPluggableDatabasesRequest,
                ListExternalPluggableDatabasesResponse,
                com.oracle.bmc.database.model.ExternalPluggableDatabaseSummary>(
                new java.util.function.Supplier<ListExternalPluggableDatabasesRequest.Builder>() {
                    @Override
                    public ListExternalPluggableDatabasesRequest.Builder get() {
                        return ListExternalPluggableDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListExternalPluggableDatabasesResponse, String>() {
                    @Override
                    public String apply(ListExternalPluggableDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalPluggableDatabasesRequest.Builder>,
                        ListExternalPluggableDatabasesRequest>() {
                    @Override
                    public ListExternalPluggableDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalPluggableDatabasesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListExternalPluggableDatabasesRequest,
                        ListExternalPluggableDatabasesResponse>() {
                    @Override
                    public ListExternalPluggableDatabasesResponse apply(
                            ListExternalPluggableDatabasesRequest request) {
                        return client.listExternalPluggableDatabases(request);
                    }
                },
                new java.util.function.Function<
                        ListExternalPluggableDatabasesResponse,
                        java.util.List<
                                com.oracle.bmc.database.model.ExternalPluggableDatabaseSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model.ExternalPluggableDatabaseSummary>
                            apply(ListExternalPluggableDatabasesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listFlexComponents operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFlexComponentsResponse> listFlexComponentsResponseIterator(
            final ListFlexComponentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFlexComponentsRequest.Builder,
                ListFlexComponentsRequest,
                ListFlexComponentsResponse>(
                new java.util.function.Supplier<ListFlexComponentsRequest.Builder>() {
                    @Override
                    public ListFlexComponentsRequest.Builder get() {
                        return ListFlexComponentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFlexComponentsResponse, String>() {
                    @Override
                    public String apply(ListFlexComponentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFlexComponentsRequest.Builder>,
                        ListFlexComponentsRequest>() {
                    @Override
                    public ListFlexComponentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFlexComponentsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListFlexComponentsRequest, ListFlexComponentsResponse>() {
                    @Override
                    public ListFlexComponentsResponse apply(ListFlexComponentsRequest request) {
                        return client.listFlexComponents(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.FlexComponentSummary} objects contained in responses from the
     * listFlexComponents operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.FlexComponentSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.FlexComponentSummary>
            listFlexComponentsRecordIterator(final ListFlexComponentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFlexComponentsRequest.Builder,
                ListFlexComponentsRequest,
                ListFlexComponentsResponse,
                com.oracle.bmc.database.model.FlexComponentSummary>(
                new java.util.function.Supplier<ListFlexComponentsRequest.Builder>() {
                    @Override
                    public ListFlexComponentsRequest.Builder get() {
                        return ListFlexComponentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFlexComponentsResponse, String>() {
                    @Override
                    public String apply(ListFlexComponentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFlexComponentsRequest.Builder>,
                        ListFlexComponentsRequest>() {
                    @Override
                    public ListFlexComponentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFlexComponentsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListFlexComponentsRequest, ListFlexComponentsResponse>() {
                    @Override
                    public ListFlexComponentsResponse apply(ListFlexComponentsRequest request) {
                        return client.listFlexComponents(request);
                    }
                },
                new java.util.function.Function<
                        ListFlexComponentsResponse,
                        java.util.List<com.oracle.bmc.database.model.FlexComponentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.FlexComponentSummary> apply(
                            ListFlexComponentsResponse response) {
                        return response.getFlexComponentCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listGiVersions
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListGiVersionsResponse> listGiVersionsResponseIterator(
            final ListGiVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListGiVersionsRequest.Builder, ListGiVersionsRequest, ListGiVersionsResponse>(
                new java.util.function.Supplier<ListGiVersionsRequest.Builder>() {
                    @Override
                    public ListGiVersionsRequest.Builder get() {
                        return ListGiVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListGiVersionsResponse, String>() {
                    @Override
                    public String apply(ListGiVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGiVersionsRequest.Builder>,
                        ListGiVersionsRequest>() {
                    @Override
                    public ListGiVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGiVersionsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListGiVersionsRequest, ListGiVersionsResponse>() {
                    @Override
                    public ListGiVersionsResponse apply(ListGiVersionsRequest request) {
                        return client.listGiVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.GiVersionSummary} objects contained in responses from the
     * listGiVersions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.GiVersionSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.database.model.GiVersionSummary> listGiVersionsRecordIterator(
            final ListGiVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListGiVersionsRequest.Builder,
                ListGiVersionsRequest,
                ListGiVersionsResponse,
                com.oracle.bmc.database.model.GiVersionSummary>(
                new java.util.function.Supplier<ListGiVersionsRequest.Builder>() {
                    @Override
                    public ListGiVersionsRequest.Builder get() {
                        return ListGiVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListGiVersionsResponse, String>() {
                    @Override
                    public String apply(ListGiVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGiVersionsRequest.Builder>,
                        ListGiVersionsRequest>() {
                    @Override
                    public ListGiVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGiVersionsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListGiVersionsRequest, ListGiVersionsResponse>() {
                    @Override
                    public ListGiVersionsResponse apply(ListGiVersionsRequest request) {
                        return client.listGiVersions(request);
                    }
                },
                new java.util.function.Function<
                        ListGiVersionsResponse,
                        java.util.List<com.oracle.bmc.database.model.GiVersionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.GiVersionSummary> apply(
                            ListGiVersionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listKeyStores
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListKeyStoresResponse> listKeyStoresResponseIterator(
            final ListKeyStoresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListKeyStoresRequest.Builder, ListKeyStoresRequest, ListKeyStoresResponse>(
                new java.util.function.Supplier<ListKeyStoresRequest.Builder>() {
                    @Override
                    public ListKeyStoresRequest.Builder get() {
                        return ListKeyStoresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListKeyStoresResponse, String>() {
                    @Override
                    public String apply(ListKeyStoresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKeyStoresRequest.Builder>,
                        ListKeyStoresRequest>() {
                    @Override
                    public ListKeyStoresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKeyStoresRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListKeyStoresRequest, ListKeyStoresResponse>() {
                    @Override
                    public ListKeyStoresResponse apply(ListKeyStoresRequest request) {
                        return client.listKeyStores(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.KeyStoreSummary} objects contained in responses from the
     * listKeyStores operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.KeyStoreSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.database.model.KeyStoreSummary> listKeyStoresRecordIterator(
            final ListKeyStoresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListKeyStoresRequest.Builder,
                ListKeyStoresRequest,
                ListKeyStoresResponse,
                com.oracle.bmc.database.model.KeyStoreSummary>(
                new java.util.function.Supplier<ListKeyStoresRequest.Builder>() {
                    @Override
                    public ListKeyStoresRequest.Builder get() {
                        return ListKeyStoresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListKeyStoresResponse, String>() {
                    @Override
                    public String apply(ListKeyStoresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKeyStoresRequest.Builder>,
                        ListKeyStoresRequest>() {
                    @Override
                    public ListKeyStoresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKeyStoresRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListKeyStoresRequest, ListKeyStoresResponse>() {
                    @Override
                    public ListKeyStoresResponse apply(ListKeyStoresRequest request) {
                        return client.listKeyStores(request);
                    }
                },
                new java.util.function.Function<
                        ListKeyStoresResponse,
                        java.util.List<com.oracle.bmc.database.model.KeyStoreSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.KeyStoreSummary> apply(
                            ListKeyStoresResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMaintenanceRunHistory operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMaintenanceRunHistoryResponse> listMaintenanceRunHistoryResponseIterator(
            final ListMaintenanceRunHistoryRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMaintenanceRunHistoryRequest.Builder,
                ListMaintenanceRunHistoryRequest,
                ListMaintenanceRunHistoryResponse>(
                new java.util.function.Supplier<ListMaintenanceRunHistoryRequest.Builder>() {
                    @Override
                    public ListMaintenanceRunHistoryRequest.Builder get() {
                        return ListMaintenanceRunHistoryRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaintenanceRunHistoryResponse, String>() {
                    @Override
                    public String apply(ListMaintenanceRunHistoryResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaintenanceRunHistoryRequest.Builder>,
                        ListMaintenanceRunHistoryRequest>() {
                    @Override
                    public ListMaintenanceRunHistoryRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaintenanceRunHistoryRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListMaintenanceRunHistoryRequest, ListMaintenanceRunHistoryResponse>() {
                    @Override
                    public ListMaintenanceRunHistoryResponse apply(
                            ListMaintenanceRunHistoryRequest request) {
                        return client.listMaintenanceRunHistory(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.MaintenanceRunHistorySummary} objects contained in responses
     * from the listMaintenanceRunHistory operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.MaintenanceRunHistorySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.MaintenanceRunHistorySummary>
            listMaintenanceRunHistoryRecordIterator(
                    final ListMaintenanceRunHistoryRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMaintenanceRunHistoryRequest.Builder,
                ListMaintenanceRunHistoryRequest,
                ListMaintenanceRunHistoryResponse,
                com.oracle.bmc.database.model.MaintenanceRunHistorySummary>(
                new java.util.function.Supplier<ListMaintenanceRunHistoryRequest.Builder>() {
                    @Override
                    public ListMaintenanceRunHistoryRequest.Builder get() {
                        return ListMaintenanceRunHistoryRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaintenanceRunHistoryResponse, String>() {
                    @Override
                    public String apply(ListMaintenanceRunHistoryResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaintenanceRunHistoryRequest.Builder>,
                        ListMaintenanceRunHistoryRequest>() {
                    @Override
                    public ListMaintenanceRunHistoryRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaintenanceRunHistoryRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListMaintenanceRunHistoryRequest, ListMaintenanceRunHistoryResponse>() {
                    @Override
                    public ListMaintenanceRunHistoryResponse apply(
                            ListMaintenanceRunHistoryRequest request) {
                        return client.listMaintenanceRunHistory(request);
                    }
                },
                new java.util.function.Function<
                        ListMaintenanceRunHistoryResponse,
                        java.util.List<
                                com.oracle.bmc.database.model.MaintenanceRunHistorySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model.MaintenanceRunHistorySummary>
                            apply(ListMaintenanceRunHistoryResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMaintenanceRuns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMaintenanceRunsResponse> listMaintenanceRunsResponseIterator(
            final ListMaintenanceRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMaintenanceRunsRequest.Builder,
                ListMaintenanceRunsRequest,
                ListMaintenanceRunsResponse>(
                new java.util.function.Supplier<ListMaintenanceRunsRequest.Builder>() {
                    @Override
                    public ListMaintenanceRunsRequest.Builder get() {
                        return ListMaintenanceRunsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaintenanceRunsResponse, String>() {
                    @Override
                    public String apply(ListMaintenanceRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaintenanceRunsRequest.Builder>,
                        ListMaintenanceRunsRequest>() {
                    @Override
                    public ListMaintenanceRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaintenanceRunsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListMaintenanceRunsRequest, ListMaintenanceRunsResponse>() {
                    @Override
                    public ListMaintenanceRunsResponse apply(ListMaintenanceRunsRequest request) {
                        return client.listMaintenanceRuns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.MaintenanceRunSummary} objects contained in responses from the
     * listMaintenanceRuns operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.MaintenanceRunSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.MaintenanceRunSummary>
            listMaintenanceRunsRecordIterator(final ListMaintenanceRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMaintenanceRunsRequest.Builder,
                ListMaintenanceRunsRequest,
                ListMaintenanceRunsResponse,
                com.oracle.bmc.database.model.MaintenanceRunSummary>(
                new java.util.function.Supplier<ListMaintenanceRunsRequest.Builder>() {
                    @Override
                    public ListMaintenanceRunsRequest.Builder get() {
                        return ListMaintenanceRunsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMaintenanceRunsResponse, String>() {
                    @Override
                    public String apply(ListMaintenanceRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMaintenanceRunsRequest.Builder>,
                        ListMaintenanceRunsRequest>() {
                    @Override
                    public ListMaintenanceRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMaintenanceRunsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListMaintenanceRunsRequest, ListMaintenanceRunsResponse>() {
                    @Override
                    public ListMaintenanceRunsResponse apply(ListMaintenanceRunsRequest request) {
                        return client.listMaintenanceRuns(request);
                    }
                },
                new java.util.function.Function<
                        ListMaintenanceRunsResponse,
                        java.util.List<com.oracle.bmc.database.model.MaintenanceRunSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.MaintenanceRunSummary>
                            apply(ListMaintenanceRunsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listPdbConversionHistoryEntries operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPdbConversionHistoryEntriesResponse>
            listPdbConversionHistoryEntriesResponseIterator(
                    final ListPdbConversionHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPdbConversionHistoryEntriesRequest.Builder,
                ListPdbConversionHistoryEntriesRequest,
                ListPdbConversionHistoryEntriesResponse>(
                new java.util.function.Supplier<ListPdbConversionHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListPdbConversionHistoryEntriesRequest.Builder get() {
                        return ListPdbConversionHistoryEntriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPdbConversionHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListPdbConversionHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPdbConversionHistoryEntriesRequest.Builder>,
                        ListPdbConversionHistoryEntriesRequest>() {
                    @Override
                    public ListPdbConversionHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPdbConversionHistoryEntriesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListPdbConversionHistoryEntriesRequest,
                        ListPdbConversionHistoryEntriesResponse>() {
                    @Override
                    public ListPdbConversionHistoryEntriesResponse apply(
                            ListPdbConversionHistoryEntriesRequest request) {
                        return client.listPdbConversionHistoryEntries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.PdbConversionHistoryEntrySummary} objects contained in
     * responses from the listPdbConversionHistoryEntries operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.PdbConversionHistoryEntrySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.PdbConversionHistoryEntrySummary>
            listPdbConversionHistoryEntriesRecordIterator(
                    final ListPdbConversionHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPdbConversionHistoryEntriesRequest.Builder,
                ListPdbConversionHistoryEntriesRequest,
                ListPdbConversionHistoryEntriesResponse,
                com.oracle.bmc.database.model.PdbConversionHistoryEntrySummary>(
                new java.util.function.Supplier<ListPdbConversionHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListPdbConversionHistoryEntriesRequest.Builder get() {
                        return ListPdbConversionHistoryEntriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPdbConversionHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListPdbConversionHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPdbConversionHistoryEntriesRequest.Builder>,
                        ListPdbConversionHistoryEntriesRequest>() {
                    @Override
                    public ListPdbConversionHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPdbConversionHistoryEntriesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListPdbConversionHistoryEntriesRequest,
                        ListPdbConversionHistoryEntriesResponse>() {
                    @Override
                    public ListPdbConversionHistoryEntriesResponse apply(
                            ListPdbConversionHistoryEntriesRequest request) {
                        return client.listPdbConversionHistoryEntries(request);
                    }
                },
                new java.util.function.Function<
                        ListPdbConversionHistoryEntriesResponse,
                        java.util.List<
                                com.oracle.bmc.database.model.PdbConversionHistoryEntrySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model.PdbConversionHistoryEntrySummary>
                            apply(ListPdbConversionHistoryEntriesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listPluggableDatabases operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPluggableDatabasesResponse> listPluggableDatabasesResponseIterator(
            final ListPluggableDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPluggableDatabasesRequest.Builder,
                ListPluggableDatabasesRequest,
                ListPluggableDatabasesResponse>(
                new java.util.function.Supplier<ListPluggableDatabasesRequest.Builder>() {
                    @Override
                    public ListPluggableDatabasesRequest.Builder get() {
                        return ListPluggableDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPluggableDatabasesResponse, String>() {
                    @Override
                    public String apply(ListPluggableDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPluggableDatabasesRequest.Builder>,
                        ListPluggableDatabasesRequest>() {
                    @Override
                    public ListPluggableDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPluggableDatabasesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListPluggableDatabasesRequest, ListPluggableDatabasesResponse>() {
                    @Override
                    public ListPluggableDatabasesResponse apply(
                            ListPluggableDatabasesRequest request) {
                        return client.listPluggableDatabases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.PluggableDatabaseSummary} objects contained in responses from
     * the listPluggableDatabases operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.PluggableDatabaseSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.PluggableDatabaseSummary>
            listPluggableDatabasesRecordIterator(final ListPluggableDatabasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPluggableDatabasesRequest.Builder,
                ListPluggableDatabasesRequest,
                ListPluggableDatabasesResponse,
                com.oracle.bmc.database.model.PluggableDatabaseSummary>(
                new java.util.function.Supplier<ListPluggableDatabasesRequest.Builder>() {
                    @Override
                    public ListPluggableDatabasesRequest.Builder get() {
                        return ListPluggableDatabasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPluggableDatabasesResponse, String>() {
                    @Override
                    public String apply(ListPluggableDatabasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPluggableDatabasesRequest.Builder>,
                        ListPluggableDatabasesRequest>() {
                    @Override
                    public ListPluggableDatabasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPluggableDatabasesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListPluggableDatabasesRequest, ListPluggableDatabasesResponse>() {
                    @Override
                    public ListPluggableDatabasesResponse apply(
                            ListPluggableDatabasesRequest request) {
                        return client.listPluggableDatabases(request);
                    }
                },
                new java.util.function.Function<
                        ListPluggableDatabasesResponse,
                        java.util.List<com.oracle.bmc.database.model.PluggableDatabaseSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.PluggableDatabaseSummary>
                            apply(ListPluggableDatabasesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listVmClusterNetworks operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVmClusterNetworksResponse> listVmClusterNetworksResponseIterator(
            final ListVmClusterNetworksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVmClusterNetworksRequest.Builder,
                ListVmClusterNetworksRequest,
                ListVmClusterNetworksResponse>(
                new java.util.function.Supplier<ListVmClusterNetworksRequest.Builder>() {
                    @Override
                    public ListVmClusterNetworksRequest.Builder get() {
                        return ListVmClusterNetworksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVmClusterNetworksResponse, String>() {
                    @Override
                    public String apply(ListVmClusterNetworksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmClusterNetworksRequest.Builder>,
                        ListVmClusterNetworksRequest>() {
                    @Override
                    public ListVmClusterNetworksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmClusterNetworksRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListVmClusterNetworksRequest, ListVmClusterNetworksResponse>() {
                    @Override
                    public ListVmClusterNetworksResponse apply(
                            ListVmClusterNetworksRequest request) {
                        return client.listVmClusterNetworks(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.VmClusterNetworkSummary} objects contained in responses from
     * the listVmClusterNetworks operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.VmClusterNetworkSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.VmClusterNetworkSummary>
            listVmClusterNetworksRecordIterator(final ListVmClusterNetworksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVmClusterNetworksRequest.Builder,
                ListVmClusterNetworksRequest,
                ListVmClusterNetworksResponse,
                com.oracle.bmc.database.model.VmClusterNetworkSummary>(
                new java.util.function.Supplier<ListVmClusterNetworksRequest.Builder>() {
                    @Override
                    public ListVmClusterNetworksRequest.Builder get() {
                        return ListVmClusterNetworksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVmClusterNetworksResponse, String>() {
                    @Override
                    public String apply(ListVmClusterNetworksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmClusterNetworksRequest.Builder>,
                        ListVmClusterNetworksRequest>() {
                    @Override
                    public ListVmClusterNetworksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmClusterNetworksRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListVmClusterNetworksRequest, ListVmClusterNetworksResponse>() {
                    @Override
                    public ListVmClusterNetworksResponse apply(
                            ListVmClusterNetworksRequest request) {
                        return client.listVmClusterNetworks(request);
                    }
                },
                new java.util.function.Function<
                        ListVmClusterNetworksResponse,
                        java.util.List<com.oracle.bmc.database.model.VmClusterNetworkSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.VmClusterNetworkSummary>
                            apply(ListVmClusterNetworksResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listVmClusterPatchHistoryEntries operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVmClusterPatchHistoryEntriesResponse>
            listVmClusterPatchHistoryEntriesResponseIterator(
                    final ListVmClusterPatchHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVmClusterPatchHistoryEntriesRequest.Builder,
                ListVmClusterPatchHistoryEntriesRequest,
                ListVmClusterPatchHistoryEntriesResponse>(
                new java.util.function.Supplier<ListVmClusterPatchHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListVmClusterPatchHistoryEntriesRequest.Builder get() {
                        return ListVmClusterPatchHistoryEntriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListVmClusterPatchHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListVmClusterPatchHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmClusterPatchHistoryEntriesRequest.Builder>,
                        ListVmClusterPatchHistoryEntriesRequest>() {
                    @Override
                    public ListVmClusterPatchHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmClusterPatchHistoryEntriesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListVmClusterPatchHistoryEntriesRequest,
                        ListVmClusterPatchHistoryEntriesResponse>() {
                    @Override
                    public ListVmClusterPatchHistoryEntriesResponse apply(
                            ListVmClusterPatchHistoryEntriesRequest request) {
                        return client.listVmClusterPatchHistoryEntries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.PatchHistoryEntrySummary} objects contained in responses from
     * the listVmClusterPatchHistoryEntries operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.PatchHistoryEntrySummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.PatchHistoryEntrySummary>
            listVmClusterPatchHistoryEntriesRecordIterator(
                    final ListVmClusterPatchHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVmClusterPatchHistoryEntriesRequest.Builder,
                ListVmClusterPatchHistoryEntriesRequest,
                ListVmClusterPatchHistoryEntriesResponse,
                com.oracle.bmc.database.model.PatchHistoryEntrySummary>(
                new java.util.function.Supplier<ListVmClusterPatchHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListVmClusterPatchHistoryEntriesRequest.Builder get() {
                        return ListVmClusterPatchHistoryEntriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListVmClusterPatchHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListVmClusterPatchHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmClusterPatchHistoryEntriesRequest.Builder>,
                        ListVmClusterPatchHistoryEntriesRequest>() {
                    @Override
                    public ListVmClusterPatchHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmClusterPatchHistoryEntriesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListVmClusterPatchHistoryEntriesRequest,
                        ListVmClusterPatchHistoryEntriesResponse>() {
                    @Override
                    public ListVmClusterPatchHistoryEntriesResponse apply(
                            ListVmClusterPatchHistoryEntriesRequest request) {
                        return client.listVmClusterPatchHistoryEntries(request);
                    }
                },
                new java.util.function.Function<
                        ListVmClusterPatchHistoryEntriesResponse,
                        java.util.List<com.oracle.bmc.database.model.PatchHistoryEntrySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.PatchHistoryEntrySummary>
                            apply(ListVmClusterPatchHistoryEntriesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listVmClusterPatches operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVmClusterPatchesResponse> listVmClusterPatchesResponseIterator(
            final ListVmClusterPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVmClusterPatchesRequest.Builder,
                ListVmClusterPatchesRequest,
                ListVmClusterPatchesResponse>(
                new java.util.function.Supplier<ListVmClusterPatchesRequest.Builder>() {
                    @Override
                    public ListVmClusterPatchesRequest.Builder get() {
                        return ListVmClusterPatchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVmClusterPatchesResponse, String>() {
                    @Override
                    public String apply(ListVmClusterPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmClusterPatchesRequest.Builder>,
                        ListVmClusterPatchesRequest>() {
                    @Override
                    public ListVmClusterPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmClusterPatchesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListVmClusterPatchesRequest, ListVmClusterPatchesResponse>() {
                    @Override
                    public ListVmClusterPatchesResponse apply(ListVmClusterPatchesRequest request) {
                        return client.listVmClusterPatches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.PatchSummary} objects contained in responses from the
     * listVmClusterPatches operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.PatchSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.database.model.PatchSummary> listVmClusterPatchesRecordIterator(
            final ListVmClusterPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVmClusterPatchesRequest.Builder,
                ListVmClusterPatchesRequest,
                ListVmClusterPatchesResponse,
                com.oracle.bmc.database.model.PatchSummary>(
                new java.util.function.Supplier<ListVmClusterPatchesRequest.Builder>() {
                    @Override
                    public ListVmClusterPatchesRequest.Builder get() {
                        return ListVmClusterPatchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVmClusterPatchesResponse, String>() {
                    @Override
                    public String apply(ListVmClusterPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmClusterPatchesRequest.Builder>,
                        ListVmClusterPatchesRequest>() {
                    @Override
                    public ListVmClusterPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmClusterPatchesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListVmClusterPatchesRequest, ListVmClusterPatchesResponse>() {
                    @Override
                    public ListVmClusterPatchesResponse apply(ListVmClusterPatchesRequest request) {
                        return client.listVmClusterPatches(request);
                    }
                },
                new java.util.function.Function<
                        ListVmClusterPatchesResponse,
                        java.util.List<com.oracle.bmc.database.model.PatchSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.PatchSummary> apply(
                            ListVmClusterPatchesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listVmClusterUpdateHistoryEntries operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVmClusterUpdateHistoryEntriesResponse>
            listVmClusterUpdateHistoryEntriesResponseIterator(
                    final ListVmClusterUpdateHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVmClusterUpdateHistoryEntriesRequest.Builder,
                ListVmClusterUpdateHistoryEntriesRequest,
                ListVmClusterUpdateHistoryEntriesResponse>(
                new java.util.function.Supplier<
                        ListVmClusterUpdateHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListVmClusterUpdateHistoryEntriesRequest.Builder get() {
                        return ListVmClusterUpdateHistoryEntriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListVmClusterUpdateHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListVmClusterUpdateHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmClusterUpdateHistoryEntriesRequest.Builder>,
                        ListVmClusterUpdateHistoryEntriesRequest>() {
                    @Override
                    public ListVmClusterUpdateHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmClusterUpdateHistoryEntriesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListVmClusterUpdateHistoryEntriesRequest,
                        ListVmClusterUpdateHistoryEntriesResponse>() {
                    @Override
                    public ListVmClusterUpdateHistoryEntriesResponse apply(
                            ListVmClusterUpdateHistoryEntriesRequest request) {
                        return client.listVmClusterUpdateHistoryEntries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.VmClusterUpdateHistoryEntrySummary} objects contained in
     * responses from the listVmClusterUpdateHistoryEntries operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.VmClusterUpdateHistoryEntrySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.VmClusterUpdateHistoryEntrySummary>
            listVmClusterUpdateHistoryEntriesRecordIterator(
                    final ListVmClusterUpdateHistoryEntriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVmClusterUpdateHistoryEntriesRequest.Builder,
                ListVmClusterUpdateHistoryEntriesRequest,
                ListVmClusterUpdateHistoryEntriesResponse,
                com.oracle.bmc.database.model.VmClusterUpdateHistoryEntrySummary>(
                new java.util.function.Supplier<
                        ListVmClusterUpdateHistoryEntriesRequest.Builder>() {
                    @Override
                    public ListVmClusterUpdateHistoryEntriesRequest.Builder get() {
                        return ListVmClusterUpdateHistoryEntriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListVmClusterUpdateHistoryEntriesResponse, String>() {
                    @Override
                    public String apply(ListVmClusterUpdateHistoryEntriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmClusterUpdateHistoryEntriesRequest.Builder>,
                        ListVmClusterUpdateHistoryEntriesRequest>() {
                    @Override
                    public ListVmClusterUpdateHistoryEntriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmClusterUpdateHistoryEntriesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListVmClusterUpdateHistoryEntriesRequest,
                        ListVmClusterUpdateHistoryEntriesResponse>() {
                    @Override
                    public ListVmClusterUpdateHistoryEntriesResponse apply(
                            ListVmClusterUpdateHistoryEntriesRequest request) {
                        return client.listVmClusterUpdateHistoryEntries(request);
                    }
                },
                new java.util.function.Function<
                        ListVmClusterUpdateHistoryEntriesResponse,
                        java.util.List<
                                com.oracle.bmc.database.model
                                        .VmClusterUpdateHistoryEntrySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.database.model
                                            .VmClusterUpdateHistoryEntrySummary>
                            apply(ListVmClusterUpdateHistoryEntriesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listVmClusterUpdates operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVmClusterUpdatesResponse> listVmClusterUpdatesResponseIterator(
            final ListVmClusterUpdatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVmClusterUpdatesRequest.Builder,
                ListVmClusterUpdatesRequest,
                ListVmClusterUpdatesResponse>(
                new java.util.function.Supplier<ListVmClusterUpdatesRequest.Builder>() {
                    @Override
                    public ListVmClusterUpdatesRequest.Builder get() {
                        return ListVmClusterUpdatesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVmClusterUpdatesResponse, String>() {
                    @Override
                    public String apply(ListVmClusterUpdatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmClusterUpdatesRequest.Builder>,
                        ListVmClusterUpdatesRequest>() {
                    @Override
                    public ListVmClusterUpdatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmClusterUpdatesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListVmClusterUpdatesRequest, ListVmClusterUpdatesResponse>() {
                    @Override
                    public ListVmClusterUpdatesResponse apply(ListVmClusterUpdatesRequest request) {
                        return client.listVmClusterUpdates(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.VmClusterUpdateSummary} objects contained in responses from the
     * listVmClusterUpdates operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.VmClusterUpdateSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.database.model.VmClusterUpdateSummary>
            listVmClusterUpdatesRecordIterator(final ListVmClusterUpdatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVmClusterUpdatesRequest.Builder,
                ListVmClusterUpdatesRequest,
                ListVmClusterUpdatesResponse,
                com.oracle.bmc.database.model.VmClusterUpdateSummary>(
                new java.util.function.Supplier<ListVmClusterUpdatesRequest.Builder>() {
                    @Override
                    public ListVmClusterUpdatesRequest.Builder get() {
                        return ListVmClusterUpdatesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVmClusterUpdatesResponse, String>() {
                    @Override
                    public String apply(ListVmClusterUpdatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmClusterUpdatesRequest.Builder>,
                        ListVmClusterUpdatesRequest>() {
                    @Override
                    public ListVmClusterUpdatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmClusterUpdatesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListVmClusterUpdatesRequest, ListVmClusterUpdatesResponse>() {
                    @Override
                    public ListVmClusterUpdatesResponse apply(ListVmClusterUpdatesRequest request) {
                        return client.listVmClusterUpdates(request);
                    }
                },
                new java.util.function.Function<
                        ListVmClusterUpdatesResponse,
                        java.util.List<com.oracle.bmc.database.model.VmClusterUpdateSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.VmClusterUpdateSummary>
                            apply(ListVmClusterUpdatesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVmClusters
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVmClustersResponse> listVmClustersResponseIterator(
            final ListVmClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVmClustersRequest.Builder, ListVmClustersRequest, ListVmClustersResponse>(
                new java.util.function.Supplier<ListVmClustersRequest.Builder>() {
                    @Override
                    public ListVmClustersRequest.Builder get() {
                        return ListVmClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVmClustersResponse, String>() {
                    @Override
                    public String apply(ListVmClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmClustersRequest.Builder>,
                        ListVmClustersRequest>() {
                    @Override
                    public ListVmClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmClustersRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListVmClustersRequest, ListVmClustersResponse>() {
                    @Override
                    public ListVmClustersResponse apply(ListVmClustersRequest request) {
                        return client.listVmClusters(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.database.model.VmClusterSummary} objects contained in responses from the
     * listVmClusters operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.database.model.VmClusterSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.database.model.VmClusterSummary> listVmClustersRecordIterator(
            final ListVmClustersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVmClustersRequest.Builder,
                ListVmClustersRequest,
                ListVmClustersResponse,
                com.oracle.bmc.database.model.VmClusterSummary>(
                new java.util.function.Supplier<ListVmClustersRequest.Builder>() {
                    @Override
                    public ListVmClustersRequest.Builder get() {
                        return ListVmClustersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVmClustersResponse, String>() {
                    @Override
                    public String apply(ListVmClustersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVmClustersRequest.Builder>,
                        ListVmClustersRequest>() {
                    @Override
                    public ListVmClustersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVmClustersRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListVmClustersRequest, ListVmClustersResponse>() {
                    @Override
                    public ListVmClustersResponse apply(ListVmClustersRequest request) {
                        return client.listVmClusters(request);
                    }
                },
                new java.util.function.Function<
                        ListVmClustersResponse,
                        java.util.List<com.oracle.bmc.database.model.VmClusterSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.database.model.VmClusterSummary> apply(
                            ListVmClustersResponse response) {
                        return response.getItems();
                    }
                });
    }
}
