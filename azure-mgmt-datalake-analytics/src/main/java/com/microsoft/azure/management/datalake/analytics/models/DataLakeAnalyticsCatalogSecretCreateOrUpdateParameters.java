/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataLakeAnalytics DataLakeAnalyticsAccount information.
 */
public class DataLakeAnalyticsCatalogSecretCreateOrUpdateParameters {
    /**
     * the password for the secret to pass in.
     */
    @JsonProperty(required = true)
    private String password;

    /**
     * the URI identifier for the secret in the format
     * &lt;hostname&gt;:&lt;port&gt;.
     */
    private String uri;

    /**
     * Get the password value.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password value.
     *
     * @param password the password value to set
     * @return the DataLakeAnalyticsCatalogSecretCreateOrUpdateParameters object itself.
     */
    public DataLakeAnalyticsCatalogSecretCreateOrUpdateParameters withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the uri value.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri value.
     *
     * @param uri the uri value to set
     * @return the DataLakeAnalyticsCatalogSecretCreateOrUpdateParameters object itself.
     */
    public DataLakeAnalyticsCatalogSecretCreateOrUpdateParameters withUri(String uri) {
        this.uri = uri;
        return this;
    }

}